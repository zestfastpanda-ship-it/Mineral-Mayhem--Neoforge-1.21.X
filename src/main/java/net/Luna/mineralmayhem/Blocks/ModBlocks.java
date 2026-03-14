package net.Luna.mineralmayhem.Blocks;

import net.Luna.mineralmayhem.MineralMayhem;
import net.Luna.mineralmayhem.item.ModItems;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(MineralMayhem.MOD_ID) ;


    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block ) {
        ModItems.ITEMS.register;
    }


    public static void register (IEventBus eventBus) {
        BLOCKS.register(eventBus) ;
    }

}
