package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;

public class AluminiumHoe extends HoeItem {

    public AluminiumHoe() { super(CustomTiers.ALUMINIUM, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
