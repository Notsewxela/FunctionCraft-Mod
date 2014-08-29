package com.notsewxela.functioncraft;

import com.notsewxela.functioncraft.client.handler.KeyInputEventHandler;
import com.notsewxela.functioncraft.handler.ConfigurationHandler;
import com.notsewxela.functioncraft.init.ModBlocks;
import com.notsewxela.functioncraft.init.ModItems;
import com.notsewxela.functioncraft.init.ModRecipes;
import com.notsewxela.functioncraft.proxy.IProxy;
import com.notsewxela.functioncraft.reference.Reference;
import com.notsewxela.functioncraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class FunctionCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static FunctionCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();

        ModBlocks.init();
        LogHelper.info("Pre Initialisation Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        ModRecipes.init();
        LogHelper.info("Initialisation Complete!");
    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialisation Complete!");

        for (String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
        }
    }

}
