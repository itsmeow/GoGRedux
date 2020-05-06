package dev.itsmeow.gogredux.client;

import static dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize.MED;
import static dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize.SMALL;

import java.util.function.Function;

import dev.itsmeow.gogredux.client.ReplacementHandler.RegistrationTime;
import dev.itsmeow.gogredux.client.ReplacementHandler.ReplaceDefinition;
import dev.itsmeow.gogredux.client.ReplacementHandler.ReplaceDefinition.RenderType;
import dev.itsmeow.gogredux.client.model.ModelAnt;
import dev.itsmeow.gogredux.client.model.ModelAnubisFemale;
import dev.itsmeow.gogredux.client.model.ModelAnubisMale;
import dev.itsmeow.gogredux.client.model.ModelBaphomet;
import dev.itsmeow.gogredux.client.model.ModelBee;
import dev.itsmeow.gogredux.client.model.ModelGoGRBase;
import dev.itsmeow.gogredux.client.model.ModelHarpy;
import dev.itsmeow.gogredux.client.model.ModelIncubus;
import dev.itsmeow.gogredux.client.model.ModelMatango;
import dev.itsmeow.gogredux.client.model.ModelMinotaurus;
import dev.itsmeow.gogredux.client.model.ModelNineTails;
import dev.itsmeow.gogredux.client.model.ModelOni;
import dev.itsmeow.gogredux.client.model.ModelSatyress;
import dev.itsmeow.gogredux.client.model.ModelSludgeSlimeGirl;
import dev.itsmeow.gogredux.client.model.ModelSuccubus;
import dev.itsmeow.gogredux.client.model.ModelToad;
import dev.itsmeow.gogredux.client.render.generic.RenderGoGR;
import dev.itsmeow.gogredux.client.render.generic.RenderGoGR.ShadowSize;
import gaia.entity.monster.EntityGaiaAnt;
import gaia.entity.monster.EntityGaiaAnubis;
import gaia.entity.monster.EntityGaiaBaphomet;
import gaia.entity.monster.EntityGaiaBee;
import gaia.entity.monster.EntityGaiaHarpy;
import gaia.entity.monster.EntityGaiaMatango;
import gaia.entity.monster.EntityGaiaMinotaurus;
import gaia.entity.monster.EntityGaiaNineTails;
import gaia.entity.monster.EntityGaiaOni;
import gaia.entity.monster.EntityGaiaSatyress;
import gaia.entity.monster.EntityGaiaSludgeGirl;
import gaia.entity.monster.EntityGaiaSuccubus;
import gaia.entity.monster.EntityGaiaToad;
import gaia.entity.passive.EntityGaiaNPCSlimeGirl;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.EntityLiving;

public class Replacements {

    public static void addAll() {
        // wave 1
        add("anubis", EntityGaiaAnubis.class, SMALL, f -> f
        .gender(EntityGaiaAnubis::isMale)
        .tGendered("anubis")
        .mGendered(new ModelAnubisMale(), new ModelAnubisFemale())
        .arms(e -> GlStateManager.translate(0F, 0.08F, 0F)));

        add("baphomet", EntityGaiaBaphomet.class, SMALL, f -> f
        .tSingle("gaia_baphomet")
        .mSingle(new ModelBaphomet())
        .arms());

        add("succubus", EntityGaiaSuccubus.class, SMALL, f -> f
        .gender(EntityGaiaSuccubus::isMale)
        .tGendered("succubus")
        .mGendered(new ModelIncubus(), new ModelSuccubus())
        .arms());

        add("ninetails", EntityGaiaNineTails.class, SMALL, f -> f
        .tSingle("gaia_ninetails")
        .mSingle(new ModelNineTails()));

        add("oni", EntityGaiaOni.class, SMALL, f -> f
        .tNumber("oni", EntityGaiaOni::getTextureType)
        .mSingle(new ModelOni())
        .arms());

        add("satyress", EntityGaiaSatyress.class, SMALL, f -> f
        .tNumber("satyress", EntityGaiaSatyress::getTextureType)
        .mSingle(new ModelSatyress())
        .arms());

        // wave 2
        add("ant", EntityGaiaAnt.class, SMALL, f -> f
        .tNumber("ant", EntityGaiaAnt::getTextureType)
        .mSingle(new ModelAnt())
        .childScale(EntityGaiaAnt::isChild, 0.7F, 0.7F, 0.7F)
        .arms(e -> {
            GlStateManager.rotate(-20F, 1F, 0F, 0F);
            GlStateManager.translate(0.28F, -0.2F, 0.2F);
        }));

        add("bee", EntityGaiaBee.class, MED, f -> f
        .tSingle("gaia_bee")
        .mSingle(new ModelBee()));

        add("harpy", EntityGaiaHarpy.class, SMALL, f -> f
        .tNumber("harpy", EntityGaiaHarpy::getTextureType)
        .mSingle(new ModelHarpy())
        .childScale(EntityGaiaHarpy::isChild, 0.7F, 0.7F, 0.7F));

        add("matango", EntityGaiaMatango.class, SMALL, f -> f
        .tSingle("gaia_matango")
        .mSingle(new ModelMatango())
        .arms());

        add("minotaurus", EntityGaiaMinotaurus.class, SMALL, f -> f
        .tNumber("minotaurus", EntityGaiaMinotaurus::getTextureType)
        .mSingle(new ModelMinotaurus())
        .arms());

        add("slime_girl", EntityGaiaNPCSlimeGirl.class, SMALL, f -> f
        .tSingle("gaia_slime_girl")
        .mSingle(new ModelSludgeSlimeGirl())
        .arms());

        add("sludge_girl", EntityGaiaSludgeGirl.class, SMALL, f -> f
        .tNumber("sludge_girl", EntityGaiaSludgeGirl::getTextureType)
        .mSingle(new ModelSludgeSlimeGirl())
        .arms());

        add("toad", EntityGaiaToad.class, MED, f -> f
        .tSingle("gaia_toad")
        .mSingle(new ModelToad()));
    }

    public static <T extends EntityLiving> void add(String name, Class<T> clazz, ShadowSize shadow, Function<RenderGoGR.Builder<T, ModelGoGRBase>, RenderGoGR.Builder<T, ModelGoGRBase>> factory) {
        ReplacementHandler.addReplace(RegistrationTime.PREINIT, "grimoireofgaia", name, () -> () -> new ReplaceDefinition<T>(clazz, factory.apply(RenderGoGR.factory(shadow)).done(), RenderType.NEW));
    }

}
