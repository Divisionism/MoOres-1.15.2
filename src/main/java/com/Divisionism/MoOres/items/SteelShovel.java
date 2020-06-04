package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class SteelShovel extends ShovelItem {

    public SteelShovel() { super(CustomTiers.STEEL, 6, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
