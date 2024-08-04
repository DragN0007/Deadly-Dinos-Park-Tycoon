package com.dragn0007.deadlydinospt.client.gui;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Pachy;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.gui.OverlayRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = DeadlyDinosPT.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PachyHUD {

    @SubscribeEvent
    public static void onFMLClientSetupEvent(FMLClientSetupEvent event) {
        OverlayRegistry.registerOverlayTop("smashing_hud_icon", Pachy.pachyHUD());
    }
}
