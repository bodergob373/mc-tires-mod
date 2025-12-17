package com.bodercorp.rubber_tires;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.util.valueproviders.UniformInt;
import com.bodercorp.rubber_tires.utilityclasses.CylinderBlockProperties;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlazedTerracottaBlock;
import net.minecraft.world.level.block.DropExperienceBlock;
import com.bodercorp.rubber_tires.blockclasses.CylinderHitboxBlock;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModClass.MODID);

    public static final RegistryObject<Block> KAOLIN_BLOCK = BLOCKS.register("kaolin_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(0.8f, 0.5f)
                            .sound(SoundType.CALCITE)
                            .mapColor(MapColor.QUARTZ)
            )
    );

    public static final RegistryObject<Block> PORCELAIN_BLOCK = BLOCKS.register("porcelain_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(2.0f, 4.0f)
                            .sound(SoundType.BONE_BLOCK)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.SNOW)
            )
    );

    public static final RegistryObject<Block> SULFUR_DEPOSIT_BLOCK = BLOCKS.register("sulfur_deposit",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.of()
                            .strength(1.4f, 5.0f)
                            .sound(SoundType.STONE)
                            .requiresCorrectToolForDrops()
                            .mapColor(MapColor.STONE),
                UniformInt.of(1, 2)
            )
    );

    public static final RegistryObject<Block> TIRE_RUBBER_BLOCK = BLOCKS.register("tire_rubber_block",
            () -> new Block(
                    BlockBehaviour.Properties.of()
                            .strength(1.0f, 48.0f)
                            .friction(0.2f)
                            .sound(SoundType.STEM)
                            .mapColor(MapColor.TERRACOTTA_BLACK)
            )
    );

    public static final RegistryObject<Block> TIRE_TREAD_BLOCK = BLOCKS.register("tire_tread_block",
            () -> new GlazedTerracottaBlock(
                    BlockBehaviour.Properties.of()
                            .strength(1.0f, 48.0f)
                            .friction(0.0f)
                            .sound(SoundType.STEM)
                            .mapColor(MapColor.TERRACOTTA_BLACK)
            )
    );

    public static final RegistryObject<Block> WHEEL_RIM_3_BLOCK = BLOCKS.register("wheel_rim_3",
            () -> new CylinderHitboxBlock(
                    BlockBehaviour.Properties.of()
                            .strength(2.0f, 8.0f)
                            .sound(SoundType.NETHERITE_BLOCK)
                            .mapColor(MapColor.WOOL),
                new CylinderBlockProperties(4, 1.48f, 0.6f, 0.0f)
            )
    );

    public static final RegistryObject<Block> WHEEL_3_BLOCK = BLOCKS.register("wheel_3",
            () -> new CylinderHitboxBlock(
                    BlockBehaviour.Properties.of()
                            .strength(2.0f, 24.0f)
                            .friction(0.0f)
                            .sound(SoundType.NETHERITE_BLOCK)
                            .mapColor(MapColor.TERRACOTTA_BLACK),
                new CylinderBlockProperties(8, 2.98f, 0.8f, 0.0f)
            )
    );
}
