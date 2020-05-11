package dev.itsmeow.gogredux.client.model;

import gaia.entity.monster.EntityGaiaBee;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_bee - cybercat5555 Created using Tabula 7.1.0
 */
public class ModelBee extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer BipedLeftArm01;
    public ModelRenderer BipedRightArm01;
    public ModelRenderer stomach;
    public ModelRenderer head;
    public ModelRenderer lWing01;
    public ModelRenderer rWing01;
    public ModelRenderer BipedLeftArm02;
    public ModelRenderer BipedRightArm02;
    public ModelRenderer leftArm01Lower;
    public ModelRenderer lHand01;
    public ModelRenderer rightArm01Lower;
    public ModelRenderer rHand01;
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
    public ModelRenderer sting;
    public ModelRenderer lMandible;
    public ModelRenderer rMandible;
    public ModelRenderer lAntenna00;
    public ModelRenderer rAntenna00;
    public ModelRenderer lAntenna01;
    public ModelRenderer rAntenna01;
    public ModelRenderer lWing02;
    public ModelRenderer rWing02;
    public ModelRenderer leftArm02Lower;
    public ModelRenderer lHand02;
    public ModelRenderer righttArm02Lower;
    public ModelRenderer rHand02;

    public ModelBee() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.lFoot = new ModelRenderer(this, 9, 37);
        this.lFoot.setRotationPoint(0.0F, 5.2F, -0.1F);
        this.lFoot.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.lAntenna00 = new ModelRenderer(this, 46, 0);
        this.lAntenna00.setRotationPoint(0.7F, 2.3F, -2.6F);
        this.lAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
        this.rightArm01Lower = new ModelRenderer(this, 39, 28);
        this.rightArm01Lower.mirror = true;
        this.rightArm01Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.rightArm01Lower.addBox(-1.0F, -0.2F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(rightArm01Lower, -0.3490658503988659F, 0.0F, -0.22689280275926282F);
        this.lHand01 = new ModelRenderer(this, 9, 37);
        this.lHand01.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.lHand01.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lHand01, 0.5235987755982988F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 10, 47);
        this.abdomen.setRotationPoint(0.0F, 0.0F, 1.7F);
        this.abdomen.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 8, 0.0F);
        this.setRotateAngle(abdomen, -0.13962634015954636F, 0.0F, 0.0F);
        this.lWing02 = new ModelRenderer(this, 29, 11);
        this.lWing02.setRotationPoint(0.2F, 0.3F, 2.4F);
        this.lWing02.addBox(-3.5F, 0.0F, 0.0F, 8, 0, 19, 0.0F);
        this.setRotateAngle(lWing02, -0.08726646259971647F, -0.4363323129985824F, 0.0F);
        this.rHand02 = new ModelRenderer(this, 9, 37);
        this.rHand02.mirror = true;
        this.rHand02.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.rHand02.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rHand02, 0.5235987755982988F, 0.0F, 0.0F);
        this.BipedLeftArm01 = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm01.setRotationPoint(3.3F, 2.4F, -1.3F);
        this.BipedLeftArm01.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedLeftArm01, -0.9599310885968813F, -0.2617993877991494F, -0.10000736613927509F);
        this.BipedLeftArm02 = new ModelRenderer(this, 40, 16);
        this.BipedLeftArm02.setRotationPoint(4.2F, 5.0F, -0.3F);
        this.BipedLeftArm02.addBox(-1.0F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedLeftArm02, -0.6981317007977318F, -0.2617993877991494F, -0.10000736613927509F);
        this.rightLeg01 = new ModelRenderer(this, 0, 27);
        this.rightLeg01.mirror = true;
        this.rightLeg01.setRotationPoint(0.0F, 4.8F, -1.2F);
        this.rightLeg01.addBox(-2.3F, 0.0F, -1.5F, 4, 6, 3, 0.0F);
        this.setRotateAngle(rightLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.abdomenBack = new ModelRenderer(this, 41, 55);
        this.abdomenBack.setRotationPoint(0.0F, -0.3F, 7.4F);
        this.abdomenBack.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 4, 0.0F);
        this.setRotateAngle(abdomenBack, -0.2792526803190927F, 0.0F, 0.0F);
        this.lWing01 = new ModelRenderer(this, 33, 38);
        this.lWing01.setRotationPoint(1.9F, 1.0F, 2.4F);
        this.lWing01.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(lWing01, -0.7853981633974483F, 0.7853981633974483F, 0.08726646259971647F);
        this.rAntenna01 = new ModelRenderer(this, 53, 0);
        this.rAntenna01.mirror = true;
        this.rAntenna01.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.rAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(rAntenna01, 0.0F, 0.0F, 0.3141592653589793F);
        this.BipedRightArm01 = new ModelRenderer(this, 40, 16);
        this.BipedRightArm01.mirror = true;
        this.BipedRightArm01.setRotationPoint(-3.3F, 2.4F, -1.3F);
        this.BipedRightArm01.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedRightArm01, -0.9599310885968813F, 0.2617993877991494F, 0.10000736613927509F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 17);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-2.1F, 4.6F, 0.2F);
        this.BipedRightLeg.addBox(-1.5F, -1.0F, -2.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(BipedRightLeg, -0.7853981633974483F, 0.0F, 0.0F);
        this.lMandible = new ModelRenderer(this, 0, 11);
        this.lMandible.setRotationPoint(1.2F, 4.7F, -0.3F);
        this.lMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lMandible, 0.0F, 0.0F, 0.2617993877991494F);
        this.BipedBody = new ModelRenderer(this, 13, 16);
        this.BipedBody.setRotationPoint(0.0F, -1.0F, -5.0F);
        this.BipedBody.addBox(-3.5F, 0.0F, -2.5F, 7, 7, 6, 0.0F);
        this.setRotateAngle(BipedBody, 0.7853981633974483F, 0.0F, 0.0F);
        this.BipedRightArm02 = new ModelRenderer(this, 40, 16);
        this.BipedRightArm02.mirror = true;
        this.BipedRightArm02.setRotationPoint(-4.2F, 5.0F, -0.3F);
        this.BipedRightArm02.addBox(-0.5F, -2.0F, -1.0F, 1, 6, 2, 0.0F);
        this.setRotateAngle(BipedRightArm02, -0.6981317007977318F, 0.2617993877991494F, 0.10000736613927509F);
        this.rWing01 = new ModelRenderer(this, 33, 38);
        this.rWing01.mirror = true;
        this.rWing01.setRotationPoint(-1.9F, 1.0F, 2.4F);
        this.rWing01.addBox(-3.5F, 0.0F, 0.0F, 7, 0, 16, 0.0F);
        this.setRotateAngle(rWing01, -0.7853981633974483F, -0.7853981633974483F, -0.08726646259971647F);
        this.rAntenna00 = new ModelRenderer(this, 46, 0);
        this.rAntenna00.mirror = true;
        this.rAntenna00.setRotationPoint(-0.7F, 2.3F, -2.6F);
        this.rAntenna00.addBox(0.0F, -0.5F, -2.5F, 0, 1, 3, 0.0F);
        this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
        this.rWing02 = new ModelRenderer(this, 29, 11);
        this.rWing02.mirror = true;
        this.rWing02.setRotationPoint(-0.2F, 0.3F, 2.4F);
        this.rWing02.addBox(-3.5F, 0.0F, 0.0F, 8, 0, 19, 0.0F);
        this.setRotateAngle(rWing02, -0.08726646259971647F, 0.4363323129985824F, 0.0F);
        this.rHand01 = new ModelRenderer(this, 9, 37);
        this.rHand01.mirror = true;
        this.rHand01.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.rHand01.addBox(-1.6F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rHand01, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftArm01Lower = new ModelRenderer(this, 39, 28);
        this.leftArm01Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.leftArm01Lower.addBox(-1.0F, -0.2F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(leftArm01Lower, -0.3490658503988659F, 0.0F, 0.22689280275926282F);
        this.thoraxBack = new ModelRenderer(this, 0, 47);
        this.thoraxBack.setRotationPoint(0.0F, 2.3F, 0.5F);
        this.thoraxBack.addBox(-3.0F, -2.5F, 0.0F, 6, 5, 2, 0.0F);
        this.setRotateAngle(thoraxBack, -0.8028514559173915F, 0.0F, 0.0F);
        this.rMandible = new ModelRenderer(this, 0, 11);
        this.rMandible.mirror = true;
        this.rMandible.setRotationPoint(-1.2F, 4.8F, -0.3F);
        this.rMandible.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rMandible, 0.0F, 0.0F, -0.2617993877991494F);
        this.stomach = new ModelRenderer(this, 19, 30);
        this.stomach.setRotationPoint(0.0F, 6.4F, 0.0F);
        this.stomach.addBox(-2.5F, 0.0F, -2.0F, 5, 4, 4, 0.0F);
        this.setRotateAngle(stomach, -0.2617993877991494F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, -1.4F, 2.1F);
        this.head.addBox(-3.0F, -1.0F, -3.0F, 6, 6, 5, 0.0F);
        this.setRotateAngle(head, -1.8151424220741026F, 0.0F, 0.0F);
        this.rightLeg02 = new ModelRenderer(this, 0, 37);
        this.rightLeg02.mirror = true;
        this.rightLeg02.setRotationPoint(0.0F, 5.2F, 0.4F);
        this.rightLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(rightLeg02, -0.8726646259971648F, 0.0F, 0.0F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 17);
        this.BipedLeftLeg.setRotationPoint(2.1F, 4.6F, 0.2F);
        this.BipedLeftLeg.addBox(-1.5F, -1.0F, -2.0F, 3, 7, 2, 0.0F);
        this.setRotateAngle(BipedLeftLeg, -0.7853981633974483F, 0.0F, 0.0F);
        this.leftLeg01 = new ModelRenderer(this, 0, 27);
        this.leftLeg01.setRotationPoint(0.0F, 4.8F, -1.2F);
        this.leftLeg01.addBox(-1.7F, 0.0F, -1.5F, 4, 6, 3, 0.0F);
        this.setRotateAngle(leftLeg01, 0.9599310885968813F, 0.0F, 0.0F);
        this.leftArm02Lower = new ModelRenderer(this, 39, 28);
        this.leftArm02Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.leftArm02Lower.addBox(-1.0F, -0.2F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(leftArm02Lower, -0.5235987755982988F, 0.0F, 0.22689280275926282F);
        this.rFoot = new ModelRenderer(this, 9, 37);
        this.rFoot.mirror = true;
        this.rFoot.setRotationPoint(0.0F, 5.2F, -0.1F);
        this.rFoot.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(rFoot, 0.5235987755982988F, 0.0F, 0.0F);
        this.sting = new ModelRenderer(this, 0, 55);
        this.sting.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.sting.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(sting, -0.2792526803190927F, 0.0F, 0.0F);
        this.leftLeg02 = new ModelRenderer(this, 0, 37);
        this.leftLeg02.setRotationPoint(0.0F, 5.2F, 0.4F);
        this.leftLeg02.addBox(-1.0F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotateAngle(leftLeg02, -0.8726646259971648F, 0.0F, 0.0F);
        this.lAntenna01 = new ModelRenderer(this, 53, 0);
        this.lAntenna01.setRotationPoint(0.0F, 0.0F, -2.3F);
        this.lAntenna01.addBox(0.0F, -0.5F, -0.7F, 0, 5, 1, 0.0F);
        this.setRotateAngle(lAntenna01, 0.0F, 0.0F, -0.3141592653589793F);
        this.righttArm02Lower = new ModelRenderer(this, 39, 28);
        this.righttArm02Lower.mirror = true;
        this.righttArm02Lower.setRotationPoint(0.0F, 3.5F, -0.0F);
        this.righttArm02Lower.addBox(-1.0F, -0.2F, -1.5F, 2, 7, 3, 0.0F);
        this.setRotateAngle(righttArm02Lower, -0.5235987755982988F, 0.0F, -0.22689280275926282F);
        this.lHand02 = new ModelRenderer(this, 9, 37);
        this.lHand02.setRotationPoint(0.0F, 6.1F, -0.2F);
        this.lHand02.addBox(-1.4F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
        this.setRotateAngle(lHand02, 0.5235987755982988F, 0.0F, 0.0F);
        this.leftLeg02.addChild(this.lFoot);
        this.head.addChild(this.lAntenna00);
        this.BipedRightArm01.addChild(this.rightArm01Lower);
        this.leftArm01Lower.addChild(this.lHand01);
        this.thoraxBack.addChild(this.abdomen);
        this.lWing01.addChild(this.lWing02);
        this.righttArm02Lower.addChild(this.rHand02);
        this.BipedBody.addChild(this.BipedLeftArm01);
        this.BipedBody.addChild(this.BipedLeftArm02);
        this.BipedRightLeg.addChild(this.rightLeg01);
        this.abdomen.addChild(this.abdomenBack);
        this.BipedBody.addChild(this.lWing01);
        this.rAntenna00.addChild(this.rAntenna01);
        this.BipedBody.addChild(this.BipedRightArm01);
        this.stomach.addChild(this.BipedRightLeg);
        this.head.addChild(this.lMandible);
        this.BipedBody.addChild(this.BipedRightArm02);
        this.BipedBody.addChild(this.rWing01);
        this.head.addChild(this.rAntenna00);
        this.rWing01.addChild(this.rWing02);
        this.rightArm01Lower.addChild(this.rHand01);
        this.BipedLeftArm01.addChild(this.leftArm01Lower);
        this.stomach.addChild(this.thoraxBack);
        this.head.addChild(this.rMandible);
        this.BipedBody.addChild(this.stomach);
        this.BipedBody.addChild(this.head);
        this.rightLeg01.addChild(this.rightLeg02);
        this.stomach.addChild(this.BipedLeftLeg);
        this.BipedLeftLeg.addChild(this.leftLeg01);
        this.BipedLeftArm02.addChild(this.leftArm02Lower);
        this.rightLeg02.addChild(this.rFoot);
        this.abdomenBack.addChild(this.sting);
        this.leftLeg01.addChild(this.leftLeg02);
        this.lAntenna00.addChild(this.lAntenna01);
        this.BipedRightArm02.addChild(this.righttArm02Lower);
        this.leftArm02Lower.addChild(this.lHand02);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);
        EntityGaiaBee entityGaiaBee = (EntityGaiaBee) entityIn;
        if(entityGaiaBee.isMoving()) {
            this.setRotateAngle(abdomen, -0.13962634015954636F, 0.0F, 0.0F);
            this.setRotateAngle(abdomenBack, -0.2792526803190927F, 0.0F, 0.0F);
            this.setRotateAngle(BipedBody, 1.5707963267948966F, 0.0F, 0.0F);
            this.setRotateAngle(BipedLeftArm01, -0.9599310885968813F, -0.2617993877991494F, -0.10000736613927509F);
            this.setRotateAngle(BipedLeftArm02, -0.6981317007977318F, -0.2617993877991494F, -0.10000736613927509F);
            this.setRotateAngle(BipedLeftLeg, -0.7853981633974483F, 0.0F, -0.22689280275926282F);
            this.setRotateAngle(BipedRightArm01, -0.9599310885968813F, 0.2617993877991494F, 0.10000736613927509F);
            this.setRotateAngle(BipedRightArm02, -0.6981317007977318F, 0.2617993877991494F, 0.10000736613927509F);
            this.setRotateAngle(BipedRightLeg, -0.7853981633974483F, 0.0F, 0.22689280275926282F);
            this.setRotateAngle(head, -2.792526803190927F, 0.0F, 0.0F);
            this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
            this.setRotateAngle(lAntenna01, 0.0F, 0.0F, -0.3141592653589793F);
            this.setRotateAngle(leftArm01Lower, -0.3490658503988659F, 0.0F, 0.22689280275926282F);
            this.setRotateAngle(leftArm02Lower, -0.5235987755982988F, 0.0F, 0.22689280275926282F);
            this.setRotateAngle(leftLeg01, 0.9599310885968813F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg02, -0.8726646259971648F, 0.0F, 0.0F);
            this.setRotateAngle(lFoot, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lHand01, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lHand02, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lMandible, 0.0F, 0.0F, 0.2617993877991494F);
            this.setRotateAngle(lWing01, -0.7853981633974483F, 1.1344640137963142F, 0.08726646259971647F);
            this.setRotateAngle(lWing02, -0.08726646259971647F, -0.4363323129985824F, 0.0F);
            this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
            this.setRotateAngle(rAntenna01, 0.0F, 0.0F, 0.3141592653589793F);
            this.setRotateAngle(rFoot, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rHand01, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rHand02, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm01Lower, -0.3490658503988659F, 0.0F, -0.22689280275926282F);
            this.setRotateAngle(rightLeg02, -0.8726646259971648F, 0.0F, 0.0F);
            this.setRotateAngle(righttArm02Lower, -0.5235987755982988F, 0.0F, -0.22689280275926282F);
            this.setRotateAngle(rMandible, 0.0F, 0.0F, -0.2617993877991494F);
            this.setRotateAngle(rWing01, -0.7853981633974483F, -1.1344640137963142F, -0.08726646259971647F);
            this.setRotateAngle(rWing02, -0.08726646259971647F, 0.4363323129985824F, 0.0F);
            this.setRotateAngle(sting, -0.2792526803190927F, 0.0F, 0.0F);
            this.setRotateAngle(stomach, -0.2617993877991494F, 0.0F, 0.0F);
            this.setRotateAngle(thoraxBack, -1.3962634015954636F, 0.0F, 0.0F);
        } else {
            this.setRotateAngle(abdomen, -0.13962634015954636F, 0.0F, 0.0F);
            this.setRotateAngle(abdomenBack, -0.2792526803190927F, 0.0F, 0.0F);
            this.setRotateAngle(BipedBody, 0.7853981633974483F, 0.0F, 0.0F);
            this.setRotateAngle(BipedLeftArm01, -0.9599310885968813F, -0.2617993877991494F, -0.10000736613927509F);
            this.setRotateAngle(BipedLeftArm02, -0.6981317007977318F, -0.2617993877991494F, -0.10000736613927509F);
            this.setRotateAngle(BipedLeftLeg, -0.7853981633974483F, 0.0F, 0.0F);
            this.setRotateAngle(BipedRightArm01, -0.9599310885968813F, 0.2617993877991494F, 0.10000736613927509F);
            this.setRotateAngle(BipedRightArm02, -0.6981317007977318F, 0.2617993877991494F, 0.10000736613927509F);
            this.setRotateAngle(BipedRightLeg, -0.7853981633974483F, 0.0F, 0.0F);
            this.setRotateAngle(head, -1.8151424220741026F, 0.0F, 0.0F);
            this.setRotateAngle(lAntenna00, 0.17453292519943295F, -0.3490658503988659F, 0.0F);
            this.setRotateAngle(lAntenna01, 0.0F, 0.0F, -0.3141592653589793F);
            this.setRotateAngle(leftArm01Lower, -0.3490658503988659F, 0.0F, 0.22689280275926282F);
            this.setRotateAngle(leftArm02Lower, -0.5235987755982988F, 0.0F, 0.22689280275926282F);
            this.setRotateAngle(leftLeg01, 0.9599310885968813F, 0.0F, 0.0F);
            this.setRotateAngle(leftLeg02, -0.8726646259971648F, 0.0F, 0.0F);
            this.setRotateAngle(lFoot, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lHand01, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lHand02, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(lMandible, 0.0F, 0.0F, 0.2617993877991494F);
            this.setRotateAngle(lWing01, -0.7853981633974483F, 0.7853981633974483F, 0.08726646259971647F);
            this.setRotateAngle(lWing02, -0.08726646259971647F, -0.4363323129985824F, 0.0F);
            this.setRotateAngle(rAntenna00, 0.17453292519943295F, 0.3490658503988659F, 0.0F);
            this.setRotateAngle(rAntenna01, 0.0F, 0.0F, 0.3141592653589793F);
            this.setRotateAngle(rFoot, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rHand01, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rHand02, 0.5235987755982988F, 0.0F, 0.0F);
            this.setRotateAngle(rightArm01Lower, -0.3490658503988659F, 0.0F, -0.22689280275926282F);
            this.setRotateAngle(rightLeg01, 0.9599310885968813F, 0.0F, 0.0F);
            this.setRotateAngle(rightLeg02, -0.8726646259971648F, 0.0F, 0.0F);
            this.setRotateAngle(righttArm02Lower, -0.5235987755982988F, 0.0F, -0.22689280275926282F);
            this.setRotateAngle(rMandible, 0.0F, 0.0F, -0.2617993877991494F);
            this.setRotateAngle(rWing01, -0.7853981633974483F, -0.7853981633974483F, -0.08726646259971647F);
            this.setRotateAngle(rWing02, -0.08726646259971647F, 0.4363323129985824F, 0.0F);
            this.setRotateAngle(sting, -0.2792526803190927F, 0.0F, 0.0F);
            this.setRotateAngle(stomach, -0.2617993877991494F, 0.0F, 0.0F);
            this.setRotateAngle(thoraxBack, -0.8028514559173915F, 0.0F, 0.0F);
        }

        // head
        head.rotateAngleY += netHeadYaw / 57.295776F;
        head.rotateAngleX += headPitch / 57.295776F;

        // arms
        if(itemstack.isEmpty()) {
            if(!entityGaiaBee.isMoving()) {
                BipedRightArm01.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F;
                BipedLeftArm01.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F;
                
                BipedRightLeg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount;
                BipedLeftLeg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount;
            }

            BipedRightArm01.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            BipedLeftArm01.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            BipedRightArm02.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            BipedLeftArm02.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }

        if(itemstack.getItem() == Items.ARROW) {
            animationThrow();
        }

        float swingSpeed = entityGaiaBee.isMoving() ? 1.5F : 0.2F;
        float angleRange = entityGaiaBee.isMoving() ? 1.0F : 0.8F;

        rWing01.rotateAngleX += MathHelper.sin(ageInTicks * swingSpeed) * angleRange * 0.5F;
        lWing01.rotateAngleX += MathHelper.sin(ageInTicks * swingSpeed) * angleRange * 0.5F;

        thoraxBack.rotateAngleX += (float) (Math.cos(Math.toRadians((float) entityIn.ticksExisted * 7F)) * Math.toRadians(2F));
    }

    private void animationThrow() {
        float armsAngleThrow = (float) -Math.toRadians(60);
        float legsAngleThrow = (float) Math.toRadians(20);

        BipedRightArm01.rotateAngleX = armsAngleThrow;
        BipedLeftArm01.rotateAngleX = armsAngleThrow;
        BipedRightLeg.rotateAngleX = legsAngleThrow;
        BipedLeftLeg.rotateAngleX = legsAngleThrow;
    }

    @Override
    public ModelRenderer[] getLeftArm() {
        return null;
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return null;
    }
}
