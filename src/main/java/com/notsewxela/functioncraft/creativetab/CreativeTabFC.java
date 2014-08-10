package com.notsewxela.functioncraft.creativetab;

import com.notsewxela.functioncraft.init.ModItems;
import com.notsewxela.functioncraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabFC
{
    public static final CreativeTabs FC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override

        public Item getTabIconItem()
        {
            return ModItems.ingotCopper;
        }
    };

}
