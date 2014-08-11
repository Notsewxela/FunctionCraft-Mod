package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockCopperOre extends BlockFunctionCraft
{
    public BlockCopperOre()
    {
        super(Material.rock);
        this.setBlockName("oreCopper");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreCopper");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeStone);
    }
}
