package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockLeadOre extends BlockFunctionCraft
{
    public BlockLeadOre()
    {
        super(Material.rock);
        this.setBlockName("oreLead");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreLead");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",2);
        this.setStepSound(soundTypeStone);
    }
}
