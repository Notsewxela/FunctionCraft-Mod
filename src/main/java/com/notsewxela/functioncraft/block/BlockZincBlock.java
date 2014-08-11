package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockZincBlock extends BlockFunctionCraft
{
    public BlockZincBlock()
    {
        super(Material.iron);
        this.setBlockName("blockZinc");
        this.setHardness(3.8F);
        this.setResistance(10F);
        this.setBlockTextureName("blockZinc");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }

}
