package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_satyress - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelSatyress extends ModelGoGRBase {
    public ModelRenderer BipedHat;
    public ModelRenderer BipedBody;
    public ModelRenderer hair;
    public ModelRenderer boobs;
    public ModelRenderer stomach;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer hips;
    public ModelRenderer tail01;
    public ModelRenderer loincloth;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer leftLeg01;
    public ModelRenderer leftLeg02;
    public ModelRenderer lHoofClaw01a;
    public ModelRenderer lHoofClaw02a;
    public ModelRenderer lHoofClaw01b;
    public ModelRenderer lHoofClaw02b;
    public ModelRenderer rightLeg01;
    public ModelRenderer rightLeg02;
    public ModelRenderer rHoofClaw01a;
    public ModelRenderer rHoofClaw02a;
    public ModelRenderer rHoofClaw01b;
    public ModelRenderer rHoofClaw02b;
    public ModelRenderer leftShoulderPad;
    public ModelRenderer rightShoulderPad;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
    public ModelRenderer lEar;
    public ModelRenderer rEar;
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

    public ModelSatyress() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BipedLeftLeg = new ModelRenderer(this, 0, 17);
        this.BipedLeftLeg.setRotationPoint(2.1F, 2.5F, 0.1F);
        this.BipedLeftLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.2617993877991494F, 0.0F, 0.0F);
        this.lHoofClaw02a = new ModelRenderer(this, 0, 48);
        this.lHoofClaw02a.setRotationPoint(-0.5F, 5.3F, -0.2F);
        this.lHoofClaw02a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHoofClaw02a, 0.17453292519943295F, 0.08726646259971647F, 0.03490658503988659F);
        this.rHorn02a = new ModelRenderer(this, 24, 0);
        this.rHorn02a.mirror = true;
        this.rHorn02a.setRotationPoint(0.2F, 0.0F, 2.3F);
        this.rHorn02a.addBox(-0.2F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHorn02a, -0.5235987755982988F, 0.45378560551852565F, 0.0F);
        this.leftLeg01 = new ModelRenderer(this, 0, 29);
        this.leftLeg01.setRotationPoint(0.0F, 4.8F, -0.7F);
        this.leftLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg01, 0.6283185307179586F, 0.0F, 0.0F);
        this.rHorn04 = new ModelRenderer(this, 56, 0);
        this.rHorn04.mirror = true;
        this.rHorn04.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.rHorn04.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHorn04, -0.4363323129985824F, -0.40142572795869574F, 0.0F);
        this.lEar = new ModelRenderer(this, 26, 4);
        this.lEar.setRotationPoint(3.4F, -6.0F, 0.8F);
        this.lEar.addBox(-0.3F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(lEar, -0.5235987755982988F, 0.0F, 0.2792526803190927F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.lHoofClaw02b = new ModelRenderer(this, 0, 52);
        this.lHoofClaw02b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lHoofClaw02b.addBox(-0.49F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.lHorn04 = new ModelRenderer(this, 56, 0);
        this.lHorn04.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.lHorn04.addBox(-0.5F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHorn04, -0.4363323129985824F, 0.40142572795869574F, 0.0F);
        this.rHorn02c = new ModelRenderer(this, 24, 0);
        this.rHorn02c.mirror = true;
        this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02c.addBox(-0.2F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 17);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.1F, 2.5F, 0.1F);
        this.BipedRightLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.2617993877991494F, 0.0F, 0.0F);
        this.rHoofClaw01b = new ModelRenderer(this, 0, 52);
        this.rHoofClaw01b.mirror = true;
        this.rHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rHoofClaw01b.addBox(-0.51F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.stomach = new ModelRenderer(this, 14, 25);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
        this.lHorn03 = new ModelRenderer(this, 32, 0);
        this.lHorn03.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.lHorn03.addBox(-0.5F, -0.5F, -0.4F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHorn03, -0.6981317007977318F, 0.3490658503988659F, 0.0F);
        this.hips = new ModelRenderer(this, 13, 33);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.leftShoulderPad = new ModelRenderer(this, 18, 49);
        this.leftShoulderPad.setRotationPoint(-0.9F, -0.5F, 0.0F);
        this.leftShoulderPad.addBox(-0.5F, -2.0F, -2.5F, 4, 4, 5, 0.0F);
        this.rEar = new ModelRenderer(this, 26, 4);
        this.rEar.mirror = true;
        this.rEar.setRotationPoint(-3.4F, -6.0F, 0.8F);
        this.rEar.addBox(-3.7F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
        this.setRotateAngle(rEar, -0.5235987755982988F, 0.0F, -0.2792526803190927F);
        this.BipedHat = new ModelRenderer(this, 32, 0);
        this.BipedHat.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.BipedHat.addBox(-4.0F, -7.8F, -4.0F, 8, 8, 8, 0.5F);
        this.tail01 = new ModelRenderer(this, 38, 33);
        this.tail01.setRotationPoint(0.0F, 1.7F, 1.3F);
        this.tail01.addBox(-1.5F, -1.0F, 0.0F, 3, 2, 4, 0.0F);
        this.setRotateAngle(tail01, -0.7853981633974483F, 0.0F, 0.0F);
        this.lHorn02a = new ModelRenderer(this, 24, 0);
        this.lHorn02a.setRotationPoint(-0.2F, 0.0F, 2.5F);
        this.lHorn02a.addBox(-0.2F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHorn02a, -0.5235987755982988F, -0.45378560551852565F, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.rightShoulderPad = new ModelRenderer(this, 18, 49);
        this.rightShoulderPad.mirror = true;
        this.rightShoulderPad.setRotationPoint(0.9F, -0.5F, 0.0F);
        this.rightShoulderPad.addBox(-3.5F, -2.0F, -2.5F, 4, 4, 5, 0.0F);
        this.lHoofClaw01a = new ModelRenderer(this, 0, 48);
        this.lHoofClaw01a.setRotationPoint(0.4F, 5.3F, -0.2F);
        this.lHoofClaw01a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHoofClaw01a, 0.17453292519943295F, -0.13962634015954636F, -0.03490658503988659F);
        this.loincloth = new ModelRenderer(this, 36, 41);
        this.loincloth.setRotationPoint(0.0F, 1.0F, -1.6F);
        this.loincloth.addBox(-2.5F, 0.0F, -0.5F, 5, 7, 1, 0.0F);
        this.setRotateAngle(loincloth, -0.2617993877991494F, 0.0F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 38);
        this.leftLeg02.setRotationPoint(0.0F, 4.5F, 0.1F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leftLeg02, -0.40142572795869574F, 0.0F, 0.0F);
        this.rHoofClaw01a = new ModelRenderer(this, 0, 48);
        this.rHoofClaw01a.mirror = true;
        this.rHoofClaw01a.setRotationPoint(-0.4F, 5.3F, -0.2F);
        this.rHoofClaw01a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHoofClaw01a, 0.17453292519943295F, 0.13962634015954636F, 0.03490658503988659F);
        this.rHorn02b = new ModelRenderer(this, 24, 0);
        this.rHorn02b.mirror = true;
        this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02b.addBox(-0.8F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.lHoofClaw01b = new ModelRenderer(this, 0, 52);
        this.lHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lHoofClaw01b.addBox(-0.49F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHorn03 = new ModelRenderer(this, 32, 0);
        this.rHorn03.mirror = true;
        this.rHorn03.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.rHorn03.addBox(-0.5F, -0.5F, -0.4F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHorn03, -0.6981317007977318F, -0.3490658503988659F, 0.0F);
        this.rHoofClaw02a = new ModelRenderer(this, 0, 48);
        this.rHoofClaw02a.mirror = true;
        this.rHoofClaw02a.setRotationPoint(0.5F, 5.3F, -0.2F);
        this.rHoofClaw02a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHoofClaw02a, 0.17453292519943295F, -0.08726646259971647F, -0.03490658503988659F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 5, 4, 0.0F);
        this.hair = new ModelRenderer(this, 12, 40);
        this.hair.setRotationPoint(0.0F, 0.5F, 4.0F);
        this.hair.addBox(-4.0F, 0.0F, -0.5F, 8, 8, 1, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.rightLeg01 = new ModelRenderer(this, 0, 29);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(0.0F, 4.8F, -0.7F);
        this.rightLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightLeg01, 0.6283185307179586F, 0.0F, 0.0F);
        this.boobs = new ModelRenderer(this, 0, 57);
        this.boobs.setRotationPoint(0.0F, 1.5F, -0.1F);
        this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(boobs, -0.5235987755982988F, 0.0F, 0.0F);
        this.rHoofClaw02b = new ModelRenderer(this, 0, 52);
        this.rHoofClaw02b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rHoofClaw02b.addBox(-0.51F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.lHorn02b = new ModelRenderer(this, 24, 0);
        this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02b.addBox(-0.8F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 54, 17);
        this.rHorn01.setRotationPoint(-3.0F, -7.2F, -1.5F);
        this.rHorn01.addBox(-1.0F, -1.0F, -0.4F, 2, 2, 3, 0.0F);
        this.setRotateAngle(rHorn01, 0.3490658503988659F, -1.3962634015954636F, 0.0F);
        this.lHorn02d = new ModelRenderer(this, 24, 0);
        this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02d.addBox(-0.8F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.rHorn02d = new ModelRenderer(this, 24, 0);
        this.rHorn02d.mirror = true;
        this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02d.addBox(-0.8F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.lHorn02c = new ModelRenderer(this, 24, 0);
        this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02c.addBox(-0.2F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 38);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 4.5F, 0.1F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rightLeg02, -0.40142572795869574F, 0.0F, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 54, 17);
        this.lHorn01.mirror = true;
        this.lHorn01.setRotationPoint(3.0F, -7.2F, -1.5F);
        this.lHorn01.addBox(-1.0F, -1.0F, -0.4F, 2, 2, 3, 0.0F);
        this.setRotateAngle(lHorn01, 0.3490658503988659F, 1.3962634015954636F, 0.0F);
        this.hips.addChild(this.BipedLeftLeg);
        this.leftLeg02.addChild(this.lHoofClaw02a);
        this.rHorn01.addChild(this.rHorn02a);
        this.BipedLeftLeg.addChild(this.leftLeg01);
        this.rHorn03.addChild(this.rHorn04);
        this.BipedHead.addChild(this.lEar);
        this.BipedBody.addChild(this.BipedHead);
        this.lHoofClaw02a.addChild(this.lHoofClaw02b);
        this.lHorn03.addChild(this.lHorn04);
        this.rHorn02a.addChild(this.rHorn02c);
        this.hips.addChild(this.BipedRightLeg);
        this.rHoofClaw01a.addChild(this.rHoofClaw01b);
        this.BipedBody.addChild(this.stomach);
        this.lHorn02a.addChild(this.lHorn03);
        this.stomach.addChild(this.hips);
        this.BipedLeftArm.addChild(this.leftShoulderPad);
        this.BipedHead.addChild(this.rEar);
        this.hips.addChild(this.tail01);
        this.lHorn01.addChild(this.lHorn02a);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.BipedRightArm.addChild(this.rightShoulderPad);
        this.leftLeg02.addChild(this.lHoofClaw01a);
        this.hips.addChild(this.loincloth);
        this.leftLeg01.addChild(this.leftLeg02);
        this.rightLeg02.addChild(this.rHoofClaw01a);
        this.rHorn02a.addChild(this.rHorn02b);
        this.lHoofClaw01a.addChild(this.lHoofClaw01b);
        this.rHorn02a.addChild(this.rHorn03);
        this.rightLeg02.addChild(this.rHoofClaw02a);
        this.BipedHat.addChild(this.hair);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedRightLeg.addChild(this.rightLeg01);
        this.BipedBody.addChild(this.boobs);
        this.rHoofClaw02a.addChild(this.rHoofClaw02b);
        this.lHorn02a.addChild(this.lHorn02b);
        this.BipedHead.addChild(this.rHorn01);
        this.lHorn02a.addChild(this.lHorn02d);
        this.rHorn02a.addChild(this.rHorn02d);
        this.lHorn02a.addChild(this.lHorn02c);
        this.rightLeg01.addChild(this.rightLeg02);
        this.BipedHead.addChild(this.lHorn01);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedHat.render(f5);
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = headPitch / 57.295776F;
        BipedHat.rotateAngleY = BipedHead.rotateAngleY;
        BipedHat.rotateAngleX = BipedHead.rotateAngleX;

        // arms
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

        if(itemstack.getItem() == Items.FEATHER) {
            if(entityIn.motionX * entityIn.motionX + entityIn.motionZ * entityIn.motionZ > 2.500000277905201E-7D) {
                animationFlee();
            }
        }
        // body
        tail01.rotateAngleY = (float) (Math.cos(Math.toRadians(entityIn.ticksExisted * 7D)) * Math.toRadians(10D));

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount - 0.2617993877991494F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + 3.1415927F) * 0.8F * limbSwingAmount - 0.2617993877991494F;
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

    private void animationFlee() {
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
