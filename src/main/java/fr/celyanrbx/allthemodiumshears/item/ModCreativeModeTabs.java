package fr.celyanrbx.allthemodiumshears.item;

import fr.celyanrbx.allthemodiumshears.AllthemodiumShears;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllthemodiumShears.MODID);

    public static final RegistryObject<CreativeModeTab> ALLLTHEMODIUM_SHEARS_TAB = CREATIVE_MODE_TABS.register("allthemodium_shears_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALLTHEMODIUM_SHEARS.get()))
                    .title(Component.translatable("Allthemodium: Shears"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.ALLTHEMODIUM_SHEARS.get());
                        pOutput.accept(ModItems.VIBRANIUM_SHEARS.get());
                        pOutput.accept(ModItems.UNOBTAINIUM_SHEARS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
