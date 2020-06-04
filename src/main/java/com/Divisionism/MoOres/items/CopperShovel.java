package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class CopperShovel extends ShovelItem {

    public CopperShovel() { super(CustomTiers.COPPER, 5, 0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
