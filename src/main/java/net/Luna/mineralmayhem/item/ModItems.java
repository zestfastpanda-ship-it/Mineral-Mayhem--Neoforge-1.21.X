package net.Luna.mineralmayhem.item;

import net.Luna.mineralmayhem.MineralMayhem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MineralMayhem.MOD_ID);

    public static final DeferredItem<Items> KIMBERLITE = ITEMS.register("kimberlite",
            ()-> new Items(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}





