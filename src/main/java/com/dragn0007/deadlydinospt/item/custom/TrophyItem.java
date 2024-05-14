package com.dragn0007.deadlydinospt.item.custom;

import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class TrophyItem extends Item {

    public MobEffectInstance[] effectInstances;

    public TrophyItem( MobEffectInstance... effectInstances) {
        super(new Properties().durability(DeadlyDinosPTCommonConfig.TROPHYITEM_DURABILITY.get()).tab(DDPTItemGroup.DDD_GROUP));
        this.effectInstances = effectInstances;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player playerEntity, InteractionHand hand) {
        if(!level.isClientSide) {
            for(int i = 0; i < effectInstances.length; i++) {
                playerEntity.addEffect(effectInstances[i]);
            }
            ItemStack itemStack = playerEntity.getItemInHand(hand);
            itemStack.hurtAndBreak(2, playerEntity, deez -> deez.broadcastBreakEvent(hand));
        }
        return super.use(level, playerEntity, hand);
    }
}

