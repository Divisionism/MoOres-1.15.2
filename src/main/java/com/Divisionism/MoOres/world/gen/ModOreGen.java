package com.Divisionism.MoOres.world.gen;

import com.Divisionism.MoOres.util.BiomeInit;
import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ModOreGen {

    public static void generateOre() {

        ConfiguredPlacement customConfigGenN = Placement.COUNT_RANGE.configure(new CountRangeConfig(6, 10, 0, 40));
        ConfiguredPlacement customConfigGenR = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 10, 0, 25));
        ConfiguredPlacement customConfigGenRR = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 10, 0, 30));
        ConfiguredPlacement customConfigGenUR = Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 0, 0, 10));

        for (Biome biome : ForgeRegistries.BIOMES) {

            AddOre(biome, customConfigGenN, RegistryHandler.COPPER_ORE_BLOCK.get(), 10);
            AddOre(biome, customConfigGenN, RegistryHandler.ALUMINIUM_ORE_BLOCK.get(), 6);
            AddOre(biome, customConfigGenR, RegistryHandler.TITANIUM_ORE_BLOCK.get(), 4);
            AddOre(biome, customConfigGenRR, RegistryHandler.PLATINUM_ORE_BLOCK.get(), 2);
            AddOre(biome, customConfigGenN, RegistryHandler.SILVER_ORE_BLOCK.get(), 7);
            AddOre(biome, customConfigGenN, RegistryHandler.LEAD_ORE_BLOCK.get(), 10);
            AddOre(biome, customConfigGenRR, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get(), 3);
            AddOre(biome, customConfigGenUR, RegistryHandler.FARADIUM_ORE_BLOCK.get(), 1);
            AddOre(biome, customConfigGenUR, RegistryHandler.DIRACIUM_ORE_BLOCK.get(), 1);

            if (biome == BiomeInit.WASTELANDS_BIOME.get() || biome == BiomeInit.RED_SAND_DESERT.get()) {
                // Custom ore gen
            }

            if (biome == BiomeInit.LOL_BIOME.get()) {
                AddOre(biome, customConfigGenN, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get(), 15);
            }
        }
    }

    public static void AddOre(Biome biome, ConfiguredPlacement placement, Block block, int veinSize) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, block.getDefaultState(), veinSize)).withPlacement(placement));
    }
}
