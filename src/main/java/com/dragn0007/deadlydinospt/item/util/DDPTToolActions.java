package com.dragn0007.deadlydinospt.item.util;

import com.google.common.collect.Sets;
import net.minecraft.world.item.DiggerItem;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.extensions.IForgeBlock;
import net.minecraftforge.common.extensions.IForgeItem;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DDPTToolActions {

    public static final ToolAction BRUSH_BLOCK = ToolAction.get("brush_block");

    public static final Set<ToolAction> DEFAULT_BRUSH_ACTIONS = of(BRUSH_BLOCK);

    private static Set<ToolAction> of(ToolAction... actions) {
        return Stream.of(actions).collect(Collectors.toCollection(Sets::newIdentityHashSet));
    }
}
