package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockNickelBlock extends BlockFunctionCraft
{
    public BlockNickelBlock()
    {
        super(Material.iron);
        this.setBlockName("blockNickel");
        this.setHardness(5F);
        this.setResistance(10F);
        this.setBlockTextureName("blockNickel");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeMetal);
    }
}
