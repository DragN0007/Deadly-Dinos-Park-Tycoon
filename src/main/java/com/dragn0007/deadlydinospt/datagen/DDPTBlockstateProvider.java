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



        simpleBlock(DDPTBlocks.ATROCIRAPTOR_FOSSIL.get(), models().cubeAll("atrociraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.ATROCIRAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.ATROCIRAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_ATROCIRAPTOR_FOSSIL.get(), models().cubeAll("chiseled_atrociraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_ATROCIRAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ATROCIRAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_carni_2")));



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



        simpleBlock(DDPTBlocks.BARYONYX_FOSSIL.get(), models().cubeAll("baryonyx_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.BARYONYX_FOSSIL.get(), models().cubeAll(DDPTBlocks.BARYONYX_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_BARYONYX_FOSSIL.get(), models().cubeAll("chiseled_baryonyx_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_BARYONYX_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_BARYONYX_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_2")));



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



        simpleBlock(DDPTBlocks.EOCARCHARIA_FOSSIL.get(), models().cubeAll("eocarcharia_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.EOCARCHARIA_FOSSIL.get(), models().cubeAll(DDPTBlocks.EOCARCHARIA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_EOCARCHARIA_FOSSIL.get(), models().cubeAll("chiseled_eocarcharia_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_EOCARCHARIA_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_EOCARCHARIA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_carni_2")));



        simpleBlock(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll("giganotosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_giganotosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_GIGANOTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));



        simpleBlock(DDPTBlocks.ICHTHYOVENATOR_FOSSIL.get(), models().cubeAll("ichthyovenator_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.ICHTHYOVENATOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.ICHTHYOVENATOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ICHTHYOVENATOR_FOSSIL.get(), models().cubeAll("chiseled_ichthyovenator_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ICHTHYOVENATOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ICHTHYOVENATOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.MAHAKALA_FOSSIL.get(), models().cubeAll("mahakala_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.MAHAKALA_FOSSIL.get(), models().cubeAll(DDPTBlocks.MAHAKALA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get(), models().cubeAll("chiseled_mahakala_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_MAHAKALA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_carni_1")));



        simpleBlock(DDPTBlocks.MAJUNGASAURUS_FOSSIL.get(), models().cubeAll("majungasaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.MAJUNGASAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.MAJUNGASAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_MAJUNGASAURUS_FOSSIL.get(), models().cubeAll("chiseled_majungasaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_MAJUNGASAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_MAJUNGASAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.MEGARAPTOR_FOSSIL.get(), models().cubeAll("megaraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.MEGARAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.MEGARAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_MEGARAPTOR_FOSSIL.get(), models().cubeAll("chiseled_megaraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_MEGARAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_MEGARAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_2")));



        simpleBlock(DDPTBlocks.TYRANNOSAURUS_FOSSIL.get(), models().cubeAll("tyrannosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.TYRANNOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.TYRANNOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_TYRANNOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_tyrannosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_TYRANNOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_TYRANNOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));



        simpleBlock(DDPTBlocks.SPINOSAURUS_FOSSIL.get(), models().cubeAll("spinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.SPINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.SPINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_SPINOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_spinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_SPINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_SPINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_1")));



        simpleBlock(DDPTBlocks.TARBOSAURUS_FOSSIL.get(), models().cubeAll("tarbosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.TARBOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.TARBOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_TARBOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_tarbosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_TARBOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_TARBOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_carni_2")));



        simpleBlock(DDPTBlocks.TROODON_FOSSIL.get(), models().cubeAll("troodon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.TROODON_FOSSIL.get(), models().cubeAll(DDPTBlocks.TROODON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_TROODON_FOSSIL.get(), models().cubeAll("chiseled_troodon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_TROODON_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_TROODON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_carni_2")));



        simpleBlock(DDPTBlocks.UTAHRAPTOR_FOSSIL.get(), models().cubeAll("utahraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.UTAHRAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.UTAHRAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_UTAHRAPTOR_FOSSIL.get(), models().cubeAll("chiseled_utahraptor_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_UTAHRAPTOR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_UTAHRAPTOR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_1")));



        simpleBlock(DDPTBlocks.YUTYRANNUS_FOSSIL.get(), models().cubeAll("yutyrannus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.YUTYRANNUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.YUTYRANNUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_carni_2")));

        simpleBlock(DDPTBlocks.CHISELED_YUTYRANNUS_FOSSIL.get(), models().cubeAll("chiseled_yutyrannus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_YUTYRANNUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_YUTYRANNUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_carni_2")));






        simpleBlock(DDPTBlocks.AMARGASAURUS_FOSSIL.get(), models().cubeAll("amargasaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.AMARGASAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.AMARGASAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_AMARGASAURUS_FOSSIL.get(), models().cubeAll("chiseled_amargasaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_AMARGASAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_AMARGASAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));



        simpleBlock(DDPTBlocks.AMPELOSAURUS_FOSSIL.get(), models().cubeAll("ampelosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.AMPELOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.AMPELOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_AMPELOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ampelosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_AMPELOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_AMPELOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_1")));



        simpleBlock(DDPTBlocks.ANKYLOSAURUS_FOSSIL.get(), models().cubeAll("ankylosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.ANKYLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ANKYLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_ANKYLOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ankylosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ANKYLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ANKYLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));



        simpleBlock(DDPTBlocks.AVACERATOPS_FOSSIL.get(), models().cubeAll("avaceratops_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_1")));
        simpleBlockItem(DDPTBlocks.AVACERATOPS_FOSSIL.get(), models().cubeAll(DDPTBlocks.AVACERATOPS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_AVACERATOPS_FOSSIL.get(), models().cubeAll("chiseled_avaceratops_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_AVACERATOPS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_AVACERATOPS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_1")));



        simpleBlock(DDPTBlocks.CROP_SNAIL_FOSSIL.get(), models().cubeAll("crop_snail_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_crop_snail")));
        simpleBlockItem(DDPTBlocks.CROP_SNAIL_FOSSIL.get(), models().cubeAll(DDPTBlocks.CROP_SNAIL_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_crop_snail")));

        simpleBlock(DDPTBlocks.CHISELED_CROP_SNAIL_FOSSIL.get(), models().cubeAll("chiseled_crop_snail_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_crop_snail")));
        simpleBlockItem(DDPTBlocks.CHISELED_CROP_SNAIL_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_CROP_SNAIL_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_crop_snail")));



        simpleBlock(DDPTBlocks.DEINOCHERIUS_FOSSIL.get(), models().cubeAll("deinocherius_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_2")));
        simpleBlockItem(DDPTBlocks.DEINOCHERIUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.DEINOCHERIUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_DEINOCHERIUS_FOSSIL.get(), models().cubeAll("chiseled_deinocherius_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_DEINOCHERIUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_DEINOCHERIUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_2")));



        simpleBlock(DDPTBlocks.EDMONTOSAURUS_FOSSIL.get(), models().cubeAll("ampelosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.EDMONTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.EDMONTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_EDMONTOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ampelosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_EDMONTOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_EDMONTOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_2")));



        simpleBlock(DDPTBlocks.GALLIMIMUS_FOSSIL.get(), models().cubeAll("gallimimus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_2")));
        simpleBlockItem(DDPTBlocks.GALLIMIMUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.GALLIMIMUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_GALLIMIMUS_FOSSIL.get(), models().cubeAll("chiseled_gallimimus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_GALLIMIMUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_GALLIMIMUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_2")));



        simpleBlock(DDPTBlocks.GRYPOSAURUS_FOSSIL.get(), models().cubeAll("gryposaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.GRYPOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.GRYPOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_GRYPOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_gryposaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_GRYPOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_GRYPOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));



        simpleBlock(DDPTBlocks.IGUANODON_FOSSIL.get(), models().cubeAll("iguanodon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.IGUANODON_FOSSIL.get(), models().cubeAll(DDPTBlocks.IGUANODON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_IGUANODON_FOSSIL.get(), models().cubeAll("chiseled_iguanodon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_IGUANODON_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_IGUANODON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_2")));



        simpleBlock(DDPTBlocks.PACHYCEPHALOSAURUS_FOSSIL.get(), models().cubeAll("pachycephalosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_1")));
        simpleBlockItem(DDPTBlocks.PACHYCEPHALOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.PACHYCEPHALOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_PACHYCEPHALOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_pachycephalosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_PACHYCEPHALOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_PACHYCEPHALOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_herbi_1")));



        simpleBlock(DDPTBlocks.PACHYRHINOSAURUS_FOSSIL.get(), models().cubeAll("pachyrhinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_2")));
        simpleBlockItem(DDPTBlocks.PACHYRHINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.PACHYRHINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_PACHYRHINOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_pachyrhinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_PACHYRHINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_PACHYRHINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_2")));



        simpleBlock(DDPTBlocks.PARASAUROLOPHUS_FOSSIL.get(), models().cubeAll("parasaurolophus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.PARASAUROLOPHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.PARASAUROLOPHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_PARASAUROLOPHUS_FOSSIL.get(), models().cubeAll("chiseled_parasaurolophus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_PARASAUROLOPHUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_PARASAUROLOPHUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));



        simpleBlock(DDPTBlocks.SAUROPOSEIDON_FOSSIL.get(), models().cubeAll("sauroposeidon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.SAUROPOSEIDON_FOSSIL.get(), models().cubeAll(DDPTBlocks.SAUROPOSEIDON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_SAUROPOSEIDON_FOSSIL.get(), models().cubeAll("chiseled_sauroposeidon_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_SAUROPOSEIDON_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_SAUROPOSEIDON_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_2")));



        simpleBlock(DDPTBlocks.SHANTUNGOSAURUS_FOSSIL.get(), models().cubeAll("shantungosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.SHANTUNGOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.SHANTUNGOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_SHANTUNGOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_shantungosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_SHANTUNGOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_SHANTUNGOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_1")));



        simpleBlock(DDPTBlocks.STEGOSAURUS_FOSSIL.get(), models().cubeAll("stegosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.STEGOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.STEGOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_large_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_STEGOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_stegosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_STEGOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_STEGOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_large_herbi_1")));



        simpleBlock(DDPTBlocks.THERIZINOSAURUS_FOSSIL.get(), models().cubeAll("therizinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.THERIZINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.THERIZINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_herbi_1")));

        simpleBlock(DDPTBlocks.CHISELED_THERIZINOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_therizinosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_THERIZINOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_THERIZINOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_herbi_1")));



        simpleBlock(DDPTBlocks.TRICERATOPS_FOSSIL.get(), models().cubeAll("triceratops_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.TRICERATOPS_FOSSIL.get(), models().cubeAll(DDPTBlocks.TRICERATOPS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_large_herbi_2")));

        simpleBlock(DDPTBlocks.CHISELED_TRICERATOPS_FOSSIL.get(), models().cubeAll("chiseled_triceratops_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_2")));
        simpleBlockItem(DDPTBlocks.CHISELED_TRICERATOPS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_TRICERATOPS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_large_herbi_2")));



        simpleBlock(DDPTBlocks.ARGANODUS_FOSSIL.get(), models().cubeAll("arganodus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.ARGANODUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ARGANODUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_marine")));

        simpleBlock(DDPTBlocks.CHISELED_ARGANODUS_FOSSIL.get(), models().cubeAll("chiseled_arganodus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_ARGANODUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ARGANODUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_marine")));



        simpleBlock(DDPTBlocks.BASILOSAURUS_FOSSIL.get(), models().cubeAll("basilosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.BASILOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.BASILOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_marine")));

        simpleBlock(DDPTBlocks.CHISELED_BASILOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_basilosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_BASILOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_BASILOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_marine")));



        simpleBlock(DDPTBlocks.DUNKLEOSTEUS_FOSSIL.get(), models().cubeAll("dunkleosteus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.DUNKLEOSTEUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.DUNKLEOSTEUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));

        simpleBlock(DDPTBlocks.CHISELED_DUNKLEOSTEUS_FOSSIL.get(), models().cubeAll("chiseled_dunkleosteus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_DUNKLEOSTEUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_DUNKLEOSTEUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));



        simpleBlock(DDPTBlocks.GAR_FOSSIL.get(), models().cubeAll("gar_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.GAR_FOSSIL.get(), models().cubeAll(DDPTBlocks.GAR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_small_marine")));

        simpleBlock(DDPTBlocks.CHISELED_GAR_FOSSIL.get(), models().cubeAll("chiseled_gar_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_GAR_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_GAR_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_small_marine")));



        simpleBlock(DDPTBlocks.HELICOPRION_FOSSIL.get(), models().cubeAll("helicoprion_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.HELICOPRION_FOSSIL.get(), models().cubeAll(DDPTBlocks.HELICOPRION_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));

        simpleBlock(DDPTBlocks.CHISELED_HELICOPRION_FOSSIL.get(), models().cubeAll("chiseled_helicoprion_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_HELICOPRION_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_HELICOPRION_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));



        simpleBlock(DDPTBlocks.HYNERIA_FOSSIL.get(), models().cubeAll("hyneria_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.HYNERIA_FOSSIL.get(), models().cubeAll(DDPTBlocks.HYNERIA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_small_marine")));

        simpleBlock(DDPTBlocks.CHISELED_HYNERIA_FOSSIL.get(), models().cubeAll("chiseled_hyneria_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_HYNERIA_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_HYNERIA_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_small_marine")));



        simpleBlock(DDPTBlocks.ICHTHYOSAURUS_FOSSIL.get(), models().cubeAll("ichthyosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.ICHTHYOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ICHTHYOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/deepslate_fossil_med_marine")));

        simpleBlock(DDPTBlocks.CHISELED_ICHTHYOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_ichthyosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));
        simpleBlockItem(DDPTBlocks.CHISELED_ICHTHYOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ICHTHYOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_deepslate_fossil_med_marine")));
    }
}
