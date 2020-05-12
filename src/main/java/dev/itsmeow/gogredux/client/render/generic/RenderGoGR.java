package dev.itsmeow.gogredux.client.render.generic;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

import dev.itsmeow.gogredux.GrimoireOfGaiaRedux;
import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.model.layer.LayerEyes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderGoGR<T extends EntityLiving, A extends ModelGoGRBase> extends BaseRenderer<T, A> {

    private final TextureContainer<T, A> textureContainer;
    private final ModelContainer<T, A> modelContainer;
    private final BiConsumer<T, Float> preRenderCallback;

    public RenderGoGR(RenderManager mgr, ShadowSize shadow, TextureContainer<T, A> textureContainer, ModelContainer<T, A> modelContainer, BiConsumer<T, Float> preRenderCallback) {
        super(mgr, modelContainer.getBaseModel(), shadow.size());
        this.textureContainer = textureContainer;
        this.modelContainer = modelContainer;
        this.preRenderCallback = preRenderCallback;
    }

    @Override
    protected void preRenderCallback(T e, float p) {
        preRenderCallback.accept(e, p);
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.mainModel = modelContainer.getModel(entity);
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return textureContainer.getTexture(entity);
    }

    public static class TextureContainer<T extends EntityLiving, A extends ModelGoGRBase> {

        private Strategy strategy;
        private ResourceLocation singleTexture;
        private Function<T, ResourceLocation> texMapper;
        private ResourceLocation maleTex;
        private ResourceLocation femaleTex;
        private Function<T, Boolean> isMale;

        public TextureContainer(ResourceLocation singleTexture) {
            this.strategy = Strategy.SINGLE;
            this.singleTexture = singleTexture;
        }

        public TextureContainer(Function<T, ResourceLocation> texMapper) {
            this.strategy = Strategy.MAPPER;
            this.texMapper = texMapper;
        }

        public TextureContainer(Function<T, Boolean> isMale, ResourceLocation maleTex, ResourceLocation femaleTex) {
            this.strategy = Strategy.GENDERED;
            this.isMale = isMale;
            this.maleTex = maleTex;
            this.femaleTex = femaleTex;
        }

        public ResourceLocation getTexture(T entity) {
            switch(strategy) {
            case SINGLE:
                return singleTexture;
            case MAPPER:
                return texMapper.apply(entity);
            case GENDERED:
                return isMale.apply(entity) ? maleTex : femaleTex;
            }
            return null;
        }
    }

    public static class ModelContainer<T extends EntityLiving, A extends ModelGoGRBase> {

        private final Strategy strategy;
        private final A baseModel;
        private Function<T, ModelGoGRBase> modelMapper;
        private A maleModel;
        private ModelGoGRBase femaleModel;
        private Function<T, Boolean> isMale;

        public ModelContainer(A baseModel) {
            this.strategy = Strategy.SINGLE;
            this.baseModel = baseModel;
        }

        public ModelContainer(Function<T, ModelGoGRBase> modelMapper, A baseModel) {
            this.strategy = Strategy.MAPPER;
            this.modelMapper = modelMapper;
            this.baseModel = baseModel;
        }

        public ModelContainer(Function<T, Boolean> isMale, A maleModel, ModelGoGRBase femaleModel) {
            this.strategy = Strategy.GENDERED;
            this.isMale = isMale;
            this.maleModel = maleModel;
            this.femaleModel = femaleModel;
            this.baseModel = maleModel;
        }

        public ModelGoGRBase getModel(T entity) {
            switch(strategy) {
            case SINGLE:
                return baseModel;
            case MAPPER:
                return modelMapper.apply(entity);
            case GENDERED:
                return isMale.apply(entity) ? maleModel : femaleModel;
            }
            return null;
        }

        public A getBaseModel() {
            return baseModel;
        }
    }

    public enum Strategy {
        SINGLE,
        MAPPER,
        GENDERED;
    }

    public enum ShadowSize {
        TINY(0.25F),
        SMALL(0.4F),
        MED(0.5F),
        LARGE(0.7F);

        private final float size;

        private ShadowSize(float size) {
            this.size = size;
        }

        public float size() {
            return size;
        }
    }

    public static class Builder<T extends EntityLiving, A extends ModelGoGRBase> {

        private final String baseName;
        private final ShadowSize shadow;
        private TextureContainer<T, A> tex;
        private ModelContainer<T, A> model;
        private Consumer<T> armsPre;
        private Function<T, Boolean> isMale;
        private BiConsumer<T, Float> preRender = (e, p) -> {};
        private ArrayList<Function<BaseRenderer<T, A>, LayerRenderer<T>>> layers = new ArrayList<>();

        protected Builder(String baseName, ShadowSize shadow) {
            this.baseName = baseName;
            this.shadow = shadow;
        }

        public Builder<T, A> arms() {
            arms((e) -> {});
            return this;
        }

        public Builder<T, A> arms(Consumer<T> armsPre) {
            this.armsPre = armsPre;
            return this;
        }

        public Builder<T, A> eyes(String texture) {
            return layer(r -> new LayerEyes<T>(r, tex(texture)));
        }

        public Builder<T, A> eyes() {
            return eyes("gaia_" + baseName + "_eyes");
        }

        public Builder<T, A> layer(Function<BaseRenderer<T, A>, LayerRenderer<T>> layer) {
            layers.add(layer);
            return this;
        }

        public Builder<T, A> gender(Function<T, Boolean> isMale) {
            this.isMale = isMale;
            return this;
        }

        public Builder<T, A> tSingle(String texture) {
            this.tex = new TextureContainer<T, A>(tex(texture));
            return this;
        }

        public Builder<T, A> tSingle() {
            return tSingle("gaia_" + baseName);
        }

        public Builder<T, A> tGendered() {
            return tGendered("gaia_" + baseName + "_male", "gaia_" + baseName + "_female");
        }

        public Builder<T, A> tGendered(String male, String female) {
            if(isMale == null) {
                throw new IllegalArgumentException("Must call gender() before gendered texture call!");
            }
            this.tex = new TextureContainer<T, A>(isMale, tex(male), tex(female));
            return this;
        }

        public Builder<T, A> tMapped(Function<T, String> texMapper) {
            this.tex = new TextureContainer<T, A>(entity -> tex(texMapper.apply(entity)));
            return this;
        }

        public Builder<T, A> tNumber(Function<T, Integer> numFunction) {
            tMapped(entity -> "gaia_" + baseName + "_" + (numFunction.apply(entity) + 1));
            return this;
        }

        public Builder<T, A> mSingle(A model) {
            this.model = new ModelContainer<T, A>(model);
            return this;
        }

        public Builder<T, A> mMapped(Function<T, ModelGoGRBase> modelMapper, A baseModel) {
            this.model = new ModelContainer<T, A>(modelMapper, baseModel);
            return this;
        }

        public Builder<T, A> mGendered(A maleModel, ModelGoGRBase femaleModel) {
            if(isMale == null) {
                throw new IllegalArgumentException("Must call gender() before gendered model call!");
            }
            this.model = new ModelContainer<T, A>(isMale, maleModel, femaleModel);
            return this;
        }

        public Builder<T, A> preRender(BiConsumer<T, Float> preRender) {
            this.preRender = preRender;
            return this;
        }

        public Builder<T, A> childScale(Function<T, Boolean> isChild, float xScale, float yScale, float zScale) {
            preRender((e, p) -> {
                if(isChild.apply(e)) {
                    GlStateManager.scale(xScale, yScale, zScale);
                }
            });
            return this;
        }

        public IRenderFactory<T> done() {
            if(tex == null || model == null) {
                throw new IllegalArgumentException("Must define both a texture and a model before calling build()!");
            }
            if(armsPre == null) {
                return mgr -> new RenderGoGR<T, A>(mgr, shadow, tex, model, preRender).layers(layers);
            } else {
                return mgr -> new RenderGoGR<T, A>(mgr, shadow, tex, model, preRender).arms(armsPre).layers(layers);
            }
        }
    }
    
    public static <T extends EntityLiving, A extends ModelGoGRBase> Builder<T, A> factory(String baseName, ShadowSize shadow) {
        return new Builder<T, A>(baseName, shadow);
    }
    
    private static ResourceLocation tex(String location) {
        return new ResourceLocation(GrimoireOfGaiaRedux.MODID, "textures/entity/" + location + ".png");
    }

}
