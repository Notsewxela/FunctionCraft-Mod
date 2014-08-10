package com.notsewxela.functioncraft.init;

import com.notsewxela.functioncraft.block.*;
import com.notsewxela.functioncraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockFunctionCraft blockCopper = new BlockCopperBlock();
    public static final BlockFunctionCraft blockLead = new BlockLeadBlock();
    public static final BlockFunctionCraft blockNickel = new BlockNickelBlock();
    public static final BlockFunctionCraft blockPlatinum = new BlockPlatinumBlock();
    public static final BlockFunctionCraft blockSilver = new BlockSilverBlock();
    public static final BlockFunctionCraft blockTin = new BlockTinBlock();
    public static final BlockFunctionCraft blockZinc = new BlockZincBlock();

    public static void init()
    {
        GameRegistry.registerBlock(blockCopper, "blockCopper");
        GameRegistry.registerBlock(blockLead, "blockLead");
        GameRegistry.registerBlock(blockNickel, "blockNickel");
        GameRegistry.registerBlock(blockPlatinum, "blockPlatinum");
        GameRegistry.registerBlock(blockSilver, "blockSilver");
        GameRegistry.registerBlock(blockTin, "blockTin");
        GameRegistry.registerBlock(blockZinc, "blockZinc");
    }
}
