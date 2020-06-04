package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class CopperHoe extends HoeItem {

    public CopperHoe() { super(CustomTiers.COPPER, 0, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
