package com.Divisionism.MoOres.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class UnlistedBlocks extends BlockItem {

    public UnlistedBlocks(Block block) {
        super(block, new Item.Properties().rarity(Rarity.EPIC));
    }
}
