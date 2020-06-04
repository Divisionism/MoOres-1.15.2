package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomTiers;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.item.PickaxeItem;

public class DiraciumPickaxe extends PickaxeItem {

    public DiraciumPickaxe() {
        super(CustomTiers.DIRACIUM, 999, 10.0f, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
