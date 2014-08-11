package com.notsewxela.functioncraft.block;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import net.minecraft.block.material.Material;

public class BlockNickelOre extends BlockFunctionCraft
{
    public BlockNickelOre()
    {
        super(Material.iron);
        this.setBlockName("oreNickel");
        this.setHardness(3.0F);
        this.setResistance(5F);
        this.setBlockTextureName("oreNicke;");
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        this.setHarvestLevel("pickaxe",1);
        this.setStepSound(soundTypeStone);
    }
}
