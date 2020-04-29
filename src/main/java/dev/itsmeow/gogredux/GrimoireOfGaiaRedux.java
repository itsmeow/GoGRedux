package dev.itsmeow.gogredux;

import java.io.File;

import dev.itsmeow.gogredux.client.ReplacementHandler;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod.EventBusSubscriber(modid = GrimoireOfGaiaRedux.MODID, value = Side.CLIENT)
@Mod(modid = GrimoireOfGaiaRedux.MODID, acceptedMinecraftVersions = "[1.12,1.12.2]", version = GrimoireOfGaiaRedux.VERSION, clientSideOnly = true, dependencies = "required-before:grimoireofgaia")
public class GrimoireOfGaiaRedux {

    public static final String MODID = "gogredux";
    public static final String VERSION = "@VERSION@";

    public static Configuration config;
    public static final String REPLACEMENT_SECTION = "replacements";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        File directory = event.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "GoGRedux.cfg"));
        config.load();
        config.addCustomCategoryComment(REPLACEMENT_SECTION, "Set to false to disable a model replacement.");
        if(config.hasChanged()) {
            config.save();
        }
        ReplacementHandler.preinit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ReplacementHandler.init();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ReplacementHandler.postinit();
        if(config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void mre(ModelRegistryEvent e) {
        ReplacementHandler.mre();
    }
}