package com.dragn0007.deadlydinospt.entity.ai;

import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.List;

public class DinoMeleeGoal extends MeleeAttackGoal {

    //For large dinos.


    private boolean checkState(BlockState state) {
        return
                state.is(BlockTags.WOODEN_BUTTONS) || state.is(BlockTags.PLANKS) || state.is(BlockTags.LOGS) || state.is(BlockTags.WOODEN_FENCES) || state.is(BlockTags.FENCE_GATES)
                        || state.is(BlockTags.WOODEN_DOORS) || state.is(BlockTags.BASE_STONE_OVERWORLD) || state.is(BlockTags.BEDS) || state.is(BlockTags.FLOWER_POTS)
                        || state.is(BlockTags.LEAVES) || state.is(BlockTags.WOODEN_SLABS) || state.is(BlockTags.WOODEN_STAIRS) || state.is(BlockTags.WOOL) || state.is(BlockTags.SAND) || state.is(BlockTags.IMPERMEABLE) || state.is(BlockTags.DIRT)

                        || state.is(Blocks.GLASS_PANE)
                        || state.is(Blocks.WHITE_STAINED_GLASS_PANE)
                        || state.is(Blocks.ORANGE_STAINED_GLASS_PANE)
                        || state.is(Blocks.MAGENTA_STAINED_GLASS_PANE)
                        || state.is(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                        || state.is(Blocks.YELLOW_STAINED_GLASS_PANE)
                        || state.is(Blocks.LIME_STAINED_GLASS_PANE)
                        || state.is(Blocks.PINK_STAINED_GLASS_PANE)
                        || state.is(Blocks.GRAY_STAINED_GLASS_PANE)
                        || state.is(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                        || state.is(Blocks.CYAN_STAINED_GLASS_PANE)
                        || state.is(Blocks.PURPLE_STAINED_GLASS_PANE)
                        || state.is(Blocks.BLUE_STAINED_GLASS_PANE)
                        || state.is(Blocks.BROWN_STAINED_GLASS_PANE)
                        || state.is(Blocks.GREEN_STAINED_GLASS_PANE)
                        || state.is(Blocks.RED_STAINED_GLASS_PANE)
                        || state.is(Blocks.BLACK_STAINED_GLASS_PANE)
                ;
    }

    public DinoMeleeGoal(Animal entity, double speedModifier, boolean followingTargetEvenIfNotSeen) {
        super(entity, speedModifier, followingTargetEvenIfNotSeen);

    }

    @Override
    protected void checkAndPerformAttack(LivingEntity entity, double distance) {

        Direction direction = entity.getDirection();
        BlockPos base = entity.blockPosition().relative(direction, 1);

        int width = DeadlyDinosPTCommonConfig.BIG_DINO_BREAK_RADIUS.get();
        int height = DeadlyDinosPTCommonConfig.BIG_DINO_BREAK_RADIUS.get();
        int depth = DeadlyDinosPTCommonConfig.BIG_DINO_BREAK_RADIUS.get();

        int maxReachDistance = 8;

        BlockPos center = new BlockPos(base.getX() + (width / 2), base.getY() + (height / 2), base.getZ() + (depth / 2));

        int numBlocksBroken = 0;
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                for (int z = 0; z < depth; z++) {
                    BlockPos pos = center.offset(x - (width / 2), y - (height / 2), z - (depth / 2));
                    BlockState state = entity.level.getBlockState(pos);
                    Block block = state.getBlock();
                    if (checkState(state)) {
                        entity.level.setBlockAndUpdate(pos, Blocks.AIR.defaultBlockState());
                        List<ItemStack> drops = Block.getDrops(state, (ServerLevel) entity.level, pos, null, entity, ItemStack.EMPTY);
                        for (ItemStack drop : drops) {
                            entity.level.addFreshEntity(new ItemEntity(entity.level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, drop));
                        }
                        entity.level.setBlock(pos, Blocks.AIR.defaultBlockState(), 10);

                        if (center.distManhattan(pos) <= maxReachDistance) {
                            if (checkState(state)) {
                                entity.level.destroyBlock(pos, true, entity);

                                numBlocksBroken++;
                                if (numBlocksBroken >= 25) {
                                    break;
                                }
                            }
                        }
                    }
                }
                super.checkAndPerformAttack(entity, distance);
            }
        }
    }
}



