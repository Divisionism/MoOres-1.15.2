package com.Divisionism.MoOres.items;

import com.Divisionism.MoOres.tabs.CreativeTabs;
import net.minecraft.client.util.ITooltipFlag;
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

public class ImpureCrystalMeth extends Item {

    public ImpureCrystalMeth() { super(new Item.Properties().group(CreativeTabs.CRYSTAL_TAB).food(new Food.Builder().fastToEat()
            .setAlwaysEdible()
            .effect(new EffectInstance(Effects.NAUSEA, 18000, 4), 1.0f)
            .effect(new EffectInstance(Effects.WEAKNESS, 18000, 4), 1.0f)
            .effect(new EffectInstance(Effects.SLOWNESS, 18000, 4), 1.0f)
            .effect(new EffectInstance(Effects.MINING_FATIGUE, 18000, 4), 1.0f)
            .build())
        );
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        tooltip.add(new TextComponent() {
            @Override
            public String getUnformattedComponentText() {
                return "\u00A7e\u00A7o[hmmmmm....] \u00A7a(Edible?)";
            }

            @Override
            public ITextComponent shallowCopy() {
                return null;
            }
        });
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }
}
