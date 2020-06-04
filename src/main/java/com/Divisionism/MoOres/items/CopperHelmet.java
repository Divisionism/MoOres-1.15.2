package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class CopperHelmet extends ArmorItem {

    public CopperHelmet() { super(CustomArmorMaterials.COPPER, EquipmentSlotType.HEAD, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
