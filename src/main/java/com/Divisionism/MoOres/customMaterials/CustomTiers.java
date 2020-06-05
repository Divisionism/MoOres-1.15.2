package com.Divisionism.MoOres.customMaterials;

import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum CustomTiers implements IItemTier {

    COPPER(2, 500, 7.0F, 0.0F, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER.get());
    }),
    STEEL(2, 1000, 10.0f, 0.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.STEEL.get());
    }),
    ALUMINIUM(2, 2000, 13.0f, 0.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.ALUMINIUM.get());
    }),
    TITANIUM(3, 5000, 16.0f, 0.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.TITANIUM.get());
    }),
    SILVER(3, 3000, 14.0f, 0.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.SILVER.get());
    }),
    PLATINUM(3, 7000, 20.0f, 0.0f, 15, () -> {
       return Ingredient.fromItems(RegistryHandler.PLATINUM.get());
    }),
    LEAD(3, 6000, 16.0f, 0.0f, 15, () -> {
        return Ingredient.fromItems(RegistryHandler.LEAD.get());
    }),
    FARADIUM(4, 10000, 100.0f, 0.0f, 100, () -> {
        return Ingredient.fromItems(RegistryHandler.FARADIUM.get());
    }),
    DIRACIUM(5, 99999, 1000.0f, 0.0f, 50, () -> {
       return  Ingredient.fromItems(RegistryHandler.DIRACIUM.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;

    private final LazyValue<Ingredient> repairMaterial;
    private CustomTiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability,
                        Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }
    @Override
    public int getMaxUses() {
        return this.maxUses;
    }
    @Override
    public float getEfficiency() {
        return this.efficiency;
    }
    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }
    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }
    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
