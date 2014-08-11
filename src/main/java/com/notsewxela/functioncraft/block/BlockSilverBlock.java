package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockSilverBlock extends BlockFunctionCraft
{
    public BlockSilverBlock()
    {
        super(Material.iron);
        this.setBlockName("blockSilver");
        this.setHardness(3.2F);
        this.setResistance(10F);
        this.setBlockTextureName("blockSilver");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }
}
