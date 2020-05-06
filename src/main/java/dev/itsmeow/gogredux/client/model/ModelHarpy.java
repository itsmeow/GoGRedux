package dev.itsmeow.gogredux.client.model;

import gaia.entity.monster.EntityGaiaHarpy;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_harpy - cybercat5555
 * Created using Tabula 7.1.0
 */
public class ModelHarpy extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedHead;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer stomach;
    public ModelRenderer boobs;
    public ModelRenderer hair01;
    public ModelRenderer hair00;
    public ModelRenderer lArm01;
    public ModelRenderer leftWing02;
    public ModelRenderer lClaw01;
    public ModelRenderer lClaw02;
    public ModelRenderer leftWing01;
    public ModelRenderer rArm01;
    public ModelRenderer rightWing02;
    public ModelRenderer rClaw01;
    public ModelRenderer rClaw02;
    public ModelRenderer rightWing01;
    public ModelRenderer hips;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer tail01;
    public ModelRenderer leftLeg01;
    public ModelRenderer leftLeg02;
    public ModelRenderer leftFoot;
    public ModelRenderer lTalon01;
    public ModelRenderer lTalon02;
    public ModelRenderer lTalon03;
    public ModelRenderer lTalon04;
    public ModelRenderer rightLeg01;
    public ModelRenderer rightLeg02;
    public ModelRenderer rightFoot;
    public ModelRenderer rTalon01;
    public ModelRenderer rTalon02;
    public ModelRenderer rTalon03;
    public ModelRenderer rTalon04;
    public ModelRenderer tailPlumeL;
    public ModelRenderer tailPlumeR;
    public ModelRenderer tailPlumeM;

    public ModelHarpy() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rTalon01 = new ModelRenderer(this, 0, 0);
        this.rTalon01.mirror = true;
        this.rTalon01.setRotationPoint(-0.7F, 0.4F, -1.9F);
        this.rTalon01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rTalon01, 0.13962634015954636F, 0.3490658503988659F, 0.0F);
        this.lTalon03 = new ModelRenderer(this, 0, 0);
        this.lTalon03.setRotationPoint(-0.7F, 0.4F, -1.9F);
        this.lTalon03.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lTalon03, 0.13962634015954636F, 0.3490658503988659F, 0.0F);
        this.tail01 = new ModelRenderer(this, 6, 53);
        this.tail01.setRotationPoint(0.0F, 1.3F, 1.1F);
        this.tail01.addBox(-1.5F, -1.0F, 0.0F, 3, 1, 3, 0.0F);
        this.setRotateAngle(tail01, -0.5235987755982988F, 0.0F, 0.0F);
        this.leftWing01 = new ModelRenderer(this, 41, 43);
        this.leftWing01.setRotationPoint(0.3F, 5.5F, 0.8F);
        this.leftWing01.addBox(-0.5F, -5.7F, 0.0F, 1, 11, 10, 0.0F);
        this.setRotateAngle(leftWing01, 0.0F, 0.12217304763960307F, 0.0F);
        this.rightWing02 = new ModelRenderer(this, 41, 23);
        this.rightWing02.mirror = true;
        this.rightWing02.setRotationPoint(-0.8F, 3.3F, -0.2F);
        this.rightWing02.addBox(-0.5F, -5.5F, 0.0F, 1, 11, 9, 0.0F);
        this.setRotateAngle(rightWing02, -0.3490658503988659F, -0.06981317007977318F, 0.05235987755982988F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.3F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(BipedHead, -0.5235987755982988F, 0.0F, 0.0F);
        this.lTalon02 = new ModelRenderer(this, 0, 0);
        this.lTalon02.setRotationPoint(0.0F, 0.4F, -2.2F);
        this.lTalon02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lTalon02, 0.13962634015954636F, 0.0F, 0.0F);
        this.leftLeg01 = new ModelRenderer(this, 0, 29);
        this.leftLeg01.setRotationPoint(0.0F, 4.7F, -0.8F);
        this.leftLeg01.addBox(-1.5F, -0.3F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.boobs = new ModelRenderer(this, 0, 57);
        this.boobs.setRotationPoint(0.0F, 1.5F, -0.1F);
        this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(boobs, -0.6108652381980153F, 0.0F, 0.0F);
        this.lClaw01 = new ModelRenderer(this, 0, 0);
        this.lClaw01.setRotationPoint(0.4F, 9.0F, -0.6F);
        this.lClaw01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lClaw01, 1.7453292519943295F, -1.1344640137963142F, 0.0F);
        this.rTalon02 = new ModelRenderer(this, 0, 0);
        this.rTalon02.mirror = true;
        this.rTalon02.setRotationPoint(0.0F, 0.4F, -2.2F);
        this.rTalon02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rTalon02, 0.13962634015954636F, 0.0F, 0.0F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -2.2F, -4.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 6, 4, 0.0F);
        this.setRotateAngle(BipedBody, 0.5235987755982988F, 0.0F, 0.0F);
        this.stomach = new ModelRenderer(this, 14, 26);
        this.stomach.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 5, 4, 0.0F);
        this.setRotateAngle(stomach, -0.2617993877991494F, 0.0F, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 17);
        this.BipedLeftLeg.setRotationPoint(2.1F, 2.5F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.5235987755982988F, -0.12217304763960307F, 0.0F);
        this.rightWing01 = new ModelRenderer(this, 41, 43);
        this.rightWing01.mirror = true;
        this.rightWing01.setRotationPoint(-0.3F, 5.5F, 0.8F);
        this.rightWing01.addBox(-0.5F, -5.7F, 0.0F, 1, 11, 10, 0.0F);
        this.setRotateAngle(rightWing01, 0.0F, -0.12217304763960307F, 0.0F);
        this.hair00 = new ModelRenderer(this, 37, 0);
        this.hair00.setRotationPoint(0.0F, -6.3F, 2.7F);
        this.hair00.addBox(-3.99F, 0.0F, -1.0F, 8, 11, 2, 0.0F);
        this.setRotateAngle(hair00, 0.3490658503988659F, 0.0F, 0.0F);
        this.lTalon04 = new ModelRenderer(this, 24, 0);
        this.lTalon04.setRotationPoint(0.0F, 0.2F, 1.3F);
        this.lTalon04.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lTalon04, -0.17453292519943295F, 0.0F, 0.0F);
        this.rClaw02 = new ModelRenderer(this, 0, 0);
        this.rClaw02.mirror = true;
        this.rClaw02.setRotationPoint(-0.3F, 8.5F, 0.6F);
        this.rClaw02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rClaw02, 1.7453292519943295F, 1.1344640137963142F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 37);
        this.leftLeg02.setRotationPoint(0.0F, 3.9F, 0.6F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftLeg02, -0.6981317007977318F, 0.0F, 0.0F);
        this.rArm01 = new ModelRenderer(this, 53, 17);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-1.0F, 4.2F, 0.4F);
        this.rArm01.addBox(-1.0F, -0.2F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(rArm01, -0.7853981633974483F, 0.0F, 0.0F);
        this.lTalon01 = new ModelRenderer(this, 0, 0);
        this.lTalon01.setRotationPoint(0.7F, 0.4F, -1.9F);
        this.lTalon01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lTalon01, 0.13962634015954636F, -0.3490658503988659F, 0.0F);
        this.rTalon03 = new ModelRenderer(this, 0, 0);
        this.rTalon03.mirror = true;
        this.rTalon03.setRotationPoint(0.7F, 0.4F, -1.9F);
        this.rTalon03.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rTalon03, 0.13962634015954636F, -0.3490658503988659F, 0.0F);
        this.hips = new ModelRenderer(this, 13, 35);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.2F);
        this.hips.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.setRotateAngle(hips, -0.12217304763960307F, 0.0F, 0.0F);
        this.rightFoot = new ModelRenderer(this, 0, 48);
        this.rightFoot.mirror = true;
        this.rightFoot.setRotationPoint(0.0F, 6.6F, 0.0F);
        this.rightFoot.addBox(-1.01F, 0.0F, -2.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rightFoot, 0.12217304763960307F, 0.0F, -0.03490658503988659F);
        this.lArm01 = new ModelRenderer(this, 53, 17);
        this.lArm01.setRotationPoint(-0.1F, 4.2F, 0.4F);
        this.lArm01.addBox(-1.0F, -0.2F, -1.0F, 2, 9, 2, 0.0F);
        this.setRotateAngle(lArm01, -0.7853981633974483F, 0.0F, 0.0F);
        this.rClaw01 = new ModelRenderer(this, 0, 0);
        this.rClaw01.mirror = true;
        this.rClaw01.setRotationPoint(-0.4F, 9.0F, -0.6F);
        this.rClaw01.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rClaw01, 1.7453292519943295F, 1.1344640137963142F, 0.0F);
        this.leftWing02 = new ModelRenderer(this, 41, 23);
        this.leftWing02.setRotationPoint(-0.1F, 3.3F, -0.2F);
        this.leftWing02.addBox(-0.5F, -5.5F, 0.0F, 1, 11, 9, 0.0F);
        this.setRotateAngle(leftWing02, -0.3490658503988659F, 0.06981317007977318F, -0.05235987755982988F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 17);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.1F, 2.5F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.5235987755982988F, 0.12217304763960307F, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 37);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 3.9F, 0.6F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightLeg02, -0.6981317007977318F, 0.0F, 0.0F);
        this.tailPlumeL = new ModelRenderer(this, 7, 43);
        this.tailPlumeL.setRotationPoint(-0.9F, -0.3F, 1.2F);
        this.tailPlumeL.addBox(-0.5F, -0.3F, -0.2F, 6, 0, 10, 0.0F);
        this.setRotateAngle(tailPlumeL, 0.0F, 0.3141592653589793F, 0.17453292519943295F);
        this.leftFoot = new ModelRenderer(this, 0, 48);
        this.leftFoot.setRotationPoint(0.0F, 6.6F, 0.0F);
        this.leftFoot.addBox(-0.99F, 0.0F, -2.1F, 2, 1, 3, 0.0F);
        this.setRotateAngle(leftFoot, 0.12217304763960307F, 0.0F, 0.03490658503988659F);
        this.tailPlumeM = new ModelRenderer(this, 20, 43);
        this.tailPlumeM.mirror = true;
        this.tailPlumeM.setRotationPoint(0.0F, -0.5F, 1.9F);
        this.tailPlumeM.addBox(-2.5F, -0.3F, -0.2F, 5, 0, 11, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 13);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, -0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(BipedLeftArm, -0.2617993877991494F, 0.0F, -0.10000736613927509F);
        this.hair01 = new ModelRenderer(this, 22, 55);
        this.hair01.mirror = true;
        this.hair01.setRotationPoint(0.0F, -7.2F, 3.2F);
        this.hair01.addBox(-4.01F, 0.0F, -0.1F, 8, 8, 1, 0.0F);
        this.setRotateAngle(hair01, 0.5235987755982988F, 0.0F, 0.0F);
        this.lClaw02 = new ModelRenderer(this, 0, 0);
        this.lClaw02.setRotationPoint(0.3F, 8.5F, 0.6F);
        this.lClaw02.addBox(-0.5F, -0.5F, -2.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lClaw02, 1.7453292519943295F, -1.1344640137963142F, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 13);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.01F, -2.0F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(BipedRightArm, -0.2617993877991494F, 0.0F, 0.10000736613927509F);
        this.rightLeg01 = new ModelRenderer(this, 0, 29);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(0.0F, 4.7F, -0.8F);
        this.rightLeg01.addBox(-1.5F, -0.3F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.tailPlumeR = new ModelRenderer(this, 7, 43);
        this.tailPlumeR.mirror = true;
        this.tailPlumeR.setRotationPoint(0.9F, -0.3F, 1.2F);
        this.tailPlumeR.addBox(-5.5F, -0.3F, -0.2F, 6, 0, 10, 0.0F);
        this.setRotateAngle(tailPlumeR, 0.0F, -0.3141592653589793F, -0.17453292519943295F);
        this.rTalon04 = new ModelRenderer(this, 24, 0);
        this.rTalon04.mirror = true;
        this.rTalon04.setRotationPoint(0.0F, 0.2F, 1.3F);
        this.rTalon04.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rTalon04, -0.17453292519943295F, 0.0F, 0.0F);
        this.rightFoot.addChild(this.rTalon01);
        this.leftFoot.addChild(this.lTalon03);
        this.hips.addChild(this.tail01);
        this.lArm01.addChild(this.leftWing01);
        this.BipedRightArm.addChild(this.rightWing02);
        this.BipedBody.addChild(this.BipedHead);
        this.leftFoot.addChild(this.lTalon02);
        this.BipedLeftLeg.addChild(this.leftLeg01);
        this.BipedBody.addChild(this.boobs);
        this.lArm01.addChild(this.lClaw01);
        this.rightFoot.addChild(this.rTalon02);
        this.BipedBody.addChild(this.stomach);
        this.hips.addChild(this.BipedLeftLeg);
        this.rArm01.addChild(this.rightWing01);
        this.BipedHead.addChild(this.hair00);
        this.leftFoot.addChild(this.lTalon04);
        this.rArm01.addChild(this.rClaw02);
        this.leftLeg01.addChild(this.leftLeg02);
        this.BipedRightArm.addChild(this.rArm01);
        this.leftFoot.addChild(this.lTalon01);
        this.rightFoot.addChild(this.rTalon03);
        this.stomach.addChild(this.hips);
        this.rightLeg02.addChild(this.rightFoot);
        this.BipedLeftArm.addChild(this.lArm01);
        this.rArm01.addChild(this.rClaw01);
        this.BipedLeftArm.addChild(this.leftWing02);
        this.hips.addChild(this.BipedRightLeg);
        this.rightLeg01.addChild(this.rightLeg02);
        this.tail01.addChild(this.tailPlumeL);
        this.leftLeg02.addChild(this.leftFoot);
        this.tail01.addChild(this.tailPlumeM);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.BipedHead.addChild(this.hair01);
        this.lArm01.addChild(this.lClaw02);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedRightLeg.addChild(this.rightLeg01);
        this.tail01.addChild(this.tailPlumeR);
        this.rightFoot.addChild(this.rTalon04);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        if(entity instanceof EntityGaiaHarpy) {
            this.boobs.showModel = !((EntityGaiaHarpy)entity).isChild();
        }
        this.BipedBody.render(f5);
    }


    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = (headPitch / 57.295776F) + 0.0872665F;

        BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F - 0.2617993877991494F;
        BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F - 0.2617993877991494F;

        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

        if (itemstack.getItem() == Items.FEATHER) {
            if (entityIn.motionX * entityIn.motionX + entityIn.motionZ * entityIn.motionZ > 2.500000277905201E-7D) {
                animationFlee();
            }
        }

        // body
        tail01.rotateAngleY = (float) (Math.cos(Math.toRadians((float) entityIn.ticksExisted * 7F)) * Math.toRadians(5F));

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount - 0.5235987755982988F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount - 0.5235987755982988F;
        
        if (isRiding) {
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

        // right arm
        BipedRightArm.rotateAngleX -= (float) ((double) BipedRightArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
        BipedRightArm.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);

        // left arm
        BipedRightArm.rotateAngleX -= (float) ((double) BipedLeftArm.rotateAngleX - ((double) f7 * 1.2D + (double) f8));
        BipedLeftArm.rotateAngleZ -= (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
    }

    private void animationFlee() {
        BipedRightArm.rotateAngleX += 1.0472F;
        BipedLeftArm.rotateAngleX += 1.0472F;
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
