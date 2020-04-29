package dev.itsmeow.gogredux.client.render.generic;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleSingleRenderer<T extends EntityLiving> extends BaseRenderer<T> {

    private ResourceLocation texture;

    public SimpleSingleRenderer(RenderManager renderManagerIn, ModelBase entityModelIn, float shadowSizeIn, ResourceLocation texture) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
        this.texture = texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return texture;
    }

}
