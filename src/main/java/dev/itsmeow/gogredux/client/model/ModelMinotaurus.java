package dev.itsmeow.gogredux.client.model;

import gaia.entity.monster.EntityGaiaMinotaurus;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_minotaurus - cybercat5555
 * Created using Tabula 7.1.0
 */
public class ModelMinotaurus extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedHat;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer stomach;
    public ModelRenderer boobs;
    public ModelRenderer head;
    public ModelRenderer leftShoulder;
    public ModelRenderer leftBracer;
    public ModelRenderer rightShoulder;
    public ModelRenderer rightBracer;
    public ModelRenderer hips;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer tail01;
    public ModelRenderer leftLeg02;
    public ModelRenderer leftLeg03;
    public ModelRenderer leftHoof;
    public ModelRenderer rightLeg02;
    public ModelRenderer righttLeg03;
    public ModelRenderer rightHoof;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer upperJaw;
    public ModelRenderer snout;
    public ModelRenderer lowerJaw;
    public ModelRenderer lEar00;
    public ModelRenderer rEar00;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
    public ModelRenderer lEar01;
    public ModelRenderer rEar01;
    public ModelRenderer lHorn02a;
    public ModelRenderer lHorn02b;
    public ModelRenderer lHorn02c;
    public ModelRenderer lHorn02d;
    public ModelRenderer lHorn03;
    public ModelRenderer lHorn04;
    public ModelRenderer rHorn02a;
    public ModelRenderer rHorn02b;
    public ModelRenderer rHorn02c;
    public ModelRenderer rHorn02d;
    public ModelRenderer rHorn03;
    public ModelRenderer rHorn04;

    public ModelMinotaurus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.leftShoulder = new ModelRenderer(this, 40, 33);
        this.leftShoulder.setRotationPoint(0.1F, -0.2F, 0.0F);
        this.leftShoulder.addBox(-0.8F, -2.2F, -2.5F, 3, 5, 5, 0.0F);
        this.lHorn02b = new ModelRenderer(this, 57, 30);
        this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02b.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.tail01 = new ModelRenderer(this, 57, 17);
        this.tail01.setRotationPoint(0.0F, 1.0F, 1.4F);
        this.tail01.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail01, 0.40142572795869574F, 0.0F, 0.0F);
        this.lHorn02d = new ModelRenderer(this, 57, 30);
        this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02d.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.rHorn02a = new ModelRenderer(this, 57, 30);
        this.rHorn02a.mirror = true;
        this.rHorn02a.setRotationPoint(-0.3F, -2.0F, 0.0F);
        this.rHorn02a.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rHorn02a, 0.0F, 0.0F, 0.6981317007977318F);
        this.rHorn02b = new ModelRenderer(this, 57, 29);
        this.rHorn02b.mirror = true;
        this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02b.addBox(-0.2F, -3.0F, -0.81F, 1, 3, 1, 0.0F);
        this.stomach = new ModelRenderer(this, 14, 26);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
        this.leftBracer = new ModelRenderer(this, 34, 45);
        this.leftBracer.setRotationPoint(0.5F, 7.3F, 0.0F);
        this.leftBracer.addBox(-2.0F, -0.5F, -2.5F, 4, 1, 5, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 29);
        this.leftLeg02.setRotationPoint(0.2F, 5.8F, -0.7F);
        this.leftLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg02, 0.767944870877505F, 0.0F, 0.06981317007977318F);
        this.leftHoof = new ModelRenderer(this, 0, 47);
        this.leftHoof.setRotationPoint(0.0F, 4.3F, -0.7F);
        this.leftHoof.addBox(-1.5F, -0.7F, -1.9F, 3, 2, 4, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 55, 29);
        this.rHorn01.mirror = true;
        this.rHorn01.setRotationPoint(-2.5F, -6.5F, 2.0F);
        this.rHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rHorn01, 0.0F, 0.0F, -1.1344640137963142F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 5, 4, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 29);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 5.8F, -0.7F);
        this.rightLeg02.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightLeg02, 0.767944870877505F, 0.0F, -0.06981317007977318F);
        this.boobs = new ModelRenderer(this, 0, 57);
        this.boobs.setRotationPoint(0.0F, 1.5F, -0.1F);
        this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(boobs, -0.6108652381980153F, 0.0F, 0.0F);
        this.rightHoof = new ModelRenderer(this, 0, 47);
        this.rightHoof.mirror = true;
        this.rightHoof.setRotationPoint(0.0F, 4.3F, -0.7F);
        this.rightHoof.addBox(-1.5F, -0.7F, -1.9F, 3, 2, 4, 0.0F);
        this.lowerJaw = new ModelRenderer(this, 13, 50);
        this.lowerJaw.setRotationPoint(0.0F, -0.9F, -3.5F);
        this.lowerJaw.addBox(-2.5F, -0.5F, -5.0F, 5, 1, 6, 0.0F);
        this.setRotateAngle(lowerJaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.rightShoulder = new ModelRenderer(this, 40, 33);
        this.rightShoulder.mirror = true;
        this.rightShoulder.setRotationPoint(0.5F, -0.2F, 0.0F);
        this.rightShoulder.addBox(-2.8F, -2.2F, -2.5F, 3, 5, 5, 0.0F);
        this.rHorn02d = new ModelRenderer(this, 57, 30);
        this.rHorn02d.mirror = true;
        this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02d.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
        this.BipedHat = new ModelRenderer(this, 32, 0);
        this.BipedHat.setRotationPoint(0.0F, -2.1F, 0.0F);
        this.BipedHat.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F);
        this.rHorn04 = new ModelRenderer(this, 57, 29);
        this.rHorn04.mirror = true;
        this.rHorn04.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.rHorn04.addBox(-0.55F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHorn04, 0.0F, 0.0F, 0.40142572795869574F);
        this.lHorn02a = new ModelRenderer(this, 57, 29);
        this.lHorn02a.setRotationPoint(0.3F, -2.0F, 0.0F);
        this.lHorn02a.addBox(-0.8F, -3.0F, -0.81F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lHorn02a, 0.0F, 0.0F, -0.6981317007977318F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.2F, 2.0F, 0.1F);
        this.BipedRightLeg.addBox(-1.8F, -0.9F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.3490658503988659F, 0.0F, 0.06981317007977318F);
        this.leftLeg03 = new ModelRenderer(this, 0, 38);
        this.leftLeg03.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.leftLeg03.addBox(-1.49F, -0.4F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg03, -0.4363323129985824F, 0.0F, 0.0F);
        this.tail04 = new ModelRenderer(this, 55, 23);
        this.tail04.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.tail04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(tail04, -0.03490658503988659F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 32, 55);
        this.snout.setRotationPoint(0.0F, -5.0F, -2.3F);
        this.snout.addBox(-2.5F, -2.05F, -6.4F, 5, 3, 6, 0.0F);
        this.setRotateAngle(snout, 0.3490658503988659F, 0.0F, 0.0F);
        this.rightBracer = new ModelRenderer(this, 34, 45);
        this.rightBracer.mirror = true;
        this.rightBracer.setRotationPoint(-0.5F, 7.3F, 0.0F);
        this.rightBracer.addBox(-2.0F, -0.5F, -2.5F, 4, 1, 5, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 2.0F, 0.1F);
        this.BipedLeftLeg.addBox(-2.0F, -0.9F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.3490658503988659F, 0.0F, -0.06981317007977318F);
        this.tail03 = new ModelRenderer(this, 57, 17);
        this.tail03.mirror = true;
        this.tail03.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.tail03.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
        this.setRotateAngle(tail03, -0.08726646259971647F, 0.0F, 0.0F);
        this.lHorn02c = new ModelRenderer(this, 57, 30);
        this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02c.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
        this.lEar00 = new ModelRenderer(this, 47, 51);
        this.lEar00.setRotationPoint(3.4F, -5.5F, 0.0F);
        this.lEar00.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(lEar00, -0.6981317007977318F, 0.08726646259971647F, 0.3490658503988659F);
        this.upperJaw = new ModelRenderer(this, 13, 42);
        this.upperJaw.mirror = true;
        this.upperJaw.setRotationPoint(0.0F, -3.8F, -4.1F);
        this.upperJaw.addBox(-3.0F, -0.65F, -4.7F, 6, 3, 5, 0.0F);
        this.hips = new ModelRenderer(this, 13, 34);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 55, 29);
        this.lHorn01.setRotationPoint(2.5F, -6.5F, 2.0F);
        this.lHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lHorn01, 0.0F, 0.0F, 1.1344640137963142F);
        this.lEar01 = new ModelRenderer(this, 52, 46);
        this.lEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.lEar01.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.22689280275926282F);
        this.righttLeg03 = new ModelRenderer(this, 0, 38);
        this.righttLeg03.mirror = true;
        this.righttLeg03.setRotationPoint(0.0F, 4.7F, 0.0F);
        this.righttLeg03.addBox(-1.51F, -0.4F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(righttLeg03, -0.4363323129985824F, 0.0F, 0.0F);
        this.rHorn02c = new ModelRenderer(this, 57, 30);
        this.rHorn02c.mirror = true;
        this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02c.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, 0.0F);
        this.lHorn03 = new ModelRenderer(this, 57, 29);
        this.lHorn03.setRotationPoint(0.1F, -2.7F, 0.0F);
        this.lHorn03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHorn03, 0.0F, 0.0F, -0.6108652381980153F);
        this.tail02 = new ModelRenderer(this, 57, 17);
        this.tail02.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.tail02.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(tail02, -0.2617993877991494F, 0.0F, 0.0F);
        this.rHorn03 = new ModelRenderer(this, 57, 29);
        this.rHorn03.mirror = true;
        this.rHorn03.setRotationPoint(-0.1F, -2.7F, 0.0F);
        this.rHorn03.addBox(-0.5F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rHorn03, 0.0F, 0.0F, 0.6108652381980153F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.lHorn04 = new ModelRenderer(this, 57, 29);
        this.lHorn04.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.lHorn04.addBox(-0.45F, -2.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lHorn04, 0.0F, 0.0F, -0.40142572795869574F);
        this.rEar01 = new ModelRenderer(this, 52, 46);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.rEar01.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.22689280275926282F);
        this.rEar00 = new ModelRenderer(this, 47, 51);
        this.rEar00.mirror = true;
        this.rEar00.setRotationPoint(-3.4F, -5.5F, 0.0F);
        this.rEar00.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, 0.0F);
        this.setRotateAngle(rEar00, -0.6981317007977318F, 0.08726646259971647F, -0.3490658503988659F);
        this.BipedLeftArm.addChild(this.leftShoulder);
        this.lHorn02a.addChild(this.lHorn02b);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.hips.addChild(this.tail01);
        this.lHorn02a.addChild(this.lHorn02d);
        this.BipedBody.addChild(this.head);
        this.rHorn01.addChild(this.rHorn02a);
        this.rHorn02a.addChild(this.rHorn02b);
        this.BipedBody.addChild(this.stomach);
        this.BipedLeftArm.addChild(this.leftBracer);
        this.BipedLeftLeg.addChild(this.leftLeg02);
        this.leftLeg03.addChild(this.leftHoof);
        this.head.addChild(this.rHorn01);
        this.BipedRightLeg.addChild(this.rightLeg02);
        this.BipedBody.addChild(this.boobs);
        this.righttLeg03.addChild(this.rightHoof);
        this.head.addChild(this.lowerJaw);
        this.BipedRightArm.addChild(this.rightShoulder);
        this.rHorn02a.addChild(this.rHorn02d);
        this.rHorn03.addChild(this.rHorn04);
        this.lHorn01.addChild(this.lHorn02a);
        this.hips.addChild(this.BipedRightLeg);
        this.leftLeg02.addChild(this.leftLeg03);
        this.tail03.addChild(this.tail04);
        this.head.addChild(this.snout);
        this.BipedRightArm.addChild(this.rightBracer);
        this.hips.addChild(this.BipedLeftLeg);
        this.tail02.addChild(this.tail03);
        this.lHorn02a.addChild(this.lHorn02c);
        this.head.addChild(this.lEar00);
        this.head.addChild(this.upperJaw);
        this.stomach.addChild(this.hips);
        this.head.addChild(this.lHorn01);
        this.lEar00.addChild(this.lEar01);
        this.rightLeg02.addChild(this.righttLeg03);
        this.rHorn02a.addChild(this.rHorn02c);
        this.lHorn02a.addChild(this.lHorn03);
        this.tail01.addChild(this.tail02);
        this.rHorn02a.addChild(this.rHorn03);
        this.BipedBody.addChild(this.BipedRightArm);
        this.lHorn03.addChild(this.lHorn04);
        this.rEar00.addChild(this.rEar01);
        this.head.addChild(this.rEar00);
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
        BipedHat.rotateAngleX = head.rotateAngleX;
        BipedHat.rotateAngleY = head.rotateAngleY;

        // arms
        BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
        BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

        BipedRightArm.rotateAngleZ = 0.0F;
        BipedLeftArm.rotateAngleZ = 0.0F;

        ItemStack itemstack = ((EntityLivingBase) entityIn).getHeldItemMainhand();
        EntityGaiaMinotaurus entity = (EntityGaiaMinotaurus) entityIn;

        if (entity.isSwingingArms() && (itemstack.getItem() == Items.BOW)) {
            holdingBow(ageInTicks);
        } else if (swingProgress > -9990.0F) {
            holdingMelee();
        }

        BipedRightArm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.10000736613927509F;
        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        BipedLeftArm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.10000736613927509F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

        // body
        tail01.rotateAngleZ = (float) (Math.cos(Math.toRadians((float) entityIn.ticksExisted * 7F)) * Math.toRadians(15F));

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount - 0.3490658503988659F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount - 0.3490658503988659F;
    }

    private void holdingBow(float ageInTicks) {
        float f = MathHelper.sin(swingProgress * (float) Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - swingProgress) * (1.0F - swingProgress)) * (float) Math.PI);

        BipedRightArm.rotateAngleZ = -0.3F;
        BipedLeftArm.rotateAngleZ = 0.3F;
        BipedRightArm.rotateAngleY = -(0.1F - f * 0.6F);
        BipedLeftArm.rotateAngleY = 0.3F - f * 0.6F;
        BipedRightArm.rotateAngleX = -((float) Math.PI / 2F);
        BipedLeftArm.rotateAngleX = -((float) Math.PI / 2F);
        BipedRightArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
        BipedLeftArm.rotateAngleX -= f * 1.2F - f1 * 0.4F;
        BipedRightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        BipedLeftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }

    public void holdingMelee() {
        float f6;
        float f7;

        f6 = 1.0F - swingProgress;
        f6 *= f6;
        f6 *= f6;
        f6 = 1.0F - f6;
        f7 = MathHelper.sin(f6 * (float) Math.PI);
        float f8 = MathHelper.sin(swingProgress * (float) Math.PI) * -(head.rotateAngleX - 0.7F) * 0.75F;

        BipedRightArm.rotateAngleX = (float) ((double) BipedRightArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
        BipedRightArm.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
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
