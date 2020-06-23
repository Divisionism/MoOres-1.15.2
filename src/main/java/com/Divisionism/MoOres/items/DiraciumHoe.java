package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.HoeItem;

public class DiraciumHoe extends HoeItem {

    public DiraciumHoe() { super(CustomTiers.DIRACIUM, 0.0f, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
