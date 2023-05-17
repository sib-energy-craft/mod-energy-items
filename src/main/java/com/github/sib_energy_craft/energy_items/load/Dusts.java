package com.github.sib_energy_craft.energy_items.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.sec_utils.load.DefaultModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.util.Rarity;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class Dusts implements DefaultModInitializer {
    public static final Item DIAMOND_DUST;
    public static final Item COAL_DUST;
    public static final Item SULFUR_DUST;
    public static final Item ENERGY_DUST;
    public static final Item FLINT_DUST;

    static {
        var commonItem = new Item.Settings()
                .rarity(Rarity.COMMON);

        DIAMOND_DUST = register(ItemGroups.INGREDIENTS, Identifiers.of("diamond_dust"), commonItem);
        COAL_DUST = register(ItemGroups.INGREDIENTS, Identifiers.of("coal_dust"), commonItem);
        SULFUR_DUST = register(ItemGroups.INGREDIENTS, Identifiers.of("sulfur_dust"), commonItem);
        ENERGY_DUST = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_dust"), commonItem);
        FLINT_DUST = register(ItemGroups.INGREDIENTS, Identifiers.of("flint_dust"), commonItem);
    }
}
