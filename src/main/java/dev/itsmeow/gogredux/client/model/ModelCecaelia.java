package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.MathHelper;

/**
 * gaia_cecaelia - cybercat555 Created using Tabula 7.1.0
 */
public class ModelCecaelia extends ModelGoGRBase {
    public ModelRenderer BipedBody;
    public ModelRenderer stomach;
    public ModelRenderer BipedLeftArm;
    public ModelRenderer BipedRightArm;
    public ModelRenderer BipedHead;
    public ModelRenderer hips;
    public ModelRenderer hipsLower;
    public ModelRenderer BipedLeftLeg;
    public ModelRenderer BipedRightLeg;
    public ModelRenderer BipedLeftBackLeg;
    public ModelRenderer BipedRightBackLeg;
    public ModelRenderer lfLeg01;
    public ModelRenderer lfLeg02;
    public ModelRenderer lfLeg03;
    public ModelRenderer lfLeg04;
    public ModelRenderer lfLeg05;
    public ModelRenderer rfLeg01;
    public ModelRenderer rfLeg02;
    public ModelRenderer rfLeg03;
    public ModelRenderer rfLeg04;
    public ModelRenderer rfLeg05;
    public ModelRenderer lbLeg01;
    public ModelRenderer lbLeg02;
    public ModelRenderer lbLeg03;
    public ModelRenderer lbLeg04;
    public ModelRenderer lbLeg05;
    public ModelRenderer rbLeg01;
    public ModelRenderer rbLeg02;
    public ModelRenderer rbLeg03;
    public ModelRenderer rbLeg04;
    public ModelRenderer rbLeg05;
    public ModelRenderer lArm01;
    public ModelRenderer lArm02;
    public ModelRenderer lArm03;
    public ModelRenderer lArm04;
    public ModelRenderer rArm01;
    public ModelRenderer rArm02;
    public ModelRenderer rArm03;
    public ModelRenderer rArm04;
    public ModelRenderer headBack;
    public ModelRenderer snout;
    public ModelRenderer lEye;
    public ModelRenderer rEye;
    public ModelRenderer lTentacle00a;
    public ModelRenderer rTentacle00a;
    public ModelRenderer lTentacle01a;
    public ModelRenderer rTentacle01a;
    public ModelRenderer lTentacle00b;
    public ModelRenderer lTentacle00c;
    public ModelRenderer lTentacle00c0;
    public ModelRenderer lTentacle00d;
    public ModelRenderer rTentacle00b;
    public ModelRenderer rTentacle00c;
    public ModelRenderer rTentacle00c0;
    public ModelRenderer rTentacle00d;
    public ModelRenderer lTentacle01b;
    public ModelRenderer lTentacle01c;
    public ModelRenderer lTentacle01c0;
    public ModelRenderer lTentacle01d;
    public ModelRenderer rTentacle01b;
    public ModelRenderer rTentacle01c;
    public ModelRenderer rTentacle01c0;
    public ModelRenderer rTentacle01d;

