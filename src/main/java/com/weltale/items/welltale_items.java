package com.weltale.items;

import com.weltale.Weltale;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class welltale_items {
    public static final Item RUBY = registerItem("ruby_of_curvature", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Weltale.MOD_ID, name), item);}



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);

    }





    public static void registerModItems() {
        Weltale.LOGGER.info("Поглощение ментальной энергии... " + Weltale.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(welltale_items::addItemsToIngredientItemGroup);
    }
}
