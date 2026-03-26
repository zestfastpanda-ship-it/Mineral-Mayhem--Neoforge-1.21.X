package net.Luna.mineralmayhem.CreativeModeTabs;

import net.Luna.mineralmayhem.Blocks.ModBlocks;
import net.Luna.mineralmayhem.MineralMayhem;
import net.Luna.mineralmayhem.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MineralMayhemCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineralMayhem.MOD_ID) ;



    public static final Supplier<CreativeModeTab>  MM_ROCKS_TAB = CREATIVE_MODE_TAB.register("mm_rocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.KIMBERLITE_BLOCK.get()))
                    .title(Component.translatable("creativetab.mineralmayhem.rocks"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.KIMBERLITE_BLOCK);
                        output.accept(ModBlocks.LIMESTONE_BLOCK);
                        output.accept(ModBlocks.SHALE_BLOCK);
                    }).build());

    public static final Supplier<CreativeModeTab>  MM_NATURALMINERALS_TAB = CREATIVE_MODE_TAB.register("mm_naturalminerals_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.KIMBERLITE_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MineralMayhem.MOD_ID, "mm_rocks_tab"))
                    .title(Component.translatable("creativetab.mineralmayhem.natural_minerals"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.KIMBERLITE_BLOCK);
                    }).build());



    public static void  register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
