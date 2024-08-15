package com.dragn0007.deadlydinospt.block.fossil;

import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

import javax.annotation.Nullable;

public class ChiselableAcroFossil extends Block {
    public ChiselableAcroFossil(Properties properties) {
        super(properties);
    }

    public void playerDestroy(Level level, Player player, BlockPos blockPos, BlockState blockState, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.playerDestroy(level, player, blockPos, blockState, blockEntity, stack);
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, stack) == 0) {

                level.setBlockAndUpdate(blockPos, DDPTBlocks.CHISELED_ACROCANTHOSAURUS_FOSSIL.get().defaultBlockState()) ;
            }
        }

    public PushReaction getPistonPushReaction(BlockState p_54173_) {
        return PushReaction.IGNORE;
    }
}

