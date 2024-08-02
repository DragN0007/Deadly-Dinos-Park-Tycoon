package com.dragn0007.deadlydinospt.block.science.base;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import com.dragn0007.deadlydinospt.block.science.DNAExtractorEntity;
import com.dragn0007.deadlydinospt.block.science.EmbryoInitiatorEntity;
import com.dragn0007.deadlydinospt.block.science.EmbryoInjectorEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDPTBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DeadlyDinosPT.MODID);

    public static final RegistryObject<BlockEntityType<AcidVatEntity>> ACID_VAT =
            BLOCK_ENTITIES.register("acid_vat", () ->
                    BlockEntityType.Builder.of(AcidVatEntity::new,
                            DDPTBlocksDataGen.ACID_VAT.get()).build(null));

    public static final RegistryObject<BlockEntityType<DNAExtractorEntity>> DNA_EXTRACTOR =
            BLOCK_ENTITIES.register("dna_extractor", () ->
                    BlockEntityType.Builder.of(DNAExtractorEntity::new,
                            DDPTBlocksDataGen.DNA_EXTRACTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<EmbryoInjectorEntity>> EMBRYO_INJECTOR =
            BLOCK_ENTITIES.register("embryo_injector", () ->
                    BlockEntityType.Builder.of(EmbryoInjectorEntity::new,
                            DDPTBlocksDataGen.EMBRYO_INJECTOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<EmbryoInitiatorEntity>> EMBRYO_INITIATOR =
            BLOCK_ENTITIES.register("embryo_initiator", () ->
                    BlockEntityType.Builder.of(EmbryoInitiatorEntity::new,
                            DDPTBlocksDataGen.EMBRYO_INITIATOR.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
