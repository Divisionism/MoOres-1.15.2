package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class DiraciumSword extends SwordItem {

    public DiraciumSword() { super(CustomTiers.DIRACIUM, 9999, 10.0f, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
