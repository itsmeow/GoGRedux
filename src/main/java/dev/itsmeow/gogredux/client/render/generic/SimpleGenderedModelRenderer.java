package dev.itsmeow.gogredux.client.render.generic;

import java.util.function.Function;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class SimpleGenderedModelRenderer<T extends EntityLiving> extends SimpleGenderedRenderer<T> {

    protected ModelBase maleModel;
    protected ModelBase femaleModel;

    public SimpleGenderedModelRenderer(RenderManager renderManagerIn, ModelBase maleModel, ModelBase femaleModel, float shadowSizeIn, ResourceLocation maleTex, ResourceLocation femaleTex, Function<T, Boolean> isMale) {
        super(renderManagerIn, maleModel, shadowSizeIn, maleTex, femaleTex, isMale);
        this.femaleModel = femaleModel;
        this.maleModel = maleModel;
    }

    @Override
    public void doRender(T entity, double x, double y, double z, float entityYaw, float partialTicks) {
        this.mainModel = isMale.apply(entity) ? maleModel : femaleModel;
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

}
