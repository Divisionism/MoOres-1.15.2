package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class DiraciumBoots extends ArmorItem {

    public DiraciumBoots() { super(CustomArmorMaterials.DIRACIUM, EquipmentSlotType.FEET, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
