package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class SteelHoe extends HoeItem {

    public SteelHoe() { super(CustomTiers.STEEL, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
