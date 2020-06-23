package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.customMaterials.CustomArmorMaterials;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;

public class DiraciumChestplate extends ArmorItem {

    public DiraciumChestplate() {
        super(CustomArmorMaterials.DIRACIUM, EquipmentSlotType.CHEST, new Properties().group(CreativeTabs.TOOLS_TAB));
    }
}
