package com.dragn0007.deadlydinospt;

import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.client.gui.DDPTMenuTypes;
import com.dragn0007.deadlydinospt.entity.util.EntityTypes;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

import static com.dragn0007.deadlydinospt.DeadlyDinosPT.MODID;
import static com.dragn0007.deadlydinospt.entity.util.Serializers.SERIALIZERS;

@Mod(MODID)
public class DeadlyDinosPT
{

    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "deadlydinospt";

    public DeadlyDinosPT()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        SERIALIZERS.register(eventBus);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onFMLCommonSetupEvent);

        DDPTItems.register(eventBus);
        DDPTBlocks.register(eventBus);
        DDPTBlocksDataGen.register(eventBus);
        EntityTypes.ENTITY_TYPES.register(eventBus);
        DDPTMenuTypes.register(eventBus);

        GeckoLib.initialize();
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, DeadlyDinosPTCommonConfig.SPEC, "deadlydinosparktycoon-common.toml");

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void onFMLCommonSetupEvent(FMLCommonSetupEvent event) {
        Network.init();
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
    }
    private void processIMC(final InterModProcessEvent event)
    {
    }
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
        }
        static {
            GeckoLibMod.DISABLE_IN_DEV = true;
        }
    }
}

