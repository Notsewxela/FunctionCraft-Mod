package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockTinBlock extends BlockFunctionCraft
{
    public BlockTinBlock()
    {
        super(Material.iron);
        this.setBlockName("blockTin");
        this.setHardness(4.5F);
        this.setResistance(10F);
        this.setBlockTextureName("blockTin");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
    }
}
