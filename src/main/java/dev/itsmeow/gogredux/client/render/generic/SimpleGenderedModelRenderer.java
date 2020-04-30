package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleGenderedModelRenderer<T extends EntityLiving, A extends ModelGoGRBase, B extends ModelGoGRBase> extends SimpleGenderedRenderer<T, A> {

    protected A maleModel;
    protected B femaleModel;

    public SimpleGenderedModelRenderer(RenderManager renderManagerIn, A maleModel, B femaleModel, float shadowSizeIn, ResourceLocation maleTex, ResourceLocation femaleTex, Function<T, Boolean> isMale) {
        super(renderManagerIn, maleModel, shadowSizeIn, maleTex, femaleTex, isMale);
        this.femaleModel = femaleModel;
        this.maleModel = maleModel;
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.mainModel = isMale.apply(entity) ? maleModel : femaleModel;
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    public ModelRenderer getLeftArm() {
        return ((ModelGoGRBase) this.mainModel).getLeftArm();
    }

    public ModelRenderer getRightArm() {
        return ((ModelGoGRBase) this.mainModel).getRightArm();
    }
}
