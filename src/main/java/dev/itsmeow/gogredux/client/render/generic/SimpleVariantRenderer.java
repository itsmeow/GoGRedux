package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleVariantRenderer<T extends EntityLiving> extends BaseRenderer<T> {

    protected Function<T, ResourceLocation> texMapper;

    public SimpleVariantRenderer(RenderManager renderManagerIn, ModelBase entityModelIn, float shadowSizeIn, Function<T, ResourceLocation> texMapper) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
        this.texMapper = texMapper;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return texMapper.apply(entity);
    }

}
