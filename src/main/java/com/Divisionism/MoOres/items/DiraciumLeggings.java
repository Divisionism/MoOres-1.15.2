package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class DiraciumLeggings extends ArmorItem {

    public DiraciumLeggings() { super(CustomArmorMaterials.DIRACIUM, EquipmentSlotType.LEGS, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
