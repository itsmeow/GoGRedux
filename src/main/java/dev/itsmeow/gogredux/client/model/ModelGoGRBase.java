package dev.itsmeow.gogredux.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public abstract class ModelGoGRBase extends ModelBase {

    public abstract ModelRenderer getLeftArm();

    public abstract ModelRenderer getRightArm();

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
