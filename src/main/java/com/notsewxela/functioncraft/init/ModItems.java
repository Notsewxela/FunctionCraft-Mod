package com.notsewxela.functioncraft.init;

import com.notsewxela.functioncraft.item.*;
import com.notsewxela.functioncraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemFunctionCraft ingotCopper = new ItemCopperIngot();
    public static final ItemFunctionCraft ingotLead = new ItemLeadIngot();
    public static final ItemFunctionCraft ingotNickel = new ItemNickelIngot();
    public static final ItemFunctionCraft ingotPlatinum = new ItemPlatinumIngot();
    public static final ItemFunctionCraft ingotSilver = new ItemSilverIngot();
    public static final ItemFunctionCraft ingotTin = new ItemTinIngot();
    public static final ItemFunctionCraft ingotZinc = new ItemZincIngot();
    public static final ItemFunctionCraft dustSulfur = new ItemSulfurDust();
    public static final ItemFunctionCraft dustSphalerite = new ItemSphaleriteDust();

    public static void init()
    {
        GameRegistry.registerItem(ingotCopper, "ingotCopper");
        GameRegistry.registerItem(ingotLead, "ingotLead");
        GameRegistry.registerItem(ingotNickel, "ingotNickel");
        GameRegistry.registerItem(ingotPlatinum, "ingotPlatinum");
        GameRegistry.registerItem(ingotSilver, "ingotSilver");
        GameRegistry.registerItem(ingotTin, "ingotTin");
        GameRegistry.registerItem(ingotZinc, "ingotZinc");
        GameRegistry.registerItem(dustSulfur, "dustSulfur");
        GameRegistry.registerItem(dustSphalerite, "dustSphalerite");
    }
}

