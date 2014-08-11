package com.notsewxela.functioncraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCopper), "ccc","ccc","ccc",'c', "ingotCopper"));
        GameRegistry.addShapelessRecipe(new ShapelessOreRecipe(new ItemStack(ModItems.ingotCopper,9),"blockCopper"));
    }
}
