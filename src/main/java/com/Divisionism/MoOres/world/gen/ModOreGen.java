package com.Divisionism.MoOres.world.gen;

import com.Divisionism.MoOres.util.BiomeInit;
import com.Divisionism.MoOres.util.RegistryHandler;
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
        for (Biome biome : ForgeRegistries.BIOMES) {

            ConfiguredPlacement customConfigGenN = Placement.COUNT_RANGE.configure(new CountRangeConfig(6, 10, 0, 40));
            ConfiguredPlacement customConfigGenR = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 10, 0, 25));
            ConfiguredPlacement customConfigGenRR = Placement.COUNT_RANGE.configure(new CountRangeConfig(3, 10, 0, 30));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.COPPER_ORE_BLOCK.get().getDefaultState(), 10)).withPlacement(customConfigGenN));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get().getDefaultState(), 3)).withPlacement(customConfigGenR));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.ALUMINIUM_ORE_BLOCK.get().getDefaultState(), 6)).withPlacement(customConfigGenN));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.TITANIUM_ORE_BLOCK.get().getDefaultState(), 4)).withPlacement(customConfigGenRR));

            if (biome == BiomeInit.WASTELANDS_BIOME.get() || biome == BiomeInit.RED_SAND_DESERT.get()) {
                // Add custom ore gen here
            } else if (biome == BiomeInit.LOL_BIOME.get()) {
                ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(10, 10, 0, 25));
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.CRYSTAL_METH_ORE_BLOCK.get().getDefaultState(), 7)).withPlacement(customConfig));
            }
        }
    }
}
