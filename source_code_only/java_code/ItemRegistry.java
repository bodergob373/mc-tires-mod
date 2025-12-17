package com.bodercorp.rubber_tires;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModClass.MODID);

    // items

    public static final RegistryObject<Item> KAOLIN_ITEM = ITEMS.register("kaolin",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> UNFIRED_PORCELAIN_BLOCK_ITEM = ITEMS.register("unfired_porcelain_block",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> SULFUR_ITEM = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> SULFUR_POWDER_ITEM = ITEMS.register("sulfur_powder",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> COAL_DUST_ITEM = ITEMS.register("coal_dust",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> CHARCOAL_DUST_ITEM = ITEMS.register("charcoal_dust",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> IMPURE_CARBON_POWDER_ITEM = ITEMS.register("impure_carbon_powder",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> CARBON_POWDER_ITEM = ITEMS.register("carbon_powder",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> RAW_RUBBER_ITEM = ITEMS.register("raw_rubber",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> UNCURED_TIRE_RUBBER_ITEM = ITEMS.register("uncured_tire_rubber",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> UNCURED_TIRE_TREAD_ITEM = ITEMS.register("uncured_tire_tread",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> UNCURED_TIRE_RUBBER_BLOCK_ITEM = ITEMS.register("uncured_tire_rubber_block",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> UNCURED_TIRE_TREAD_BLOCK_ITEM = ITEMS.register("uncured_tire_tread_block",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> GREEN_TIRE_3_ITEM = ITEMS.register("green_tire_3",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> TIRE_3_ITEM = ITEMS.register("tire_3",
            () -> new Item(new Item.Properties())
    );

    // blockitems

    public static final RegistryObject<Item> KAOLIN_BLOCK_ITEM = ITEMS.register("kaolin_block",
            () -> new BlockItem(
                    BlockRegistry.KAOLIN_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> PORCELAIN_BLOCK_ITEM = ITEMS.register("porcelain_block",
            () -> new BlockItem(
                    BlockRegistry.PORCELAIN_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> SULFUR_DEPOSIT_BLOCK_ITEM = ITEMS.register("sulfur_deposit",
            () -> new BlockItem(
                    BlockRegistry.SULFUR_DEPOSIT_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> TIRE_RUBBER_BLOCK_ITEM = ITEMS.register("tire_rubber_block",
            () -> new BlockItem(
                    BlockRegistry.TIRE_RUBBER_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> TIRE_TREAD_BLOCK_ITEM = ITEMS.register("tire_tread_block",
            () -> new BlockItem(
                    BlockRegistry.TIRE_TREAD_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> WHEEL_RIM_3_BLOCK_ITEM = ITEMS.register("wheel_rim_3",
            () -> new BlockItem(
                    BlockRegistry.WHEEL_RIM_3_BLOCK.get(),
                    new Item.Properties()
                    )
                    );

    public static final RegistryObject<Item> WHEEL_3_BLOCK_ITEM = ITEMS.register("wheel_3",
            () -> new BlockItem(
                    BlockRegistry.WHEEL_3_BLOCK.get(),
                    new Item.Properties()
                    )
                    );
}