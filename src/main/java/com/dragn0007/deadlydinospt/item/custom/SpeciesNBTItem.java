package com.dragn0007.deadlydinospt.item.custom;

import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SpeciesNBTItem extends Item {

    public SpeciesNBTItem() {
        super(new Properties().tab(DDPTItemGroup.DDD_GROUP));
    }

    @Override
    public void appendHoverText(ItemStack itemStack, Level level, List<Component> tooltip, TooltipFlag flag) {
        CompoundTag tag = itemStack.getTag();
        if (tag !=null) {
            for (TagKey tagFossil : DDPTTags.Items.FOSSIL_TO_EGG_MAP.keySet()) {
                if (tagFossil.toString().equals(tag.getString("SpeciesTag"))) {
                    Pair<RegistryObject<Item>, String> result = DDPTTags.Items.FOSSIL_TO_EGG_MAP.get(tagFossil);
                    tooltip.add(new TextComponent(result.getSecond()).withStyle(ChatFormatting.GOLD));
                    return;
                }
            }
        }
        tooltip.add(new TextComponent("No species recognized...").withStyle(ChatFormatting.RED));
    }

}