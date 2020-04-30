package dev.itsmeow.gogredux.client;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import org.apache.commons.lang3.tuple.Pair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.collect.Multimap;
import com.google.common.collect.MultimapBuilder;

import dev.itsmeow.gogredux.GrimoireOfGaiaRedux;
import dev.itsmeow.gogredux.client.ReplacementHandler.ReplaceDefinition.RenderType;
import dev.itsmeow.gogredux.client.model.ModelAnubisFemale;
import dev.itsmeow.gogredux.client.model.ModelAnubisMale;
import dev.itsmeow.gogredux.client.render.generic.RenderFactories;
import gaia.entity.monster.EntityGaiaAnubis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Loader;

@SuppressWarnings("unchecked")
public class ReplacementHandler {

    public static final Logger LOG = LogManager.getLogger();

    public static Map<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition<?>>>>> replaceDefs = new HashMap<RegistrationTime, Multimap<Pair<String, String>, Supplier<Supplier<ReplaceDefinition<?>>>>>();
    public static Map<RegistrationTime, Multimap<String, Supplier<Runnable>>> modActions = new HashMap<RegistrationTime, Multimap<String, Supplier<Runnable>>>();
    public static Map<String, Boolean> config = new HashMap<String, Boolean>();

    static {
        final float tiny = 0.25F;
        final float small = 0.4F;
        final float med = 0.5F;
        final float large = 0.7F;
        final String GAIA_MODID = "grimoireofgaia";

        // Add replaces here
        addReplace(RegistrationTime.PREINIT, GAIA_MODID, "anubis", () -> () -> new ReplaceDefinition<>(EntityGaiaAnubis.class, RenderFactories.simpleGenderedModel(new ModelAnubisMale(), new ModelAnubisFemale(), small, "gaia_anubis_male", "gaia_anubis_female", e -> e.isMale()), RenderType.NEW));
    }

    public static void preinit() {
        replaceDefs.values().forEach(m -> m.keySet().forEach(pair -> {
            boolean val = GrimoireOfGaiaRedux.config.getBoolean("replace_" + pair.getRight(), GrimoireOfGaiaRedux.REPLACEMENT_SECTION + "." + pair.getLeft(), true, "from " + pair.getLeft());
            config.put(pair.getRight(), val);
            LOG.debug("Loaded config replace_" + pair.getRight() + " from " + pair.getLeft() + " as " + val);
        }));
        runActions(RegistrationTime.PREINIT);
        overwriteRenders(RegistrationTime.PREINIT);
    }

    public static void init() {
        runActions(RegistrationTime.INIT);
        overwriteRenders(RegistrationTime.INIT);
    }

    public static void mre() {
        runActions(RegistrationTime.MODELREGISTRY);
        overwriteRenders(RegistrationTime.MODELREGISTRY);
    }

    public static void postinit() {
        runActions(RegistrationTime.POSTINIT);
        overwriteRenders(RegistrationTime.POSTINIT);
    }

    public static void addReplace(RegistrationTime time, String modid, String name, Supplier<Supplier<ReplaceDefinition<?>>> definition) {
        replaceDefs.putIfAbsent(time, MultimapBuilder.hashKeys().linkedHashSetValues().build());
        replaceDefs.get(time).put(Pair.of(modid, name), definition);
        LOG.debug(String.format("Registering replace for %s from %s at %s", name, modid, time.name()));
    }

    public static void addAction(RegistrationTime time, String modid, Supplier<Runnable> action) {
        modActions.putIfAbsent(time, MultimapBuilder.hashKeys().linkedHashSetValues().build());
        modActions.get(time).put(modid, action);
        LOG.debug(String.format("Registering action for %s at %s", modid, time.name()));
    }

    public static boolean getEnabledAndLoaded(String id) {
        return config.containsKey(id) ? config.get(id) : false;
    }

    @SuppressWarnings("deprecation")
    private static void overwriteRenders(RegistrationTime phase) {
        replaceDefs.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        replaceDefs.get(phase).forEach((pair, definitionSupplier) -> {
            boolean doReplace = config.get(pair.getRight());
            if(Loader.isModLoaded(pair.getLeft()) || pair.getLeft().equals("minecraft")) {
                ReplaceDefinition<?> def = definitionSupplier.get().get();
                if(doReplace) {
                    if(def.type == RenderType.NEW) {
                        IRenderFactory<EntityLivingBase> factory = new IRenderFactory<EntityLivingBase>() {
                            @Override
                            public Render<? super EntityLivingBase> createRenderFor(RenderManager manager) {
                                return (Render<? super EntityLivingBase>) def.factory.apply(manager);
                            }
                        };
                        RenderingRegistry.registerEntityRenderingHandler(def.clazz, factory);
                    } else {
                        RenderingRegistry.registerEntityRenderingHandler(def.clazz, (Render<? extends Entity>) def.factory.apply(Minecraft.getMinecraft().getRenderManager()));
                    }
                    LOG.debug(String.format("Overriding %s / %s in %s with render type %s", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft(), def.type.name()));
                } else {
                    LOG.debug(String.format("Was going to override %s / %s in %s with render type %s, but it is disabled!", pair.getRight(), def.clazz.getSimpleName(), pair.getLeft(), def.type.name()));
                }
            } else {
                LOG.debug(String.format("%s was not replaced, because %s is not loaded! Config %s", pair.getRight(), pair.getLeft(), doReplace));
            }
        });
    }

    private static void runActions(RegistrationTime phase) {
        modActions.putIfAbsent(phase, MultimapBuilder.hashKeys().hashSetValues().build());
        modActions.get(phase).forEach((modid, action) -> {
            if(Loader.isModLoaded(modid) || modid.equals("minecraft")) {
                action.get().run();
                LOG.debug("Running action for " + modid);
            } else {
                LOG.debug("No action executed for " + modid + ", as it is not loaded.");
            }
        });
    }

    public static class ReplaceDefinition<T extends EntityLivingBase> {

        public final Class<T> clazz;
        public final Function<RenderManager, Render<? super T>> factory;
        public final RenderType type;

        public ReplaceDefinition(Class<T> clazz, Function<RenderManager, Render<? super T>> factory, RenderType type) {
            this.clazz = clazz;
            this.factory = factory;
            this.type = type;
        }

        public ReplaceDefinition(Class<T> clazz, IRenderFactory<T> factory, RenderType type) {
            this.clazz = clazz;
            this.factory = mgr -> factory.createRenderFor(mgr);
            this.type = type;
        }

        public static enum RenderType {
            OLD,
            NEW;
        }

    }

    public static enum RegistrationTime {
        MODELREGISTRY,
        PREINIT,
        INIT,
        POSTINIT;
    }

}