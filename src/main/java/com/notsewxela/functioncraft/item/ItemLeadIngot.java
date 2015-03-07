package com.notsewxela.functioncraft.item;

import com.notsewxela.functioncraft.creativetab.CreativeTabFC;
import com.notsewxela.functioncraft.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemLeadIngot extends ItemFunctionCraft
{
    public ItemLeadIngot()
    {
        super();
        this.setUnlocalizedName("ingotLead");
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabFC.FC_TAB);
        // THIS DOESN'T WORK HKTRNOKTRIBHIEUG: this.setPotionEffect("Potion.poison.id");

    }
}
