package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.tabs.CreativeTabs;
//import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

public class CreditCard extends Item {

    private final Random rand = new Random();
    public static int cash = 1000;
    public static Item[] items = {Items.BLACK_BED, Items.DIAMOND, Items.GOLD_BLOCK, Items.EMERALD_ORE, Items.STRIPPED_ACACIA_WOOD, Items.BLUE_GLAZED_TERRACOTTA,
    Items.BLUE_WOOL, Items.BLUE_BANNER, Items.BIRCH_PLANKS, Items.BREAD}; /* RegistryHandler.CRYSTAL_METH_ORE_BLOCK_ITEM.get(), RegistryHandler.LEAD_ORE_BLOCK_ITEM.get(),
    RegistryHandler.COPPER_BOOTS.get(), RegistryHandler.ALUMINIUM.get(), Items.BLACK_STAINED_GLASS, Items.BROWN_BED, RegistryHandler.COPPER_ORE_BLOCK_ITEM.get()}; */

    public CreditCard() { super(new Item.Properties().group(CreativeTabs.TOOLS_TAB)); }

    //Purchase items
    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (cash >= 100) {
            int randItem = rand.nextInt(items.length);
            Item item = items[randItem];

            System.out.println(item);
            System.out.println("GOOD");

            playerIn.inventory.addItemStackToInventory(item.getDefaultInstance());
            cash -= 100;
        } else {
            cash = 0;
            System.out.println("Not enough cash");
        }
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }

    //Add comment
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponent() {
            @Override
            public String getUnformattedComponentText() {
                return "\u00A7e\u00A7o[W.I.P. Right click to get a random item] - Cash: $" + cash;
            }

            @Override
            public ITextComponent shallowCopy() {
                return null;
            }
        });
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
