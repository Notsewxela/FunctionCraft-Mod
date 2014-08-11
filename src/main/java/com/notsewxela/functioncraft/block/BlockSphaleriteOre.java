package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockSphaleriteOre extends BlockFunctionCraft
{
    public BlockSphaleriteOre()
    {
        super(Material.rock);
        this.setBlockName("oreSphalerite");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreSphalerite");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",2);
        this.setStepSound(soundTypeStone);
    }
}
