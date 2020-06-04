package com.Divisionism.MoOres.util;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.world.biomes.LolBiome;
import com.Divisionism.MoOres.world.biomes.RedSandDesert;
import com.Divisionism.MoOres.world.biomes.WasteLandsBiome;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, MoOres.MOD_ID);

    public static final RegistryObject<Biome> WASTELANDS_BIOME = BIOMES.register("wastelands_biome", () -> new WasteLandsBiome(new Biome.Builder().precipitation(Biome.RainType.NONE)
            .depth(1.1f)
            .scale(0.5f)
            .downfall(0)
            .temperature(2)
            .waterColor(11562024)
            .waterFogColor(16771544)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.STONE.getDefaultState()))
                    .category(Biome.Category.DESERT)
            .parent(null)
    ));

    public static final RegistryObject<Biome> LOL_BIOME = BIOMES.register("mountain_range", () -> new LolBiome(new Biome.Builder().precipitation(Biome.RainType.SNOW)
            .depth(2.5f)
            .scale(0.25f)
            .downfall(2)
            .temperature(-1.0f)
            .waterColor(3126783)
            .waterFogColor(10077139)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.AIR.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState(), Blocks.STONE.getDefaultState()))
                    .category(Biome.Category.PLAINS)
            .parent("mountains")
    ));

    public static final RegistryObject<Biome> RED_SAND_DESERT = BIOMES.register("wastelands_desert", () -> new RedSandDesert(new Biome.Builder().parent("wastelands_biome")
            .depth(0.7f)
            .temperature(2)
            .downfall(0)
            .precipitation(Biome.RainType.NONE)
            .scale(0.1f)
            .waterColor(11562024)
            .waterFogColor(16771544)
            .surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.STONE.getDefaultState()))
                .category(Biome.Category.DESERT)
    ));

    public static void registerBiomes() {
        registerBiome(WASTELANDS_BIOME.get(), BiomeManager.BiomeType.WARM, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(LOL_BIOME.get(), BiomeManager.BiomeType.COOL, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD);
        registerBiome(RED_SAND_DESERT.get(), BiomeManager.BiomeType.WARM, BiomeDictionary.Type.DEAD, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, BiomeManager.BiomeType bType, BiomeDictionary.Type... types) {
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addBiome(bType, new BiomeManager.BiomeEntry(biome, 100));
    }
}
