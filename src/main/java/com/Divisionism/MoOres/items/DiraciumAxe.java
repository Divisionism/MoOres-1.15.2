package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;

public class DiraciumAxe extends AxeItem {

    public DiraciumAxe() { super(CustomTiers.DIRACIUM, 9999, 10, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
