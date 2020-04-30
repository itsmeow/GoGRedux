package dev.itsmeow.gogredux.client.render.generic;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleSingleRenderer<T extends EntityLiving, A extends ModelGoGRBase> extends BaseRenderer<T, A> {

    private ResourceLocation texture;

    public SimpleSingleRenderer(RenderManager renderManagerIn, A entityModelIn, float shadowSizeIn, ResourceLocation texture) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
        this.texture = texture;
    }

    @Override
    protected ResourceLocation getEntityTexture(T entity) {
        return texture;
    }

}
