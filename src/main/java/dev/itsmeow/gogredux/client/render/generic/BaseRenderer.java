package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;

public abstract class BaseRenderer<T extends EntityLiving> extends RenderLiving<T> {

    public BaseRenderer(RenderManager renderManagerIn, ModelBase entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    public BaseRenderer<T> layer(Function<BaseRenderer<T>, LayerRenderer<T>> layer) {
        this.addLayer(layer.apply(this));
        return this;
    }

}