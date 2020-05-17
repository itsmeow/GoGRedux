package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_incubus - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelIncubus extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer leftWing01;
    public ModelRenderer rightWing01;
    public ModelRenderer tail01;
    public ModelRenderer leftPec;
    public ModelRenderer rightPec;
    public ModelRenderer coat;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer leftShoulderPad;
    public ModelRenderer rightShoulderPad;
    public ModelRenderer lHorn01;
    public ModelRenderer rHorn01;
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
    public ModelRenderer leftWing02;
    public ModelRenderer leftWingMembrane;
    public ModelRenderer righttWing02;
    public ModelRenderer righttWingMembrane;
    public ModelRenderer tail02;
    public ModelRenderer tail03;
    public ModelRenderer tailTip01;
    public ModelRenderer tailTip02;
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
    public ModelRenderer BipedHat;
    public ModelRenderer hair;

    public ModelIncubus() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lHorn03 = new ModelRenderer(this, 32, 0);
        this.lHorn03.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.lHorn03.addBox(-0.5F, -0.5F, -0.4F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHorn03, 0.6108652381980153F, 0.0F, 0.0F);
        this.lHoofClaw01b = new ModelRenderer(this, 0, 52);
        this.lHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lHoofClaw01b.addBox(-0.49F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.tailTip01 = new ModelRenderer(this, 56, 35);
        this.tailTip01.setRotationPoint(0.0F, 0.0F, 2.9F);
        this.tailTip01.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F);
        this.setRotateAngle(tailTip01, 0.2617993877991494F, 0.0F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 38);
        this.leftLeg02.setRotationPoint(0.0F, 4.5F, 0.1F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leftLeg02, -0.40142572795869574F, 0.0F, 0.0F);
        this.rightWing01 = new ModelRenderer(this, 46, 42);
        this.rightWing01.mirror = true;
        this.rightWing01.setRotationPoint(-1.5F, 2.9F, 1.3F);
        this.rightWing01.addBox(-0.6F, -1.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(rightWing01, 0.5235987755982988F, -0.7853981633974483F, 0.0F);
        this.lHorn02d = new ModelRenderer(this, 24, 0);
        this.lHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02d.addBox(-0.8F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-3.0F, -1.6F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.lHoofClaw02b = new ModelRenderer(this, 0, 52);
        this.lHoofClaw02b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.lHoofClaw02b.addBox(-0.49F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.lHorn04 = new ModelRenderer(this, 56, 0);
        this.lHorn04.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.lHorn04.addBox(-0.51F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHorn04, 0.4363323129985824F, 0.0F, 0.0F);
        this.tailTip02 = new ModelRenderer(this, 56, 39);
        this.tailTip02.setRotationPoint(0.0F, 0.1F, 0.8F);
        this.tailTip02.addBox(-1.5F, -0.5F, -0.5F, 2, 1, 2, 0.0F);
        this.setRotateAngle(tailTip02, 0.0F, 0.7853981633974483F, 0.0F);
        this.leftPec = new ModelRenderer(this, 14, 33);
        this.leftPec.setRotationPoint(2.3F, 2.1F, 0.1F);
        this.leftPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(leftPec, 0.0F, -0.08726646259971647F, 0.08726646259971647F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.rightShoulderPad = new ModelRenderer(this, 10, 49);
        this.rightShoulderPad.mirror = true;
        this.rightShoulderPad.setRotationPoint(0.2F, -0.5F, 0.0F);
        this.rightShoulderPad.addBox(-3.4F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.lHoofClaw01a = new ModelRenderer(this, 0, 48);
        this.lHoofClaw01a.setRotationPoint(0.4F, 5.6F, -0.2F);
        this.lHoofClaw01a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHoofClaw01a, 0.17453292519943295F, -0.13962634015954636F, -0.03490658503988659F);
        this.rHorn01 = new ModelRenderer(this, 0, 0);
        this.rHorn01.setRotationPoint(-3.5F, -7.6F, -1.0F);
        this.rHorn01.addBox(-1.0F, -1.0F, -0.4F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rHorn01, 0.0F, -1.2217304763960306F, 0.6108652381980153F);
        this.leftWing02 = new ModelRenderer(this, 56, 52);
        this.leftWing02.setRotationPoint(0.0F, 0.6F, 8.4F);
        this.leftWing02.addBox(-0.5F, -3.5F, -0.5F, 1, 11, 1, 0.0F);
        this.tail01 = new ModelRenderer(this, 52, 28);
        this.tail01.setRotationPoint(0.0F, 10.0F, 1.4F);
        this.tail01.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(tail01, -1.0471975511965976F, 0.0F, 0.0F);
        this.rHoofClaw02a = new ModelRenderer(this, 0, 48);
        this.rHoofClaw02a.mirror = true;
        this.rHoofClaw02a.setRotationPoint(0.5F, 5.6F, -0.2F);
        this.rHoofClaw02a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHoofClaw02a, 0.17453292519943295F, -0.08726646259971647F, -0.03490658503988659F);
        this.leftWing01 = new ModelRenderer(this, 46, 42);
        this.leftWing01.setRotationPoint(1.5F, 2.9F, 1.3F);
        this.leftWing01.addBox(-0.6F, -1.0F, 0.0F, 1, 2, 8, 0.0F);
        this.setRotateAngle(leftWing01, 0.5235987755982988F, 0.7853981633974483F, 0.0F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.lHorn02a = new ModelRenderer(this, 24, 0);
        this.lHorn02a.setRotationPoint(-0.2F, 0.0F, 1.1F);
        this.lHorn02a.addBox(-0.2F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(lHorn02a, 0.6108652381980153F, 0.2792526803190927F, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 17);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.1F, 11.6F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.2617993877991494F, 0.0F, 0.0F);
        this.rHorn04 = new ModelRenderer(this, 56, 0);
        this.rHorn04.mirror = true;
        this.rHorn04.setRotationPoint(0.0F, 0.0F, 1.6F);
        this.rHorn04.addBox(-0.49F, -0.5F, -0.3F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHorn04, 0.4363323129985824F, 0.0F, 0.0F);
        this.coat = new ModelRenderer(this, 30, 37);
        this.coat.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.coat.addBox(-4.5F, -0.4F, -3.2F, 9, 10, 2, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 17);
        this.BipedLeftLeg.setRotationPoint(2.1F, 11.6F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, -1.0F, -2.0F, 4, 7, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.2617993877991494F, 0.0F, 0.0F);
        this.rHorn02c = new ModelRenderer(this, 24, 0);
        this.rHorn02c.mirror = true;
        this.rHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02c.addBox(-0.2F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.rHorn02d = new ModelRenderer(this, 24, 0);
        this.rHorn02d.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02d.addBox(-0.79F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 38);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 4.5F, 0.1F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rightLeg02, -0.40142572795869574F, 0.0F, 0.0F);
        this.rHorn03 = new ModelRenderer(this, 32, 0);
        this.rHorn03.mirror = true;
        this.rHorn03.setRotationPoint(0.0F, 0.0F, 2.4F);
        this.rHorn03.addBox(-0.5F, -0.5F, -0.4F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHorn03, 0.6108652381980153F, 0.0F, 0.0F);
        this.lHorn02c = new ModelRenderer(this, 24, 0);
        this.lHorn02c.mirror = true;
        this.lHorn02c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02c.addBox(-0.29F, -0.2F, -0.5F, 1, 1, 3, 0.0F);
        this.righttWingMembrane = new ModelRenderer(this, 28, 40);
        this.righttWingMembrane.mirror = true;
        this.righttWingMembrane.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.righttWingMembrane.addBox(0.0F, -1.0F, -0.2F, 0, 15, 9, 0.0F);
        this.rHorn02a = new ModelRenderer(this, 24, 0);
        this.rHorn02a.mirror = true;
        this.rHorn02a.setRotationPoint(-0.2F, 0.0F, 1.1F);
        this.rHorn02a.addBox(-0.2F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHorn02a, 0.6108652381980153F, -0.2792526803190927F, 0.0F);
        this.lHorn01 = new ModelRenderer(this, 0, 0);
        this.lHorn01.mirror = true;
        this.lHorn01.setRotationPoint(3.5F, -7.6F, -1.0F);
        this.lHorn01.addBox(-1.0F, -1.0F, -0.4F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lHorn01, 0.0F, 1.2217304763960306F, -0.6108652381980153F);
        this.tail02 = new ModelRenderer(this, 52, 28);
        this.tail02.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail02.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(tail02, 0.03490658503988659F, 0.0F, 0.0F);
        this.rHoofClaw01a = new ModelRenderer(this, 0, 48);
        this.rHoofClaw01a.mirror = true;
        this.rHoofClaw01a.setRotationPoint(-0.4F, 5.6F, -0.2F);
        this.rHoofClaw01a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(rHoofClaw01a, 0.17453292519943295F, 0.13962634015954636F, 0.03490658503988659F);
        this.lHorn02b = new ModelRenderer(this, 24, 0);
        this.lHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lHorn02b.addBox(-0.8F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.righttWing02 = new ModelRenderer(this, 56, 52);
        this.righttWing02.mirror = true;
        this.righttWing02.setRotationPoint(0.0F, 0.6F, 8.4F);
        this.righttWing02.addBox(-0.5F, -3.5F, -0.5F, 1, 11, 1, 0.0F);
        this.leftLeg01 = new ModelRenderer(this, 0, 29);
        this.leftLeg01.setRotationPoint(0.0F, 4.8F, -0.7F);
        this.leftLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(leftLeg01, 0.6283185307179586F, 0.0F, 0.0F);
        this.rightLeg01 = new ModelRenderer(this, 0, 29);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(0.0F, 4.8F, -0.7F);
        this.rightLeg01.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rightLeg01, 0.6283185307179586F, 0.0F, 0.0F);
        this.rightPec = new ModelRenderer(this, 14, 33);
        this.rightPec.mirror = true;
        this.rightPec.setRotationPoint(-2.3F, 2.1F, 0.1F);
        this.rightPec.addBox(-2.5F, -2.5F, -3.0F, 5, 5, 3, 0.0F);
        this.setRotateAngle(rightPec, 0.0F, 0.08726646259971647F, -0.08726646259971647F);
        this.leftShoulderPad = new ModelRenderer(this, 10, 49);
        this.leftShoulderPad.setRotationPoint(0.4F, -0.5F, 0.0F);
        this.leftShoulderPad.addBox(-1.2F, -2.2F, -2.5F, 4, 5, 5, 0.0F);
        this.lHoofClaw02a = new ModelRenderer(this, 0, 48);
        this.lHoofClaw02a.setRotationPoint(-0.5F, 5.6F, -0.2F);
        this.lHoofClaw02a.addBox(-0.5F, -0.5F, -2.0F, 1, 1, 2, 0.0F);
        this.setRotateAngle(lHoofClaw02a, 0.17453292519943295F, 0.08726646259971647F, 0.03490658503988659F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -1.6F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.rHoofClaw02b = new ModelRenderer(this, 0, 52);
        this.rHoofClaw02b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rHoofClaw02b.addBox(-0.51F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHoofClaw02b, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHoofClaw01b = new ModelRenderer(this, 0, 52);
        this.rHoofClaw01b.mirror = true;
        this.rHoofClaw01b.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.rHoofClaw01b.addBox(-0.51F, -1.1F, -1.2F, 1, 1, 3, 0.0F);
        this.setRotateAngle(rHoofClaw01b, 0.3490658503988659F, 0.0F, 0.0F);
        this.rHorn02b = new ModelRenderer(this, 24, 0);
        this.rHorn02b.mirror = true;
        this.rHorn02b.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rHorn02b.addBox(-0.8F, -0.8F, -0.5F, 1, 1, 3, 0.0F);
        this.leftWingMembrane = new ModelRenderer(this, 28, 40);
        this.leftWingMembrane.setRotationPoint(0.0F, 1.2F, 0.0F);
        this.leftWingMembrane.addBox(0.0F, -1.0F, -0.2F, 0, 15, 9, 0.0F);
        this.tail03 = new ModelRenderer(this, 52, 28);
        this.tail03.setRotationPoint(0.0F, 0.0F, 3.9F);
        this.tail03.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F);
        this.setRotateAngle(tail03, 0.08726646259971647F, 0.0F, 0.0F);
        this.BipedHat = new ModelRenderer(this, 32, 0);
        this.BipedHat.setRotationPoint(0.0F, -1.8F, 0.0F);
        this.BipedHat.addBox(-4.0F, -7.8F, -4.0F, 8, 8, 8, 0.5F);
        this.hair = new ModelRenderer(this, 0, 61);
        this.hair.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.hair.addBox(-4.0F, 0.0F, 3.5F, 8, 2, 1, 0.0F);
        this.BipedHat.addChild(hair);
        this.lHorn02a.addChild(this.lHorn03);
        this.lHoofClaw01a.addChild(this.lHoofClaw01b);
        this.tail03.addChild(this.tailTip01);
        this.leftLeg01.addChild(this.leftLeg02);
        this.BipedBody.addChild(this.rightWing01);
        this.lHorn02a.addChild(this.lHorn02d);
        this.BipedBody.addChild(this.BipedRightArm);
        this.lHoofClaw02a.addChild(this.lHoofClaw02b);
        this.lHorn03.addChild(this.lHorn04);
        this.tailTip01.addChild(this.tailTip02);
        this.BipedBody.addChild(this.leftPec);
        this.BipedBody.addChild(this.BipedHead);
        this.BipedRightArm.addChild(this.rightShoulderPad);
        this.leftLeg02.addChild(this.lHoofClaw01a);
        this.BipedHead.addChild(this.rHorn01);
        this.leftWing01.addChild(this.leftWing02);
        this.BipedBody.addChild(this.tail01);
        this.rightLeg02.addChild(this.rHoofClaw02a);
        this.BipedBody.addChild(this.leftWing01);
        this.lHorn01.addChild(this.lHorn02a);
        this.BipedBody.addChild(this.BipedRightLeg);
        this.rHorn03.addChild(this.rHorn04);
        this.BipedBody.addChild(this.coat);
        this.BipedBody.addChild(this.BipedLeftLeg);
        this.rHorn02a.addChild(this.rHorn02c);
        this.rHorn02a.addChild(this.rHorn02d);
        this.rightLeg01.addChild(this.rightLeg02);
        this.rHorn02a.addChild(this.rHorn03);
        this.lHorn02a.addChild(this.lHorn02c);
        this.rightWing01.addChild(this.righttWingMembrane);
        this.rHorn01.addChild(this.rHorn02a);
        this.BipedHead.addChild(this.lHorn01);
        this.tail01.addChild(this.tail02);
        this.rightLeg02.addChild(this.rHoofClaw01a);
        this.lHorn02a.addChild(this.lHorn02b);
        this.rightWing01.addChild(this.righttWing02);
        this.BipedLeftLeg.addChild(this.leftLeg01);
        this.BipedRightLeg.addChild(this.rightLeg01);
        this.BipedBody.addChild(this.rightPec);
        this.BipedLeftArm.addChild(this.leftShoulderPad);
        this.leftLeg02.addChild(this.lHoofClaw02a);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.rHoofClaw02a.addChild(this.rHoofClaw02b);
        this.rHoofClaw01a.addChild(this.rHoofClaw01b);
        this.rHorn02a.addChild(this.rHorn02b);
        this.leftWing01.addChild(this.leftWingMembrane);
        this.tail02.addChild(this.tail03);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
        this.BipedHat.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstackChest = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.CHEST);

        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = headPitch / 57.295776F;

        BipedHat.rotateAngleY = BipedHead.rotateAngleY;
        BipedHat.rotateAngleX = BipedHead.rotateAngleX;

        // arms
        if(itemstackChest.getItem() == Items.STICK) {
            BipedRightArm.rotationPointX = -3F;
            BipedLeftArm.rotationPointX = 3F;
        }

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

        // body
        rightWing01.rotateAngleY = MathHelper.cos(ageInTicks * 0.3F + (float) Math.PI) * 1.0F * limbSwingAmount * 0.5F;
        leftWing01.rotateAngleY = MathHelper.cos(ageInTicks * 0.3F) * 1.0F * limbSwingAmount * 0.5F;
        --rightWing01.rotateAngleY;
        ++leftWing01.rotateAngleY;

        tail01.rotateAngleY = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;
        BipedRightLeg.rotateAngleX -= 0.1745329F;
        BipedLeftLeg.rotateAngleX -= 0.1745329F;
        BipedRightLeg.rotateAngleY = 0.0F;
        BipedLeftLeg.rotateAngleY = 0.0F;
        BipedRightLeg.rotateAngleZ = 0.0F;
        BipedLeftLeg.rotateAngleZ = 0.0F;
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

    @Override
    public ModelRenderer[] getLeftArm() {
        return new ModelRenderer[] {BipedBody, BipedLeftArm};
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] {BipedBody, BipedRightArm};
    }
}
