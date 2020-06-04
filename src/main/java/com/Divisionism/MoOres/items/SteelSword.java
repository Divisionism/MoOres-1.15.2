package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SteelSword extends SwordItem {

    public SteelSword() { super(CustomTiers.STEEL, 8, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
