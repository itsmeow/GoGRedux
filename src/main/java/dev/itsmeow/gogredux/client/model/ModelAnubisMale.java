package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_anubis_male - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelAnubisMale extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer rEar01;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedBipedHead;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer leftPec;
    public ModelRenderer rightPec;
    public ModelRenderer collarFront;
    public ModelRenderer loincloth;
    public ModelRenderer leftShoulderPad;
    public ModelRenderer rightShoulderPad;
    public ModelRenderer lEar01;
    public ModelRenderer snout;
    public ModelRenderer muzzleLeft;
    public ModelRenderer muzzleRight;
    public ModelRenderer lowerJaw;
    public ModelRenderer BipedHeadpieceBack;
    public ModelRenderer BipedHeadpieceLeft;
    public ModelRenderer BipedHeadpieceRight;
    public ModelRenderer lEar02;
    public ModelRenderer collarLeft;
    public ModelRenderer collarRight;
    public ModelRenderer collarBack;
    public ModelRenderer rEar02;

    public ModelAnubisMale() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rightShoulderPad = new ModelRenderer(this, 15, 43);
        this.rightShoulderPad.mirror = true;
        this.rightShoulderPad.setRotationPoint(0.2F, -0.5F, 0.0F);
        this.rightShoulderPad.addBox(-3.4F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.lEar01 = new ModelRenderer(this, 32, 0);
        this.lEar01.setRotationPoint(1.9F, -7.4F, -0.5F);
        this.lEar01.addBox(-1.0F, -5.3F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.20943951023931953F);
        this.BipedHeadpieceBack = new ModelRenderer(this, 42, 51);
        this.BipedHeadpieceBack.setRotationPoint(0.0F, -6.2F, 2.2F);
        this.BipedHeadpieceBack.addBox(-4.0F, -0.7F, -1.9F, 8, 10, 3, 0.0F);
        this.setRotateAngle(BipedHeadpieceBack, 0.10471975511965977F, 0.0F, 0.0F);
        this.lEar02 = new ModelRenderer(this, 41, 0);
        this.lEar02.setRotationPoint(0.0F, 0.5F, 0.7F);
        this.lEar02.addBox(0.3F, -5.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.0F, 0.3141592653589793F, -0.22689280275926282F);
        this.BipedHeadpieceLeft = new ModelRenderer(this, 31, 52);
        this.BipedHeadpieceLeft.setRotationPoint(2.4F, -4.5F, -0.9F);
        this.BipedHeadpieceLeft.addBox(-0.5F, -0.7F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(BipedHeadpieceLeft, -0.2617993877991494F, 0.0F, -0.08726646259971647F);
        this.leftPec = new ModelRenderer(this, 14, 33);
        this.leftPec.setRotationPoint(2.3F, 2.1F, 0.1F);
        this.leftPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(leftPec, 0.0F, -0.08726646259971647F, 0.08726646259971647F);
        this.leftShoulderPad = new ModelRenderer(this, 15, 43);
        this.leftShoulderPad.setRotationPoint(0.4F, -0.5F, 0.0F);
        this.leftShoulderPad.addBox(-1.2F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.rEar02 = new ModelRenderer(this, 41, 0);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(0.0F, 0.5F, 0.7F);
        this.rEar02.addBox(-2.3F, -5.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.0F, -0.3141592653589793F, 0.22689280275926282F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -1.6F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.muzzleRight = new ModelRenderer(this, 31, 41);
        this.muzzleRight.mirror = true;
        this.muzzleRight.setRotationPoint(-1.0F, -2.0F, -3.6F);
        this.muzzleRight.addBox(-1.0F, -0.8F, -3.7F, 2, 2, 4, 0.0F);
        this.setRotateAngle(muzzleRight, 0.0F, -0.13962634015954636F, 0.0F);
        this.collarFront = new ModelRenderer(this, 0, 43);
        this.collarFront.setRotationPoint(0.0F, 0.0F, -3.2F);
        this.collarFront.addBox(-4.5F, -0.9F, 0.01F, 9, 5, 0, 0.0F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.loincloth = new ModelRenderer(this, 0, 48);
        this.loincloth.setRotationPoint(0.0F, 11.7F, -2.3F);
        this.loincloth.addBox(-2.5F, 0.0F, -0.1F, 5, 8, 1, 0.0F);
        this.snout = new ModelRenderer(this, 31, 35);
        this.snout.setRotationPoint(0.0F, -3.0F, -3.5F);
        this.snout.addBox(-1.5F, -1.0F, -4.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.collarBack = new ModelRenderer(this, 0, 43);
        this.collarBack.setRotationPoint(0.0F, 0.0F, 5.9F);
        this.collarBack.addBox(-4.5F, -0.5F, 0.0F, 9, 5, 0, 0.0F);
        this.collarLeft = new ModelRenderer(this, 0, 35);
        this.collarLeft.setRotationPoint(3.5F, -0.1F, 2.5F);
        this.collarLeft.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 6, 0.0F);
        this.BipedBipedHead = new ModelRenderer(this, 0, 0);
        this.BipedBipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedBipedHead.addBox(-3.5F, -7.0F, -4.0F, 7, 7, 7, 0.0F);
        this.collarRight = new ModelRenderer(this, 0, 35);
        this.collarRight.mirror = true;
        this.collarRight.setRotationPoint(-3.5F, -0.1F, 2.5F);
        this.collarRight.addBox(-1.0F, -0.5F, -2.5F, 2, 1, 6, 0.0F);
        this.muzzleLeft = new ModelRenderer(this, 31, 41);
        this.muzzleLeft.setRotationPoint(1.0F, -2.0F, -3.6F);
        this.muzzleLeft.addBox(-1.0F, -0.8F, -3.7F, 2, 2, 4, 0.0F);
        this.setRotateAngle(muzzleLeft, 0.0F, 0.13962634015954636F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 44, 42);
        this.lowerJaw.setRotationPoint(0.0F, -0.8F, -3.6F);
        this.lowerJaw.addBox(-1.5F, -0.5F, -3.6F, 3, 1, 4, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-3.0F, -1.6F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.rEar01 = new ModelRenderer(this, 32, 0);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-1.9F, -7.4F, -0.5F);
        this.rEar01.addBox(0.0F, -5.3F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.20943951023931953F);
        this.rightPec = new ModelRenderer(this, 14, 33);
        this.rightPec.mirror = true;
        this.rightPec.setRotationPoint(-2.3F, 2.1F, 0.1F);
        this.rightPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(rightPec, 0.0F, 0.08726646259971647F, -0.08726646259971647F);
        this.BipedHeadpieceRight = new ModelRenderer(this, 31, 52);
        this.BipedHeadpieceRight.mirror = true;
        this.BipedHeadpieceRight.setRotationPoint(-2.4F, -4.5F, -0.9F);
        this.BipedHeadpieceRight.addBox(-1.5F, -0.7F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(BipedHeadpieceRight, -0.2617993877991494F, 0.0F, 0.08726646259971647F);
        this.BipedRightArm.addChild(this.rightShoulderPad);
        this.BipedBipedHead.addChild(this.lEar01);
        this.BipedBipedHead.addChild(this.rEar01);
        this.BipedBipedHead.addChild(this.BipedHeadpieceBack);
        this.lEar01.addChild(this.lEar02);
        this.BipedBipedHead.addChild(this.BipedHeadpieceLeft);
        this.BipedBody.addChild(this.leftPec);
        this.BipedLeftArm.addChild(this.leftShoulderPad);
        this.rEar01.addChild(this.rEar02);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.BipedBody.addChild(this.BipedLeftLeg);
        this.BipedBipedHead.addChild(this.muzzleRight);
        this.BipedBody.addChild(this.collarFront);
        this.BipedBody.addChild(this.loincloth);
        this.BipedBipedHead.addChild(this.snout);
        this.BipedBody.addChild(this.BipedRightLeg);
        this.collarFront.addChild(this.collarBack);
        this.collarFront.addChild(this.collarLeft);
        this.BipedBody.addChild(this.BipedBipedHead);
        this.collarFront.addChild(this.collarRight);
        this.BipedBipedHead.addChild(this.muzzleLeft);
        this.BipedBipedHead.addChild(this.lowerJaw);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedBody.addChild(this.rightPec);
        this.BipedBipedHead.addChild(this.BipedHeadpieceRight);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netBipedHeadYaw, float BipedHeadPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        ItemStack itemstackChest = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.CHEST);

        // BipedHead
        BipedBipedHead.rotateAngleY = netBipedHeadYaw / 57.295776F;
        BipedBipedHead.rotateAngleX = BipedHeadPitch / 57.295776F;

        // arms
        if(itemstackChest.getItem() == Items.STICK) {
            BipedRightArm.rotationPointX = -3F;
            BipedLeftArm.rotationPointX = 3F;
        }

        if(itemstack.isEmpty()) {
            BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
            BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

            BipedRightArm.rotateAngleZ = 0.0F;
            BipedLeftArm.rotateAngleZ = 0.0F;

            if(swingProgress > -9990.0F) {
                holdingMelee();
            }

            BipedRightArm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
            BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
            BipedLeftArm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.1745329F;
            BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        }

        if(itemstack.getItem() == Items.ARROW) {
            animationThrow();
        }

        if(itemstack.getItem() == Items.STICK) {
            animationCast();
        }

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
        BipedRightLeg.rotateAngleY = 0.0F;
        BipedLeftLeg.rotateAngleY = 0.0F;
        BipedRightLeg.rotateAngleZ = 0.0F;
        BipedLeftLeg.rotateAngleZ = 0.0F;

        if(isRiding) {
            BipedRightArm.rotateAngleX += -((float) Math.PI / 5F);
            BipedLeftArm.rotateAngleX += -((float) Math.PI / 5F);
            BipedRightLeg.rotateAngleX = -1.4137167F;
            BipedRightLeg.rotateAngleY = ((float) Math.PI / 10F);
            BipedRightLeg.rotateAngleZ = 0.07853982F;
            BipedLeftLeg.rotateAngleX = -1.4137167F;
            BipedLeftLeg.rotateAngleY = -((float) Math.PI / 10F);
            BipedLeftLeg.rotateAngleZ = -0.07853982F;
        }
    }

    public void holdingMelee() {
        float f6;
        float f7;

        f6 = 1.0F - swingProgress;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float) Math.PI);
        float f8 = MathHelper.sin(swingProgress * (float) Math.PI) * -(BipedBipedHead.rotateAngleX - 0.7F) * 0.75F;

        BipedRightArm.rotateAngleX = (float) ((double) BipedRightArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
        BipedRightArm.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
    }

    private void animationThrow() {
        BipedRightArm.rotateAngleX = -1.0472F;
    }

    private void animationCast() {
        BipedRightArm.rotateAngleX = -1.0472F;
        BipedLeftArm.rotateAngleX = -1.0472F;
        BipedRightArm.rotateAngleZ = -0.261799F;
        BipedLeftArm.rotateAngleZ = +0.261799F;
    }

    @Override
    public ModelRenderer[] getLeftArm() {
        return new ModelRenderer[] {BipedBody, BipedLeftArm};
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] {BipedBody, BipedRightArm};
    }
}
