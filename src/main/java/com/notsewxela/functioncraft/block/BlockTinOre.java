package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockTinOre extends BlockFunctionCraft
{
    public BlockTinOre()
    {
        super(Material.rock);
        this.setBlockName("oreTin");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreTin");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeStone);
    }
}
