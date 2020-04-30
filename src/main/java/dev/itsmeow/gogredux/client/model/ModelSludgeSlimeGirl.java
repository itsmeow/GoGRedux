package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * gaia_sludge_girl - cybercat5555
 * Created using Tabula 7.1.0
 */
public class ModelSludgeSlimeGirl extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer skull;
    public ModelRenderer stomach;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer ribs;
    public ModelRenderer hips;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer lLegBones;
    public ModelRenderer rLegBones;
    public ModelRenderer lArmBones;
    public ModelRenderer rArmBones;

    public ModelSludgeSlimeGirl() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.ribs = new ModelRenderer(this, 0, 43);
        this.ribs.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ribs.addBox(-3.5F, 0.0F, -2.0F, 7, 12, 4, 0.0F);
        this.lLegBones = new ModelRenderer(this, 33, 43);
        this.lLegBones.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.lLegBones.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.skull = new ModelRenderer(this, 34, 0);
        this.skull.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.skull.addBox(-3.5F, -7.5F, -3.5F, 7, 7, 7, 0.0F);
        this.lArmBones = new ModelRenderer(this, 24, 43);
        this.lArmBones.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lArmBones.addBox(-0.5F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.0F, 3.0F, 0.0F);
        this.BipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.0F, 3.0F, 0.0F);
        this.BipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.rArmBones = new ModelRenderer(this, 24, 43);
        this.rArmBones.mirror = true;
        this.rArmBones.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rArmBones.addBox(-1.5F, -2.0F, -1.0F, 2, 12, 2, 0.0F);
        this.stomach = new ModelRenderer(this, 16, 26);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.5F, 7, 4, 5, 0.0F);
        this.hips = new ModelRenderer(this, 13, 35);
        this.hips.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -2.5F, 8, 3, 5, 0.0F);
        this.BipedLeftArm = new ModelRenderer(this, 42, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.2F, -2.0F, 3, 13, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.0F, 0.0F, -0.10000736613927509F);
        this.rLegBones = new ModelRenderer(this, 33, 43);
        this.rLegBones.mirror = true;
        this.rLegBones.setRotationPoint(0.0F, 0.0F, 0.1F);
        this.rLegBones.addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 42, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.2F, -2.0F, 3, 13, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.0F, 0.0F, 0.10000736613927509F);
        this.BipedBody = new ModelRenderer(this, 16, 16);
        this.BipedBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.5F, 8, 5, 5, 0.0F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.BipedBody.addChild(this.ribs);
        this.BipedLeftLeg.addChild(this.lLegBones);
        this.BipedLeftArm.addChild(this.lArmBones);
        this.hips.addChild(this.BipedRightLeg);
        this.hips.addChild(this.BipedLeftLeg);
        this.BipedRightArm.addChild(this.rArmBones);
        this.BipedBody.addChild(this.stomach);
        this.stomach.addChild(this.hips);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.BipedRightLeg.addChild(this.rLegBones);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedBody.addChild(this.BipedHead);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.skull.render(f5);
        this.BipedBody.render(f5);
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
