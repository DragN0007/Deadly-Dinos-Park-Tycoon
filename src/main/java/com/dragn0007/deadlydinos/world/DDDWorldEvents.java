package com.dragn0007.deadlydinos.world;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.world.gen.DDDFlowerGeneration;
import com.dragn0007.deadlydinos.world.gen.DDDTreeGeneration;
import com.dragn0007.deadlydinos.world.gen.DinoSpawnGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber (modid = DeadlyDinosPT.MODID)
public class DDDWorldEvents {



    @SubscribeEvent
            public static void biomeLoadingEvent(final BiomeLoadingEvent event) {

    DDDFlowerGeneration.generateFlowers(event);
    DDDTreeGeneration.generateTrees(event);

    DinoSpawnGeneration.onEntitySpawn(event);
    }
}
