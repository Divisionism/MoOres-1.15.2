package com.Divisionism.MoOres.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class ORE_PROPERTIES extends Block {

    public ORE_PROPERTIES() { super(Block.Properties.create(Material.ROCK)
            .hardnessAndResistance(5f,6f)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.STONE)
        );
    }
}
