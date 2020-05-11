package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_ant - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelAnt extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer stomach;
    public ModelRenderer head;
    public ModelRenderer BipedLeftArm02;
    public ModelRenderer BipedRightArm02;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer thoraxBack;
    public ModelRenderer leftLeg01;
    public ModelRenderer leftLeg02;
    public ModelRenderer lFoot;
    public ModelRenderer rightLeg01;
    public ModelRenderer rightLeg02;
    public ModelRenderer rFoot;
    public ModelRenderer abdomen;
    public ModelRenderer abdomenBack;
    public ModelRenderer lMandible;
    public ModelRenderer rMandible;
    public ModelRenderer lAntenna00;
    public ModelRenderer rAntenna00;
    public ModelRenderer lMandibleLarge;
    public ModelRenderer rMandibleLarge;
    public ModelRenderer lAntenna01;
    public ModelRenderer rAntenna01;
    public ModelRenderer leftArm02Lower;
    public ModelRenderer lHand02;
    public ModelRenderer righttArm02Lower;
    public ModelRenderer rHand02;
    public ModelRenderer leftArm01Upper;
    public ModelRenderer leftArm01Lower;
    public ModelRenderer lHand01;
    public ModelRenderer rightArm01Upper;
    public ModelRenderer rightArm01Lower;
    public ModelRenderer rHand01;

    public ModelAnt() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.BipedRightArm = new ModelRenderer(this, 54, 20);
        this.BipedRightArm.setRotationPoint(-3.3F, 2.4F, -1.3F);
        this.BipedRightArm.addBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(BipedRightArm, -0.7853981633974483F, 0.0F, 0.10000736613927509F);
        this.rAntenna01 = new ModelRenderer(this, 53, 0);
        this.rAntenna01.mirror = true;
        this.rAntenna01.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.rAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 6, 1, 0.0F);
        this.setRotateAngle(rAntenna01, -0.3141592653589793F, 0.0F, 0.3141592653589793F);
        this.lMandible = new ModelRenderer(this, 0, 11);
        this.lMandible.setRotationPoint(1.2F, 4.7F, -0.3F);
        this.lMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lMandible, 0.17453292519943295F, 0.0F, 0.05235987755982988F);
        this.abdomenBack = new ModelRenderer(this, 41, 55);
        this.abdomenBack.setRotationPoint(0.0F, -0.3F, 7.2F);
        this.abdomenBack.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 3, 0.0F);
        this.setRotateAngle(abdomenBack, -0.2792526803190927F, 0.0F, 0.0F);
        this.rightLeg01 = new ModelRenderer(this, 0, 27);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(0.0F, 4.8F, -1.2F);
        this.rightLeg01.addBox(-1.51F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(rightLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.lHand01 = new ModelRenderer(this, 9, 37);
        this.lHand01.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.lHand01.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lHand01, 0.5235987755982988F, 0.0F, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 37);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 6.2F, 0.4F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rightLeg02, -0.7155849933176751F, 0.0F, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 17);
        this.BipedLeftLeg.setRotationPoint(2.1F, 4.0F, 0.2F);
        this.BipedLeftLeg.addBox(-1.5F, -1.0F, -2.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.9250245035569946F, 0.0F, 0.0F);
        this.rFoot = new ModelRenderer(this, 9, 37);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 5.2F, -0.2F);
        this.rFoot.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rFoot, -1.3788101090755203F, 0.0F, 0.0F);
        this.rightArm01Upper = new ModelRenderer(this, 40, 16);
        this.rightArm01Upper.mirror = true;
        this.rightArm01Upper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rightArm01Upper.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(rightArm01Upper, 0.2617993877991494F, 0.2617993877991494F, 0.22689280275926282F);
        this.rMandibleLarge = new ModelRenderer(this, 10, 11);
        this.rMandibleLarge.mirror = true;
        this.rMandibleLarge.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.rMandibleLarge.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rMandibleLarge, 0.0F, 0.0F, -0.08726646259971647F);
        this.stomach = new ModelRenderer(this, 19, 30);
        this.stomach.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.stomach.addBox(-2.5F, 0.0F, -2.0F, 5, 5, 4, 0.0F);
        this.rMandible = new ModelRenderer(this, 0, 11);
        this.rMandible.mirror = true;
        this.rMandible.setRotationPoint(-1.2F, 4.8F, -0.3F);
        this.rMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rMandible, 0.17453292519943295F, 0.0F, -0.05235987755982988F);
        this.abdomen = new ModelRenderer(this, 10, 47);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 1.3F);
        this.abdomen.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(abdomen, -0.13962634015954636F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -1.4F, 2.1F);
        this.head.addBox(-3.0F, -1.0F, -3.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(head, -1.8151424220741026F, 0.0F, 0.0F);
        this.rightArm01Lower = new ModelRenderer(this, 39, 28);
        this.rightArm01Lower.mirror = true;
        this.rightArm01Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.rightArm01Lower.addBox(-1.0F, -0.2F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rightArm01Lower, -0.3490658503988659F, 0.0F, -0.22689280275926282F);
        this.leftArm01Lower = new ModelRenderer(this, 39, 28);
        this.leftArm01Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.leftArm01Lower.addBox(-1.0F, -0.2F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftArm01Lower, -0.3490658503988659F, 0.0F, 0.22689280275926282F);
        this.leftArm02Lower = new ModelRenderer(this, 39, 28);
        this.leftArm02Lower.setRotationPoint(-0.6F, 3.5F, -0.0F);
        this.leftArm02Lower.addBox(-1.0F, -0.2F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(leftArm02Lower, -0.5235987755982988F, 0.0F, 0.22689280275926282F);
        this.lAntenna00 = new ModelRenderer(this, 46, 0);
        this.lAntenna00.setRotationPoint(0.7F, 2.3F, -2.6F);
        this.lAntenna00.addBox(0.0F, -0.5F, -3.5F, 0, 1, 4, 0.0F);
        this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
        this.lMandibleLarge = new ModelRenderer(this, 10, 11);
        this.lMandibleLarge.setRotationPoint(0.0F, 2.9F, 0.0F);
        this.lMandibleLarge.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lMandibleLarge, 0.0F, 0.0F, 0.08726646259971647F);
        this.BipedRightArm02 = new ModelRenderer(this, 40, 16);
        this.BipedRightArm02.mirror = true;
        this.BipedRightArm02.setRotationPoint(-4.2F, 5.0F, -0.3F);
        this.BipedRightArm02.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedRightArm02, -0.3490658503988659F, 0.2617993877991494F, 0.10000736613927509F);
        this.rHand01 = new ModelRenderer(this, 9, 37);
        this.rHand01.mirror = true;
        this.rHand01.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.rHand01.addBox(-1.6F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rHand01, 0.5235987755982988F, 0.0F, 0.0F);
        this.BipedBody = new ModelRenderer(this, 13, 16);
        this.BipedBody.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.BipedBody.addBox(-3.5F, 0.0F, -2.5F, 7, 7, 6, 0.0F);
        this.setRotateAngle(BipedBody, 0.4886921905584123F, 0.0F, 0.0F);
        this.leftLeg01 = new ModelRenderer(this, 0, 27);
        this.leftLeg01.setRotationPoint(0.0F, 4.8F, -1.2F);
        this.leftLeg01.addBox(-1.49F, 0.0F, -1.5F, 3, 7, 3, 0.0F);
        this.setRotateAngle(leftLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 37);
        this.leftLeg02.setRotationPoint(0.0F, 6.2F, 0.4F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leftLeg02, -0.7155849933176751F, 0.0F, 0.0F);
        this.rAntenna00 = new ModelRenderer(this, 46, 0);
        this.rAntenna00.mirror = true;
        this.rAntenna00.setRotationPoint(-0.7F, 2.3F, -2.6F);
        this.rAntenna00.addBox(0.0F, -0.5F, -3.5F, 0, 1, 4, 0.0F);
        this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
        this.lHand02 = new ModelRenderer(this, 9, 37);
        this.lHand02.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.lHand02.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lHand02, 0.5235987755982988F, 0.0F, 0.0F);
        this.lAntenna01 = new ModelRenderer(this, 53, 0);
        this.lAntenna01.setRotationPoint(0.0F, 0.0F, -2.8F);
        this.lAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 6, 1, 0.0F);
        this.setRotateAngle(lAntenna01, -0.3141592653589793F, 0.0F, -0.3141592653589793F);
        this.leftArm01Upper = new ModelRenderer(this, 40, 16);
        this.leftArm01Upper.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.leftArm01Upper.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(leftArm01Upper, 0.2617993877991494F, -0.2617993877991494F, -0.22689280275926282F);
        this.righttArm02Lower = new ModelRenderer(this, 39, 28);
        this.righttArm02Lower.mirror = true;
        this.righttArm02Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.righttArm02Lower.addBox(-1.0F, -0.2F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(righttArm02Lower, -0.5235987755982988F, 0.0F, -0.22689280275926282F);
        this.BipedLeftArm02 = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm02.setRotationPoint(4.2F, 5.0F, -0.3F);
        this.BipedLeftArm02.addBox(-1.0F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedLeftArm02, -0.3490658503988659F, -0.2617993877991494F, -0.10000736613927509F);
        this.rHand02 = new ModelRenderer(this, 9, 37);
        this.rHand02.mirror = true;
        this.rHand02.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.rHand02.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rHand02, 0.5235987755982988F, 0.0F, 0.0F);
        this.thoraxBack = new ModelRenderer(this, 0, 47);
        this.thoraxBack.setRotationPoint(0.0F, 3.7F, 0.5F);
        this.thoraxBack.addBox(-3.0F, -2.0F, 0.0F, 6, 4, 2, 0.0F);
        this.setRotateAngle(thoraxBack, -0.8028514559173915F, 0.0F, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 54, 20);
        this.BipedLeftArm.setRotationPoint(3.3F, 2.4F, -1.3F);
        this.BipedLeftArm.addBox(-0.5F, -0.5F, -0.5F, 1, 12, 1, 0.0F);
        this.setRotateAngle(BipedLeftArm, -0.7853981633974483F, 0.0F, -0.10000736613927509F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 17);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.1F, 4.0F, 0.2F);
        this.BipedRightLeg.addBox(-1.5F, -1.0F, -2.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.9250245035569946F, 0.0F, 0.0F);
        this.lFoot = new ModelRenderer(this, 9, 37);
        this.lFoot.setRotationPoint(0.0F, 5.2F, -0.2F);
        this.lFoot.addBox(-1.5F, -1.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lFoot, -1.3788101090755203F, 0.0F, 0.0F);
        this.BipedBody.addChild(this.BipedRightArm);
        this.rAntenna00.addChild(this.rAntenna01);
        this.head.addChild(this.lMandible);
        this.abdomen.addChild(this.abdomenBack);
        this.BipedRightLeg.addChild(this.rightLeg01);
        this.leftArm01Lower.addChild(this.lHand01);
        this.rightLeg01.addChild(this.rightLeg02);
        this.stomach.addChild(this.BipedLeftLeg);
        this.rightLeg02.addChild(this.rFoot);
        this.BipedRightArm.addChild(this.rightArm01Upper);
        this.rMandible.addChild(this.rMandibleLarge);
        this.BipedBody.addChild(this.stomach);
        this.head.addChild(this.rMandible);
        this.thoraxBack.addChild(this.abdomen);
        this.BipedBody.addChild(this.head);
        this.rightArm01Upper.addChild(this.rightArm01Lower);
        this.leftArm01Upper.addChild(this.leftArm01Lower);
        this.BipedLeftArm02.addChild(this.leftArm02Lower);
        this.head.addChild(this.lAntenna00);
        this.lMandible.addChild(this.lMandibleLarge);
        this.BipedBody.addChild(this.BipedRightArm02);
        this.rightArm01Lower.addChild(this.rHand01);
        this.BipedLeftLeg.addChild(this.leftLeg01);
        this.leftLeg01.addChild(this.leftLeg02);
        this.head.addChild(this.rAntenna00);
        this.leftArm02Lower.addChild(this.lHand02);
        this.lAntenna00.addChild(this.lAntenna01);
        this.BipedLeftArm.addChild(this.leftArm01Upper);
        this.BipedRightArm02.addChild(this.righttArm02Lower);
        this.BipedBody.addChild(this.BipedLeftArm02);
        this.righttArm02Lower.addChild(this.rHand02);
        this.stomach.addChild(this.thoraxBack);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.stomach.addChild(this.BipedRightLeg);
        this.leftLeg02.addChild(this.lFoot);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        // head (look)
        head.rotateAngleY = netHeadYaw / 57.295776F;
        head.rotateAngleX = headPitch / 57.295776F - 1.8151424220741026F;

        // arms (moving)
        BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F - 0.7853981633974483F;
        BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F - 0.7853981633974483F;

        BipedRightArm.rotateAngleZ = 0.0F;
        BipedLeftArm.rotateAngleZ = 0.0F;
        if(swingProgress > -9990.0F) {
            holdingMelee();
        }

        // arms (idle)
        BipedRightArm.rotateAngleZ += (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.2617994F;
        BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.025F;
        BipedLeftArm.rotateAngleZ -= (MathHelper.cos(ageInTicks * 0.09F) * 0.025F + 0.025F) + 0.2617994F;
        BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.025F;

        // body
        thoraxBack.rotateAngleX = MathHelper.cos((float) Math.toRadians((float) entityIn.ticksExisted * 7)) * (float) Math.toRadians(2) - 0.8028514559173915F;

        // legs (walking)
        BipedRightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount * 0.5F - 0.9250245035569946F;
        BipedLeftLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 1.4F * limbSwingAmount * 0.5F - 0.9250245035569946F;
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
        return new ModelRenderer[] {BipedBody, BipedLeftArm, leftArm01Upper, leftArm01Lower, lHand01};
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] {BipedBody, BipedRightArm, rightArm01Upper, rightArm01Lower, rHand01};
    }
}
