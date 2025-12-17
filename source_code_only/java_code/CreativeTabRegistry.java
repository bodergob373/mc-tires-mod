package com.bodercorp.rubber_tires;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class CreativeTabRegistry {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModClass.MODID);

    public static final RegistryObject<CreativeModeTab> ITEMS_TAB = CREATIVE_MODE_TABS.register("sussy_skibidi_tires_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + ModClass.MODID + ".sussy_skibidi_tires_items"))
            .icon(() -> ItemRegistry.TIRE_3_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.KAOLIN_ITEM.get());
                output.accept(ItemRegistry.UNFIRED_PORCELAIN_BLOCK_ITEM.get());
                output.accept(ItemRegistry.SULFUR_ITEM.get());
                output.accept(ItemRegistry.SULFUR_POWDER_ITEM.get());
                output.accept(ItemRegistry.COAL_DUST_ITEM.get());
                output.accept(ItemRegistry.CHARCOAL_DUST_ITEM.get());
                output.accept(ItemRegistry.IMPURE_CARBON_POWDER_ITEM.get());
                output.accept(ItemRegistry.CARBON_POWDER_ITEM.get());
                output.accept(ItemRegistry.RAW_RUBBER_ITEM.get());
                output.accept(ItemRegistry.UNCURED_TIRE_RUBBER_ITEM.get());
                output.accept(ItemRegistry.UNCURED_TIRE_TREAD_ITEM.get());
                output.accept(ItemRegistry.UNCURED_TIRE_RUBBER_BLOCK_ITEM.get());
                output.accept(ItemRegistry.UNCURED_TIRE_TREAD_BLOCK_ITEM.get());
                output.accept(ItemRegistry.GREEN_TIRE_3_ITEM.get());
                output.accept(ItemRegistry.TIRE_3_ITEM.get());
            }).build());

    public static final RegistryObject<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TABS.register("sussy_skibidi_tires_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + ModClass.MODID + ".sussy_skibidi_tires_blocks"))
            .icon(() -> ItemRegistry.WHEEL_3_BLOCK_ITEM.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(ItemRegistry.KAOLIN_BLOCK_ITEM.get());
                output.accept(ItemRegistry.PORCELAIN_BLOCK_ITEM.get());
                output.accept(ItemRegistry.SULFUR_DEPOSIT_BLOCK_ITEM.get());
                output.accept(ItemRegistry.TIRE_RUBBER_BLOCK_ITEM.get());
                output.accept(ItemRegistry.TIRE_TREAD_BLOCK_ITEM.get());
                output.accept(ItemRegistry.WHEEL_RIM_3_BLOCK_ITEM.get());
                output.accept(ItemRegistry.WHEEL_3_BLOCK_ITEM.get());
            }).build());
}