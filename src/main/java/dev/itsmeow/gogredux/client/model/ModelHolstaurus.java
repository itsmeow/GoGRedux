package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_holstaurus - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelHolstaurus extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedHat;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer stomach;
    public ModelRenderer boobs;
    public ModelRenderer head;
    public ModelRenderer bell;
    public ModelRenderer strap3;
    public ModelRenderer strap4;
    public ModelRenderer hips;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer tail01;
    public ModelRenderer leftLeg02;
    public ModelRenderer lPant;
    public ModelRenderer leftLeg03;
    public ModelRenderer leftHoof;
    public ModelRenderer rightLeg02;
    public ModelRenderer rPant;
    public ModelRenderer righttLeg03;
    public ModelRenderer rightHoof;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer strap1;
    public ModelRenderer strap2;
    public ModelRenderer upperJaw;
    public ModelRenderer snout;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar00;
    public ModelRenderer rEar00;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
    public ModelRenderer lEar01;
    public ModelRenderer rEar01;
    public ModelRenderer lHorn02;
    public ModelRenderer rHorn02;
    public ModelRenderer bellInside;

    public ModelHolstaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rPant = new ModelRenderer(this, 36, 42);
        this.rPant.mirror = true;
        this.rPant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rPant.addBox(-2.3F, -1.0F, -2.8F, 5, 5, 5, 0.0F);
        this.setRotateAngle(rPant, 0.17453292519943295F, 0.0F, 0.0F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 5, 4, 0.0F);
        this.rEar00 = new ModelRenderer(this, 47, 52);
        this.rEar00.mirror = true;
        this.rEar00.setRotationPoint(-3.4F, -5.5F, 0.0F);
        this.rEar00.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(rEar00, -0.6981317007977318F, 0.08726646259971647F, -0.3490658503988659F);
        this.hips = new ModelRenderer(this, 13, 34);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.upperJaw = new ModelRenderer(this, 13, 42);
        this.upperJaw.setRotationPoint(0.0F, -3.8F, -4.1F);
        this.upperJaw.addBox(-3.0F, -0.65F, -4.7F, 6, 3, 5, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.2F, 2.0F, 0.1F);
        this.BipedRightLeg.addBox(-1.8F, -0.9F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.3490658503988659F, 0.0F, 0.06981317007977318F);
        this.tail03 = new ModelRenderer(this, 57, 17);
        this.tail03.mirror = true;
        this.tail03.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.tail03.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(tail03, -0.08726646259971647F, 0.0F, 0.0F);
        this.tail01 = new ModelRenderer(this, 57, 17);
        this.tail01.setRotationPoint(0.0F, 1.0F, 1.4F);
        this.tail01.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail01, 0.40142572795869574F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 31, 55);
        this.snout.setRotationPoint(0.0F, -5.0F, -2.3F);
        this.snout.addBox(-2.5F, -2.05F, -6.4F, 5, 3, 6, 0.0F);
        this.setRotateAngle(snout, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 58, 31);
        this.rHorn01.mirror = true;
        this.rHorn01.setRotationPoint(-3.5F, -7.2F, 2.0F);
        this.rHorn01.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHorn01, 0.0F, 0.0F, -0.3490658503988659F);
        this.rHorn02 = new ModelRenderer(this, 57, 30);
        this.rHorn02.mirror = true;
        this.rHorn02.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.rHorn02.addBox(-0.55F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHorn02, 0.0F, 0.0F, 0.2617993877991494F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.tail02 = new ModelRenderer(this, 57, 17);
        this.tail02.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.tail02.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail02, -0.2617993877991494F, 0.0F, 0.0F);
        this.strap4 = new ModelRenderer(this, 4, 0);
        this.strap4.setRotationPoint(-2.5F, 3.8F, 2.1F);
        this.strap4.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F);
        this.setRotateAngle(strap4, 0.03490658503988659F, 0.0F, 0.0F);
        this.strap1 = new ModelRenderer(this, 0, 0);
        this.strap1.setRotationPoint(2.0F, 4.0F, -0.2F);
        this.strap1.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F);
        this.setRotateAngle(strap1, 0.8726646259971648F, 0.0F, 0.0F);
        this.bell = new ModelRenderer(this, 39, 34);
        this.bell.setRotationPoint(0.0F, 0.0F, -1.2F);
        this.bell.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(bell, -0.9948376736367678F, 0.0F, 0.0F);
        this.lEar00 = new ModelRenderer(this, 47, 52);
        this.lEar00.setRotationPoint(3.4F, -5.5F, 0.0F);
        this.lEar00.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(lEar00, -0.6981317007977318F, 0.08726646259971647F, 0.3490658503988659F);
        this.lPant = new ModelRenderer(this, 36, 42);
        this.lPant.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lPant.addBox(-2.5F, -1.0F, -2.8F, 5, 5, 5, 0.0F);
        this.setRotateAngle(lPant, 0.17453292519943295F, 0.0F, 0.0F);
        this.lHorn02 = new ModelRenderer(this, 57, 30);
        this.lHorn02.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.lHorn02.addBox(-0.45F, -2.0F, -0.49F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHorn02, 0.0F, 0.0F, -0.2617993877991494F);
        this.bellInside = new ModelRenderer(this, 49, 38);
        this.bellInside.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.bellInside.addBox(-1.5F, 0.0F, -1.5F, 3, 0, 3, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 2.0F, 0.1F);
        this.BipedLeftLeg.addBox(-2.0F, -0.9F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.3490658503988659F, 0.0F, -0.06981317007977318F);
        this.strap3 = new ModelRenderer(this, 4, 0);
        this.strap3.setRotationPoint(2.5F, 3.6F, 2.1F);
        this.strap3.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F);
        this.setRotateAngle(strap3, 0.03490658503988659F, 0.0F, 0.0F);
        this.stomach = new ModelRenderer(this, 14, 26);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
        this.BipedHat = new ModelRenderer(this, 32, 0);
        this.BipedHat.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.BipedHat.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.leftLeg03 = new ModelRenderer(this, 0, 38);
        this.leftLeg03.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.leftLeg03.addBox(-1.49F, -0.4F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg03, -0.4363323129985824F, 0.0F, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 29);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 5.8F, -0.7F);
        this.rightLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightLeg02, 0.767944870877505F, 0.0F, -0.06981317007977318F);
        this.rEar01 = new ModelRenderer(this, 52, 42);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.rEar01.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.22689280275926282F);
        this.lEar01 = new ModelRenderer(this, 52, 42);
        this.lEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.lEar01.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.22689280275926282F);
        this.strap2 = new ModelRenderer(this, 0, 0);
        this.strap2.setRotationPoint(-2.0F, 4.0F, -0.2F);
        this.strap2.addBox(-0.5F, 0.0F, 0.0F, 1, 7, 0, 0.0F);
        this.setRotateAngle(strap2, 0.8726646259971648F, 0.0F, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 13, 50);
        this.lowerJaw.setRotationPoint(0.0F, -0.9F, -3.5F);
        this.lowerJaw.addBox(-2.5F, -0.5F, -5.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(lowerJaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.boobs = new ModelRenderer(this, 0, 57);
        this.boobs.setRotationPoint(0.0F, 1.5F, -0.1F);
        this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(boobs, -0.7853981633974483F, 0.0F, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 58, 31);
        this.lHorn01.setRotationPoint(3.5F, -7.2F, 2.0F);
        this.lHorn01.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHorn01, 0.0F, 0.0F, 0.3490658503988659F);
        this.tail04 = new ModelRenderer(this, 55, 23);
        this.tail04.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.tail04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail04, -0.03490658503988659F, 0.0F, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.rightHoof = new ModelRenderer(this, 0, 47);
        this.rightHoof.mirror = true;
        this.rightHoof.setRotationPoint(0.0F, 4.3F, -0.7F);
        this.rightHoof.addBox(-1.5F, -0.7F, -1.9F, 3, 2, 4, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 29);
        this.leftLeg02.setRotationPoint(0.2F, 5.8F, -0.7F);
        this.leftLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg02, 0.767944870877505F, 0.0F, 0.06981317007977318F);
        this.leftHoof = new ModelRenderer(this, 0, 47);
        this.leftHoof.setRotationPoint(0.0F, 4.3F, -0.7F);
        this.leftHoof.addBox(-1.5F, -0.7F, -1.9F, 3, 2, 4, 0.0F);
        this.righttLeg03 = new ModelRenderer(this, 0, 38);
        this.righttLeg03.mirror = true;
        this.righttLeg03.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.righttLeg03.addBox(-1.51F, -0.4F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(righttLeg03, -0.4363323129985824F, 0.0F, 0.0F);
        this.BipedRightLeg.addChild(this.rPant);
        this.head.addChild(this.rEar00);
        this.stomach.addChild(this.hips);
        this.head.addChild(this.upperJaw);
        this.BipedBody.addChild(this.head);
        this.hips.addChild(this.BipedRightLeg);
        this.tail02.addChild(this.tail03);
        this.hips.addChild(this.tail01);
        this.head.addChild(this.snout);
        this.head.addChild(this.rHorn01);
        this.rHorn01.addChild(this.rHorn02);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.tail01.addChild(this.tail02);
        this.BipedBody.addChild(this.strap4);
        this.boobs.addChild(this.strap1);
        this.BipedBody.addChild(this.bell);
        this.head.addChild(this.lEar00);
        this.BipedLeftLeg.addChild(this.lPant);
        this.lHorn01.addChild(this.lHorn02);
        this.bell.addChild(this.bellInside);
        this.hips.addChild(this.BipedLeftLeg);
        this.BipedBody.addChild(this.strap3);
        this.BipedBody.addChild(this.stomach);
        this.leftLeg02.addChild(this.leftLeg03);
        this.BipedRightLeg.addChild(this.rightLeg02);
        this.rEar00.addChild(this.rEar01);
        this.lEar00.addChild(this.lEar01);
        this.boobs.addChild(this.strap2);
        this.head.addChild(this.lowerJaw);
        this.BipedBody.addChild(this.boobs);
        this.head.addChild(this.lHorn01);
        this.tail03.addChild(this.tail04);
        this.BipedBody.addChild(this.BipedRightArm);
        this.righttLeg03.addChild(this.rightHoof);
        this.BipedLeftLeg.addChild(this.leftLeg02);
        this.leftLeg03.addChild(this.leftHoof);
        this.rightLeg02.addChild(this.righttLeg03);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
        this.BipedHat.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        // head
        head.rotateAngleY = netHeadYaw / 57.295776F;
        head.rotateAngleX = headPitch / 57.295776F;
        BipedHat.rotateAngleY = head.rotateAngleY;
        BipedHat.rotateAngleX = head.rotateAngleX;

        // arms
        BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
        BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

        BipedRightArm.rotateAngleZ = (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.10000736613927509F;
        BipedLeftArm.rotateAngleZ = -(MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) - 0.10000736613927509F;

        tail01.rotateAngleZ = (float) (Math.cos(Math.toRadians((float) entityIn.ticksExisted * 7F)) * Math.toRadians(15F));

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount - 0.3490658503988659F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount - 0.3490658503988659F;
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public ModelRenderer[] getLeftArm() {
        return new ModelRenderer[] { BipedBody, BipedLeftArm };
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] { BipedBody, BipedRightArm };
    }
}
