package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * gaia_ninetails - cybecat5555
 * Created using Tabula 7.0.1
 */
public class ModelNineTails extends ModelBase {
    public ModelRenderer chest;
    public ModelRenderer torso;
    public ModelRenderer neck;
    public ModelRenderer lForeleg01;
    public ModelRenderer rForeleg01;
    public ModelRenderer hips;
    public ModelRenderer lHindLeg01;
    public ModelRenderer rHindLeg01;
    public ModelRenderer tailM01a;
    public ModelRenderer tailL01a;
    public ModelRenderer tailR01a;
    public ModelRenderer tailL02a;
    public ModelRenderer tailR02a;
    public ModelRenderer tailL03a;
    public ModelRenderer tailR03a;
    public ModelRenderer tailM02a;
    public ModelRenderer tailM03a;
    public ModelRenderer skirt;
    public ModelRenderer lHindLeg02;
    public ModelRenderer lHindLeg03;
    public ModelRenderer lHindPaw;
    public ModelRenderer rHindLeg02;
    public ModelRenderer rHindLeg03;
    public ModelRenderer rHindPaw;
    public ModelRenderer tailM01b;
    public ModelRenderer tailM01c;
    public ModelRenderer tailM01d;
    public ModelRenderer tailL01b;
    public ModelRenderer tailL01c;
    public ModelRenderer tailL01d;
    public ModelRenderer tailR01b;
    public ModelRenderer tailR01c;
    public ModelRenderer tailR01d;
    public ModelRenderer tailL02b;
    public ModelRenderer tailL02c;
    public ModelRenderer tailL02d;
    public ModelRenderer tailR02b;
    public ModelRenderer tailR02c;
    public ModelRenderer tailR02d;
    public ModelRenderer tailL03b;
    public ModelRenderer tailL03c;
    public ModelRenderer tailL03d;
    public ModelRenderer tailR03b;
    public ModelRenderer tailR03c;
    public ModelRenderer tailR03d;
    public ModelRenderer tailM02b;
    public ModelRenderer tailM02c;
    public ModelRenderer tailM02d;
    public ModelRenderer tailM03b;
    public ModelRenderer tailM03c;
    public ModelRenderer tailM03d;
    public ModelRenderer head;
    public ModelRenderer mane01;
    public ModelRenderer mane02;
    public ModelRenderer mane03;
    public ModelRenderer jawUpper01;
    public ModelRenderer jawLower;
    public ModelRenderer snout;
    public ModelRenderer lEar01;
    public ModelRenderer rEar01;
    public ModelRenderer jawUpper02;
    public ModelRenderer lEar02;
    public ModelRenderer rEar02;
    public ModelRenderer lForeleg02;
    public ModelRenderer lForePaw;
    public ModelRenderer rForeleg02;
    public ModelRenderer rForePaw;

