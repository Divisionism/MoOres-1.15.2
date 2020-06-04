package com.Divisionism.MoOres.blocks;

import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.block.Block;

public class SteelBlock extends Block {

    public SteelBlock() { super(Block.Properties.from(RegistryHandler.COPPER_BLOCK.get())); }
}
