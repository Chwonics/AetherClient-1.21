package net.chwonics.aetherclient.item;

import net.chwonics.aetherclient.AetherClient;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import javax.xml.namespace.QName;

public class ModItems {
    public static final Item BIG_DILDO = registerItem("big_dildo", new Item(new Item.Settings()));
    public static final Item cooked_big_dildo = registerItem("cooked_big_dildo", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AetherClient.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        AetherClient.LOGGER.info("Registering Mod Items " + AetherClient.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BIG_DILDO);
            entries.add(cooked_big_dildo);
        });
    }
}
