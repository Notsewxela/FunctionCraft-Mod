package com.notsewxela.functioncraft.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;


public class ModRecipes
{
    public static void init()
    {
        //Ingots to blocks
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockCopper), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotCopper))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockLead), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotLead))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockNickel), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotNickel))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockPlatinum), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotPlatinum))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockSilver), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotSilver))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockTin), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotTin))));
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.blockZinc), "ccc", "ccc", "ccc", 'c', (new ItemStack(ModItems.ingotZinc))));

        //Blocks to ingots
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotCopper, 9, 0), new ItemStack(ModBlocks.blockCopper, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotLead, 9, 0), new ItemStack(ModBlocks.blockLead, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotNickel, 9, 0), new ItemStack(ModBlocks.blockNickel, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotPlatinum, 9, 0), new ItemStack(ModBlocks.blockPlatinum, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotSilver, 9, 0), new ItemStack(ModBlocks.blockSilver, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTin, 9, 0), new ItemStack(ModBlocks.blockTin, 1, 0));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotZinc, 9, 0), new ItemStack(ModBlocks.blockZinc, 1, 0));
    }
}
