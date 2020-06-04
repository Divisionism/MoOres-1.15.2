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

public class CrystalMethPowder extends Item {

    public CrystalMethPowder() { super(new Item.Properties().group(CreativeTabs.CONSUMABLES_TAB).food(new Food.Builder().hunger(2)
            .saturation(20.0f)
            .setAlwaysEdible()
            .fastToEat()
            .effect(new EffectInstance(Effects.NAUSEA, 600, 2), 1.0f)
            .effect(new EffectInstance(Effects.SPEED, 1200, 3), 1.0f)
            .effect(new EffectInstance(Effects.ABSORPTION, 1200, 2), 1.0f)
            .effect(new EffectInstance(Effects.HEALTH_BOOST, 1200, 1), 1.0f)
            .effect(new EffectInstance(Effects.WEAKNESS, 200, 1), 1.0f)
            .effect(new EffectInstance(Effects.MINING_FATIGUE, 1200, 1), 1.0f)
            .effect(new EffectInstance(Effects.RESISTANCE, 1200, 1), 0.6f)
            .effect(new EffectInstance(Effects.POISON, 180000, 30), 0.2f)
            .effect(new EffectInstance(Effects.WITHER, 180000, 30), 0.2f)
            .effect(new EffectInstance(Effects.INSTANT_DAMAGE, 180000, 40), 0.1f)
            .effect(new EffectInstance(Effects.REGENERATION, 180000, 60), 0.000000001f)
            .build())
        );
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponent() {
            @Override
            public String getUnformattedComponentText() {
                return "\u00A7e\u00A7o[What could go wrong, right?] \u00A7a(Edible)";
            }

            @Override
            public ITextComponent shallowCopy() {
                return null;
            }
        });
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {

        Antidote.TimesEaten = 0;
        return super.onItemUseFinish(stack, worldIn, entityLiving);
    }
}
