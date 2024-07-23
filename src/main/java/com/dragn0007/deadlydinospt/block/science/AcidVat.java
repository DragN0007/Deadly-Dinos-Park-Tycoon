package com.dragn0007.deadlydinospt.block.science;

import com.dragn0007.deadlydinospt.block.science.base.DDPTBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.network.NetworkHooks;
import org.jetbrains.annotations.Nullable;

public class AcidVat extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;

    public AcidVat(Properties properties) {
        super(properties);
    }

    private static final VoxelShape SHAPE =  Block.box(0, 0, 0, 16, 8, 16);

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    /* FACING */

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING);
    }

    /* BLOCK ENTITY */

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    @Override
    public void onRemove(BlockState pState, Level pLevel, BlockPos pPos, BlockState pNewState, boolean pIsMoving) {
        if (pState.getBlock() != pNewState.getBlock()) {
            BlockEntity blockEntity = pLevel.getBlockEntity(pPos);
            if (blockEntity instanceof AcidVatEntity) {
                ((AcidVatEntity) blockEntity).drops();
            }
        }
        super.onRemove(pState, pLevel, pPos, pNewState, pIsMoving);
    }

    @Override
    public InteractionResult use(BlockState pState, Level pLevel, BlockPos pPos,
                                 Player pPlayer, InteractionHand pHand, BlockHitResult pHit) {
        if (!pLevel.isClientSide()) {
            BlockEntity entity = pLevel.getBlockEntity(pPos);
            if(entity instanceof AcidVatEntity) {
                NetworkHooks.openGui(((ServerPlayer)pPlayer), (AcidVatEntity)entity, pPos);
            } else {
                throw new IllegalStateException("Our Container provider is missing!");
            }
        }

        return InteractionResult.sidedSuccess(pLevel.isClientSide());
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new AcidVatEntity(pPos, pState);
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level pLevel, BlockState pState, BlockEntityType<T> pBlockEntityType) {
        return createTickerHelper(pBlockEntityType, DDPTBlockEntities.ACID_VAT.get(),
                AcidVatEntity::tick);
    }
}


//    public AcidVat() {
//        super(NORTH, EAST, SOUTH, WEST);
//    }
//    public static final VoxelShape NORTH = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();
//
//    public static final VoxelShape EAST = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//
//    public static final VoxelShape SOUTH = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//
//    public static final VoxelShape WEST = Stream.of(
//            Block.box(1, 0, 1, 15, 2, 15),
//            Block.box(1, 16, 1, 15, 18, 15),
//            Block.box(3, 2, 3, 13, 16, 13)
//    ).reduce((v1, v2) -> Shapes.join(v1, v2,BooleanOp.OR)).get();
//}
