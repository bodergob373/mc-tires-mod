package com.bodercorp.rubber_tires.blockclasses;

import java.util.EnumMap;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import com.bodercorp.rubber_tires.utilityclasses.CylinderBlockProperties;

public class CylinderHitboxBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    private final CylinderBlockProperties cylinderProperties;
    private final EnumMap<Direction, VoxelShape> cylinderShapes = new EnumMap<>(Direction.class);

    public CylinderHitboxBlock(Properties properties, CylinderBlockProperties cylinderProperties) {
        super(properties);
        this.cylinderProperties = cylinderProperties;
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.UP));
        buildShapes();
    }

     private void buildShapes() {
        for (Direction direction : Direction.values()) {
            cylinderShapes.put(direction, makeCylinder(cylinderProperties, direction));
        }
    }

    public static VoxelShape makeCylinder(CylinderBlockProperties properties, Direction direction) {
        VoxelShape shape = Shapes.empty();
        int offsetNegation = (direction == Direction.WEST || direction == Direction.DOWN || direction == Direction.SOUTH) ? -1 : 1;
        double minHeight = 8 - properties.getHeight() * 16 / 2 + properties.getOffset() * 16 * offsetNegation;
        double maxHeight = 8 + properties.getHeight() * 16 / 2 + properties.getOffset() * 16 * offsetNegation;
        double angleStep = Math.PI / properties.getResolution() / 2;

        for (double angle = angleStep / 2; angle < Math.PI / 2; angle += angleStep)
        {
            VoxelShape box;
            double x = Math.cos(angle) * properties.getDiameter() / 2;
            double y = Math.sin(angle) * properties.getDiameter() / 2;
            double minX = 8 - x * 16;
            double maxX = 8 + x * 16;
            double minY = 8 - y * 16;
            double maxY = 8 + y * 16;

            if (direction == Direction.WEST || direction == Direction.EAST) {
                box = Block.box(minHeight, minX, minY, maxHeight, maxX, maxY);
            }
            else if (direction == Direction.DOWN || direction == Direction.UP) {
                box = Block.box(minX, minHeight, minY, maxX, maxHeight, maxY);
            }
            else {
                box = Block.box(minX, minY, minHeight, maxX, maxY, maxHeight);
            }

            shape = Shapes.or(shape, box);
        }

        return shape;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction dir = context.getNearestLookingDirection().getOpposite();
        return this.defaultBlockState().setValue(FACING, dir);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Block.box(0, 0, 0, 16, 16, 16);
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return cylinderShapes.getOrDefault(state.getValue(FACING), Shapes.block());
    }
}