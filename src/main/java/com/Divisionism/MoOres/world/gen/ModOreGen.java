package com.Divisionism.MoOres.world.gen;

import com.Divisionism.MoOres.util.BiomeInit;
import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
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
        ConfiguredPlacement customConfigGenMount = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 10, 0, 100));

        for (Biome biome : ForgeRegistries.BIOMES) {

            AddOre(biome, customConfigGenN, RegistryHandler.COPPER_ORE_BLOCK.get(), 10, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenN, RegistryHandler.ALUMINIUM_ORE_BLOCK.get(), 6, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenR, RegistryHandler.TITANIUM_ORE_BLOCK.get(), 4, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenRR, RegistryHandler.PLATINUM_ORE_BLOCK.get(), 2, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenN, RegistryHandler.SILVER_ORE_BLOCK.get(), 7, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenN, RegistryHandler.LEAD_ORE_BLOCK.get(), 10, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenRR, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get(), 3, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenUR, RegistryHandler.FARADIUM_ORE_BLOCK.get(), 1, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            AddOre(biome, customConfigGenUR, RegistryHandler.DIRACIUM_ORE_BLOCK.get(), 1, OreFeatureConfig.FillerBlockType.NATURAL_STONE);

            if (biome == BiomeInit.WASTELANDS_BIOME.get() || biome == BiomeInit.RED_SAND_DESERT.get()) {
                AddOre(biome, customConfigGenRR, RegistryHandler.FARADIUM_ORE_BLOCK.get(), 3, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
                AddOre(biome, customConfigGenRR, RegistryHandler.DIRACIUM_ORE_BLOCK.get(), 2, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            } else if (biome == BiomeInit.LOL_BIOME.get()) {
                AddOre(biome, customConfigGenMount, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get(), 15, OreFeatureConfig.FillerBlockType.NATURAL_STONE);
            } else if (biome == Biomes.NETHER) {
                AddOre(biome, customConfigGenN, RegistryHandler.NETHER_COPPER_ORE_BLOCK.get(), 10, OreFeatureConfig.FillerBlockType.NETHERRACK);
            }
        }
    }

    private static void AddOre(Biome biome, ConfiguredPlacement placement, Block block, int veinSize, OreFeatureConfig.FillerBlockType filler) {
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(filler, block.getDefaultState(), veinSize)).withPlacement(placement));
    }
}
