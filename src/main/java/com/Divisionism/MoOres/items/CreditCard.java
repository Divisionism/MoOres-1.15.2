package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.MoOres;
import com.Divisionism.MoOres.tabs.CreativeTabs;
import com.Divisionism.MoOres.util.RegistryHandler;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreditCard extends Item {

    private final Random rand = new Random();
    public static int cash = 1000;
    public static List<Item> items = new ArrayList<Item>();

    public CreditCard() {
        super(new Item.Properties().group(CreativeTabs.TOOLS_TAB));

        for (Item item : ForgeRegistries.ITEMS) {
            items.add(item);
        }

        MoOres.LOGGER.info(items.toString());
    }

    //Purchase items
    @Override
    @OnlyIn(Dist.CLIENT)
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {

        if (cash >= 100) {
            int randItem = rand.nextInt(items.size());
            Item item = items.get(randItem);

            MoOres.LOGGER.info(items.toString());
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
