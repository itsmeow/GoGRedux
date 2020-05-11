package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_minotaur - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelMinotaur extends ModelGoGRBase {
    public ModelRenderer chest;
    public ModelRenderer neck;
    public ModelRenderer leftPec;
    public ModelRenderer rightPec;
    public ModelRenderer torso;
    public ModelRenderer leftArm00;
    public ModelRenderer rightArm00;
    public ModelRenderer head;
    public ModelRenderer rEar00;
    public ModelRenderer lowerJaw;
    public ModelRenderer snout;
    public ModelRenderer lEar00;
    public ModelRenderer upperJaw;
    public ModelRenderer lHorn00;
    public ModelRenderer rHorn00;
    public ModelRenderer rEar01;
    public ModelRenderer lEar01;
    public ModelRenderer noseRing;
    public ModelRenderer lHorn01;
    public ModelRenderer lHorn02a;
    public ModelRenderer lHorn02b;
    public ModelRenderer lHorn02c;
    public ModelRenderer lHorn02d;
    public ModelRenderer lHorn03;
    public ModelRenderer rHorn01;
    public ModelRenderer rHorn02a;
    public ModelRenderer rHorn02b;
    public ModelRenderer rHorn02c;
    public ModelRenderer rHorn02d;
    public ModelRenderer rHorn03;
    public ModelRenderer tail01;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer loincloth;
    public ModelRenderer loinclothBack;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tail04;
    public ModelRenderer tail05;
    public ModelRenderer leftLeg02;
    public ModelRenderer leftLeg03;
    public ModelRenderer leftHoof;
    public ModelRenderer lHoofClaw01a;
    public ModelRenderer lHoofClaw02a;
    public ModelRenderer lHoofClaw01b;
    public ModelRenderer lHoofClaw02b;
    public ModelRenderer rightLeg02;
    public ModelRenderer rightLeg03;
    public ModelRenderer rightHoof;
    public ModelRenderer rHoofClaw01a;
    public ModelRenderer rHoofClaw02a;
    public ModelRenderer rHoofClaw01b;
    public ModelRenderer rHoofClaw02b;
    public ModelRenderer leftArm01;
    public ModelRenderer leftShoulder;
    public ModelRenderer rightArm01;
    public ModelRenderer rightShoulder;
    public ModelRenderer rightShoulderGuard;
    public ModelRenderer rightShoulderGuardLower;
    
    public ModelMinotaur() {
        this(0.0F);
    }

    public ModelMinotaur(float scale) {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.tail01 = new ModelRenderer(this, 57, 57);
        this.tail01.setRotationPoint(0.0F, 9.0F, 2.8F);
        this.tail01.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, scale);
        this.setRotateAngle(tail01, 0.40142572795869574F, 0.0F, 0.0F);
        this.lHorn02c = new ModelRenderer(this, 54, 12);
        this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02c.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, scale);
        this.lHorn03 = new ModelRenderer(this, 59, 11);
        this.lHorn03.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.lHorn03.addBox(-0.5F, -3.4F, -0.5F, 1, 4, 1, scale);
        this.setRotateAngle(lHorn03, 0.3490658503988659F, 0.0F, -0.3490658503988659F);
        this.leftHoof = new ModelRenderer(this, 112, 0);
        this.leftHoof.setRotationPoint(0.0F, 6.4F, -0.5F);
        this.leftHoof.addBox(-1.9F, -0.1F, -1.0F, 4, 3, 3, scale);
        this.setRotateAngle(leftHoof, 0.17453292519943295F, 0.0F, 0.05235987755982988F);
        this.tail05 = new ModelRenderer(this, 48, 57);
        this.tail05.setRotationPoint(0.0F, 3.6F, 0.0F);
        this.tail05.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, scale);
        this.setRotateAngle(tail05, -0.08726646259971647F, 0.0F, 0.0F);
        this.leftLeg03 = new ModelRenderer(this, 114, 15);
        this.leftLeg03.setRotationPoint(0.0F, 3.2F, 6.0F);
        this.leftLeg03.addBox(-2.0F, -0.4F, -1.5F, 4, 7, 3,scale);
        this.setRotateAngle(leftLeg03, 0.3490658503988659F, 0.0F, 0.06981317007977318F);
        this.rHorn02a = new ModelRenderer(this, 54, 12);
        this.rHorn02a.mirror = true;
        this.rHorn02a.setRotationPoint(0.1F, -2.2F, 0.1F);
        this.rHorn02a.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, scale);
        this.setRotateAngle(rHorn02a, 0.4363323129985824F, 0.0F, -0.5235987755982988F);
        this.tail02 = new ModelRenderer(this, 60, 58);
        this.tail02.mirror = true;
        this.tail02.setRotationPoint(0.0F, 3.7F, 0.0F);
        this.tail02.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, scale);
        this.setRotateAngle(tail02, -0.2617993877991494F, 0.0F, 0.0F);
        this.lHoofClaw02a = new ModelRenderer(this, 27, 43);
        this.lHoofClaw02a.setRotationPoint(-1.0F, 1.5F, -1.1F);
        this.lHoofClaw02a.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, scale);
        this.setRotateAngle(lHoofClaw02a, 0.03490658503988659F, 0.06981317007977318F, 0.03490658503988659F);
        this.tail04 = new ModelRenderer(this, 59, 58);
        this.tail04.mirror = true;
        this.tail04.setRotationPoint(0.0F, 3.9F, 0.0F);
        this.tail04.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, scale);
        this.setRotateAngle(tail04, -0.08726646259971647F, 0.0F, 0.0F);
        this.rEar01 = new ModelRenderer(this, 54, 5);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.rEar01.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, scale);
        this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.22759093446006054F);
        this.rHoofClaw01a = new ModelRenderer(this, 27, 43);
        this.rHoofClaw01a.mirror = true;
        this.rHoofClaw01a.setRotationPoint(-1.1F, 1.5F, -1.1F);
        this.rHoofClaw01a.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, scale);
        this.setRotateAngle(rHoofClaw01a, 0.03490658503988659F, 0.10471975511965977F, 0.03490658503988659F);
        this.chest = new ModelRenderer(this, 0, 26);
        this.chest.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.chest.addBox(-6.0F, -9.0F, -4.0F, 12, 9, 8, scale);
        this.setRotateAngle(chest, 0.3490658503988659F, 0.0F, 0.0F);
        this.tail03 = new ModelRenderer(this, 60, 58);
        this.tail03.setRotationPoint(0.0F, 3.8F, 0.0F);
        this.tail03.addBox(-0.5F, 0.0F, -0.5F, 1, 4, 1, scale);
        this.setRotateAngle(tail03, -0.08726646259971647F, 0.0F, 0.0F);
        this.rightShoulderGuardLower = new ModelRenderer(this, 91, 51);
        this.rightShoulderGuardLower.setRotationPoint(0.1F, 6.4F, -0.5F);
        this.rightShoulderGuardLower.addBox(-4.0F, -4.4F, -2.5F, 5, 6, 6, scale);
        this.rEar00 = new ModelRenderer(this, 47, 0);
        this.rEar00.mirror = true;
        this.rEar00.setRotationPoint(-3.4F, -4.5F, 0.8F);
        this.rEar00.addBox(-5.0F, -0.5F, -1.5F, 5, 1, 3, scale);
        this.setRotateAngle(rEar00, -0.6981317007977318F, 0.08726646259971647F, -0.3490658503988659F);
        this.upperJaw = new ModelRenderer(this, 0, 16);
        this.upperJaw.mirror = true;
        this.upperJaw.setRotationPoint(0.0F, -3.4F, -2.3F);
        this.upperJaw.addBox(-3.0F, -0.65F, -6.8F, 6, 3, 7, scale);
        this.lHoofClaw02b = new ModelRenderer(this, 33, 46);
        this.lHoofClaw02b.mirror = true;
        this.lHoofClaw02b.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.lHoofClaw02b.addBox(-0.99F, -1.1F, -1.2F, 2, 1, 3, scale);
        this.setRotateAngle(lHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.lEar01 = new ModelRenderer(this, 54, 5);
        this.lEar01.setRotationPoint(0.0F, -0.9F, 0.0F);
        this.lEar01.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, scale);
        this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.22759093446006054F);
        this.loinclothBack = new ModelRenderer(this, 108, 44);
        this.loinclothBack.setRotationPoint(0.0F, 8.5F, 3.9F);
        this.loinclothBack.addBox(-4.5F, -0.5F, -0.5F, 9, 10, 1, scale);
        this.setRotateAngle(loinclothBack, -0.12217304763960307F, 0.0F, 0.0F);
        this.rightShoulder = new ModelRenderer(this, 69, 35);
        this.rightShoulder.mirror = true;
        this.rightShoulder.setRotationPoint(0.8F, 1.8F, 0.0F);
        this.rightShoulder.addBox(-4.0F, -4.0F, -3.0F, 4, 6, 6, scale);
        this.head = new ModelRenderer(this, 0, 2);
        this.head.setRotationPoint(0.0F, -4.9F, -1.4F);
        this.head.addBox(-4.0F, -6.7F, -3.0F, 8, 7, 7, scale);
        this.setRotateAngle(head, -0.6283185307179586F, 0.0F, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 88, 0);
        this.BipedLeftLeg.setRotationPoint(2.6F, 9.0F, 0.0F);
        this.BipedLeftLeg.addBox(-3.0F, -0.9F, -2.0F, 6, 12, 6, scale);
        this.setRotateAngle(BipedLeftLeg, -0.4363323129985824F, -0.12217304763960307F, -0.06981317007977318F);
        this.leftLeg02 = new ModelRenderer(this, 88, 18);
        this.leftLeg02.setRotationPoint(0.0F, 9.0F, -0.1F);
        this.leftLeg02.addBox(-2.5F, 0.0F, -1.5F, 5, 4, 9, scale);
        this.setRotateAngle(leftLeg02, -0.22689280275926282F, 0.0F, 0.0F);
        this.rightArm01 = new ModelRenderer(this, 73, 18);
        this.rightArm01.mirror = true;
        this.rightArm01.setRotationPoint(-0.8F, 8.9F, 0.3F);
        this.rightArm01.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, scale);
        this.setRotateAngle(rightArm01, -0.5235987755982988F, 0.0F, -0.08726646259971647F);
        this.rHorn02d = new ModelRenderer(this, 54, 12);
        this.rHorn02d.mirror = true;
        this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02d.addBox(-0.8F, -3.0F, -0.79F, 1, 3, 1, scale);
        this.setRotateAngle(rHorn02d, 0.0F, 1.5707963267948966F, 0.0F);
        this.lHorn02d = new ModelRenderer(this, 54, 12);
        this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02d.addBox(-0.8F, -3.0F, -0.2F, 1, 3, 1, scale);
        this.leftArm00 = new ModelRenderer(this, 70, 0);
        this.leftArm00.setRotationPoint(6.0F, -7.0F, 0.0F);
        this.leftArm00.addBox(-1.3F, -2.0F, -2.4F, 4, 12, 5, scale);
        this.setRotateAngle(leftArm00, 0.08726646259971647F, 0.0F, -0.13962634015954636F);
        this.rightShoulderGuard = new ModelRenderer(this, 69, 48);
        this.rightShoulderGuard.setRotationPoint(-0.3F, -0.2F, 0.0F);
        this.rightShoulderGuard.addBox(-4.0F, -4.0F, -3.5F, 4, 7, 7, scale);
        this.lEar00 = new ModelRenderer(this, 47, 0);
        this.lEar00.setRotationPoint(3.4F, -4.5F, 0.8F);
        this.lEar00.addBox(0.0F, -0.5F, -1.5F, 5, 1, 3, scale);
        this.setRotateAngle(lEar00, -0.6981317007977318F, 0.08726646259971647F, 0.3490658503988659F);
        this.rightHoof = new ModelRenderer(this, 112, 0);
        this.rightHoof.mirror = true;
        this.rightHoof.setRotationPoint(0.0F, 6.4F, -0.5F);
        this.rightHoof.addBox(-2.1F, -0.1F, -1.0F, 4, 3, 3, scale);
        this.setRotateAngle(rightHoof, 0.17453292519943295F, 0.0F, -0.05235987755982988F);
        this.rHoofClaw02a = new ModelRenderer(this, 27, 43);
        this.rHoofClaw02a.mirror = true;
        this.rHoofClaw02a.setRotationPoint(1.0F, 1.5F, -1.1F);
        this.rHoofClaw02a.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, scale);
        this.setRotateAngle(rHoofClaw02a, 0.03490658503988659F, -0.06981317007977318F, -0.03490658503988659F);
        this.leftShoulder = new ModelRenderer(this, 69, 35);
        this.leftShoulder.setRotationPoint(-0.8F, 1.8F, 0.0F);
        this.leftShoulder.addBox(0.0F, -4.0F, -3.0F, 4, 6, 6, scale);
        this.rHoofClaw02b = new ModelRenderer(this, 33, 46);
        this.rHoofClaw02b.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.rHoofClaw02b.addBox(-0.99F, -1.1F, -1.2F, 2, 1, 3, scale);
        this.setRotateAngle(rHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 45, 11);
        this.lHorn01.setRotationPoint(0.0F, -2.6F, 0.1F);
        this.lHorn01.addBox(-1.0F, -2.7F, -1.1F, 2, 3, 2, scale);
        this.setRotateAngle(lHorn01, 0.7330382858376184F, 0.0F, 0.5235987755982988F);
        this.rHoofClaw01b = new ModelRenderer(this, 33, 46);
        this.rHoofClaw01b.mirror = true;
        this.rHoofClaw01b.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.rHoofClaw01b.addBox(-0.99F, -1.1F, -1.2F, 2, 1, 3, scale);
        this.setRotateAngle(rHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHorn02b = new ModelRenderer(this, 54, 12);
        this.rHorn02b.mirror = true;
        this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02b.addBox(-0.2F, -3.0F, -0.2F, 1, 3, 1, scale);
        this.rightLeg03 = new ModelRenderer(this, 114, 15);
        this.rightLeg03.mirror = true;
        this.rightLeg03.setRotationPoint(0.0F, 3.2F, 6.0F);
        this.rightLeg03.addBox(-2.0F, -0.4F, -1.5F, 4, 7, 3, scale);
        this.setRotateAngle(rightLeg03, 0.3490658503988659F, 0.0F, -0.06981317007977318F);
        this.lHorn02b = new ModelRenderer(this, 54, 12);
        this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02b.addBox(-0.2F, -3.0F, -0.79F, 1, 3, 1, scale);
        this.setRotateAngle(lHorn02b, 0.0F, -1.5707963267948966F, 0.0F);
        this.lHoofClaw01b = new ModelRenderer(this, 33, 46);
        this.lHoofClaw01b.setRotationPoint(0.0F, 0.0F, -0.8F);
        this.lHoofClaw01b.addBox(-0.99F, -1.1F, -1.2F, 2, 1, 3, scale);
        this.setRotateAngle(lHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.rightArm00 = new ModelRenderer(this, 70, 0);
        this.rightArm00.mirror = true;
        this.rightArm00.setRotationPoint(-6.0F, -7.0F, 0.0F);
        this.rightArm00.addBox(-2.7F, -2.0F, -2.4F, 4, 12, 5, scale);
        this.setRotateAngle(rightArm00, 0.08726646259971647F, 0.0F, 0.13962634015954636F);
        this.loincloth = new ModelRenderer(this, 89, 32);
        this.loincloth.setRotationPoint(0.0F, 8.5F, -2.1F);
        this.loincloth.addBox(-5.5F, 0.0F, -0.5F, 11, 10, 1, scale);
        this.setRotateAngle(loincloth, -0.4363323129985824F, 0.0F, 0.0F);
        this.rightPec = new ModelRenderer(this, 41, 46);
        this.rightPec.setRotationPoint(-2.8F, -5.7F, -2.4F);
        this.rightPec.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 4, scale);
        this.setRotateAngle(rightPec, 0.0F, 0.10471975511965977F, -0.08726646259971647F);
        this.lHorn02a = new ModelRenderer(this, 54, 12);
        this.lHorn02a.setRotationPoint(-0.1F, -2.2F, 0.1F);
        this.lHorn02a.addBox(-0.2F, -3.0F, -0.8F, 1, 3, 1, scale);
        this.setRotateAngle(lHorn02a, 0.4363323129985824F, 0.13962634015954636F, 0.5235987755982988F);
        this.lHoofClaw01a = new ModelRenderer(this, 27, 43);
        this.lHoofClaw01a.setRotationPoint(1.1F, 1.5F, -1.1F);
        this.lHoofClaw01a.addBox(-1.0F, -0.5F, -2.0F, 2, 2, 2, scale);
        this.setRotateAngle(lHoofClaw01a, 0.03490658503988659F, -0.10471975511965977F, -0.03490658503988659F);
        this.rHorn00 = new ModelRenderer(this, 45, 12);
        this.rHorn00.mirror = true;
        this.rHorn00.setRotationPoint(-2.7F, -5.9F, 2.0F);
        this.rHorn00.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, scale);
        this.setRotateAngle(rHorn00, 0.08726646259971647F, -0.45378560551852565F, -0.7853981633974483F);
        this.leftArm01 = new ModelRenderer(this, 73, 18);
        this.leftArm01.setRotationPoint(0.8F, 8.9F, 0.3F);
        this.leftArm01.addBox(-1.5F, 0.0F, -2.0F, 3, 12, 4, scale);
        this.setRotateAngle(leftArm01, -0.5235987755982988F, 0.0F, 0.08726646259971647F);
        this.BipedRightLeg = new ModelRenderer(this, 88, 0);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.6F, 9.0F, 0.0F);
        this.BipedRightLeg.addBox(-3.0F, -0.9F, -2.0F, 6, 12, 6, scale);
        this.setRotateAngle(BipedRightLeg, -0.4363323129985824F, 0.12217304763960307F, 0.06981317007977318F);
        this.rHorn02c = new ModelRenderer(this, 54, 12);
        this.rHorn02c.mirror = true;
        this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02c.addBox(-0.8F, -3.0F, -0.8F, 1, 3, 1, scale);
        this.lHorn00 = new ModelRenderer(this, 45, 12);
        this.lHorn00.setRotationPoint(2.7F, -5.9F, 2.0F);
        this.lHorn00.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, scale);
        this.setRotateAngle(lHorn00, 0.08726646259971647F, 0.45378560551852565F, 0.7853981633974483F);
        this.noseRing = new ModelRenderer(this, 25, 0);
        this.noseRing.setRotationPoint(0.0F, 0.0F, -6.2F);
        this.noseRing.addBox(-2.0F, 0.0F, -0.6F, 4, 4, 1, scale);
        this.setRotateAngle(noseRing, -0.13962634015954636F, 0.0F, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 88, 18);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 9.0F, -0.1F);
        this.rightLeg02.addBox(-2.5F, 0.0F, -1.5F, 5, 4, 9, scale);
        this.setRotateAngle(rightLeg02, -0.22689280275926282F, 0.0F, 0.0F);
        this.torso = new ModelRenderer(this, 0, 43);
        this.torso.setRotationPoint(0.0F, -0.6F, 0.0F);
        this.torso.addBox(-5.0F, 0.0F, -3.2F, 10, 11, 7, scale);
        this.setRotateAngle(torso, -0.22689280275926282F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 30, 0);
        this.snout.setRotationPoint(0.0F, -4.5F, -2.3F);
        this.snout.addBox(-2.5F, -2.15F, -6.6F, 5, 3, 7, scale);
        this.setRotateAngle(snout, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHorn01 = new ModelRenderer(this, 45, 11);
        this.rHorn01.mirror = true;
        this.rHorn01.setRotationPoint(0.0F, -2.6F, 0.1F);
        this.rHorn01.addBox(-1.0F, -2.7F, -1.1F, 2, 3, 2, scale);
        this.setRotateAngle(rHorn01, 0.7330382858376184F, 0.0F, -0.5235987755982988F);
        this.lowerJaw = new ModelRenderer(this, 25, 11);
        this.lowerJaw.setRotationPoint(0.0F, -1.0F, -2.9F);
        this.lowerJaw.addBox(-2.5F, -0.1F, -5.8F, 5, 1, 6, scale);
        this.setRotateAngle(lowerJaw, -0.03490658503988659F, 0.0F, 0.0F);
        this.rHorn03 = new ModelRenderer(this, 59, 11);
        this.rHorn03.mirror = true;
        this.rHorn03.setRotationPoint(0.0F, -3.0F, 0.0F);
        this.rHorn03.addBox(-0.5F, -3.4F, -0.5F, 1, 4, 1, scale);
        this.setRotateAngle(rHorn03, 0.3490658503988659F, 0.0F, 0.3490658503988659F);
        this.neck = new ModelRenderer(this, 32, 18);
        this.neck.setRotationPoint(0.0F, -6.9F, 0.5F);
        this.neck.addBox(-5.0F, -5.8F, -4.0F, 10, 6, 8, scale);
        this.setRotateAngle(neck, 0.6108652381980153F, 0.0F, 0.0F);
        this.leftPec = new ModelRenderer(this, 41, 33);
        this.leftPec.setRotationPoint(3.3F, -5.7F, -2.4F);
        this.leftPec.addBox(-3.5F, -3.0F, -3.0F, 7, 7, 4, scale);
        this.setRotateAngle(leftPec, 0.0F, -0.10471975511965977F, 0.08726646259971647F);
        this.torso.addChild(this.tail01);
        this.lHorn02a.addChild(this.lHorn02c);
        this.lHorn02a.addChild(this.lHorn03);
        this.leftLeg03.addChild(this.leftHoof);
        this.tail04.addChild(this.tail05);
        this.leftLeg02.addChild(this.leftLeg03);
        this.rHorn01.addChild(this.rHorn02a);
        this.tail01.addChild(this.tail02);
        this.leftHoof.addChild(this.lHoofClaw02a);
        this.tail03.addChild(this.tail04);
        this.rEar00.addChild(this.rEar01);
        this.rightHoof.addChild(this.rHoofClaw01a);
        this.tail02.addChild(this.tail03);
        this.rightShoulderGuard.addChild(this.rightShoulderGuardLower);
        this.head.addChild(this.rEar00);
        this.head.addChild(this.upperJaw);
        this.lHoofClaw02a.addChild(this.lHoofClaw02b);
        this.lEar00.addChild(this.lEar01);
        this.torso.addChild(this.loinclothBack);
        this.rightArm00.addChild(this.rightShoulder);
        this.neck.addChild(this.head);
        this.torso.addChild(this.BipedLeftLeg);
        this.BipedLeftLeg.addChild(this.leftLeg02);
        this.rightArm00.addChild(this.rightArm01);
        this.rHorn02a.addChild(this.rHorn02d);
        this.lHorn02a.addChild(this.lHorn02d);
        this.chest.addChild(this.leftArm00);
        this.rightShoulder.addChild(this.rightShoulderGuard);
        this.head.addChild(this.lEar00);
        this.rightLeg03.addChild(this.rightHoof);
        this.rightHoof.addChild(this.rHoofClaw02a);
        this.leftArm00.addChild(this.leftShoulder);
        this.rHoofClaw02a.addChild(this.rHoofClaw02b);
        this.lHorn00.addChild(this.lHorn01);
        this.rHoofClaw01a.addChild(this.rHoofClaw01b);
        this.rHorn02a.addChild(this.rHorn02b);
        this.rightLeg02.addChild(this.rightLeg03);
        this.lHorn02a.addChild(this.lHorn02b);
        this.lHoofClaw01a.addChild(this.lHoofClaw01b);
        this.chest.addChild(this.rightArm00);
        this.torso.addChild(this.loincloth);
        this.chest.addChild(this.rightPec);
        this.lHorn01.addChild(this.lHorn02a);
        this.leftHoof.addChild(this.lHoofClaw01a);
        this.head.addChild(this.rHorn00);
        this.leftArm00.addChild(this.leftArm01);
        this.torso.addChild(this.BipedRightLeg);
        this.rHorn02a.addChild(this.rHorn02c);
        this.head.addChild(this.lHorn00);
        this.upperJaw.addChild(this.noseRing);
        this.BipedRightLeg.addChild(this.rightLeg02);
        this.chest.addChild(this.torso);
        this.head.addChild(this.snout);
        this.rHorn00.addChild(this.rHorn01);
        this.head.addChild(this.lowerJaw);
        this.rHorn02a.addChild(this.rHorn03);
        this.chest.addChild(this.neck);
        this.chest.addChild(this.leftPec);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.chest.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // head
        head.rotateAngleY = netHeadYaw / 57.295776F;
        head.rotateAngleX = (headPitch / 57.295776F) - 0.6283185307179586F;

        // arms

        if(itemstack.isEmpty()) {
            rightArm00.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F + 0.08726646259971647F;
            leftArm00.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F + 0.08726646259971647F;

            rightArm00.rotateAngleZ = 0.0F;
            leftArm00.rotateAngleZ = 0.0F;

            if(swingProgress > -9990.0F) {
                holdingMelee();
            }

            rightArm00.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + 0.13962634015954636F;
            leftArm00.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + 0.13962634015954636F;
            rightArm00.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            leftArm00.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }

        if(itemstack.getItem() == Items.STICK) {
            animationBuff();
        }

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount - 0.4363323129985824F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount - 0.4363323129985824F;
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

        rightArm00.rotateAngleX = (float) ((double) rightArm00.rotateAngleX - ((double) f7 * 1.2D + (double) f8)) + 0.08726646259971647F;
        rightArm00.rotateAngleZ = (MathHelper.sin(swingProgress * (float) Math.PI) * -0.4F);
    }

    private void animationBuff() {
        float armDefaultAngleX = 0.785398F;

        rightArm00.rotateAngleX = 0.0F;
        leftArm00.rotateAngleX = 0.0F;
        rightArm00.rotateAngleZ = +armDefaultAngleX;
        leftArm00.rotateAngleZ = -armDefaultAngleX;

        rightArm00.rotateAngleX = +armDefaultAngleX;
        leftArm00.rotateAngleX = +armDefaultAngleX;
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
        return new ModelRenderer[] { chest, leftArm00, leftArm01 };
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] { chest, rightArm00, rightArm01 };
    }
}