    public ModelCecaelia() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.rfLeg02 = new ModelRenderer(this, 0, 41);
        this.rfLeg02.mirror = true;
        this.rfLeg02.setRotationPoint(0.0F, 5.6F, 0.3F);
        this.rfLeg02.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(rfLeg02, 0.0F, 0.0F, 1.0471975511965976F);
        this.lArm03 = new ModelRenderer(this, 56, 26);
        this.lArm03.setRotationPoint(0.0F, 3.4F, -0.6F);
        this.lArm03.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lArm03, 0.5235987755982988F, 0.0F, 0.0F);
        this.rTentacle00c = new ModelRenderer(this, 25, 1);
        this.rTentacle00c.mirror = true;
        this.rTentacle00c.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.rTentacle00c.addBox(-0.7F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(rTentacle00c, 0.3490658503988659F, 0.0F, -0.08726646259971647F);
        this.rbLeg02 = new ModelRenderer(this, 0, 41);
        this.rbLeg02.mirror = true;
        this.rbLeg02.setRotationPoint(0.0F, 5.6F, 0.3F);
        this.rbLeg02.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(rbLeg02, 0.0F, 0.0F, 1.0471975511965976F);
        this.BipedBody = new ModelRenderer(this, 21, 17);
        this.BipedBody.setRotationPoint(0.0F, -4.0F, 0.0F);
        this.BipedBody.addBox(-4.0F, 0.0F, -2.5F, 8, 5, 5, 0.0F);
        this.lArm02 = new ModelRenderer(this, 44, 26);
        this.lArm02.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.lArm02.addBox(-1.49F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(lArm02, -0.2617993877991494F, 0.0F, 0.0F);
        this.rTentacle00c0 = new ModelRenderer(this, 25, 1);
        this.rTentacle00c0.mirror = true;
        this.rTentacle00c0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle00c0.addBox(-0.3F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.lbLeg03 = new ModelRenderer(this, 0, 53);
        this.lbLeg03.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.lbLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(lbLeg03, 0.0F, 0.0F, -0.7330382858376184F);
        this.BipedHead = new ModelRenderer(this, 0, 0);
        this.BipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(BipedHead, 0.20943951023931953F, 0.0F, 0.0F);
        this.lArm01 = new ModelRenderer(this, 44, 26);
        this.lArm01.setRotationPoint(0.4F, 3.3F, 0.0F);
        this.lArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(lArm01, -0.3141592653589793F, 0.0F, 0.0F);
        this.lbLeg01 = new ModelRenderer(this, 0, 30);
        this.lbLeg01.setRotationPoint(1.4F, 4.1F, 0.0F);
        this.lbLeg01.addBox(-2.49F, 0.0F, -2.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(lbLeg01, 0.0F, 0.0F, -0.5759586531581287F);
        this.lbLeg02 = new ModelRenderer(this, 0, 41);
        this.lbLeg02.setRotationPoint(0.0F, 5.6F, 0.3F);
        this.lbLeg02.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(lbLeg02, 0.0F, 0.0F, -1.0471975511965976F);
        this.stomach = new ModelRenderer(this, 21, 27);
        this.stomach.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.stomach.addBox(-3.5F, 0.0F, -2.0F, 7, 5, 4, 0.0F);
        this.lTentacle00b = new ModelRenderer(this, 25, 1);
        this.lTentacle00b.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.lTentacle00b.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lTentacle00b, 0.40142572795869574F, 0.0F, -0.08726646259971647F);
        this.rEye = new ModelRenderer(this, 50, 47);
        this.rEye.mirror = true;
        this.rEye.setRotationPoint(-3.5F, -5.5F, -0.5F);
        this.rEye.addBox(-2.0F, -1.5F, -2.0F, 2, 3, 3, 0.0F);
        this.rbLeg05 = new ModelRenderer(this, 12, 58);
        this.rbLeg05.mirror = true;
        this.rbLeg05.setRotationPoint(0.0F, 2.6F, 0.1F);
        this.rbLeg05.addBox(-1.0F, 0.0F, -1.01F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rbLeg05, 0.0F, 0.0F, 0.4363323129985824F);
        this.rbLeg04 = new ModelRenderer(this, 12, 57);
        this.rbLeg04.mirror = true;
        this.rbLeg04.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rbLeg04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rbLeg04, 0.0F, 0.0F, 0.4363323129985824F);
        this.BipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftLeg.setRotationPoint(2.5F, 4.9F, -2.5F);
        this.BipedLeftLeg.addBox(-1.0F, -2.5F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(BipedLeftLeg, 0.0F, 0.7853981633974483F, 0.0F);
        this.lfLeg05 = new ModelRenderer(this, 12, 58);
        this.lfLeg05.setRotationPoint(0.0F, 2.6F, 0.1F);
        this.lfLeg05.addBox(-1.0F, 0.0F, -1.01F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lfLeg05, 0.0F, 0.0F, -0.4363323129985824F);
        this.rTentacle01c0 = new ModelRenderer(this, 25, 1);
        this.rTentacle01c0.mirror = true;
        this.rTentacle01c0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.rTentacle01c0.addBox(-0.3F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.rTentacle00d = new ModelRenderer(this, 25, 1);
        this.rTentacle00d.mirror = true;
        this.rTentacle00d.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.rTentacle00d.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(rTentacle00d, 0.5759586531581287F, 0.0F, 0.3490658503988659F);
        this.lTentacle01c0 = new ModelRenderer(this, 25, 1);
        this.lTentacle01c0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle01c0.addBox(-0.3F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.rfLeg01 = new ModelRenderer(this, 0, 30);
        this.rfLeg01.mirror = true;
        this.rfLeg01.setRotationPoint(1.4F, 4.1F, 0.0F);
        this.rfLeg01.addBox(-2.49F, 0.0F, -2.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(rfLeg01, 0.0F, 0.0F, 0.5759586531581287F);
        this.rfLeg05 = new ModelRenderer(this, 12, 58);
        this.rfLeg05.mirror = true;
        this.rfLeg05.setRotationPoint(0.0F, 2.6F, 0.1F);
        this.rfLeg05.addBox(-1.0F, 0.0F, -1.01F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rfLeg05, 0.0F, 0.0F, 0.4363323129985824F);
        this.rTentacle00a = new ModelRenderer(this, 25, 0);
        this.rTentacle00a.mirror = true;
        this.rTentacle00a.setRotationPoint(-1.1F, -2.2F, -2.5F);
        this.rTentacle00a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rTentacle00a, -0.9424777960769379F, 0.0F, 0.0F);
        this.rTentacle01c = new ModelRenderer(this, 25, 1);
        this.rTentacle01c.mirror = true;
        this.rTentacle01c.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.rTentacle01c.addBox(-0.7F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(rTentacle01c, 0.6981317007977318F, -0.4886921905584123F, 0.0F);
        this.lTentacle00c0 = new ModelRenderer(this, 25, 1);
        this.lTentacle00c0.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.lTentacle00c0.addBox(-0.3F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.BipedRightBackLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightBackLeg.mirror = true;
        this.BipedRightBackLeg.setRotationPoint(-4.0F, 4.9F, 4.0F);
        this.BipedRightBackLeg.addBox(-1.0F, -2.5F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(BipedRightBackLeg, 0.0F, 0.7853981633974483F, 0.0F);
        this.lfLeg01 = new ModelRenderer(this, 0, 30);
        this.lfLeg01.setRotationPoint(1.4F, 4.1F, 0.0F);
        this.lfLeg01.addBox(-2.49F, 0.0F, -2.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(lfLeg01, 0.0F, 0.0F, -0.5759586531581287F);
        this.rbLeg03 = new ModelRenderer(this, 0, 53);
        this.rbLeg03.mirror = true;
        this.rbLeg03.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.rbLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rbLeg03, 0.0F, 0.0F, 0.7330382858376184F);
        this.rfLeg03 = new ModelRenderer(this, 0, 53);
        this.rfLeg03.mirror = true;
        this.rfLeg03.setRotationPoint(0.5F, 7.0F, 0.0F);
        this.rfLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(rfLeg03, 0.0F, 0.0F, 0.7330382858376184F);
        this.snout = new ModelRenderer(this, 45, 36);
        this.snout.setRotationPoint(0.0F, -4.0F, -2.6F);
        this.snout.addBox(-3.0F, -3.4F, -3.0F, 6, 5, 3, 0.0F);
        this.setRotateAngle(snout, 0.3490658503988659F, 0.0F, 0.0F);
        this.lTentacle00a = new ModelRenderer(this, 25, 0);
        this.lTentacle00a.setRotationPoint(1.1F, -2.2F, -2.5F);
        this.lTentacle00a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lTentacle00a, -0.9424777960769379F, 0.0F, 0.0F);
        this.lTentacle00c = new ModelRenderer(this, 25, 1);
        this.lTentacle00c.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.lTentacle00c.addBox(-0.7F, 0.0F, -1.0F, 1, 3, 2, 0.0F);
        this.setRotateAngle(lTentacle00c, 0.3490658503988659F, 0.0F, 0.08726646259971647F);
        this.lTentacle01b = new ModelRenderer(this, 25, 0);
        this.lTentacle01b.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.lTentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(lTentacle01b, 0.5759586531581287F, 0.17453292519943295F, 0.0F);
        this.lfLeg02 = new ModelRenderer(this, 0, 41);
        this.lfLeg02.setRotationPoint(0.0F, 5.6F, 0.3F);
        this.lfLeg02.addBox(-2.0F, 0.0F, -2.0F, 4, 8, 4, 0.0F);
        this.setRotateAngle(lfLeg02, 0.0F, 0.0F, -1.0471975511965976F);
        this.rArm02 = new ModelRenderer(this, 44, 26);
        this.rArm02.mirror = true;
        this.rArm02.setRotationPoint(0.0F, 3.2F, 0.0F);
        this.rArm02.addBox(-1.51F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(rArm02, -0.2617993877991494F, 0.0F, 0.0F);
        this.lTentacle01a = new ModelRenderer(this, 25, 0);
        this.lTentacle01a.setRotationPoint(2.2F, -0.5F, -2.0F);
        this.lTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lTentacle01a, -0.7853981633974483F, 0.0F, -0.41887902047863906F);
        this.rbLeg01 = new ModelRenderer(this, 0, 30);
        this.rbLeg01.mirror = true;
        this.rbLeg01.setRotationPoint(1.4F, 4.1F, 0.0F);
        this.rbLeg01.addBox(-2.49F, 0.0F, -2.0F, 5, 7, 4, 0.0F);
        this.setRotateAngle(rbLeg01, 0.0F, 0.0F, 0.5759586531581287F);
        this.rArm01 = new ModelRenderer(this, 44, 26);
        this.rArm01.mirror = true;
        this.rArm01.setRotationPoint(-0.4F, 3.3F, 0.0F);
        this.rArm01.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(rArm01, -0.3141592653589793F, 0.0F, 0.0F);
        this.rArm03 = new ModelRenderer(this, 56, 26);
        this.rArm03.mirror = true;
        this.rArm03.setRotationPoint(0.0F, 3.4F, -0.6F);
        this.rArm03.addBox(-1.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rArm03, 0.5235987755982988F, 0.0F, 0.0F);
        this.rTentacle01a = new ModelRenderer(this, 25, 0);
        this.rTentacle01a.mirror = true;
        this.rTentacle01a.setRotationPoint(-2.2F, -0.5F, -2.0F);
        this.rTentacle01a.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rTentacle01a, -0.7853981633974483F, 0.0F, 0.41887902047863906F);
        this.headBack = new ModelRenderer(this, 34, 0);
        this.headBack.setRotationPoint(0.0F, -4.2F, 2.6F);
        this.headBack.addBox(-3.5F, -4.0F, 0.0F, 7, 8, 5, 0.0F);
        this.setRotateAngle(headBack, -0.3490658503988659F, 0.0F, 0.0F);
        this.rArm04 = new ModelRenderer(this, 56, 27);
        this.rArm04.mirror = true;
        this.rArm04.setRotationPoint(0.0F, 3.1F, -0.4F);
        this.rArm04.addBox(-1.01F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(rArm04, 0.9599310885968813F, 0.0F, 0.0F);
        this.rTentacle01b = new ModelRenderer(this, 25, 0);
        this.rTentacle01b.mirror = true;
        this.rTentacle01b.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rTentacle01b.addBox(-1.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
        this.setRotateAngle(rTentacle01b, 0.5759586531581287F, -0.17453292519943295F, 0.0F);
        this.rTentacle01d = new ModelRenderer(this, 25, 1);
        this.rTentacle01d.mirror = true;
        this.rTentacle01d.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.rTentacle01d.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(rTentacle01d, 0.6981317007977318F, 0.0F, 0.0F);
        this.hipsLower = new ModelRenderer(this, 21, 49);
        this.hipsLower.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.hipsLower.addBox(-4.5F, 0.0F, -4.5F, 9, 5, 9, 0.0F);
        this.lTentacle01d = new ModelRenderer(this, 25, 1);
        this.lTentacle01d.setRotationPoint(0.0F, 1.7F, 0.0F);
        this.lTentacle01d.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
        this.setRotateAngle(lTentacle01d, 0.7330382858376184F, 0.0F, 0.0F);
        this.lTentacle01c = new ModelRenderer(this, 25, 1);
        this.lTentacle01c.setRotationPoint(0.0F, 1.5F, 0.0F);
        this.lTentacle01c.addBox(-0.7F, 0.0F, -1.0F, 1, 2, 2, 0.0F);
        this.setRotateAngle(lTentacle01c, 0.6981317007977318F, 0.4886921905584123F, 0.0F);
        this.BipedLeftBackLeg = new ModelRenderer(this, 0, 16);
        this.BipedLeftBackLeg.setRotationPoint(2.5F, 4.9F, 2.5F);
        this.BipedLeftBackLeg.addBox(-1.0F, -2.5F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(BipedLeftBackLeg, 0.0F, -0.7853981633974483F, 0.0F);
        this.BipedRightArm = new ModelRenderer(this, 47, 16);
        this.BipedRightArm.mirror = true;
        this.BipedRightArm.setRotationPoint(-5.0F, 2.5F, 0.0F);
        this.BipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BipedRightArm, 0.2617993877991494F, 0.0F, 0.10000736613927509F);
        this.BipedLeftArm = new ModelRenderer(this, 47, 16);
        this.BipedLeftArm.setRotationPoint(5.0F, 2.5F, 0.0F);
        this.BipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 6, 4, 0.0F);
        this.setRotateAngle(BipedLeftArm, 0.2617993877991494F, 0.0F, -0.10000736613927509F);
        this.lfLeg03 = new ModelRenderer(this, 0, 53);
        this.lfLeg03.setRotationPoint(-0.5F, 7.0F, 0.0F);
        this.lfLeg03.addBox(-1.5F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.setRotateAngle(lfLeg03, 0.0F, 0.0F, -0.7330382858376184F);
        this.BipedRightLeg = new ModelRenderer(this, 0, 16);
        this.BipedRightLeg.mirror = true;
        this.BipedRightLeg.setRotationPoint(-4.0F, 4.9F, -4.0F);
        this.BipedRightLeg.addBox(-1.0F, -2.5F, -2.5F, 5, 8, 5, 0.0F);
        this.setRotateAngle(BipedRightLeg, 0.0F, -0.7853981633974483F, 0.0F);
        this.rfLeg04 = new ModelRenderer(this, 12, 57);
        this.rfLeg04.mirror = true;
        this.rfLeg04.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.rfLeg04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rfLeg04, 0.0F, 0.0F, 0.4363323129985824F);
        this.lbLeg04 = new ModelRenderer(this, 12, 57);
        this.lbLeg04.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.lbLeg04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lbLeg04, 0.0F, 0.0F, -0.4363323129985824F);
        this.lArm04 = new ModelRenderer(this, 56, 27);
        this.lArm04.setRotationPoint(0.0F, 3.1F, -0.4F);
        this.lArm04.addBox(-0.99F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(lArm04, 0.9599310885968813F, 0.0F, 0.0F);
        this.hips = new ModelRenderer(this, 20, 38);
        this.hips.setRotationPoint(0.0F, 5.0F, 0.0F);
        this.hips.addBox(-4.0F, 0.0F, -3.5F, 8, 3, 7, 0.0F);
        this.rTentacle00b = new ModelRenderer(this, 25, 1);
        this.rTentacle00b.mirror = true;
        this.rTentacle00b.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.rTentacle00b.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(rTentacle00b, 0.40142572795869574F, 0.0F, 0.08726646259971647F);
        this.lTentacle00d = new ModelRenderer(this, 25, 1);
        this.lTentacle00d.setRotationPoint(0.0F, 2.8F, 0.0F);
        this.lTentacle00d.addBox(-0.5F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
        this.setRotateAngle(lTentacle00d, 0.5759586531581287F, 0.0F, -0.3490658503988659F);
        this.lfLeg04 = new ModelRenderer(this, 12, 57);
        this.lfLeg04.setRotationPoint(0.0F, 4.5F, 0.0F);
        this.lfLeg04.addBox(-1.0F, 0.0F, -1.0F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lfLeg04, 0.0F, 0.0F, -0.4363323129985824F);
        this.lEye = new ModelRenderer(this, 50, 47);
        this.lEye.setRotationPoint(3.5F, -5.5F, -0.5F);
        this.lEye.addBox(0.0F, -1.5F, -2.0F, 2, 3, 3, 0.0F);
        this.lbLeg05 = new ModelRenderer(this, 12, 58);
        this.lbLeg05.setRotationPoint(0.0F, 2.6F, 0.1F);
        this.lbLeg05.addBox(-1.0F, 0.0F, -1.01F, 2, 3, 2, 0.0F);
        this.setRotateAngle(lbLeg05, 0.0F, 0.0F, -0.4363323129985824F);
        this.rfLeg01.addChild(this.rfLeg02);
        this.lArm02.addChild(this.lArm03);
        this.rTentacle00b.addChild(this.rTentacle00c);
        this.rbLeg01.addChild(this.rbLeg02);
        this.lArm01.addChild(this.lArm02);
        this.rTentacle00c.addChild(this.rTentacle00c0);
        this.lbLeg02.addChild(this.lbLeg03);
        this.BipedBody.addChild(this.BipedHead);
        this.BipedLeftArm.addChild(this.lArm01);
        this.BipedLeftBackLeg.addChild(this.lbLeg01);
        this.lbLeg01.addChild(this.lbLeg02);
        this.BipedBody.addChild(this.stomach);
        this.lTentacle00a.addChild(this.lTentacle00b);
        this.BipedHead.addChild(this.rEye);
        this.rbLeg04.addChild(this.rbLeg05);
        this.rbLeg03.addChild(this.rbLeg04);
        this.hipsLower.addChild(this.BipedLeftLeg);
        this.lfLeg04.addChild(this.lfLeg05);
        this.rTentacle01c.addChild(this.rTentacle01c0);
        this.rTentacle00c.addChild(this.rTentacle00d);
        this.lTentacle01c.addChild(this.lTentacle01c0);
        this.BipedRightLeg.addChild(this.rfLeg01);
        this.rfLeg04.addChild(this.rfLeg05);
        this.snout.addChild(this.rTentacle00a);
        this.rTentacle01b.addChild(this.rTentacle01c);
        this.lTentacle00c.addChild(this.lTentacle00c0);
        this.hipsLower.addChild(this.BipedRightBackLeg);
        this.BipedLeftLeg.addChild(this.lfLeg01);
        this.rbLeg02.addChild(this.rbLeg03);
        this.rfLeg02.addChild(this.rfLeg03);
        this.BipedHead.addChild(this.snout);
        this.snout.addChild(this.lTentacle00a);
        this.lTentacle00b.addChild(this.lTentacle00c);
        this.lTentacle01a.addChild(this.lTentacle01b);
        this.lfLeg01.addChild(this.lfLeg02);
        this.rArm01.addChild(this.rArm02);
        this.snout.addChild(this.lTentacle01a);
        this.BipedRightBackLeg.addChild(this.rbLeg01);
        this.BipedRightArm.addChild(this.rArm01);
        this.rArm02.addChild(this.rArm03);
        this.snout.addChild(this.rTentacle01a);
        this.BipedHead.addChild(this.headBack);
        this.rArm03.addChild(this.rArm04);
        this.rTentacle01a.addChild(this.rTentacle01b);
        this.rTentacle01c.addChild(this.rTentacle01d);
        this.hips.addChild(this.hipsLower);
        this.lTentacle01c.addChild(this.lTentacle01d);
        this.lTentacle01b.addChild(this.lTentacle01c);
        this.hipsLower.addChild(this.BipedLeftBackLeg);
        this.BipedBody.addChild(this.BipedRightArm);
        this.BipedBody.addChild(this.BipedLeftArm);
        this.lfLeg02.addChild(this.lfLeg03);
        this.hipsLower.addChild(this.BipedRightLeg);
        this.rfLeg03.addChild(this.rfLeg04);
        this.lbLeg03.addChild(this.lbLeg04);
        this.lArm03.addChild(this.lArm04);
        this.stomach.addChild(this.hips);
        this.rTentacle00a.addChild(this.rTentacle00b);
        this.lTentacle00c.addChild(this.lTentacle00d);
        this.lfLeg03.addChild(this.lfLeg04);
        this.BipedHead.addChild(this.lEye);
        this.lbLeg04.addChild(this.lbLeg05);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.BipedBody.render(f5);
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        ItemStack itemstack = ((EntityLivingBase) entityIn).getItemStackFromSlot(EntityEquipmentSlot.HEAD);

        // head
        BipedHead.rotateAngleY = netHeadYaw / 57.295776F;
        BipedHead.rotateAngleX = headPitch / 57.295776F;

        // arms
        if(itemstack.isEmpty()) {
            BipedRightArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float) Math.PI) * 0.8F * limbSwingAmount * 0.5F + 0.2617993877991494F;
            BipedLeftArm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 0.8F * limbSwingAmount * 0.5F + 0.2617993877991494F;

            if(swingProgress > -9990.0F) {
                holdingMelee();
            }
            BipedRightArm.rotateAngleZ = (MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) + 0.10000736613927509F;
            BipedRightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
            BipedLeftArm.rotateAngleZ = -(MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F) - 0.10000736613927509F;
            BipedLeftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        }

        if(itemstack.getItem() == Items.ARROW) {
            animationThrow();
        }

        float angle = MathHelper.sin(limbSwing * 0.66F) * limbSwingAmount;

        this.BipedLeftBackLeg.rotateAngleY = -angle - 0.7853981633974483F;
        this.BipedRightBackLeg.rotateAngleY = angle + 0.7853981633974483F;
        this.BipedLeftLeg.rotateAngleY = angle + 0.7853981633974483F;
        this.BipedRightLeg.rotateAngleY = -angle - 0.7853981633974483F;

        float mul = 0.1F;
        float div = 20F;
        float add = entityIn.getUniqueID().hashCode() * 0.001F;
        lTentacle01a.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.05F) + add) / div - 0.7853981633974483F;
        lTentacle00a.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div + 0.7853981633974483F;
        rTentacle01a.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div - 0.7853981633974483F;
        rTentacle00a.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.03F) + add) / div + 0.7853981633974483F;

        mul = 0.05F;
        div = 20F;

        lTentacle01a.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div - 0.41887902047863906F;
        lTentacle00a.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div;
        rTentacle01a.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div + 0.41887902047863906F;
        rTentacle00a.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div;

        mul = 0.15F;
        div = 40F;

        lfLeg02.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.05F) + add) / div;
        rfLeg02.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div;
        lbLeg02.rotateAngleX = (float) Math.cos(ageInTicks * mul + add) / div;
        rbLeg02.rotateAngleX = (float) Math.cos(ageInTicks * (mul + 0.03F) + add) / div;

        mul = 0.05F;
        div = 40F;

        lfLeg02.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div - 1.0471975511965976F;
        rfLeg02.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div + 1.0471975511965976F;
        lbLeg02.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div - 1.0471975511965976F;
        rbLeg02.rotateAngleZ = (float) Math.sin(ageInTicks * (mul + 0.05F) + add) / div + 1.0471975511965976F;
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

    private void animationThrow() {
        BipedRightArm.rotateAngleX = -1.0472F;
        BipedLeftArm.rotateAngleX = -1.0472F;
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
        return new ModelRenderer[] { BipedBody, BipedLeftArm, lArm01 };
    }

    @Override
    public ModelRenderer[] getRightArm() {
        return new ModelRenderer[] { BipedBody, BipedRightArm, rArm01 };
    }
}
