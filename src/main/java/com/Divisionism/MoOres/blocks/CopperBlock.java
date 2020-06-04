package com.Divisionism.MoOres.blocks;

import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;

public class CopperBlock extends Block {

    public CopperBlock() { super(Block.Properties.from(RegistryHandler.COPPER_ORE_BLOCK.get()).sound(SoundType.METAL)); }
}
