package com.notsewxela.functioncraft.block;


import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockPlatinumBlock extends BlockFunctionCraft
{
    public BlockPlatinumBlock()
    {
        super(Material.iron);
        this.setBlockName("blockPlatinum");
        this.setHardness(3F);
        this.setResistance(10F);
        this.setBlockTextureName("blockPlatinum");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }
}
