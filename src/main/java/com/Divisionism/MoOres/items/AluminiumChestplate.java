package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class AluminiumChestplate extends ArmorItem {

    public AluminiumChestplate() { super(CustomArmorMaterials.ALUMINIUM, EquipmentSlotType.CHEST, new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }
}
