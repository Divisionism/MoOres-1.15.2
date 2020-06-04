package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class SteelAxe extends AxeItem {

    public SteelAxe() { super(CustomTiers.STEEL, 9, 0.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
