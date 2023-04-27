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
    public static final BatteryItem ADVANCED_RECHARGEABLE_BATTERY;

    public static final Item ENERGY_CRYSTAL;

    public static final Item ENERGY_CIRCUIT;
    public static final Item ADVANCED_ENERGY_CIRCUIT;


    public static final Item COIL;
    public static final Item ENERGY_MOTOR;
    public static final Item ENERGY_TOOL_BODY;

    public static final Item MIXED_METAL_INGOT;
    public static final Item ADVANCED_ALLOY;

    static {
        var simpleMaterial = new Item.Settings();

        var batteryItem = new BatteryItem(simpleMaterial, 10_000);
        RECHARGEABLE_BATTERY = register(ItemGroups.INGREDIENTS,
                Identifiers.of("rechargeable_battery"), batteryItem);

        var advancedBatteryItem = new BatteryItem(simpleMaterial, 100_000);
        ADVANCED_RECHARGEABLE_BATTERY = register(ItemGroups.INGREDIENTS,
                Identifiers.of("advanced_rechargeable_battery"), advancedBatteryItem);

        ENERGY_CRYSTAL = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_crystal"), simpleMaterial);
        ENERGY_CIRCUIT = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_circuit"), simpleMaterial);
        ADVANCED_ENERGY_CIRCUIT = register(ItemGroups.INGREDIENTS,
                Identifiers.of("advanced_energy_circuit"), simpleMaterial);

        COIL = register(ItemGroups.INGREDIENTS, Identifiers.of("coil"), simpleMaterial);
        ENERGY_MOTOR = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_motor"), simpleMaterial);

        var energyToolBody = new BatteryItem(simpleMaterial, 30_000);
        ENERGY_TOOL_BODY = register(ItemGroups.INGREDIENTS, Identifiers.of("energy_tool_body"), energyToolBody);
        MIXED_METAL_INGOT = register(ItemGroups.INGREDIENTS, Identifiers.of("mixed_metal_ingot"), simpleMaterial);
        ADVANCED_ALLOY = register(ItemGroups.INGREDIENTS, Identifiers.of("advanced_alloy"), simpleMaterial);
    }
}
