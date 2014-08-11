package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockSilverOre extends BlockFunctionCraft
{
    public BlockSilverOre()
    {
        super(Material.rock);
        this.setBlockName("oreSilver");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreSilver");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",2);
        this.setStepSound(soundTypeStone);
    }
}
