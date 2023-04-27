package com.github.sib_energy_craft.energy_items.battery;

import com.github.sib_energy_craft.energy_api.items.ChargeableItem;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public class BatteryItem extends Item implements ChargeableItem {
    @Getter
    private final int maxCharge;

    public BatteryItem(@NotNull Settings settings, int maxCharge) {
        super(settings);
        this.maxCharge = maxCharge;
    }

    @Override
    public void onCraft(@NotNull ItemStack stack,
                        @NotNull World world,
                        @NotNull PlayerEntity player) {
        ChargeableItem.super.onCraft(stack);
    }

    @Override
    public void appendTooltip(@NotNull ItemStack stack,
                              @Nullable World world,
                              @NotNull List<Text> tooltip,
                              @NotNull TooltipContext context) {
        ChargeableItem.super.appendTooltip(stack, tooltip);
    }
}
