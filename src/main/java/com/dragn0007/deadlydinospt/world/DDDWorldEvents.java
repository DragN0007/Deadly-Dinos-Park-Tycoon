package com.dragn0007.deadlydinospt.world;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = DeadlyDinosPT.MODID)
public class DDDWorldEvents {



    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {


    }
}
