package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_oni - cybercat5555 Created using Tabula 7.0.1
 */
public class ModelOni extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer leftPec;
    public ModelRenderer rightPec;
    public ModelRenderer belly;
    public ModelRenderer loinclothF;
    public ModelRenderer lHair;
    public ModelRenderer leftShoulderPad;
    public ModelRenderer rightShoulderPad;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
    public ModelRenderer lowerJaw;
    public ModelRenderer upperJaw;
    public ModelRenderer hair00;
    public ModelRenderer hair01;
    public ModelRenderer rHair;
    public ModelRenderer nose;
    public ModelRenderer lHorn02a;
    public ModelRenderer lHorn02b;
    public ModelRenderer lHorn02c;
    public ModelRenderer lHorn02d;
    public ModelRenderer lHorn03;
    public ModelRenderer rHorn02a;
    public ModelRenderer rHorn02b;
    public ModelRenderer rHorn02c;
    public ModelRenderer rHorn02d;
    public ModelRenderer rHorn03;
    public ModelRenderer lTusk01;
    public ModelRenderer rTusk01;
    public ModelRenderer lTusk02;
    public ModelRenderer rTusk02;
    public ModelRenderer loinclothL;
    public ModelRenderer loinclothR;

    public ModelOni() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.hair00 = new ModelRenderer(this, 38, 51);
        this.hair00.setRotationPoint(0.0F, -5.5F, 3.2F);
        this.hair00.addBox(-3.99F, 0.0F, -1.0F, 8, 11, 2, 0.0F);
        this.setRotateAngle(hair00, 0.13962634015954636F, 0.0F, 0.0F);
        this.belly = new ModelRenderer(this, 16, 33);
        this.belly.setRotationPoint(0.0F, 8.9F, -0.6F);
        this.belly.addBox(-3.5F, -3.5F, -3.0F, 7, 7, 3, 0.0F);
        this.setRotateAngle(belly, -0.13962634015954636F, 0.0F, 0.0F);
        this.loinclothL = new ModelRenderer(this, 0, 48);
        this.loinclothL.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.loinclothL.addBox(-1.8F, -0.2F, -2.6F, 4, 7, 5, 0.0F);
        this.setRotateAngle(loinclothL, 0.03490658503988659F, 0.0F, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 33);
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-3.0F, -1.6F, -2.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.lHair = new ModelRenderer(this, 45, 0);
        this.lHair.setRotationPoint(2.3F, -5.7F, 0.6F);
        this.lHair.addBox(0.0F, -0.7F, -3.5F, 2, 9, 7, 0.0F);
        this.setRotateAngle(lHair, -0.08726646259971647F, 0.0F, -0.13962634015954636F);
        this.rHorn02b = new ModelRenderer(this, 25, 0);
        this.rHorn02b.mirror = true;
        this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02b.addBox(-0.2F, -2.0F, -0.8F, 1, 3, 1, 0.0F);
        this.leftShoulderPad = new ModelRenderer(this, 15, 43);
        this.leftShoulderPad.setRotationPoint(0.4F, -0.5F, 0.0F);
        this.leftShoulderPad.addBox(-1.2F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 0, 0);
        this.rHorn01.mirror = true;
        this.rHorn01.setRotationPoint(-2.0F, -7.2F, -3.3F);
        this.rHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rHorn01, 0.7853981633974483F, 0.0F, -0.2792526803190927F);
        this.lHorn02c = new ModelRenderer(this, 25, 0);
        this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02c.addBox(-0.8F, -2.0F, -0.2F, 1, 3, 1, 0.0F);
        this.lHorn02b = new ModelRenderer(this, 25, 0);
        this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02b.addBox(-0.2F, -2.0F, -0.8F, 1, 3, 1, 0.0F);
        this.lHorn03 = new ModelRenderer(this, 25, 4);
        this.lHorn03.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.lHorn03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHorn03, -0.40142572795869574F, 0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 33, 0);
        this.lowerJaw.setRotationPoint(0.0F, -2.2F, -1.4F);
        this.lowerJaw.addBox(-2.5F, 0.0F, -4.0F, 5, 3, 4, 0.0F);
        this.setRotateAngle(lowerJaw, 0.41887902047863906F, 0.0F, 0.0F);
        this.rTusk02 = new ModelRenderer(this, 35, 9);
        this.rTusk02.mirror = true;
        this.rTusk02.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.rTusk02.addBox(-0.5F, 0.0F, -0.55F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rTusk02, 0.2617993877991494F, 0.0F, 0.17453292519943295F);
        this.hair01 = new ModelRenderer(this, 19, 54);
        this.hair01.mirror = true;
        this.hair01.setRotationPoint(0.0F, -7.2F, 3.2F);
        this.hair01.addBox(-4.01F, 0.0F, -0.1F, 8, 8, 1, 0.0F);
        this.setRotateAngle(hair01, 0.2792526803190927F, 0.0F, 0.0F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.nose = new ModelRenderer(this, 36, 13);
        this.nose.setRotationPoint(0.0F, -3.0F, -3.3F);
        this.nose.addBox(-1.5F, -0.4F, -1.1F, 3, 3, 1, 0.0F);
        this.setRotateAngle(nose, -0.7853981633974483F, 0.0F, 0.0F);
        this.loinclothF = new ModelRenderer(this, 0, 41);
        this.loinclothF.setRotationPoint(0.0F, 12.8F, -1.6F);
        this.loinclothF.addBox(-3.5F, -0.1F, -0.8F, 7, 6, 1, 0.0F);
        this.rHair = new ModelRenderer(this, 45, 0);
        this.rHair.mirror = true;
        this.rHair.setRotationPoint(-2.3F, -5.7F, 0.6F);
        this.rHair.addBox(-2.0F, -0.7F, -3.5F, 2, 9, 7, 0.0F);
        this.setRotateAngle(rHair, -0.08726646259971647F, 0.0F, 0.13962634015954636F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -1.9F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 13, 4, 0.0F);
        this.rightPec = new ModelRenderer(this, 0, 33);
        this.rightPec.mirror = true;
        this.rightPec.setRotationPoint(-2.2F, 2.7F, -0.1F);
        this.rightPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(rightPec, 0.0F, 0.08726646259971647F, -0.08726646259971647F);
        this.rHorn02d = new ModelRenderer(this, 25, 0);
        this.rHorn02d.mirror = true;
        this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02d.addBox(-0.2F, -2.0F, -0.2F, 1, 3, 1, 0.0F);
        this.lTusk01 = new ModelRenderer(this, 35, 9);
        this.lTusk01.setRotationPoint(2.8F, 0.3F, -1.8F);
        this.lTusk01.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lTusk01, 0.0F, 0.0F, -0.17453292519943295F);
        this.rHorn03 = new ModelRenderer(this, 25, 4);
        this.rHorn03.mirror = true;
        this.rHorn03.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.rHorn03.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHorn03, -0.40142572795869574F, 0.0F, 0.0F);
        this.rHorn02c = new ModelRenderer(this, 25, 0);
        this.rHorn02c.mirror = true;
        this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02c.addBox(-0.8F, -2.0F, -0.2F, 1, 3, 1, 0.0F);
        this.rTusk01 = new ModelRenderer(this, 35, 9);
        this.rTusk01.mirror = true;
        this.rTusk01.setRotationPoint(-2.8F, 0.3F, -1.8F);
        this.rTusk01.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rTusk01, 0.0F, 0.0F, 0.17453292519943295F);
        this.loinclothR = new ModelRenderer(this, 0, 48);
        this.loinclothR.mirror = true;
        this.loinclothR.setRotationPoint(0.0F, -0.3F, 0.0F);
        this.loinclothR.addBox(-2.2F, -0.2F, -2.6F, 4, 7, 5, 0.0F);
        this.setRotateAngle(loinclothR, 0.03490658503988659F, 0.0F, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 0, 0);
        this.lHorn01.setRotationPoint(2.0F, -7.2F, -3.3F);
        this.lHorn01.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lHorn01, 0.7853981633974483F, 0.0F, 0.2792526803190927F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 13.0F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 13, 4, 0.0F);
        this.upperJaw = new ModelRenderer(this, 0, 60);
        this.upperJaw.setRotationPoint(0.0F, -1.2F, -2.6F);
        this.upperJaw.addBox(-3.5F, -0.6F, -2.0F, 7, 2, 2, 0.0F);
        this.setRotateAngle(upperJaw, -0.12217304763960307F, 0.0F, 0.0F);
        this.lTusk02 = new ModelRenderer(this, 35, 9);
        this.lTusk02.setRotationPoint(0.0F, 1.8F, 0.0F);
        this.lTusk02.addBox(-0.5F, 0.0F, -0.55F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lTusk02, 0.2617993877991494F, 0.0F, -0.17453292519943295F);
        this.leftPec = new ModelRenderer(this, 0, 33);
        this.leftPec.setRotationPoint(2.2F, 2.7F, -0.1F);
        this.leftPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(leftPec, 0.0F, -0.08726646259971647F, 0.08726646259971647F);
        this.lHorn02a = new ModelRenderer(this, 25, 0);
        this.lHorn02a.setRotationPoint(0.0F, -2.3F, 0.2F);
        this.lHorn02a.addBox(-0.8F, -2.0F, -0.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHorn02a, -0.3490658503988659F, 0.0F, 0.0F);
        this.lHorn02d = new ModelRenderer(this, 25, 0);
        this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02d.addBox(-0.2F, -2.0F, -0.2F, 1, 3, 1, 0.0F);
        this.rHorn02a = new ModelRenderer(this, 25, 0);
        this.rHorn02a.mirror = true;
        this.rHorn02a.setRotationPoint(0.0F, -2.3F, 0.2F);
        this.rHorn02a.addBox(-0.8F, -2.0F, -0.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHorn02a, -0.3490658503988659F, 0.0F, 0.0F);
        this.rightShoulderPad = new ModelRenderer(this, 15, 43);
        this.rightShoulderPad.mirror = true;
        this.rightShoulderPad.setRotationPoint(0.2F, -0.5F, 0.0F);
        this.rightShoulderPad.addBox(-3.4F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -1.6F, -2.0F, 4, 13, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.0F, 13.0F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 13, 4, 0.0F);
        this.BipedHead.addChild(this.hair00);
        this.BipedBody.addChild(this.belly);
        this.BipedLeftLeg.addChild(this.loinclothL);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedBody.addChild(this.lHair);
        this.rHorn02a.addChild(this.rHorn02b);
        this.BipedLeftArm.addChild(this.leftShoulderPad);
        this.BipedHead.addChild(this.rHorn01);
        this.lHorn02a.addChild(this.lHorn02c);
        this.lHorn02a.addChild(this.lHorn02b);
        this.lHorn02a.addChild(this.lHorn03);
        this.BipedHead.addChild(this.lowerJaw);
        this.rTusk01.addChild(this.rTusk02);
        this.BipedHead.addChild(this.hair01);
        this.BipedBody.addChild(this.BipedHead);
        this.BipedHead.addChild(this.nose);
        this.BipedBody.addChild(this.loinclothF);
        this.BipedHead.addChild(this.rHair);
        this.BipedBody.addChild(this.rightPec);
        this.rHorn02a.addChild(this.rHorn02d);
        this.upperJaw.addChild(this.lTusk01);
        this.rHorn02a.addChild(this.rHorn03);
        this.rHorn02a.addChild(this.rHorn02c);
        this.upperJaw.addChild(this.rTusk01);
        this.BipedRightLeg.addChild(this.loinclothR);
        this.BipedHead.addChild(this.lHorn01);
        this.BipedBody.addChild(this.BipedLeftLeg);
        this.BipedHead.addChild(this.upperJaw);
        this.lTusk01.addChild(this.lTusk02);
        this.BipedBody.addChild(this.leftPec);
        this.lHorn01.addChild(this.lHorn02a);
        this.lHorn02a.addChild(this.lHorn02d);
        this.rHorn01.addChild(this.rHorn02a);
        this.BipedRightArm.addChild(this.rightShoulderPad);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.BipedBody.addChild(this.BipedRightLeg);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = headPitch / 57.295776F;

        // arms
        if(itemstack.isEmpty()) {
            BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
            BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

            BipedRightArm.rotateAngleZ = 0.0F;
            BipedLeftArm.rotateAngleZ = 0.0F;

            if(swingProgress > -9990.0F) {
                holdingMelee();
            }

            float armDefaultAngleZ = 0.1745329F;

            BipedRightArm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + armDefaultAngleZ;
            BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            BipedLeftArm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + armDefaultAngleZ;
            BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }

        if(itemstack.getItem() == Items.STICK) {
            animationBuff();
        }

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;
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
        float f8 = MathHelper.sin(swingProgress * (float) Math.PI) * -(BipedHead.rotateAngleX - 0.7F) * 0.75F;

        BipedRightArm.rotateAngleX = (float) ((double) BipedRightArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
        BipedRightArm.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
    }

    private void animationBuff() {
        BipedRightArm.rotateAngleX = 0.0F;
        BipedLeftArm.rotateAngleX = 0.0F;
        BipedRightArm.rotateAngleZ = +0.785398F;
        BipedLeftArm.rotateAngleZ = -0.785398F;
    }

    @Override
    public ModelRenderer getLeftArm() {
        return BipedLeftArm;
    }

    @Override
    public ModelRenderer getRightArm() {
        return BipedRightArm;
    }
}
