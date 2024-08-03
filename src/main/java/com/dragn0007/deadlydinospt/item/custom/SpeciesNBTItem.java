package com.dragn0007.deadlydinospt.item.custom;

import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class SpeciesNBTItem extends Item {

    public SpeciesNBTItem() {
        super(new Properties().tab(DDPTItemGroup.DDD_GROUP));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(itemStack, level, tooltip, flag);

        CompoundTag tag = itemStack.getTag();
        if (tag != null && tag.contains("Dinosaur Name", Tag.TAG_STRING)) {
            String dinosaurName = tag.getString("Dinosaur Name");
            tooltip.add(new TextComponent(dinosaurName).withStyle(ChatFormatting.GOLD));
        } else {
            tooltip.add(new TextComponent("No species recognized...").withStyle(ChatFormatting.RED));
        }
    }
}