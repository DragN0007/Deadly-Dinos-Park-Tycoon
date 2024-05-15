package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDPTBlockstateProvider extends BlockStateProvider {
    public DDPTBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DeadlyDinosPT.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        simpleBlock(DDPTBlocks.ACROCANTHOSAURUS_FOSSIL.get(), models().cubeAll("acrocanthosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.ACROCANTHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ACROCANTHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ACROCANTHOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_acrocanthosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ACROCANTHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ACROCANTHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_carni_1")));



        simpleBlock(DDPTBlocks.ALBERTOSAURUS_FOSSIL.get(), models().cubeAll("albertosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.ALBERTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ALBERTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ALBERTOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_albertosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ALBERTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ALBERTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));



        simpleBlock(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll("allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.ANDALGALORNIS_FOSSIL.get(), models().cubeAll("andalgalornis_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.ANDALGALORNIS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ANDALGALORNIS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ANDALGALORNIS_FOSSIL.get(), models().cubeAll("chiseled_andalgalornis_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ANDALGALORNIS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ANDALGALORNIS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.ARCHAEOPTERYX_FOSSIL.get(), models().cubeAll("archaeopteryx_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.ARCHAEOPTERYX_FOSSIL.get(), models().cubeAll(DDPTBlocks.ARCHAEOPTERYX_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ARCHAEOPTERYX_FOSSIL.get(), models().cubeAll("chiseled_archaeopteryx_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ARCHAEOPTERYX_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ARCHAEOPTERYX_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));



        simpleBlock(DDPTBlocks.CERATOSAURUS_FOSSIL.get(), models().cubeAll("ceratosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CERATOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CERATOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ceratosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));

    }

}
