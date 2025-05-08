package fr.celyanrbx.allthemodiumshears.item;

import fr.celyanrbx.allthemodiumshears.AllthemodiumShears;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AllthemodiumShears.MODID);

    public static final DeferredItem<Item> ALLTHEMODIUM_SHEARS = ITEMS.register("allthemodium_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static final DeferredItem<Item> VIBRANIUM_SHEARS = ITEMS.register("vibranium_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).component(DataComponents.UNBREAKABLE, new Unbreakable(true))));

    public static final DeferredItem<Item> UNOBTAINIUM_SHEARS = ITEMS.register("unobtainium_shears",
            () -> new ShearsItem(new Item.Properties().stacksTo(1).component(DataComponents.UNBREAKABLE, new Unbreakable(true))));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