    public ModelNineTails() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.tailR02d = new ModelRenderer(this, 17, 54);
        this.tailR02d.mirror = true;
        this.tailR02d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailR02d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailR02d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailR03c = new ModelRenderer(this, 25, 56);
        this.tailR03c.mirror = true;
        this.tailR03c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailR03c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR03c, 0.13962634015954636F, 0.0F, 0.0F);
        this.rForeleg02 = new ModelRenderer(this, 33, 27);
        this.rForeleg02.mirror = true;
        this.rForeleg02.setRotationPoint(-1.5F, 6.7F, -1.3F);
        this.rForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(rForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
        this.tailL02d = new ModelRenderer(this, 17, 54);
        this.tailL02d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailL02d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailL02d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailR03a = new ModelRenderer(this, 25, 49);
        this.tailR03a.mirror = true;
        this.tailR03a.setRotationPoint(0.7F, -1.8F, 4.5F);
        this.tailR03a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR03a, 0.8726646259971648F, 1.0471975511965976F, 0.0F);
        this.tailM02d = new ModelRenderer(this, 17, 54);
        this.tailM02d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailM02d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailM02d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailM03b = new ModelRenderer(this, 0, 50);
        this.tailM03b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailM03b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailM03b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailL01b = new ModelRenderer(this, 0, 50);
        this.tailL01b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailL01b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailL01b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailL03d = new ModelRenderer(this, 17, 54);
        this.tailL03d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailL03d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailL03d, 0.06981317007977318F, 0.0F, 0.0F);
        this.rHindPaw = new ModelRenderer(this, 25, 41);
        this.rHindPaw.mirror = true;
        this.rHindPaw.setRotationPoint(0.0F, 6.4F, -1.3F);
        this.rHindPaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
        this.lForeleg01 = new ModelRenderer(this, 31, 14);
        this.lForeleg01.setRotationPoint(1.7F, -0.2F, -1.2F);
        this.lForeleg01.addBox(0.0F, -1.1F, -3.4F, 3, 8, 4, 0.0F);
        this.setRotateAngle(lForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
        this.jawUpper01 = new ModelRenderer(this, 21, 22);
        this.jawUpper01.setRotationPoint(1.2F, -4.8F, -1.1F);
        this.jawUpper01.addBox(-1.4F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(jawUpper01, 0.0F, 0.0F, -0.13962634015954636F);
        this.skirt = new ModelRenderer(this, 27, 0);
        this.skirt.setRotationPoint(0.0F, -1.8F, 2.2F);
        this.skirt.addBox(-4.5F, -2.0F, 0.0F, 9, 4, 9, 0.0F);
        this.setRotateAngle(skirt, -0.13962634015954636F, 0.0F, 0.0F);
        this.chest = new ModelRenderer(this, 0, 5);
        this.chest.setRotationPoint(0.0F, 7.8F, -3.5F);
        this.chest.addBox(-3.5F, -4.0F, -5.0F, 7, 8, 8, 0.0F);
        this.setRotateAngle(chest, -0.06981317007977318F, 0.0F, 0.0F);
        this.tailL03a = new ModelRenderer(this, 25, 49);
        this.tailL03a.setRotationPoint(-0.7F, -1.8F, 4.5F);
        this.tailL03a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL03a, 0.8726646259971648F, -1.0471975511965976F, 0.0F);
        this.mane02 = new ModelRenderer(this, 54, 0);
        this.mane02.setRotationPoint(0.0F, 3.1F, -2.3F);
        this.mane02.addBox(-2.0F, 0.0F, -0.5F, 4, 5, 1, 0.0F);
        this.setRotateAngle(mane02, 0.6283185307179586F, 0.0F, 0.0F);
        this.tailL02c = new ModelRenderer(this, 25, 56);
        this.tailL02c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailL02c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL02c, 0.13962634015954636F, 0.0F, 0.0F);
        this.tailR02b = new ModelRenderer(this, 0, 50);
        this.tailR02b.mirror = true;
        this.tailR02b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailR02b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailR02b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailM01d = new ModelRenderer(this, 17, 54);
        this.tailM01d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailM01d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailM01d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailM03d = new ModelRenderer(this, 17, 54);
        this.tailM03d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailM03d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailM03d, 0.06981317007977318F, 0.0F, 0.0F);
        this.mane01 = new ModelRenderer(this, 11, 0);
        this.mane01.setRotationPoint(0.0F, 3.1F, -3.3F);
        this.mane01.addBox(-2.0F, 0.0F, -0.5F, 4, 4, 1, 0.0F);
        this.setRotateAngle(mane01, 0.5235987755982988F, 0.0F, 0.0F);
        this.lForeleg02 = new ModelRenderer(this, 33, 27);
        this.lForeleg02.setRotationPoint(1.5F, 6.7F, -1.4F);
        this.lForeleg02.addBox(-1.0F, 0.0F, -1.5F, 2, 8, 3, 0.0F);
        this.setRotateAngle(lForeleg02, -0.10471975511965977F, 0.0F, 0.0F);
        this.rHindLeg02 = new ModelRenderer(this, 45, 29);
        this.rHindLeg02.mirror = true;
        this.rHindLeg02.setRotationPoint(-1.9F, 6.6F, -2.1F);
        this.rHindLeg02.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(rHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
        this.tailR01d = new ModelRenderer(this, 17, 54);
        this.tailR01d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailR01d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailR01d, 0.06981317007977318F, 0.0F, 0.0F);
        this.rForeleg01 = new ModelRenderer(this, 31, 14);
        this.rForeleg01.mirror = true;
        this.rForeleg01.setRotationPoint(-1.7F, -0.2F, -1.2F);
        this.rForeleg01.addBox(-3.0F, -1.1F, -3.4F, 3, 8, 4, 0.0F);
        this.setRotateAngle(rForeleg01, 0.13962634015954636F, 0.0F, 0.0F);
        this.tailR02a = new ModelRenderer(this, 25, 49);
        this.tailR02a.mirror = true;
        this.tailR02a.setRotationPoint(0.7F, -1.9F, 4.5F);
        this.tailR02a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR02a, 0.9599310885968813F, 0.6981317007977318F, 0.0F);
        this.tailR01c = new ModelRenderer(this, 25, 56);
        this.tailR01c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailR01c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR01c, 0.13962634015954636F, 0.0F, 0.0F);
        this.snout = new ModelRenderer(this, 0, 22);
        this.snout.setRotationPoint(0.0F, -4.3F, 0.1F);
        this.snout.addBox(-1.0F, -4.45F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(snout, 0.17453292519943295F, 0.0F, 0.0F);
        this.tailL01a = new ModelRenderer(this, 25, 49);
        this.tailL01a.setRotationPoint(-0.5F, -2.0F, 4.5F);
        this.tailL01a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL01a, 1.0471975511965976F, -0.3490658503988659F, 0.0F);
        this.tailR01b = new ModelRenderer(this, 0, 50);
        this.tailR01b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailR01b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailR01b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailM02a = new ModelRenderer(this, 25, 49);
        this.tailM02a.setRotationPoint(-1.3F, -0.2F, 4.5F);
        this.tailM02a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM02a, 0.8726646259971648F, -0.20943951023931953F, 0.0F);
        this.neck = new ModelRenderer(this, 41, 40);
        this.neck.setRotationPoint(0.0F, -1.7F, -3.3F);
        this.neck.addBox(-2.5F, -2.5F, -5.0F, 5, 6, 5, 0.0F);
        this.setRotateAngle(neck, -0.5235987755982988F, 0.0F, 0.0F);
        this.lHindLeg02 = new ModelRenderer(this, 45, 29);
        this.lHindLeg02.setRotationPoint(1.9F, 6.6F, -2.1F);
        this.lHindLeg02.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 6, 0.0F);
        this.setRotateAngle(lHindLeg02, -0.2617993877991494F, 0.0F, 0.0F);
        this.jawUpper02 = new ModelRenderer(this, 21, 22);
        this.jawUpper02.mirror = true;
        this.jawUpper02.setRotationPoint(0.0F, 0.35F, 0.0F);
        this.jawUpper02.addBox(-3.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F);
        this.setRotateAngle(jawUpper02, 0.0F, 0.0F, 0.2792526803190927F);
        this.lEar01 = new ModelRenderer(this, 24, 35);
        this.lEar01.setRotationPoint(1.3F, -2.5F, 2.3F);
        this.lEar01.addBox(-1.0F, -0.5F, -0.4F, 3, 1, 3, 0.0F);
        this.setRotateAngle(lEar01, 0.0F, 0.22689280275926282F, 0.40142572795869574F);
        this.tailR02c = new ModelRenderer(this, 25, 56);
        this.tailR02c.mirror = true;
        this.tailR02c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailR02c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR02c, 0.13962634015954636F, 0.0F, 0.0F);
        this.tailM01c = new ModelRenderer(this, 25, 56);
        this.tailM01c.setRotationPoint(0.0F, 9.4F, 0.1F);
        this.tailM01c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM01c, 0.13962634015954636F, 0.0F, 0.0F);
        this.tailL02a = new ModelRenderer(this, 25, 49);
        this.tailL02a.setRotationPoint(-0.7F, -1.9F, 4.5F);
        this.tailL02a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL02a, 0.9599310885968813F, -0.6981317007977318F, 0.0F);
        this.lHindLeg03 = new ModelRenderer(this, 0, 0);
        this.lHindLeg03.setRotationPoint(0.1F, -0.4F, 5.4F);
        this.lHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 7, 2, 0.0F);
        this.setRotateAngle(lHindLeg03, 0.5235987755982988F, 0.0F, 0.05235987755982988F);
        this.rForePaw = new ModelRenderer(this, 25, 41);
        this.rForePaw.mirror = true;
        this.rForePaw.setRotationPoint(0.0F, 7.8F, -0.1F);
        this.rForePaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(rForePaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.tailL02b = new ModelRenderer(this, 0, 50);
        this.tailL02b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailL02b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailL02b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailR03d = new ModelRenderer(this, 17, 54);
        this.tailR03d.mirror = true;
        this.tailR03d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailR03d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailR03d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailM03c = new ModelRenderer(this, 25, 56);
        this.tailM03c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailM03c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM03c, 0.3141592653589793F, 0.0F, 0.0F);
        this.tailL01d = new ModelRenderer(this, 17, 54);
        this.tailL01d.setRotationPoint(0.0F, 0.0F, 0.4F);
        this.tailL01d.addBox(-1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotateAngle(tailL01d, 0.06981317007977318F, 0.0F, 0.0F);
        this.tailM02b = new ModelRenderer(this, 0, 50);
        this.tailM02b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailM02b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailM02b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailM02c = new ModelRenderer(this, 25, 56);
        this.tailM02c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailM02c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM02c, 0.22689280275926282F, 0.0F, 0.0F);
        this.hips = new ModelRenderer(this, 0, 38);
        this.hips.setRotationPoint(0.0F, -1.2F, 5.7F);
        this.hips.addBox(-3.5F, -3.0F, 0.4F, 7, 7, 5, 0.0F);
        this.tailR01a = new ModelRenderer(this, 25, 49);
        this.tailR01a.mirror = true;
        this.tailR01a.setRotationPoint(0.5F, -2.0F, 4.5F);
        this.tailR01a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailR01a, 1.0471975511965976F, 0.3490658503988659F, 0.0F);
        this.tailL03b = new ModelRenderer(this, 0, 50);
        this.tailL03b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailL03b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailL03b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailM03a = new ModelRenderer(this, 25, 49);
        this.tailM03a.setRotationPoint(0.0F, -0.2F, 4.5F);
        this.tailM03a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM03a, 0.8726646259971648F, 0.20943951023931953F, 0.0F);
        this.rHindLeg01 = new ModelRenderer(this, 46, 13);
        this.rHindLeg01.mirror = true;
        this.rHindLeg01.setRotationPoint(-1.0F, 0.6F, 3.1F);
        this.rHindLeg01.addBox(-4.0F, -2.0F, -3.0F, 4, 10, 5, 0.0F);
        this.setRotateAngle(rHindLeg01, -0.3839724354387525F, 0.0F, 0.05235987755982988F);
        this.tailM01a = new ModelRenderer(this, 25, 49);
        this.tailM01a.setRotationPoint(0.0F, -2.0F, 4.5F);
        this.tailM01a.addBox(-1.5F, 0.0F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailM01a, 1.1344640137963142F, 0.0F, 0.0F);
        this.head = new ModelRenderer(this, 39, 52);
        this.head.setRotationPoint(0.0F, -0.5F, -3.6F);
        this.head.addBox(-3.0F, -5.0F, -3.0F, 6, 5, 6, 0.0F);
        this.setRotateAngle(head, 2.1816615649929116F, 0.0F, 0.0F);
        this.lEar02 = new ModelRenderer(this, 36, 39);
        this.lEar02.setRotationPoint(0.5F, 0.4F, 0.6F);
        this.lEar02.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(lEar02, 0.17453292519943295F, 0.0F, 0.0F);
        this.jawLower = new ModelRenderer(this, 44, 28);
        this.jawLower.setRotationPoint(0.0F, -4.1F, -2.3F);
        this.jawLower.addBox(-1.0F, -4.5F, -0.5F, 2, 4, 1, 0.0F);
        this.rEar02 = new ModelRenderer(this, 36, 39);
        this.rEar02.mirror = true;
        this.rEar02.setRotationPoint(0.5F, 0.4F, 0.6F);
        this.rEar02.addBox(-1.0F, -0.5F, 0.0F, 2, 1, 3, 0.0F);
        this.setRotateAngle(rEar02, 0.17453292519943295F, 0.0F, 0.0F);
        this.tailL03c = new ModelRenderer(this, 25, 56);
        this.tailL03c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailL03c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL03c, 0.13962634015954636F, 0.0F, 0.0F);
        this.tailL01c = new ModelRenderer(this, 25, 56);
        this.tailL01c.setRotationPoint(0.0F, 8.4F, 0.1F);
        this.tailL01c.addBox(-1.5F, 0.2F, -1.5F, 3, 4, 3, 0.0F);
        this.setRotateAngle(tailL01c, 0.13962634015954636F, 0.0F, 0.0F);
        this.lHindPaw = new ModelRenderer(this, 25, 41);
        this.lHindPaw.setRotationPoint(0.0F, 6.4F, -1.2F);
        this.lHindPaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(lHindPaw, 0.12217304763960307F, 0.0F, 0.0F);
        this.tailR03b = new ModelRenderer(this, 0, 50);
        this.tailR03b.mirror = true;
        this.tailR03b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailR03b.addBox(-2.0F, 0.0F, -2.0F, 4, 9, 4, 0.0F);
        this.setRotateAngle(tailR03b, -0.3141592653589793F, 0.0F, 0.0F);
        this.lHindLeg01 = new ModelRenderer(this, 46, 13);
        this.lHindLeg01.setRotationPoint(1.0F, 0.5F, 3.1F);
        this.lHindLeg01.addBox(0.0F, -2.0F, -3.0F, 4, 10, 5, 0.0F);
        this.setRotateAngle(lHindLeg01, -0.3839724354387525F, 0.0F, -0.05235987755982988F);
        this.lForePaw = new ModelRenderer(this, 25, 41);
        this.lForePaw.setRotationPoint(0.0F, 7.8F, -0.1F);
        this.lForePaw.addBox(-1.5F, 0.0F, -2.4F, 3, 2, 4, 0.0F);
        this.setRotateAngle(lForePaw, 0.03490658503988659F, 0.0F, 0.0F);
        this.torso = new ModelRenderer(this, 1, 23);
        this.torso.setRotationPoint(0.0F, 0.4F, 2.2F);
        this.torso.addBox(-3.0F, -4.0F, 0.0F, 6, 7, 7, 0.0F);
        this.setRotateAngle(torso, 0.06981317007977318F, 0.0F, 0.0F);
        this.mane03 = new ModelRenderer(this, 23, 0);
        this.mane03.setRotationPoint(0.0F, 3.1F, -1.0F);
        this.mane03.addBox(-2.51F, 0.0F, -0.5F, 5, 6, 1, 0.0F);
        this.setRotateAngle(mane03, 0.6632251157578453F, 0.0F, 0.0F);
        this.rEar01 = new ModelRenderer(this, 24, 35);
        this.rEar01.mirror = true;
        this.rEar01.setRotationPoint(-2.3F, -2.5F, 2.3F);
        this.rEar01.addBox(-1.0F, -0.5F, -0.4F, 3, 1, 3, 0.0F);
        this.setRotateAngle(rEar01, 0.0F, -0.22689280275926282F, -0.40142572795869574F);
        this.rHindLeg03 = new ModelRenderer(this, 0, 0);
        this.rHindLeg03.mirror = true;
        this.rHindLeg03.setRotationPoint(-0.1F, -0.4F, 5.4F);
        this.rHindLeg03.addBox(-1.0F, -0.3F, -1.5F, 2, 7, 2, 0.0F);
        this.setRotateAngle(rHindLeg03, 0.5235987755982988F, 0.0F, -0.05235987755982988F);
        this.tailM01b = new ModelRenderer(this, 0, 50);
        this.tailM01b.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.tailM01b.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
        this.setRotateAngle(tailM01b, -0.3141592653589793F, 0.0F, 0.0F);
        this.tailR02c.addChild(this.tailR02d);
        this.tailR03b.addChild(this.tailR03c);
        this.rForeleg01.addChild(this.rForeleg02);
        this.tailL02c.addChild(this.tailL02d);
        this.hips.addChild(this.tailR03a);
        this.tailM02c.addChild(this.tailM02d);
        this.tailM03a.addChild(this.tailM03b);
        this.tailL01a.addChild(this.tailL01b);
        this.tailL03c.addChild(this.tailL03d);
        this.rHindLeg03.addChild(this.rHindPaw);
        this.chest.addChild(this.lForeleg01);
        this.head.addChild(this.jawUpper01);
        this.hips.addChild(this.skirt);
        this.hips.addChild(this.tailL03a);
        this.neck.addChild(this.mane02);
        this.tailL02b.addChild(this.tailL02c);
        this.tailR02a.addChild(this.tailR02b);
        this.tailM01c.addChild(this.tailM01d);
        this.tailM03c.addChild(this.tailM03d);
        this.neck.addChild(this.mane01);
        this.lForeleg01.addChild(this.lForeleg02);
        this.rHindLeg01.addChild(this.rHindLeg02);
        this.tailR01c.addChild(this.tailR01d);
        this.chest.addChild(this.rForeleg01);
        this.hips.addChild(this.tailR02a);
        this.tailR01b.addChild(this.tailR01c);
        this.head.addChild(this.snout);
        this.hips.addChild(this.tailL01a);
        this.tailR01a.addChild(this.tailR01b);
        this.hips.addChild(this.tailM02a);
        this.chest.addChild(this.neck);
        this.lHindLeg01.addChild(this.lHindLeg02);
        this.jawUpper01.addChild(this.jawUpper02);
        this.head.addChild(this.lEar01);
        this.tailR02b.addChild(this.tailR02c);
        this.tailM01b.addChild(this.tailM01c);
        this.hips.addChild(this.tailL02a);
        this.lHindLeg02.addChild(this.lHindLeg03);
        this.rForeleg02.addChild(this.rForePaw);
        this.tailL02a.addChild(this.tailL02b);
        this.tailR03c.addChild(this.tailR03d);
        this.tailM03b.addChild(this.tailM03c);
        this.tailL01c.addChild(this.tailL01d);
        this.tailM02a.addChild(this.tailM02b);
        this.tailM02b.addChild(this.tailM02c);
        this.torso.addChild(this.hips);
        this.hips.addChild(this.tailR01a);
        this.tailL03a.addChild(this.tailL03b);
        this.hips.addChild(this.tailM03a);
        this.hips.addChild(this.rHindLeg01);
        this.hips.addChild(this.tailM01a);
        this.neck.addChild(this.head);
        this.lEar01.addChild(this.lEar02);
        this.head.addChild(this.jawLower);
        this.rEar01.addChild(this.rEar02);
        this.tailL03b.addChild(this.tailL03c);
        this.tailL01b.addChild(this.tailL01c);
        this.lHindLeg03.addChild(this.lHindPaw);
        this.tailR03a.addChild(this.tailR03b);
        this.hips.addChild(this.lHindLeg01);
        this.lForeleg02.addChild(this.lForePaw);
        this.chest.addChild(this.torso);
        this.neck.addChild(this.mane03);
        this.head.addChild(this.rEar01);
        this.rHindLeg02.addChild(this.rHindLeg03);
        this.tailM01a.addChild(this.tailM01b);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.chest.render(f5);
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