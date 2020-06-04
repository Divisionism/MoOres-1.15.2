package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class Antidote extends Item {

    public static int TimesEaten = 0;

    public Antidote() { super(new Item.Properties().group(CreativeTabs.CONSUMABLES_TAB).food(new Food.Builder().setAlwaysEdible()
            .fastToEat()
            .build()
        ));
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity player) {

        if ((player.isPotionActive(Effects.POISON) || player.isPotionActive(Effects.WITHER) || player.isPotionActive(Effects.WEAKNESS) || player.isPotionActive(Effects.SLOWNESS) || player.isPotionActive(Effects.HUNGER)
        || player.isPotionActive(Effects.NAUSEA) || player.isPotionActive(Effects.INSTANT_DAMAGE) || player.isPotionActive(Effects.BLINDNESS) || player.isPotionActive(Effects.MINING_FATIGUE)) && TimesEaten < 5) {
            player.removeActivePotionEffect(Effects.POISON);
            player.removeActivePotionEffect(Effects.WITHER);
            player.removeActivePotionEffect(Effects.WEAKNESS);
            player.removeActivePotionEffect(Effects.SLOWNESS);
            player.removeActivePotionEffect(Effects.HUNGER);
            player.removeActivePotionEffect(Effects.NAUSEA);
            player.removeActivePotionEffect(Effects.INSTANT_DAMAGE);
            player.removeActivePotionEffect(Effects.BLINDNESS);
            player.removeActivePotionEffect(Effects.MINING_FATIGUE);
        } else Overdose(player);
        return super.onItemUseFinish(stack, worldIn, player);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponent() {
            @Override
            public String getUnformattedComponentText() {
                return "\u00A7e\u00A7o[Now with 100% more sugar] \u00A7a(Edible)" + " - " + TimesEaten;
            }

            @Override
            public ITextComponent shallowCopy() {
                return null;
            }
        });
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    private void Overdose(LivingEntity player) {

        TimesEaten++;

        System.out.println(TimesEaten);

        if (TimesEaten >= 2) player.addPotionEffect(new EffectInstance(Effects.NAUSEA, 180000, 3));
        if (TimesEaten >= 4) player.addPotionEffect(new EffectInstance(Effects.POISON, 180000, 3));
        if (TimesEaten >= 6) player.addPotionEffect(new EffectInstance(Effects.WITHER, 180000, 3));
        if (TimesEaten >= 10) {
            player.addPotionEffect(new EffectInstance(Effects.INSTANT_DAMAGE, 180000, 30));
            TimesEaten = 0;
        }
    }
}
