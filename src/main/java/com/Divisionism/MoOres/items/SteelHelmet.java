package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class SteelHelmet extends ArmorItem {

    public SteelHelmet() { super(CustomArmorMaterials.STEEL, EquipmentSlotType.HEAD, new Properties().group(CreativeTabs.TOOLS_TAB)); }
}
