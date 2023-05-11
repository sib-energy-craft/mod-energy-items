package com.github.sib_energy_craft.energy_items.load;

import com.github.sib_energy_craft.energy_api.items.ChargeableItem;
import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.client.item.ClampedModelPredicateProvider;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class ModelPredicateProviderRegistries implements DefaultModInitializer {
    public static final ClampedModelPredicateProvider CHARGED;

    static {
        CHARGED = ModelPredicateProviderRegistry.register(Identifiers.of("charged"),
                ModelPredicateProviderRegistries::getCharged);
    }

    private static float getCharged(@NotNull ItemStack itemStack,
                                    @Nullable ClientWorld clientWorld,
                                    @Nullable LivingEntity livingEntity,
                                    int i) {
        if(itemStack.getItem() instanceof ChargeableItem chargeableItem) {
            int maxCharge = chargeableItem.getMaxCharge();
            int charge = chargeableItem.getCharge(itemStack);
            return 1f * charge / maxCharge;
        }
        return 0f;
    }
}
