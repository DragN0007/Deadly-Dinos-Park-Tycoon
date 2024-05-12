package com.dragn0007.deadlydinospt.event;


import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.event.loot.AddBowieKnifeToDungeonChest;
import com.dragn0007.deadlydinospt.event.loot.AddCrowbarToDungeonChest;
import com.dragn0007.deadlydinospt.event.loot.AddDinoGiftBoxToDungeonChest;
import com.dragn0007.deadlydinospt.event.loot.AddDinoGiftBoxToMineshaft;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = DeadlyDinosPT.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDDBusEvents {
    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new AddDinoGiftBoxToDungeonChest.Serializer().setRegistryName
                        (new ResourceLocation(DeadlyDinosPT.MODID, "dino_gift_box_dungeon")),
                new AddDinoGiftBoxToMineshaft.Serializer().setRegistryName
                        (new ResourceLocation(DeadlyDinosPT.MODID, "dino_gift_box_mineshaft")),
                new AddBowieKnifeToDungeonChest.Serializer().setRegistryName
                        (new ResourceLocation(DeadlyDinosPT.MODID, "bowie_knife_dungeon")),
                new AddCrowbarToDungeonChest.Serializer().setRegistryName
                        (new ResourceLocation(DeadlyDinosPT.MODID, "crowbar_dungeon"))
        );
    }
}
