package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class AluminiumShovel extends ShovelItem {

    public AluminiumShovel() { super(CustomTiers.ALUMINIUM, 3, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
