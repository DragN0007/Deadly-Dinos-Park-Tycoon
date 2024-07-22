package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.rot.StrongDecorRotator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;

public class DNAExtractor extends StrongDecorRotator {
    public DNAExtractor() {
        super(NORTH, EAST, SOUTH, WEST);
    }

    public static final VoxelShape NORTH = Stream.of(
            Block.box(3, 0, 3, 13, 16, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape EAST = Stream.of(
            Block.box(3, 0, 3, 13, 16, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape SOUTH = Stream.of(
            Block.box(3, 0, 3, 13, 16, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();

    public static final VoxelShape WEST = Stream.of(
            Block.box(3, 0, 3, 13, 16, 15)
    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();


}
