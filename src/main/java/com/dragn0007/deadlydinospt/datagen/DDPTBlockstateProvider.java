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



        simpleBlock(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll("allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));



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



        simpleBlock(DDPTBlocks.AUSTRALOVENATOR_FOSSIL.get(), models().cubeAll("australovenator_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.AUSTRALOVENATOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.AUSTRALOVENATOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_AUSTRALOVENATOR_FOSSIL.get(), models().cubeAll("chiseled_australovenator_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_AUSTRALOVENATOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_AUSTRALOVENATOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));



        simpleBlock(DDPTBlocks.AUSTRORAPTOR_FOSSIL.get(), models().cubeAll("austroraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.AUSTRORAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.AUSTRORAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_AUSTRORAPTOR_FOSSIL.get(), models().cubeAll("chiseled_austroraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_AUSTRORAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_AUSTRORAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.CARCHARODONTOSAURUS_FOSSIL.get(), models().cubeAll("carcharodontosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.CARCHARODONTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CARCHARODONTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_CARCHARODONTOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_carcharodontosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_CARCHARODONTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CARCHARODONTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));



        simpleBlock(DDPTBlocks.CARNOTAURUS_FOSSIL.get(), models().cubeAll("carnotaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CARNOTAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CARNOTAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_CARNOTAURUS_FOSSIL.get(), models().cubeAll("chiseled_carnotaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_CARNOTAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CARNOTAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.CERATOSAURUS_FOSSIL.get(), models().cubeAll("ceratosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CERATOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CERATOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ceratosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CERATOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));



        simpleBlock(DDPTBlocks.COMPSOGNATHUS_FOSSIL.get(), models().cubeAll("compsognathus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.COMPSOGNATHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.COMPSOGNATHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_COMPSOGNATHUS_FOSSIL.get(), models().cubeAll("chiseled_compsognathus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_COMPSOGNATHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_COMPSOGNATHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));



        simpleBlock(DDPTBlocks.CRYOLOPHOSAURUS_FOSSIL.get(), models().cubeAll("cryolophosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CRYOLOPHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CRYOLOPHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_CRYOLOPHOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_cryolophosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_CRYOLOPHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CRYOLOPHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.DEINONYCHUS_FOSSIL.get(), models().cubeAll("deinonychus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.DEINONYCHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.DEINONYCHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_DEINONYCHUS_FOSSIL.get(), models().cubeAll("chiseled_deinonychus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_DEINONYCHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_DEINONYCHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_2")));



        simpleBlock(DDPTBlocks.DILOPHOSAURUS_FOSSIL.get(), models().cubeAll("dilophosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.DILOPHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.DILOPHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_DILOPHOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_dilophosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_DILOPHOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_DILOPHOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));



        simpleBlock(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll("giganotosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_giganotosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));



        simpleBlock(DDPTBlocks.MAHAKALA_FOSSIL.get(), models().cubeAll("mahakala_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.MAHAKALA_FOSSIL.get(), models().cubeAll(DDPTBlocks.MAHAKALA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get(), models().cubeAll("chiseled_mahakala_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));
    }
}
