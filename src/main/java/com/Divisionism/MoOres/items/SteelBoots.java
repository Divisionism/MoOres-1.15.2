package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelBoots extends ArmorItem {

    public SteelBoots() { super(CustomArmorMaterials.STEEL, EquipmentSlotType.FEET, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
