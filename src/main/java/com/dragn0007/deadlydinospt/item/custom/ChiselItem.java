package com.dragn0007.deadlydinospt.item.custom;


import com.dragn0007.deadlydinospt.item.util.DDPTToolActions;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.UseAnim;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;


public class ChiselItem extends DiggerItem {

    public ChiselItem(Tier p_42961_, int p_42962_, float p_42963_, Properties p_42964_) {
        super((float)p_42962_, p_42963_, p_42961_, DDPTTags.Blocks.CHISELABLE, p_42964_);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction);
    }
}
