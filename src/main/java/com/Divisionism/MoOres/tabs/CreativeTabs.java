package com.Divisionism.MoOres.tabs;

import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CreativeTabs {

    public static final ItemGroup INGOT_TAB = new ItemGroup("ingot_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.COPPER.get());
        }
    };
    public static final ItemGroup CRYSTAL_TAB = new ItemGroup("crystal_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.CRYSTAL_METH.get());
        }
    };
    public static final ItemGroup BLOCKS_TAB = new ItemGroup("blocks_tab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.STEEL_BLOCK.get());
        }

    };
    public static final ItemGroup TOOLS_TAB = new ItemGroup("tools_tab") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandler.COPPER_PICKAXE.get()); }
    };
    public static final ItemGroup CONSUMABLES_TAB = new ItemGroup("consumables_tab") {
        @Override
        public ItemStack createIcon() { return new ItemStack(RegistryHandler.ANTIDOTE.get()); }
    };
}
