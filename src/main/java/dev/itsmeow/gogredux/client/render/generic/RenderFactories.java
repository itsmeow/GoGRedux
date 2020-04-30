package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import dev.itsmeow.gogredux.GrimoireOfGaiaRedux;
import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderFactories {

    /*
     * BASE
     */

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleSingle(A model, float shadowSize, String texture) {
        return mgr -> new SimpleSingleRenderer<T, A>(mgr, model, shadowSize, tex(texture));
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleGendered(A model, float shadowSize, String male, String female, Function<T, Boolean> isMale) {
        return mgr -> new SimpleGenderedRenderer<T, A>(mgr, model, shadowSize, tex(male), tex(female), isMale);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase, B extends ModelGoGRBase> IRenderFactory<T> simpleGenderedModel(A maleModel, B femaleModel, float shadowSize, String male, String female, Function<T, Boolean> isMale) {
        return mgr -> new SimpleGenderedModelRenderer<T, A, B>(mgr, maleModel, femaleModel, shadowSize, tex(male), tex(female), isMale);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleVariant(A model, float shadowSize, Function<T, String> texMapper) {
        return mgr -> new SimpleVariantRenderer<T, A>(mgr, model, shadowSize, entity -> tex(texMapper.apply(entity)));
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleVariantNum(A model, float shadowSize, String name, Function<T, Integer> numFunction) {
        return mgr -> new SimpleVariantRenderer<T, A>(mgr, model, shadowSize, entity -> tex("gaia_" + name + "_" + (numFunction.apply(entity) + 1)));
    }

    /*
     * ARMS
     */

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleSingleArms(A model, float shadowSize, String texture, float offsetX, float offsetY, float offsetZ) {
        return mgr -> new SimpleSingleRenderer<T, A>(mgr, model, shadowSize, tex(texture)).arms(offsetX, offsetY, offsetZ);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleGenderedArms(A model, float shadowSize, String male, String female, Function<T, Boolean> isMale, float offsetX, float offsetY, float offsetZ) {
        return mgr -> new SimpleGenderedRenderer<T, A>(mgr, model, shadowSize, tex(male), tex(female), isMale).arms(offsetX, offsetY, offsetZ);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase, B extends ModelGoGRBase> IRenderFactory<T> simpleGenderedModelArms(A maleModel, B femaleModel, float shadowSize, String male, String female, Function<T, Boolean> isMale, float offsetX, float offsetY, float offsetZ) {
        return mgr -> new SimpleGenderedModelRenderer<T, A, B>(mgr, maleModel, femaleModel, shadowSize, tex(male), tex(female), isMale).arms(offsetX, offsetY, offsetZ);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleVariantArms(A model, float shadowSize, Function<T, String> texMapper, float offsetX, float offsetY, float offsetZ) {
        return mgr -> new SimpleVariantRenderer<T, A>(mgr, model, shadowSize, entity -> tex(texMapper.apply(entity))).arms(offsetX, offsetY, offsetZ);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> IRenderFactory<T> simpleVariantNumArms(A model, float shadowSize, String name, Function<T, Integer> numFunction, float offsetX, float offsetY, float offsetZ) {
        return mgr -> new SimpleVariantRenderer<T, A>(mgr, model, shadowSize, entity -> tex("gaia_" + name + "_" + (numFunction.apply(entity) + 1))).arms(offsetX, offsetY, offsetZ);
    }

    /*
     * UTIL
     */

    private static ResourceLocation tex(String location) {
        return new ResourceLocation(GrimoireOfGaiaRedux.MODID, "textures/entity/" + location + ".png");
    }

}
