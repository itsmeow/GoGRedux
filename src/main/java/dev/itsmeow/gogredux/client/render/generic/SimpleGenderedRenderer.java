package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleGenderedRenderer<T extends EntityLiving> extends SimpleVariantRenderer<T> {

    protected ResourceLocation maleTex;
    protected ResourceLocation femaleTex;
    protected Function<T, Boolean> isMale;

    public SimpleGenderedRenderer(RenderManager renderManagerIn, ModelBase entityModelIn, float shadowSizeIn, ResourceLocation maleTex, ResourceLocation femaleTex, Function<T, Boolean> isMale) {
        super(renderManagerIn, entityModelIn, shadowSizeIn, e -> isMale.apply(e) ? maleTex : femaleTex);
        this.femaleTex = femaleTex;
        this.maleTex = maleTex;
        this.isMale = isMale;
    }

}