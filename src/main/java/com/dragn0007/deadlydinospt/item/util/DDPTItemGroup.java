package com.dragn0007.deadlydinospt.item.util;

import com.dragn0007.deadlydinospt.item.DDPTItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DDPTItemGroup {

    public static final CreativeModeTab DDD_GROUP = new CreativeModeTab("dddmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DDPTItems.DDDENTITIES.get());
        }
    };

    public static final CreativeModeTab DINO_GROUP = new CreativeModeTab("dinomodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DDPTItems.DDDBLOCKS.get());
        }
    };

    public static final CreativeModeTab FOOD_GROUP = new CreativeModeTab("foodmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DDPTItems.DDDITEMS.get());
        }
    };

    public static final CreativeModeTab BLOCK_GROUP = new CreativeModeTab("blockmodtab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(DDPTItems.DDDFOOD.get());
        }
    };
}
