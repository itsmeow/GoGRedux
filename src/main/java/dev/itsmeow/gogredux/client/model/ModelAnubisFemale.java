package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * gaia_anubis_female - cybercat5555
 * Created using Tabula 7.1.0
 */
public class ModelAnubisFemale extends ModelBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedHat;
    public ModelRenderer boobs;
    public ModelRenderer stomach;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer hips;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer skirt;
    public ModelRenderer leftShoulderPad;
    public ModelRenderer rightShoulderPad;
    public ModelRenderer snout;
    public ModelRenderer muzzleLeft;
    public ModelRenderer muzzleRight;
    public ModelRenderer lEar01;
    public ModelRenderer rEar01;
    public ModelRenderer headpieceBack;
    public ModelRenderer hair;
    public ModelRenderer headpieceLeft;
    public ModelRenderer headpieceRight;
    public ModelRenderer lEar02;
    public ModelRenderer rEar02;

    public ModelAnubisFemale() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.hips = new ModelRenderer(this, 13, 33);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -2.0F, 8, 3, 4, 0.0F);
        this.rEar02 = new ModelRenderer(this, 33, 0);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(0.0F, 0.5F, 0.7F);
        this.rEar02.addBox(-2.3F, -5.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(rEar02, 0.0F, -0.3141592653589793F, 0.22689280275926282F);
        this.BipedHat = new ModelRenderer(this, 33, 2);
        this.BipedHat.setRotationPoint(0.0F, -0.1F, 0.0F);
        this.BipedHat.addBox(-4.0F, -7.5F, -4.0F, 8, 5, 7, 0.5F);
        this.BipedLeftArm = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.0F, 3.0F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.headpieceRight = new ModelRenderer(this, 0, 33);
        this.headpieceRight.mirror = true;
        this.headpieceRight.setRotationPoint(-3.2F, -5.8F, 0.2F);
        this.headpieceRight.addBox(-1.5F, -0.7F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(headpieceRight, -0.3665191429188092F, 0.0F, 0.08726646259971647F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 3.0F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rightShoulderPad = new ModelRenderer(this, 0, 49);
        this.rightShoulderPad.mirror = true;
        this.rightShoulderPad.setRotationPoint(0.9F, -0.5F, 0.0F);
        this.rightShoulderPad.addBox(-3.5F, -2.0F, -2.5F, 4, 3, 5, 0.0F);
        this.stomach = new ModelRenderer(this, 16, 25);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 4, 0.0F);
        this.lEar01 = new ModelRenderer(this, 25, 0);
        this.lEar01.setRotationPoint(2.2F, -8.3F, -0.5F);
        this.lEar01.addBox(-1.0F, -5.3F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, 0.0F, 0.20943951023931953F);
        this.headpieceBack = new ModelRenderer(this, 38, 50);
        this.headpieceBack.setRotationPoint(0.0F, -7.4F, 3.0F);
        this.headpieceBack.addBox(-5.0F, -0.7F, -1.9F, 10, 11, 3, 0.0F);
        this.setRotateAngle(headpieceBack, 0.10471975511965977F, 0.0F, 0.0F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 5, 4, 0.0F);
        this.leftShoulderPad = new ModelRenderer(this, 0, 49);
        this.leftShoulderPad.setRotationPoint(-0.9F, -0.5F, 0.0F);
        this.leftShoulderPad.addBox(-0.5F, -2.0F, -2.5F, 4, 3, 5, 0.0F);
        this.muzzleLeft = new ModelRenderer(this, 19, 49);
        this.muzzleLeft.setRotationPoint(1.1F, -2.8F, -4.4F);
        this.muzzleLeft.addBox(-1.0F, -0.8F, -3.7F, 2, 2, 4, 0.0F);
        this.setRotateAngle(muzzleLeft, 0.0F, 0.13962634015954636F, 0.0F);
        this.skirt = new ModelRenderer(this, 40, 34);
        this.skirt.setRotationPoint(0.0F, 2.9F, 1.5F);
        this.skirt.addBox(-3.5F, 0.0F, 0.0F, 7, 11, 1, 0.0F);
        this.hair = new ModelRenderer(this, 20, 55);
        this.hair.setRotationPoint(0.0F, -2.0F, 3.7F);
        this.hair.addBox(-4.0F, 0.0F, -0.5F, 8, 8, 1, 0.0F);
        this.boobs = new ModelRenderer(this, 0, 57);
        this.boobs.setRotationPoint(0.0F, 1.5F, -0.1F);
        this.boobs.addBox(-3.5F, 0.0F, -2.0F, 7, 4, 3, 0.0F);
        this.setRotateAngle(boobs, -0.4363323129985824F, 0.0F, 0.0F);
        this.rEar01 = new ModelRenderer(this, 25, 0);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-2.2F, -8.3F, -0.5F);
        this.rEar01.addBox(0.0F, -5.3F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, 0.0F, -0.20943951023931953F);
        this.lEar02 = new ModelRenderer(this, 33, 0);
        this.lEar02.setRotationPoint(0.0F, 0.5F, 0.7F);
        this.lEar02.addBox(0.3F, -5.5F, -0.5F, 2, 7, 1, 0.0F);
        this.setRotateAngle(lEar02, 0.0F, 0.3141592653589793F, -0.22689280275926282F);
        this.snout = new ModelRenderer(this, 18, 41);
        this.snout.setRotationPoint(0.0F, -3.7F, -4.6F);
        this.snout.addBox(-1.5F, -1.5F, -3.5F, 3, 2, 4, 0.0F);
        this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.muzzleRight = new ModelRenderer(this, 19, 49);
        this.muzzleRight.mirror = true;
        this.muzzleRight.setRotationPoint(-1.1F, -2.8F, -4.4F);
        this.muzzleRight.addBox(-1.0F, -0.8F, -3.7F, 2, 2, 4, 0.0F);
        this.setRotateAngle(muzzleRight, 0.0F, -0.13962634015954636F, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 40, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.headpieceLeft = new ModelRenderer(this, 0, 33);
        this.headpieceLeft.setRotationPoint(3.2F, -5.8F, 0.2F);
        this.headpieceLeft.addBox(-0.5F, -0.7F, -1.5F, 2, 9, 3, 0.0F);
        this.setRotateAngle(headpieceLeft, -0.3665191429188092F, 0.0F, -0.08726646259971647F);
        this.stomach.addChild(this.hips);
        this.rEar01.addChild(this.rEar02);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.hips.addChild(this.BipedRightLeg);
        this.BipedHat.addChild(this.headpieceRight);
        this.hips.addChild(this.BipedLeftLeg);
        this.BipedRightArm.addChild(this.rightShoulderPad);
        this.BipedBody.addChild(this.stomach);
        this.BipedHat.addChild(this.lEar01);
        this.BipedHat.addChild(this.headpieceBack);
        this.BipedLeftArm.addChild(this.leftShoulderPad);
        this.BipedHat.addChild(this.muzzleLeft);
        this.hips.addChild(this.skirt);
        this.BipedHat.addChild(this.hair);
        this.BipedBody.addChild(this.boobs);
        this.BipedHat.addChild(this.rEar01);
        this.lEar01.addChild(this.lEar02);
        this.BipedHat.addChild(this.snout);
        this.BipedHat.addChild(this.muzzleRight);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedBody.addChild(this.BipedHead);
        this.BipedHat.addChild(this.headpieceLeft);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BipedHat.render(f5);
        this.BipedBody.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
