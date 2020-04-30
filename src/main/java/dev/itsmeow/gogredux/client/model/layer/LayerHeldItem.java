package dev.itsmeow.gogredux.client.model.layer;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.render.generic.BaseRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;

public class LayerHeldItem<T extends EntityLiving, A extends ModelGoGRBase> implements LayerRenderer<T> {
    private final EntityEquipmentSlot slot;
    private final BaseRenderer<T, A> renderer;
    private final float offsetX;
    private final float offsetY;
    private final float offsetZ;

    public LayerHeldItem(BaseRenderer<T, A> renderer, EntityEquipmentSlot slot, float offsetX, float offsetY, float offsetZ) {
        this.renderer = renderer;
        this.slot = slot == EntityEquipmentSlot.MAINHAND || slot == EntityEquipmentSlot.OFFHAND ? slot : EntityEquipmentSlot.MAINHAND;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> LayerHeldItem<T, A> left(BaseRenderer<T, A> renderer, float offsetX, float offsetY, float offsetZ) {
        return new LayerHeldItem<T, A>(renderer, EntityEquipmentSlot.OFFHAND, offsetX, offsetY, offsetZ);
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> LayerHeldItem<T, A> right(BaseRenderer<T, A> renderer, float offsetX, float offsetY, float offsetZ) {
        return new LayerHeldItem<T, A>(renderer, EntityEquipmentSlot.MAINHAND, offsetX, offsetY, offsetZ);
    }

    @Override
    public void doRenderLayer(T living, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ItemStack stack = living.getItemStackFromSlot(slot);

        GlStateManager.pushMatrix();

        if(renderer.getMainModel().isChild) {
            GlStateManager.translate(0.0F, 0.625F, 0.0F);
            GlStateManager.rotate(-20.0F, -1.0F, 0.0F, 0.0F);
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
        }
        GlStateManager.translate(offsetX, offsetY, offsetZ);
        if(slot == EntityEquipmentSlot.MAINHAND) {
            renderHeldItem(living, stack, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND, EnumHandSide.RIGHT);
        } else {
            renderHeldItem(living, stack, ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND, EnumHandSide.LEFT);
        }

        GlStateManager.popMatrix();
    }

    private void renderHeldItem(T living, ItemStack stack, ItemCameraTransforms.TransformType camera, EnumHandSide handSide) {
        if(!stack.isEmpty()) {
            GlStateManager.pushMatrix();

            if(living.isSneaking()) {
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
            }

            this.renderer.getArm(slot).postRender(0.0625F);

            GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);

            boolean flag = handSide == EnumHandSide.LEFT;
            GlStateManager.translate((float) (flag ? -1 : 1) / 16.0F, 0.125F, -0.625F);
            Minecraft.getMinecraft().getItemRenderer().renderItemSide(living, stack, camera, flag);
            GlStateManager.popMatrix();
        }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }

}
