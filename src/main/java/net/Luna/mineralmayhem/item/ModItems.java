package net.Luna.mineralmayhem.item;

import net.Luna.mineralmayhem.MineralMayhem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MineralMayhem.MOD_ID);

    public static final DeferredItem<Item> KIMBERLITE = ITEMS.register("kimberlite",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> LIMESTONE = ITEMS.register("limestone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SHALE = ITEMS.register("shale",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MUDSTONE = ITEMS.register("mudstone",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> MARBLE = ITEMS.register("marble",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GABBRO = ITEMS.register("gabbro",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}





