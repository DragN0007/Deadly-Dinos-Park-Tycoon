package com.dragn0007.deadlydinospt.item.custom;


import com.dragn0007.deadlydinospt.item.util.DDPTToolActions;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.world.item.*;


public class BrushItem extends DiggerItem {

    public BrushItem(Tier p_42961_, int p_42962_, float p_42963_, Item.Properties p_42964_) {
        super((float)p_42962_, p_42963_, p_42961_, DDPTTags.Blocks.BRUSHABLE, p_42964_);
    }

    @Override
    public boolean canPerformAction(ItemStack stack, net.minecraftforge.common.ToolAction toolAction) {
        return DDPTToolActions.DEFAULT_BRUSH_ACTIONS.contains(toolAction);
    }
}
