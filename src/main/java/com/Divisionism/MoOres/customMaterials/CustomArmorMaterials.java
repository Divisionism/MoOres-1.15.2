package com.Divisionism.MoOres.customMaterials;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum CustomArmorMaterials implements IArmorMaterial {
    COPPER(MoOres.MOD_ID + ":copper", 5, new int[] { 3, 6, 7, 3 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 6.9F, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER.get());
    }),
    STEEL(MoOres.MOD_ID + ":steel", 8, new int[] { 5, 8, 10, 5 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 10, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL.get());
    }),
    ALUMINIUM(MoOres.MOD_ID + ":aluminium", 12, new int[] { 7, 10, 12, 7 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 12, () -> {
        return Ingredient.fromItems(RegistryHandler.ALUMINIUM.get());
    }),
    TITANIUM(MoOres.MOD_ID + ":titanium", 15, new int[] { 10, 12, 13, 9 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.TITANIUM.get());
    }),
    SILVER(MoOres.MOD_ID + ":silver", 13, new int[] { 8, 11, 13, 8 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 13, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER.get());
    }),
    PLATINUM(MoOres.MOD_ID + ":platinum", 17, new int[] { 12, 15, 14, 11 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 17, () -> {
        return Ingredient.fromItems(RegistryHandler.PLATINUM.get());
    }),
    LEAD(MoOres.MOD_ID + ":lead", 15, new int[] { 9, 12, 12, 8 }, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 14, () -> {
        return Ingredient.fromItems(RegistryHandler.LEAD.get());
    }),
    FARADIUM(MoOres.MOD_ID + ":faradium", 100, new int[] { 50, 60, 40, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 100, () -> {
        return Ingredient.fromItems(RegistryHandler.FARADIUM.get());
    }),
    DIRACIUM(MoOres.MOD_ID + ":diracium", 999, new int[] { 99999, 99999, 99999, 99999}, 100, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 999, () -> {
        return Ingredient.fromItems(RegistryHandler.DIRACIUM.get());
    });

    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 100, 110, 101, 95 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;

    private CustomArmorMaterials(String nameIn, int maxDamageFactorIn, int[] damageReductionAmountIn,
                              int enchantabilityIn, SoundEvent soundEventIn, float toughnessIn,
                              Supplier<Ingredient> repairMaterialIn) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = soundEventIn;
        this.toughness = toughnessIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
