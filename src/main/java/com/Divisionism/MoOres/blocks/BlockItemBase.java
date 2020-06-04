package com.Divisionism.MoOres.blocks;

import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(CreativeTabs.BLOCKS_TAB));
    }
}
