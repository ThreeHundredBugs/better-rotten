package ru.thb.betterrotten;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.recipe.RecipeManager;
import ru.thb.betterrotten.item.BetterRottenItems;

import static ru.thb.betterrotten.item.BetterRottenItems.LEATHER_SCRAP;

public class BetterRotten implements ModInitializer {

    public static final String MOD_ID = "betterrotten";

    @Override
    public void onInitialize() {
        CompostingChanceRegistry.INSTANCE.add(Items.ROTTEN_FLESH, 0.30f);
        BetterRottenItems.registerItems();
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->
                entries.add(LEATHER_SCRAP));
    }
}
