package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleVariantRenderer<T extends EntityLiving, A extends ModelGoGRBase> extends BaseRenderer<T, A> {

    protected Function<T, ResourceLocation> texMapper;

    public SimpleVariantRenderer(RenderManager renderManagerIn, A entityModelIn, float shadowSizeIn, Function<T, ResourceLocation> texMapper) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
        this.texMapper = texMapper;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return texMapper.apply(entity);
    }

}
