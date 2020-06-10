package com.Divisionism.MoOres.util;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.blocks.*;
//import com.Divisionism.MoOres.container.alloyContainer;
//import com.Divisionism.MoOres.container.crateContainer;
import com.Divisionism.MoOres.items.*;
//import com.Divisionism.MoOres.objects.blocks.Crate;
//import com.Divisionism.MoOres.tileentity.alloyContainerTileEntity;
//import com.Divisionism.MoOres.tileentity.crateContainerTileEntity;
import net.minecraft.block.Block;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
//import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MoOres.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, MoOres.MOD_ID);
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, MoOres.MOD_ID);
    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MoOres.MOD_ID);

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> COPPER = ITEMS.register("copper_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> CRYSTAL_METH = ITEMS.register("crystal_meth", CrystalMeth::new);
    public static final RegistryObject<Item> IMPURE_CRYSTAL_METH = ITEMS.register("impure_crystal_meth", ItemBaseCrystals::new);
    public static final RegistryObject<Item> STEEL = ITEMS.register("steel_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> CRYSTAL_METH_POWDER = ITEMS.register("crystal_meth_powder", CrystalMethPowder::new);
    public static final RegistryObject<Item> ANTIDOTE = ITEMS.register("antidote", Antidote::new);
    public static final RegistryObject<Item> IMPURE_CRYSTAL_METH_POWDER = ITEMS.register("impure_crystal_meth_powder", ImpureCrystalMeth::new);
    public static final RegistryObject<Item> METHAMPHETAMINE_SILICA = ITEMS.register("methamphetamine_silica", ItemBaseCrystals::new);
    public static final RegistryObject<Item> MOMS_CREDIT_CARD = ITEMS.register("credit_card", CreditCard::new);
    public static final RegistryObject<Item> CASH = ITEMS.register("cash", Cash::new);
    public static final RegistryObject<Item> ALUMINIUM = ITEMS.register("aluminium_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> TITANIUM = ITEMS.register("titanium_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> PLATINUM = ITEMS.register("platinum_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> LEAD = ITEMS.register("lead_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> FARADIUM = ITEMS.register("faradium_ingot", ItemBaseIngots::new);
    public static final RegistryObject<Item> DIRACIUM = ITEMS.register("diracium_ingot", ItemBaseIngots::new);

    //Blocks
    public static final RegistryObject<Block> ORE_PROPERTIES = BLOCKS.register("ore_properties", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> CRYSTAL_METH_ORE_BLOCK = BLOCKS.register("crystal_meth_ore_block", ORE_PROPERTIES::new);
    //public static final RegistryObject<Block> CRATE = BLOCKS.register("crate", Crate::new);
    public static final RegistryObject<Block> COPPER_ORE_BLOCK = BLOCKS.register("copper_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
    public static final RegistryObject<Block> ALUMINIUM_ORE_BLOCK = BLOCKS.register("aluminium_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> TITANIUM_ORE_BLOCK = BLOCKS.register("titanium_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> PLATINUM_ORE_BLOCK = BLOCKS.register("platinum_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCKS.register("silver_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> LEAD_ORE_BLOCK = BLOCKS.register("lead_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> FARADIUM_ORE_BLOCK = BLOCKS.register("faradium_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> DIRACIUM_ORE_BLOCK = BLOCKS.register("diracium_ore_block", ORE_PROPERTIES::new);
    public static final RegistryObject<Block> ALLOY_FURNACE = BLOCKS.register("alloy_furnace", AlloyFurnace::new);

    //Block Items
    public static final RegistryObject<Item> CRYSTAL_METH_ORE_BLOCK_ITEM = ITEMS.register("crystal_meth_ore_block", () -> new BlockItemBase(CRYSTAL_METH_ORE_BLOCK.get()));
    //public static final RegistryObject<Item> CRATE_ITEM = ITEMS.register("crate", () -> new BlockItemBase(CRATE.get()));
    public static final RegistryObject<Item> COPPER_ORE_BLOCK_ITEM = ITEMS.register("copper_ore_block", () -> new BlockItemBase(COPPER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block", () -> new BlockItemBase(COPPER_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block", () -> new BlockItemBase(STEEL_BLOCK.get()));
    public static final RegistryObject<Item> ALUMINIUM_ORE_BLOCK_ITEM = ITEMS.register("aluminium_ore_block", () -> new BlockItemBase(ALUMINIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> TITANIUM_ORE_BLOCK_ITEM = ITEMS.register("titanium_ore_block", () -> new BlockItemBase(TITANIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> PLATINUM_ORE_BLOCK_ITEM = ITEMS.register("platinum_ore_block", () -> new BlockItemBase(PLATINUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> SILVER_ORE_BLOCK_ITEM = ITEMS.register("silver_ore_block", () -> new BlockItemBase(SILVER_ORE_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_ORE_BLOCK_ITEM = ITEMS.register("lead_ore_block", () -> new BlockItemBase(LEAD_ORE_BLOCK.get()));
    public static final RegistryObject<Item> FARADIUM_ORE_BLOCK_ITEM = ITEMS.register("faradium_ore_block", () -> new BlockItemBase(FARADIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> DIRACIUM_ORE_BLOCK_ITEM = ITEMS.register("diracium_ore_block", () -> new BlockItemBase(DIRACIUM_ORE_BLOCK.get()));
    public static final RegistryObject<Item> ALLOY_FURNACE_BLOCK_ITEM = ITEMS.register("alloy_furnace", () -> new BlockItemBase(ALLOY_FURNACE.get()));

    //Containers
    //public static RegistryObject<ContainerType<crateContainer>> CRATE_CONTAINER = CONTAINER_TYPES.register("crate_container", () -> IForgeContainerType.create(crateContainer::new));
    //public static RegistryObject<ContainerType<alloyContainer>> ALLOY_CONTAINER = CONTAINER_TYPES.register("alloy_container", () -> IForgeContainerType.create(alloyContainer::new));

    //Tile Entities
    //public static final RegistryObject<TileEntityType<crateContainerTileEntity>> CRATE_TILE_ENTITY = TILE_ENTITY_TYPES.register("crate_tile", () -> TileEntityType.Builder.create(crateContainerTileEntity::new, CRATE.get()).build(null));
    //public static final RegistryObject<TileEntityType<alloyContainerTileEntity>> ALLOY_TILE_ENTITY = TILE_ENTITY_TYPES.register("alloy_tile", () -> TileEntityType.Builder.create(alloyContainerTileEntity::new, ALLOY_FURNACE.get()).build(null));

    //Tools
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe", CopperPickaxe::new);
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword", CopperSword::new);
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe", CopperAxe::new);
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel", CopperShovel::new);
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe", CopperHoe::new);
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe", SteelPickaxe::new);
    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword", SteelSword::new);
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe", SteelAxe::new);
    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel", SteelShovel::new);
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe", SteelHoe::new);
    public static final RegistryObject<Item> ALUMINIUM_SWORD = ITEMS.register("aluminium_sword", AluminiumSword::new);
    public static final RegistryObject<Item> ALUMINIUM_PICKAXE = ITEMS.register("aluminium_pickaxe", AluminiumPickaxe::new);
    public static final RegistryObject<Item> ALUMINIUM_AXE = ITEMS.register("aluminium_axe", AluminiumAxe::new);
    public static final RegistryObject<Item> ALUMINIUM_SHOVEL = ITEMS.register("aluminium_shovel", AluminiumShovel::new);
    public static final RegistryObject<Item> ALUMINIUM_HOE = ITEMS.register("aluminium_hoe", AluminiumHoe::new);
    public static final RegistryObject<Item> DIRACIUM_SWORD = ITEMS.register("diracium_sword", DiraciumSword::new);
    public static final RegistryObject<Item> DIRACIUM_PICKAXE = ITEMS.register("diracium_pickaxe", DiraciumPickaxe::new);

    //Armor
    public static final RegistryObject<Item> COPPER_HELMET = ITEMS.register("copper_helmet", CopperHelmet::new);
    public static final RegistryObject<Item> COPPER_CHESTPLATE = ITEMS.register("copper_chestplate", CopperChestplate::new);
    public static final RegistryObject<Item> COPPER_LEGGINGS = ITEMS.register("copper_leggings", CopperLeggings::new);
    public static final RegistryObject<Item> COPPER_BOOTS = ITEMS.register("copper_boots", CopperBoots::new);
    public static final RegistryObject<Item> STEEL_HELMET = ITEMS.register("steel_helmet", SteelHelmet::new);
    public static final RegistryObject<Item> STEEL_CHESTPLATE = ITEMS.register("steel_chestplate", SteelChestplate::new);
    public static final RegistryObject<Item> STEEL_LEGGINGS = ITEMS.register("steel_leggings", SteelLeggings::new);
    public static final RegistryObject<Item> STEEL_BOOTS = ITEMS.register("steel_boots", SteelBoots::new);
    public static final RegistryObject<Item> ALUMINIUM_HELMET = ITEMS.register("aluminium_helmet", AluminiumHelmet::new);
    public static final RegistryObject<Item> ALUMINIUM_CHESTPLATE = ITEMS.register("aluminium_chestplate", AluminiumChestplate::new);
    public static final RegistryObject<Item> ALUMINIUM_LEGGINGS = ITEMS.register("aluminium_leggings", AluminiumLeggings::new);
    public static final RegistryObject<Item> ALUMINIUM_BOOTS = ITEMS.register("aluminium_boots", AluminiumBoots::new);
}
