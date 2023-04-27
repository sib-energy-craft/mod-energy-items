package com.github.sib_energy_craft.energy_items.load;

import com.github.sib_energy_craft.energy_api.utils.Identifiers;
import com.github.sib_energy_craft.energy_items.battery.BatteryItem;
import com.github.sib_energy_craft.sec_utils.load.ModRegistrar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;

import static com.github.sib_energy_craft.sec_utils.utils.ItemUtils.register;

/**
 * @since 0.0.1
 * @author sibmaks
 */
public final class Items implements ModRegistrar {
    public static final BatteryItem RECHARGEABLE_BATTERY;
    public static final Item ENERGY_CRYSTAL;
    public static final Item ENERGY_CIRCUIT;
    public static final Item ADVANCED_ENERGY_CIRCUIT;

    static {
        var simpleMaterial = new Item.Settings();
        var batteryItem = new BatteryItem(simpleMaterial, 10_000);
        RECHARGEABLE_BATTERY = register(ItemGroups.INGREDIENTS, Identifiers.of("rechargeable_battery"), batteryItem);

        ENERGY_CRYSTAL = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_crystal"), simpleMaterial);
        ENERGY_CIRCUIT = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_circuit"), simpleMaterial);
        ADVANCED_ENERGY_CIRCUIT = register(ItemGroups.INGREDIENTS, Identifiers.of("advanced_energy_circuit"), simpleMaterial);
    }
}
