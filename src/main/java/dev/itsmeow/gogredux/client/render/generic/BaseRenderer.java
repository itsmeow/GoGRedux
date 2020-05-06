package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Consumer;
import java.util.function.Function;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.model.layer.LayerHeldItem;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.inventory.EntityEquipmentSlot;

public abstract class BaseRenderer<T extends EntityLiving, A extends ModelGoGRBase> extends RenderLiving<T> {

    public BaseRenderer(RenderManager renderManagerIn, A entityModelIn, float shadowSizeIn) {
        super(renderManagerIn, entityModelIn, shadowSizeIn);
    }

    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0F, 0.1875F, 0.0F);
    }

    public BaseRenderer<T, A> layer(Function<BaseRenderer<T, A>, LayerRenderer<?>> layer) {
        this.addLayer(layer.apply(this));
        return this;
    }

    public BaseRenderer<T, A> arms(Consumer<T> preRender) {
        this.addLayer(LayerHeldItem.left(this, preRender));
        this.addLayer(LayerHeldItem.right(this, preRender));
        return this;
    }

    public ModelRenderer[] getArm(EntityEquipmentSlot slot) {
        return slot == EntityEquipmentSlot.MAINHAND ? getRightArm() : getLeftArm();
    }

    public ModelRenderer[] getLeftArm() {
        return ((ModelGoGRBase) this.mainModel).getLeftArm();
    }

    public ModelRenderer[] getRightArm() {
        return ((ModelGoGRBase) this.mainModel).getRightArm();
    }

}