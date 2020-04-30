package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleGenderedRenderer<T extends EntityLiving, A extends ModelGoGRBase> extends SimpleVariantRenderer<T, A> {

    protected ResourceLocation maleTex;
    protected ResourceLocation femaleTex;
    protected Function<T, Boolean> isMale;

    public SimpleGenderedRenderer(RenderManager renderManagerIn, A entityModelIn, float shadowSizeIn, ResourceLocation maleTex, ResourceLocation femaleTex, Function<T, Boolean> isMale) {
        super(renderManagerIn, entityModelIn, shadowSizeIn, e -> isMale.apply(e) ? maleTex : femaleTex);
        this.femaleTex = femaleTex;
        this.maleTex = maleTex;
        this.isMale = isMale;
    }

}