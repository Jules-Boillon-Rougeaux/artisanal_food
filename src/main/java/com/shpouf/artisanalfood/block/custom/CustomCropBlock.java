package com.shpouf.artisanalfood.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Objects;
import java.util.function.Supplier;

public abstract class CustomCropBlock extends CropBlock {
    private final Supplier<? extends ItemLike> seeds;
    private final VoxelShape[] shapes;

    protected CustomCropBlock(Properties properties, Supplier<? extends ItemLike> seeds, VoxelShape[] shapes) {
        super(properties);
        this.seeds = Objects.requireNonNull(seeds, "seeds");
        this.shapes = Objects.requireNonNull(shapes, "shapes").clone();
        if (this.shapes.length <= getMaxAge()) {
            throw new IllegalArgumentException(
                    "There must be a shape for every crop age from 0 to " + getMaxAge());
        }
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return shapes[this.getAge(state)];
    }

    @Override
    protected int getBonemealAgeIncrease(Level level) {
        return Mth.nextInt(level.getRandom(), 1, 2);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seeds.get();
    }

    @Override
    public abstract IntegerProperty getAgeProperty();

    @Override
    public int getMaxAge() {
        return getAgeProperty().getPossibleValues().stream().mapToInt(Integer::intValue).max().orElseThrow();
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(getAgeProperty());
    }

    public static final class Age4 extends CustomCropBlock {
        public static final IntegerProperty AGE = BlockStateProperties.AGE_4;

        public Age4(Properties properties, Supplier<? extends ItemLike> seeds, VoxelShape[] shapes) {
            super(properties, seeds, shapes);
        }

        @Override
        public IntegerProperty getAgeProperty() {
            return AGE;
        }
    }
}
