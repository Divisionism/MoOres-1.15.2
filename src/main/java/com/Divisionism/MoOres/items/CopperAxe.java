package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class CopperAxe extends AxeItem {

    public CopperAxe() { super(CustomTiers.COPPER, 8, 0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
