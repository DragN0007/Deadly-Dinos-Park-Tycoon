package com.dragn0007.deadlydinospt.entity;

import net.minecraft.sounds.SoundSource;

import javax.annotation.Nullable;

public interface Armorable {
    boolean isArmorable();

    void equipArmor(@Nullable SoundSource soundSource);

    boolean isArmored();
}
