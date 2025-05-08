package fr.celyanrbx.allthemodiumshears.item;

import fr.celyanrbx.allthemodiumshears.AllthemodiumShears;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllthemodiumShears.MODID);

    public static final Supplier<CreativeModeTab> ALLTHEMODIUM_SHEARS_TAB = CREATIVE_MODE_TAB.register("allthemodium_shears_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALLTHEMODIUM_SHEARS.get()))
                    .title(Component.translatable("creativetab.allthemodiumshears.allthemodium_shears"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ALLTHEMODIUM_SHEARS);
                        output.accept(ModItems.VIBRANIUM_SHEARS);
                        output.accept(ModItems.UNOBTAINIUM_SHEARS);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
