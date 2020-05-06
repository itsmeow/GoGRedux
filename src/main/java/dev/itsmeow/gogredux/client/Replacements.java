package dev.itsmeow.gogredux.client;

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
import dev.itsmeow.gogredux.client.render.generic.RenderFactories;
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
import net.minecraft.entity.EntityLiving;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class Replacements {

    public static void addAll() {
        final float tiny = 0.25F;
        final float small = 0.4F;
        final float med = 0.5F;
        final float large = 0.7F;

        // Add replaces here
        add("anubis", EntityGaiaAnubis.class, RenderFactories.simpleGenderedModelArms(new ModelAnubisMale(), new ModelAnubisFemale(), small, "gaia_anubis_male", "gaia_anubis_female", e -> e.isMale(), 0F, 0.08F, 0F));
        add("baphomet", EntityGaiaBaphomet.class, RenderFactories.simpleSingleArms(new ModelBaphomet(), small, "gaia_baphomet", 0F, 0F, 0F));
        add("succubus", EntityGaiaSuccubus.class, RenderFactories.simpleGenderedModelArms(new ModelIncubus(), new ModelSuccubus(), small, "gaia_incubus", "gaia_succubus", e -> e.isMale(), 0F, 0F, 0F));
        add("ninetails", EntityGaiaNineTails.class, RenderFactories.simpleSingle(new ModelNineTails(), small, "gaia_ninetails"));
        addNum("oni", EntityGaiaOni.class, new ModelOni(), small, e -> e.getTextureType(), 0F, 0F, 0F);
        addNum("satyress", EntityGaiaSatyress.class, new ModelSatyress(), small, e -> e.getTextureType(), 0F, 0F, 0F);

        addNum("ant", EntityGaiaAnt.class, new ModelAnt(), small, e -> e.getTextureType(), 0F, 0.08F, 0F);
        add("bee", EntityGaiaBee.class, RenderFactories.simpleSingle(new ModelBee(), med, "gaia_bee"));
        addNum("harpy", EntityGaiaHarpy.class, new ModelHarpy(), small, e -> e.getTextureType());
        add("mantago", EntityGaiaMatango.class, RenderFactories.simpleSingleArms(new ModelMatango(), small, "gaia_matango", 0F, 0F, 0F));
        addNum("minotaurus", EntityGaiaMinotaurus.class, new ModelMinotaurus(), small, e -> e.getTextureType(), 0F, 0F, 0F);
        add("slime_girl", EntityGaiaNPCSlimeGirl.class, RenderFactories.simpleSingleArms(new ModelSludgeSlimeGirl(), small, "gaia_slime_girl", 0F, 0F, 0F));
        addNum("sludge_girl", EntityGaiaSludgeGirl.class, new ModelSludgeSlimeGirl(), small, e -> e.getTextureType(), 0F, 0F, 0F);
        add("toad", EntityGaiaToad.class, RenderFactories.simpleSingle(new ModelToad(), med, "gaia_toad"));
    }

    public static <T extends EntityLiving> void add(String name, Class<T> clazz, IRenderFactory<T> factory) {
        ReplacementHandler.addReplace(RegistrationTime.PREINIT, "grimoireofgaia", name, () -> () -> new ReplaceDefinition<T>(clazz, factory, RenderType.NEW));
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> void addNum(String name, Class<T> clazz, A model, float shadowSize, Function<T, Integer> numFunction) {
        ReplacementHandler.addReplace(RegistrationTime.PREINIT, "grimoireofgaia", name, () -> () -> new ReplaceDefinition<T>(clazz, RenderFactories.simpleVariantNum(model, shadowSize, name, numFunction), RenderType.NEW));
    }

    public static <T extends EntityLiving, A extends ModelGoGRBase> void addNum(String name, Class<T> clazz, A model, float shadowSize, Function<T, Integer> numFunction, float offsetX, float offsetY, float offsetZ) {
        ReplacementHandler.addReplace(RegistrationTime.PREINIT, "grimoireofgaia", name, () -> () -> new ReplaceDefinition<T>(clazz, RenderFactories.simpleVariantNumArms(model, shadowSize, name, numFunction, offsetX, offsetY, offsetZ), RenderType.NEW));
    }

}
