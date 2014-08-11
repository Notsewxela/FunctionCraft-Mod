package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockCopperBlock extends BlockFunctionCraft
{
    public BlockCopperBlock()
    {
        super(Material.iron);
        this.setBlockName("blockCopper");
        this.setHardness(3.5F);
        this.setResistance(10F);
        this.setBlockTextureName("blockCopper");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }
}
