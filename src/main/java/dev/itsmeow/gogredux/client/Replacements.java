package dev.itsmeow.gogredux.client;

import static dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize.LARGE;
import static dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize.MED;
import static dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize.SMALL;

import java.lang.reflect.Field;
import java.util.function.Function;

import dev.itsmeow.gogredux.client.ReplacementHandler.RegistrationTime;
import dev.itsmeow.gogredux.client.ReplacementHandler.ReplaceDefinition;
import dev.itsmeow.gogredux.client.ReplacementHandler.ReplaceDefinition.RenderType;
import dev.itsmeow.gogredux.client.model.ModelAnt;
import dev.itsmeow.gogredux.client.model.ModelAnubisFemale;
import dev.itsmeow.gogredux.client.model.ModelAnubisMale;
import dev.itsmeow.gogredux.client.model.ModelBaphomet;
import dev.itsmeow.gogredux.client.model.ModelBee;
import dev.itsmeow.gogredux.client.model.ModelCecaelia;
import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.model.ModelHarpy;
import dev.itsmeow.gogredux.client.model.ModelHolstaurus;
import dev.itsmeow.gogredux.client.model.ModelIncubus;
import dev.itsmeow.gogredux.client.model.ModelMatango;
import dev.itsmeow.gogredux.client.model.ModelMinotaur;
import dev.itsmeow.gogredux.client.model.ModelMinotaurus;
import dev.itsmeow.gogredux.client.model.ModelNineTails;
import dev.itsmeow.gogredux.client.model.ModelOni;
import dev.itsmeow.gogredux.client.model.ModelSatyress;
import dev.itsmeow.gogredux.client.model.ModelSludgeSlimeGirl;
import dev.itsmeow.gogredux.client.model.ModelSuccubus;
import dev.itsmeow.gogredux.client.model.ModelToad;
import dev.itsmeow.gogredux.client.model.layer.LayerAuraMinotaurRedux;
import dev.itsmeow.gogredux.client.model.layer.LayerSludgeSlimeTransparent;
import dev.itsmeow.gogredux.client.render.generic.RenderGoGR;
import dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize;
import gaia.GaiaReference;
import gaia.entity.monster.EntityGaiaAnt;
import gaia.entity.monster.EntityGaiaAnubis;
import gaia.entity.monster.EntityGaiaBaphomet;
import gaia.entity.monster.EntityGaiaBee;
import gaia.entity.monster.EntityGaiaCecaelia;
import gaia.entity.monster.EntityGaiaDryad;
import gaia.entity.monster.EntityGaiaHarpy;
import gaia.entity.monster.EntityGaiaMatango;
import gaia.entity.monster.EntityGaiaMinotaur;
import gaia.entity.monster.EntityGaiaMinotaurus;
import gaia.entity.monster.EntityGaiaNineTails;
import gaia.entity.monster.EntityGaiaOni;
import gaia.entity.monster.EntityGaiaSatyress;
import gaia.entity.monster.EntityGaiaSludgeGirl;
import gaia.entity.monster.EntityGaiaSuccubus;
import gaia.entity.monster.EntityGaiaToad;
import gaia.entity.passive.EntityGaiaNPCHolstaurus;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import gaia.model.ModelGaiaDryad;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

public class Replacements {

