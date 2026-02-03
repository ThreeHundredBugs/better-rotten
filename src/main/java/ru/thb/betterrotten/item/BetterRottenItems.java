package ru.thb.betterrotten.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import ru.thb.betterrotten.BetterRotten;

public class BetterRottenItems {
    public static Item LEATHER_SCRAP;

    public static void registerItems() {
        Identifier id = Identifier.of(BetterRotten.MOD_ID, "leather_scrap");
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);

        LEATHER_SCRAP = Registry.register(Registries.ITEM, key,
                new Item(new Item.Settings().registryKey(key)));    }
}