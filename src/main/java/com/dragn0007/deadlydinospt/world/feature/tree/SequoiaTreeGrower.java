package com.dragn0007.deadlydinospt.world.feature.tree;

import com.dragn0007.deadlydinospt.world.feature.DDPTConfigFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class SequoiaTreeGrower extends AbstractTreeGrower {
    @Nullable
    @Override
    protected Holder<? extends ConfiguredFeature<?, ?>> getConfiguredFeature(Random p_204307_, boolean p_204308_) {
        return DDPTConfigFeatures.SEQUOIA;
    }
}
