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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;

import javax.annotation.Nullable;

public class ChiselableCompyFossil extends Block {
    public ChiselableCompyFossil(Properties properties) {
        super(properties);
    }

    public void playerDestroy(Level p_54157_, Player p_54158_, BlockPos p_54159_, BlockState p_54160_, @Nullable BlockEntity p_54161_, ItemStack p_54162_) {
        super.playerDestroy(p_54157_, p_54158_, p_54159_, p_54160_, p_54161_, p_54162_);
        if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.SILK_TOUCH, p_54162_) == 0) {

            Material material = p_54157_.getBlockState(p_54159_.below()).getMaterial();
            if (material.blocksMotion()) {
                p_54157_.setBlockAndUpdate(p_54159_, DDPTBlocks.CHISELED_COMPSOGNATHUS_FOSSIL.get().defaultBlockState()) ;
            }
        }

    }

    public PushReaction getPistonPushReaction(BlockState p_54173_) {
        return PushReaction.NORMAL;
    }
}

