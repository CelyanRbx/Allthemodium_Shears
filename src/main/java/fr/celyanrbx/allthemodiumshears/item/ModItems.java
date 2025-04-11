package fr.celyanrbx.allthemodiumshears.item;

import com.thevortex.allthemodium.material.ToolTiers;
import fr.celyanrbx.allthemodiumshears.AllthemodiumShears;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.server.command.TextComponentHelper;

import java.util.List;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AllthemodiumShears.MODID);

    public static final RegistryObject<Item> ALLTHEMODIUM_SHEARS = ITEMS.register("allthemodium_shears",
            () -> new ShearsItem(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
                    tooltip.add(TextComponentHelper.createComponentTranslation(null,"indestructible" , new Object()).withStyle(ChatFormatting.GOLD));

                    super.appendHoverText(stack, worldIn, tooltip, flagIn);
                }
            });

    public static final RegistryObject<Item> VIBRANIUM_SHEARS = ITEMS.register("vibranium_shears",
            () -> new ShearsItem(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
                    tooltip.add(TextComponentHelper.createComponentTranslation(null,"indestructible" , new Object()).withStyle(ChatFormatting.GOLD));

                    super.appendHoverText(stack, worldIn, tooltip, flagIn);
                }
            });

    public static final RegistryObject<Item> UNOBTAINIUM_SHEARS = ITEMS.register("unobtainium_shears",
            () -> new ShearsItem(new Item.Properties()) {
                @Override
                public void appendHoverText(ItemStack stack, Level worldIn, List<Component> tooltip, TooltipFlag flagIn){
                    tooltip.add(TextComponentHelper.createComponentTranslation(null,"indestructible" , new Object()).withStyle(ChatFormatting.GOLD));

                    super.appendHoverText(stack, worldIn, tooltip, flagIn);
                }
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
