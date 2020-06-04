package com.Divisionism.MoOres.util;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.tileentity.crateContainerTileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MoOres.MOD_ID);

    public static final RegistryObject<TileEntityType<crateContainerTileEntity>> CRATE_TILE_ENTITY = TILE_ENTITY_TYPES.register("crate_tile", () -> TileEntityType.Builder.create(crateContainerTileEntity::new, RegistryHandler.CRATE.get()).build(null));
}
