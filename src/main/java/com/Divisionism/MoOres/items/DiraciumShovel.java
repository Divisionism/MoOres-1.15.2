package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.ShovelItem;

public class DiraciumShovel extends ShovelItem {

    public DiraciumShovel() { super(CustomTiers.DIRACIUM, 1000, 0.0f, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
