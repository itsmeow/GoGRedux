package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import dev.itsmeow.gogredux.GrimoireOfGaiaRedux;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFactories {

    public static <T extends EntityLiving> IRenderFactory<T> simpleSingle(ModelBase model, float shadowSize, String texture) {
        return mgr -> new SimpleSingleRenderer<T>(mgr, model, shadowSize, tex(texture));
    }

    public static <T extends EntityLiving> IRenderFactory<T> simpleGendered(ModelBase model, float shadowSize, String male, String female, Function<T, Boolean> isMale) {
        return mgr -> new SimpleGenderedRenderer<T>(mgr, model, shadowSize, tex(male), tex(female), isMale);
    }

    public static <T extends EntityLiving> IRenderFactory<T> simpleGenderedModel(ModelBase maleModel, ModelBase femaleModel, float shadowSize, String male, String female, Function<T, Boolean> isMale) {
        return mgr -> new SimpleGenderedModelRenderer<T>(mgr, maleModel, femaleModel, shadowSize, tex(male), tex(female), isMale);
    }
    
    public static <T extends EntityLiving> IRenderFactory<T> simpleVariant(ModelBase model, float shadowSize, Function<T, String> texMapper) {
        return mgr -> new SimpleVariantRenderer<T>(mgr, model, shadowSize, entity -> tex(texMapper.apply(entity)));
    }

    private static ResourceLocation tex(String location) {
        return new ResourceLocation(GrimoireOfGaiaRedux.MODID, "textures/entity/" + location + ".png");
    }

}