    public static void addAll() {
        // wave 1
        add("anubis", EntityGaiaAnubis.class, SMALL, f -> f
        .gender(EntityGaiaAnubis::isMale)
        .tGendered()
        .mGendered(new ModelAnubisMale(), new ModelAnubisFemale())
        .arms(e -> GlStateManager.translate(0F, 0.08F, 0F)));

        add("baphomet", EntityGaiaBaphomet.class, SMALL, f -> f
        .tSingle()
        .mSingle(new ModelBaphomet())
        .arms());

        add("succubus", EntityGaiaSuccubus.class, SMALL, f -> f
        .gender(EntityGaiaSuccubus::isMale)
        .tGendered()
        .mGendered(new ModelIncubus(), new ModelSuccubus())
        .arms());

        add("ninetails", EntityGaiaNineTails.class, SMALL, f -> f
        .tSingle()
        .mSingle(new ModelNineTails()));

        add("oni", EntityGaiaOni.class, SMALL, f -> f
        .tNumber(EntityGaiaOni::getTextureType)
        .mSingle(new ModelOni())
        .arms());

        add("satyress", EntityGaiaSatyress.class, SMALL, f -> f
        .tNumber(EntityGaiaSatyress::getTextureType)
        .mSingle(new ModelSatyress())
        .arms());

        // wave 2
        add("ant", EntityGaiaAnt.class, SMALL, f -> f
        .tNumber(EntityGaiaAnt::getTextureType)
        .mSingle(new ModelAnt())
        .childScale(EntityGaiaAnt::isChild, 0.7F, 0.7F, 0.7F)
        .arms(e -> {
            GlStateManager.rotate(-20F, 1F, 0F, 0F);
            GlStateManager.translate(0.28F, -0.2F, 0.2F);
        }));

        add("bee", EntityGaiaBee.class, MED, f -> f
        .tSingle()
        .mSingle(new ModelBee()));

        add("harpy", EntityGaiaHarpy.class, SMALL, f -> f
        .tNumber(EntityGaiaHarpy::getTextureType)
        .mSingle(new ModelHarpy())
        .childScale(EntityGaiaHarpy::isChild, 0.7F, 0.7F, 0.7F));

        add("matango", EntityGaiaMatango.class, SMALL, f -> f
        .tSingle()
        .mSingle(new ModelMatango())
        .arms());

        add("minotaurus", EntityGaiaMinotaurus.class, SMALL, f -> f
        .tNumber(EntityGaiaMinotaurus::getTextureType)
        .mSingle(new ModelMinotaurus())
        .arms());

        add("slime_girl", EntityGaiaNPCSlimeGirl.class, SMALL, f -> f
        .tSingle()
        .mSingle(new ModelSludgeSlimeGirl(false))
        .arms()
        .layer(LayerSludgeSlimeTransparent::new));

        add("sludge_girl", EntityGaiaSludgeGirl.class, SMALL, f -> f
        .tNumber(EntityGaiaSludgeGirl::getTextureType)
        .mSingle(new ModelSludgeSlimeGirl(false))
        .arms()
        .layer(LayerSludgeSlimeTransparent::new));

        add("toad", EntityGaiaToad.class, MED, f -> f
        .tSingle()
        .mSingle(new ModelToad()));

        // wave 3
        add("cecaelia", EntityGaiaCecaelia.class, MED, f -> f
        .tSingle()
        .mSingle(new ModelCecaelia())
        .arms(e -> {
            GlStateManager.translate(0.05F, 0F, 0F);
        }));

        add("holstaurus", EntityGaiaNPCHolstaurus.class, SMALL, f -> f
        .tSingle()
        .mSingle(new ModelHolstaurus())
        .arms());
        
        add("minotaur", EntityGaiaMinotaur.class, LARGE, f -> f
        .tSingle()
        .mSingle(new ModelMinotaur())
        .arms()
        .eyes()
        .layer(LayerAuraMinotaurRedux::new));

        removeTiddy(EntityGaiaDryad.class, ModelGaiaDryad.class, "leftchest", "rightchest");
    }

    public static <T extends EntityLiving> void add(String name, Class<T> clazz, ShadowSize shadow, Function<RenderGoGR.Builder<T, ModelGoGRBase>, RenderGoGR.Builder<T, ModelGoGRBase>> factory) {
        ReplacementHandler.addReplace(RegistrationTime.PREINIT, GaiaReference.MOD_ID, name, () -> () -> new ReplaceDefinition<T>(clazz, factory.apply(RenderGoGR.factory(name, shadow)).done(), RenderType.NEW));
    }

    public static <T extends EntityLivingBase, A extends ModelBase> void removeTiddy(Class<T> entityC, Class<A> modelC, String... tiddies) {
        ReplacementHandler.addAction(RegistrationTime.POSTINIT, GaiaReference.MOD_ID, () -> () -> {
            Render<Entity> renderer = Minecraft.getMinecraft().getRenderManager().getEntityClassRenderObject(entityC);
            if(renderer instanceof RenderLivingBase<?>) {
                RenderLivingBase<?> render = (RenderLivingBase<?>) renderer;
                ModelBase model = render.getMainModel();
                if(modelC.isInstance(model)) {
                    for(String tiddy : tiddies) {
                        try {
                            Field field = modelC.getDeclaredField(tiddy);
                            field.setAccessible(true);
                            Object obj = field.get(model);
                            if(obj instanceof ModelRenderer) {
                                ModelRenderer part = (ModelRenderer) obj;
                                part.showModel = false;
                            }
                        } catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

}
