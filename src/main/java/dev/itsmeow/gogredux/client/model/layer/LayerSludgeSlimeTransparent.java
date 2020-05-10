package dev.itsmeow.gogredux.client.model.layer;

import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.model.ModelSludgeSlimeGirl;
import dev.itsmeow.gogredux.client.render.generic.BaseRenderer;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLiving;

public class LayerSludgeSlimeTransparent<T extends EntityLiving> implements LayerRenderer<T> {

    private final BaseRenderer<T, ModelGoGRBase> baseRender;
    private final ModelSludgeSlimeGirl model = new ModelSludgeSlimeGirl(true);

    public LayerSludgeSlimeTransparent(BaseRenderer<T, ModelGoGRBase> baseRender) {
        this.baseRender = baseRender;
    }

    public void doRenderLayer(T entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        if(!entitylivingbaseIn.isInvisible()) {
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            this.model.setModelAttributes(this.baseRender.getMainModel());
            if(this.baseRender.getMainModel() instanceof ModelSludgeSlimeGirl) {
                ModelSludgeSlimeGirl modelO = (ModelSludgeSlimeGirl) this.baseRender.getMainModel();
                ModelBase.copyModelAngles(modelO.BipedBody, model.BipedBody);
                ModelBase.copyModelAngles(modelO.BipedRightArm, model.BipedRightArm);
                ModelBase.copyModelAngles(modelO.BipedLeftArm, model.BipedLeftArm);
                ModelBase.copyModelAngles(modelO.BipedRightLeg, model.BipedRightLeg);
                ModelBase.copyModelAngles(modelO.BipedLeftLeg, model.BipedLeftLeg);
                ModelBase.copyModelAngles(modelO.BipedHead, model.BipedHead);
                ModelBase.copyModelAngles(modelO.rArmBones, model.rArmBones);
                ModelBase.copyModelAngles(modelO.lArmBones, model.lArmBones);
                ModelBase.copyModelAngles(modelO.rLegBones, model.rLegBones);
                ModelBase.copyModelAngles(modelO.lLegBones, model.lLegBones);
                ModelBase.copyModelAngles(modelO.skull, model.skull);
                ModelBase.copyModelAngles(modelO.ribs, model.ribs);
                ModelBase.copyModelAngles(modelO.stomach, model.stomach);
                ModelBase.copyModelAngles(modelO.hips, model.hips);
            }
            this.model.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
            GlStateManager.disableBlend();
            GlStateManager.disableNormalize();
        }
    }

    public boolean shouldCombineTextures() {
        return true;
    }
}