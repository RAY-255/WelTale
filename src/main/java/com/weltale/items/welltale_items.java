package com.weltale.items;

import com.weltale.Weltale;
import com.weltale.items.armor.other_crown;
import com.weltale.items.armor.other_crown;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.minecraft.item.ArmorItem.Type.HELMET;
import static net.minecraft.item.Items.register;

public class welltale_items {
    public static final Item RUBY = registerItem("ruby_of_curvature", new Item(new FabricItemSettings()));
    public static final ArmorMaterial OTHER = new other_crown();
    public static final Item OTHER_CROWN = registerItem("other_crown",new ArmorItem(OTHER,ArmorItem.Type.HELMET,new FabricItemSettings()));
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
