package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_matango - cybercat5555
 * Created using Tabula 7.1.0
 */
public class ModelMatango extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer bodyMycelium;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer lArmMycelium;
    public ModelRenderer lClaw01;
    public ModelRenderer lClaw02;
    public ModelRenderer lClaw03;
    public ModelRenderer lClaw04;
    public ModelRenderer lClaw05;
    public ModelRenderer rArmMycelium;
    public ModelRenderer rClaw01;
    public ModelRenderer rClaw02;
    public ModelRenderer rClaw03;
    public ModelRenderer rClaw04;
    public ModelRenderer rClaw05;
    public ModelRenderer capMain;
    public ModelRenderer capFront;
    public ModelRenderer capBack;
    public ModelRenderer capLeft;
    public ModelRenderer capRight;
    public ModelRenderer growth01;
    public ModelRenderer growth02;
    public ModelRenderer growth03;
    public ModelRenderer growth04;
    public ModelRenderer growth05;
    public ModelRenderer growth06;
    public ModelRenderer growth07;
    public ModelRenderer growth08;
    public ModelRenderer growth09;
    public ModelRenderer growth10;
    public ModelRenderer growth11;
    public ModelRenderer growth12;
    public ModelRenderer growth13;
    public ModelRenderer capFrontMycelium;
    public ModelRenderer capBackMycelium;
    public ModelRenderer capLeftMycelium;
    public ModelRenderer capRightMycelium;
    public ModelRenderer lFoot;
    public ModelRenderer rFoot;

    public ModelMatango() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.capRightMycelium = new ModelRenderer(this, 28, 6);
        this.capRightMycelium.setRotationPoint(0.0F, 2.3F, 0.3F);
        this.capRightMycelium.addBox(-6.0F, -1.0F, -4.5F, 12, 3, 3, 0.0F);
        this.growth06 = new ModelRenderer(this, 33, 53);
        this.growth06.setRotationPoint(5.6F, 0.0F, 0.0F);
        this.growth06.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(growth06, 0.0F, 1.5707963267948966F, 0.17453292519943295F);
        this.capLeftMycelium = new ModelRenderer(this, 28, 6);
        this.capLeftMycelium.setRotationPoint(0.0F, 2.3F, 0.3F);
        this.capLeftMycelium.addBox(-6.0F, -1.0F, -4.5F, 12, 3, 3, 0.0F);
        this.capFront = new ModelRenderer(this, 6, 41);
        this.capFront.setRotationPoint(0.0F, 0.5F, -3.0F);
        this.capFront.addBox(-4.5F, -1.0F, -4.5F, 9, 3, 3, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedRightLeg, 0.0F, 0.0F, 0.03490658503988659F);
        this.lClaw01 = new ModelRenderer(this, 33, 32);
        this.lClaw01.setRotationPoint(1.6F, 8.0F, -1.4F);
        this.lClaw01.addBox(-0.3F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lClaw01, -0.3490658503988659F, 0.0F, 0.17453292519943295F);
        this.growth02 = new ModelRenderer(this, 52, 50);
        this.growth02.setRotationPoint(-4.0F, 0.8F, -5.0F);
        this.growth02.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.growth08 = new ModelRenderer(this, 33, 53);
        this.growth08.setRotationPoint(0.0F, 0.0F, 5.6F);
        this.growth08.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(growth08, -0.17453292519943295F, 0.0F, 0.0F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-3.5F, -7.0F, -3.0F, 7, 7, 6, 0.0F);
        this.growth11 = new ModelRenderer(this, 52, 50);
        this.growth11.setRotationPoint(-2.8F, -1.0F, -2.8F);
        this.growth11.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(growth11, 0.22689280275926282F, 0.7853981633974483F, 0.0F);
        this.capBackMycelium = new ModelRenderer(this, 28, 0);
        this.capBackMycelium.mirror = true;
        this.capBackMycelium.setRotationPoint(0.0F, 2.3F, -2.6F);
        this.capBackMycelium.addBox(-5.0F, -1.0F, -1.5F, 10, 3, 3, 0.0F);
        this.capRight = new ModelRenderer(this, 4, 41);
        this.capRight.setRotationPoint(-3.0F, 0.5F, 0.0F);
        this.capRight.addBox(-5.5F, -1.0F, -4.5F, 11, 3, 3, 0.0F);
        this.setRotateAngle(capRight, 0.0F, 1.5707963267948966F, 0.0F);
        this.growth03 = new ModelRenderer(this, 52, 50);
        this.growth03.setRotationPoint(4.0F, 0.8F, 5.0F);
        this.growth03.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.rClaw01 = new ModelRenderer(this, 33, 32);
        this.rClaw01.mirror = true;
        this.rClaw01.setRotationPoint(-1.6F, 8.0F, -1.4F);
        this.rClaw01.addBox(-1.7F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rClaw01, -0.3490658503988659F, 0.0F, -0.17453292519943295F);
        this.lClaw02 = new ModelRenderer(this, 33, 32);
        this.lClaw02.setRotationPoint(1.6F, 9.0F, -0.6F);
        this.lClaw02.addBox(-0.3F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lClaw02, -0.22689280275926282F, 0.0F, 0.13962634015954636F);
        this.rArmMycelium = new ModelRenderer(this, 41, 32);
        this.rArmMycelium.mirror = true;
        this.rArmMycelium.setRotationPoint(-1.5F, -0.2F, 0.0F);
        this.rArmMycelium.addBox(-2.0F, -2.0F, -2.49F, 4, 7, 5, 0.0F);
        this.growth07 = new ModelRenderer(this, 33, 53);
        this.growth07.setRotationPoint(-5.6F, 0.0F, 0.0F);
        this.growth07.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(growth07, 0.0F, -1.5707963267948966F, -0.17453292519943295F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.growth04 = new ModelRenderer(this, 52, 50);
        this.growth04.setRotationPoint(-4.0F, 0.8F, 5.0F);
        this.growth04.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.lArmMycelium = new ModelRenderer(this, 41, 32);
        this.lArmMycelium.setRotationPoint(1.5F, -0.2F, 0.0F);
        this.lArmMycelium.addBox(-2.0F, -2.0F, -2.49F, 4, 7, 5, 0.0F);
        this.lClaw04 = new ModelRenderer(this, 33, 32);
        this.lClaw04.setRotationPoint(1.6F, 9.0F, 0.7F);
        this.lClaw04.addBox(-0.3F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lClaw04, 0.22689280275926282F, 0.0F, 0.12217304763960307F);
        this.lClaw03 = new ModelRenderer(this, 33, 32);
        this.lClaw03.setRotationPoint(1.6F, 9.5F, 0.0F);
        this.lClaw03.addBox(-0.3F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lClaw03, 0.0F, 0.0F, 0.08726646259971647F);
        this.rClaw05 = new ModelRenderer(this, 33, 32);
        this.rClaw05.mirror = true;
        this.rClaw05.setRotationPoint(-1.6F, 8.2F, 1.4F);
        this.rClaw05.addBox(-1.7F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rClaw05, 0.3490658503988659F, 0.0F, -0.17453292519943295F);
        this.growth13 = new ModelRenderer(this, 52, 50);
        this.growth13.mirror = true;
        this.growth13.setRotationPoint(-2.8F, -1.0F, 2.8F);
        this.growth13.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(growth13, -0.22689280275926282F, -0.7853981633974483F, 0.0F);
        this.capFrontMycelium = new ModelRenderer(this, 28, 0);
        this.capFrontMycelium.setRotationPoint(0.0F, 2.3F, -2.6F);
        this.capFrontMycelium.addBox(-5.0F, -1.0F, -1.5F, 10, 3, 3, 0.0F);
        this.lClaw05 = new ModelRenderer(this, 33, 32);
        this.lClaw05.setRotationPoint(1.6F, 8.2F, 1.4F);
        this.lClaw05.addBox(-0.3F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lClaw05, 0.3490658503988659F, 0.0F, 0.17453292519943295F);
        this.rFoot = new ModelRenderer(this, 33, 44);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.rFoot.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(rFoot, 0.0F, 0.0F, -0.03490658503988659F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.growth09 = new ModelRenderer(this, 44, 56);
        this.growth09.setRotationPoint(0.0F, -1.6F, 0.0F);
        this.growth09.addBox(-2.5F, -3.0F, -2.5F, 5, 3, 5, 0.0F);
        this.setRotateAngle(growth09, 0.0F, 0.7853981633974483F, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(BipedLeftLeg, 0.0F, 0.0F, -0.03490658503988659F);
        this.growth12 = new ModelRenderer(this, 52, 50);
        this.growth12.setRotationPoint(2.8F, -1.0F, 2.8F);
        this.growth12.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(growth12, -0.22689280275926282F, -0.7853981633974483F, 0.22689280275926282F);
        this.capMain = new ModelRenderer(this, 0, 34);
        this.capMain.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.capMain.addBox(-4.5F, -2.6F, -4.5F, 9, 4, 9, 0.0F);
        this.capLeft = new ModelRenderer(this, 4, 41);
        this.capLeft.setRotationPoint(3.0F, 0.5F, 0.0F);
        this.capLeft.addBox(-5.5F, -1.0F, -4.5F, 11, 3, 3, 0.0F);
        this.setRotateAngle(capLeft, 0.0F, -1.5707963267948966F, 0.0F);
        this.bodyMycelium = new ModelRenderer(this, 0, 48);
        this.bodyMycelium.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bodyMycelium.addBox(-5.5F, -0.4F, -2.51F, 11, 10, 5, 0.0F);
        this.rClaw02 = new ModelRenderer(this, 33, 32);
        this.rClaw02.mirror = true;
        this.rClaw02.setRotationPoint(-1.6F, 9.0F, -0.6F);
        this.rClaw02.addBox(-1.7F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rClaw02, -0.22689280275926282F, 0.0F, -0.13962634015954636F);
        this.growth05 = new ModelRenderer(this, 33, 53);
        this.growth05.setRotationPoint(0.0F, 0.0F, -5.6F);
        this.growth05.addBox(-2.0F, -3.0F, -2.0F, 4, 3, 4, 0.0F);
        this.setRotateAngle(growth05, 0.17453292519943295F, 0.0F, 0.0F);
        this.rClaw04 = new ModelRenderer(this, 33, 32);
        this.rClaw04.mirror = true;
        this.rClaw04.setRotationPoint(-1.6F, 9.0F, 0.7F);
        this.rClaw04.addBox(-1.7F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rClaw04, 0.22689280275926282F, 0.0F, -0.12217304763960307F);
        this.capBack = new ModelRenderer(this, 6, 41);
        this.capBack.setRotationPoint(0.0F, 0.5F, 3.0F);
        this.capBack.addBox(-4.5F, -1.0F, -4.5F, 9, 3, 3, 0.0F);
        this.setRotateAngle(capBack, 0.0F, 3.141592653589793F, 0.0F);
        this.lFoot = new ModelRenderer(this, 33, 44);
        this.lFoot.setRotationPoint(0.0F, 8.0F, 0.0F);
        this.lFoot.addBox(-2.5F, 0.0F, -2.5F, 5, 4, 5, 0.0F);
        this.setRotateAngle(lFoot, 0.0F, 0.0F, 0.03490658503988659F);
        this.rClaw03 = new ModelRenderer(this, 33, 32);
        this.rClaw03.mirror = true;
        this.rClaw03.setRotationPoint(-1.6F, 9.5F, 0.0F);
        this.rClaw03.addBox(-1.7F, -1.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rClaw03, 0.0F, 0.0F, -0.08726646259971647F);
        this.growth10 = new ModelRenderer(this, 52, 50);
        this.growth10.mirror = true;
        this.growth10.setRotationPoint(2.8F, -1.0F, -2.8F);
        this.growth10.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(growth10, 0.22689280275926282F, 0.7853981633974483F, 0.22689280275926282F);
        this.growth01 = new ModelRenderer(this, 52, 50);
        this.growth01.setRotationPoint(4.0F, 0.8F, -5.0F);
        this.growth01.addBox(-1.5F, -3.0F, -1.5F, 3, 3, 3, 0.0F);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.capRight.addChild(this.capRightMycelium);
        this.capMain.addChild(this.growth06);
        this.capLeft.addChild(this.capLeftMycelium);
        this.capMain.addChild(this.capFront);
        this.BipedBody.addChild(this.BipedRightLeg);
        this.BipedLeftArm.addChild(this.lClaw01);
        this.capMain.addChild(this.growth02);
        this.capMain.addChild(this.growth08);
        this.BipedBody.addChild(this.BipedHead);
        this.capMain.addChild(this.growth11);
        this.capBack.addChild(this.capBackMycelium);
        this.capMain.addChild(this.capRight);
        this.capMain.addChild(this.growth03);
        this.BipedRightArm.addChild(this.rClaw01);
        this.BipedLeftArm.addChild(this.lClaw02);
        this.BipedRightArm.addChild(this.rArmMycelium);
        this.capMain.addChild(this.growth07);
        this.capMain.addChild(this.growth04);
        this.BipedLeftArm.addChild(this.lArmMycelium);
        this.BipedLeftArm.addChild(this.lClaw04);
        this.BipedLeftArm.addChild(this.lClaw03);
        this.BipedRightArm.addChild(this.rClaw05);
        this.capMain.addChild(this.growth13);
        this.capFront.addChild(this.capFrontMycelium);
        this.BipedLeftArm.addChild(this.lClaw05);
        this.BipedRightLeg.addChild(this.rFoot);
        this.BipedBody.addChild(this.BipedRightArm);
        this.capMain.addChild(this.growth09);
        this.BipedBody.addChild(this.BipedLeftLeg);
        this.capMain.addChild(this.growth12);
        this.BipedHead.addChild(this.capMain);
        this.capMain.addChild(this.capLeft);
        this.BipedBody.addChild(this.bodyMycelium);
        this.BipedRightArm.addChild(this.rClaw02);
        this.capMain.addChild(this.growth05);
        this.BipedRightArm.addChild(this.rClaw04);
        this.capMain.addChild(this.capBack);
        this.BipedLeftLeg.addChild(this.lFoot);
        this.BipedRightArm.addChild(this.rClaw03);
        this.capMain.addChild(this.growth10);
        this.capMain.addChild(this.growth01);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = headPitch / 57.295776F;

        // arms
        BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
        BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;

        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

        // legs
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.5F * limbSwingAmount;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.5F * limbSwingAmount;
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
