package com.Divisionism.MoOres.util;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.container.crateContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MoOres.MOD_ID);

    public static RegistryObject<ContainerType<crateContainer>> CRATE_CONTAINER = CONTAINER_TYPES.register("crate_container", () -> IForgeContainerType.create(crateContainer::new));
}
