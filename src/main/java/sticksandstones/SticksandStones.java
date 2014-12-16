package sticksandstones;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import sticksandstones.config.ConfigHandler;
import sticksandstones.proxy.CommonProxy;
import sticksandstones.reference.MetaData;
import sticksandstones.reference.Reference;
import sticksandstones.registry.BlockRegistry;
import sticksandstones.registry.ItemRegistry;
import sticksandstones.registry.RecipeRegistry;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION_FULL, guiFactory = Reference.GUI_FACTORY)
public class SticksandStones
{
    @Mod.Instance(value = Reference.ID)
    public static SticksandStones INSTANCE;

    @Mod.Metadata(Reference.ID)
    public static ModMetadata metadata;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy PROXY;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        INSTANCE = this;
        metadata = MetaData.init(metadata);
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        BlockRegistry.init();
        ItemRegistry.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        RecipeRegistry.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }

}
