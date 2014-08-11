package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockLeadBlock  extends BlockFunctionCraft
{
    public BlockLeadBlock()
    {
        super(Material.iron);
        this.setBlockName("blockLead");
        this.setHardness(5.4F);
        this.setResistance(10F);
        this.setBlockTextureName("blockLead");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }
}
