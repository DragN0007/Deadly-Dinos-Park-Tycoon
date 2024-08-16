package com.dragn0007.deadlydinospt.world.feature;

import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.google.common.collect.ImmutableList;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.valueproviders.ConstantInt;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.WeightedPlacedFeature;
import net.minecraft.world.level.levelgen.feature.configurations.*;
import net.minecraft.world.level.levelgen.feature.featuresize.TwoLayersFeatureSize;
import net.minecraft.world.level.levelgen.feature.foliageplacers.BlobFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.foliageplacers.MegaPineFoliagePlacer;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.treedecorators.AlterGroundDecorator;
import net.minecraft.world.level.levelgen.feature.trunkplacers.GiantTrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.StraightTrunkPlacer;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import java.util.List;

public class DDPTConfigFeatures {


    //Pilocene + (Stone)
    public static final List<OreConfiguration.TargetBlockState> ANDALGALORNIS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.ANDALGALORNIS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ANDALGALORNIS_FOSSIL_ORE = FeatureUtils.register("andalgalornis_fossil_ore",
            Feature.ORE, new OreConfiguration(ANDALGALORNIS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> CROP_SNAIL_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.CROP_SNAIL_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CROP_SNAIL_FOSSIL_ORE = FeatureUtils.register("crop_snail_fossil_ore",
            Feature.ORE, new OreConfiguration(CROP_SNAIL_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> BASILOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.BASILOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BASILOSAURUS_FOSSIL_ORE = FeatureUtils.register("basilosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(BASILOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> GAR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.GAR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GAR_FOSSIL_ORE = FeatureUtils.register("gar_fossil_ore",
            Feature.ORE, new OreConfiguration(GAR_FOSSIL, 3));



    //Late Cretaceous (Stone)
    public static final List<OreConfiguration.TargetBlockState> ALBERTOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.ALBERTOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALBERTOSAURUS_FOSSIL_ORE = FeatureUtils.register("albertosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(ALBERTOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> ATROCIRAPTOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.ATROCIRAPTOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ATROCIRAPTOR_FOSSIL_ORE = FeatureUtils.register("atrociraptor_fossil_ore",
            Feature.ORE, new OreConfiguration(ATROCIRAPTOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> AUSTRORAPTOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.AUSTRORAPTOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AUSTRORAPTOR_FOSSIL_ORE = FeatureUtils.register("austroraptor_fossil_ore",
            Feature.ORE, new OreConfiguration(AUSTRORAPTOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> CARCHARODONTOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.CARCHARODONTOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CARCHARODONTOSAURUS_FOSSIL_ORE = FeatureUtils.register("carcharodontosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(CARCHARODONTOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> CARNOTAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.CARNOTAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CARNOTAURUS_FOSSIL_ORE = FeatureUtils.register("carnotaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(CARNOTAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> GIGANOTOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.GIGANOTOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GIGANOTOSAURUS_FOSSIL_ORE = FeatureUtils.register("giganotosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(GIGANOTOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> MAJUNGASAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.MAJUNGASAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAJUNGASAURUS_FOSSIL_ORE = FeatureUtils.register("majungasaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(MAJUNGASAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> MEGARAPTOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.MEGARAPTOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MEGARAPTOR_FOSSIL_ORE = FeatureUtils.register("megaraptor_fossil_ore",
            Feature.ORE, new OreConfiguration(MEGARAPTOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> TYRANNOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.TYRANNOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TYRANNOSAURUS_FOSSIL_ORE = FeatureUtils.register("tyrannosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(TYRANNOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> SPINOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.SPINOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SPINOSAURUS_FOSSIL_ORE = FeatureUtils.register("spinosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(SPINOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> TARBOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.TARBOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TARBOSAURUS_FOSSIL_ORE = FeatureUtils.register("tarbosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(TARBOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> TROODON_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.TROODON_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TROODON_FOSSIL_ORE = FeatureUtils.register("troodon_fossil_ore",
            Feature.ORE, new OreConfiguration(TROODON_FOSSIL, 3));


    public static final List<OreConfiguration.TargetBlockState> AMPELOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.AMPELOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMPELOSAURUS_FOSSIL_ORE = FeatureUtils.register("ampelosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(AMPELOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> ANKYLOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.ANKYLOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ANKYLOSAURUS_FOSSIL_ORE = FeatureUtils.register("ankylosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(ANKYLOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> AVACERATOPS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.AVACERATOPS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AVACERATOPS_FOSSIL_ORE = FeatureUtils.register("avaceratops_fossil_ore",
            Feature.ORE, new OreConfiguration(AVACERATOPS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> DEINOCHERIUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.DEINOCHERIUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEINOCHERIUS_FOSSIL_ORE = FeatureUtils.register("deinocherius_fossil_ore",
            Feature.ORE, new OreConfiguration(DEINOCHERIUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> EDMONTOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.EDMONTOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EDMONTOSAURUS_FOSSIL_ORE = FeatureUtils.register("edmontosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(EDMONTOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> GALLIMIMUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.GALLIMIMUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GALLIMIMUS_FOSSIL_ORE = FeatureUtils.register("gallimimus_fossil_ore",
            Feature.ORE, new OreConfiguration(GALLIMIMUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> GRYPOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.GRYPOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> GRYPOSAURUS_FOSSIL_ORE = FeatureUtils.register("gryposaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(GRYPOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> PACHYCEPHALOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.PACHYCEPHALOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PACHYCEPHALOSAURUS_FOSSIL_ORE = FeatureUtils.register("pachycephalosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(PACHYCEPHALOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> PACHYRHINOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.PACHYRHINOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PACHYRHINOSAURUS_FOSSIL_ORE = FeatureUtils.register("pachyrhinosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(PACHYRHINOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> PARASAUROLOPHUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.PARASAUROLOPHUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> PARASAUROLOPHUS_FOSSIL_ORE = FeatureUtils.register("parasaurolophus_fossil_ore",
            Feature.ORE, new OreConfiguration(PARASAUROLOPHUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> SHANTUNGOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.SHANTUNGOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SHANTUNGOSAURUS_FOSSIL_ORE = FeatureUtils.register("shantungosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(SHANTUNGOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> THERIZINOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.THERIZINOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> THERIZINOSAURUS_FOSSIL_ORE = FeatureUtils.register("therizinosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(THERIZINOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> TRICERATOPS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, DDPTBlocks.TRICERATOPS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> TRICERATOPS_FOSSIL_ORE = FeatureUtils.register("triceratops_fossil_ore",
            Feature.ORE, new OreConfiguration(TRICERATOPS_FOSSIL, 3));



    //Early Cretaceous (Deepslate)
    public static final List<OreConfiguration.TargetBlockState> ACROCANTHOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.ACROCANTHOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ACROCANTHOSAURUS_FOSSIL_ORE = FeatureUtils.register("acrocanthosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(ACROCANTHOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> AUSTRALOVENATOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.AUSTRALOVENATOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AUSTRALOVENATOR_FOSSIL_ORE = FeatureUtils.register("australovenator_fossil_ore",
            Feature.ORE, new OreConfiguration(AUSTRALOVENATOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> BARYONYX_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.BARYONYX_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> BARYONYX_FOSSIL_ORE = FeatureUtils.register("baryonyx_fossil_ore",
            Feature.ORE, new OreConfiguration(BARYONYX_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> DEINONYCHUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.DEINONYCHUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DEINONYCHUS_FOSSIL_ORE = FeatureUtils.register("deinonychus_fossil_ore",
            Feature.ORE, new OreConfiguration(DEINONYCHUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> EOCARCHARIA_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.EOCARCHARIA_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> EOCARCHARIA_FOSSIL_ORE = FeatureUtils.register("eocarcharia_fossil_ore",
            Feature.ORE, new OreConfiguration(EOCARCHARIA_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> ICHTHYOVENATOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.ICHTHYOVENATOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ICHTHYOVENATOR_FOSSIL_ORE = FeatureUtils.register("ichthyovenator_fossil_ore",
            Feature.ORE, new OreConfiguration(ICHTHYOVENATOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> MAHAKALA_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.MAHAKALA_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> MAHAKALA_FOSSIL_ORE = FeatureUtils.register("mahakala_fossil_ore",
            Feature.ORE, new OreConfiguration(MAHAKALA_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> UTAHRAPTOR_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.UTAHRAPTOR_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> UTAHRAPTOR_FOSSIL_ORE = FeatureUtils.register("utahraptor_fossil_ore",
            Feature.ORE, new OreConfiguration(UTAHRAPTOR_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> YUTYRANNUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.YUTYRANNUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> YUTYRANNUS_FOSSIL_ORE = FeatureUtils.register("yutyrannus_fossil_ore",
            Feature.ORE, new OreConfiguration(YUTYRANNUS_FOSSIL, 3));


    public static final List<OreConfiguration.TargetBlockState> AMARGASAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.AMARGASAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> AMARGASAURUS_FOSSIL_ORE = FeatureUtils.register("amargasaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(AMARGASAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> IGUANODON_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.IGUANODON_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> IGUANODON_FOSSIL_ORE = FeatureUtils.register("iguanodon_fossil_ore",
            Feature.ORE, new OreConfiguration(IGUANODON_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> SAUROPOSEIDON_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.SAUROPOSEIDON_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> SAUROPOSEIDON_FOSSIL_ORE = FeatureUtils.register("sauroposeidon_fossil_ore",
            Feature.ORE, new OreConfiguration(SAUROPOSEIDON_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> ARGANODUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.ARGANODUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ARGANODUS_FOSSIL_ORE = FeatureUtils.register("arganodus_fossil_ore",
            Feature.ORE, new OreConfiguration(ARGANODUS_FOSSIL, 3));





    //Late Jurassic (Deepslate)
    public static final List<OreConfiguration.TargetBlockState> ALLOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.ALLOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ALLOSAURUS_FOSSIL_ORE = FeatureUtils.register("allosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(ALLOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> CERATOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.CERATOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CERATOSAURUS_FOSSIL_ORE = FeatureUtils.register("ceratosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(CERATOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> ARCHAEOPTERYX_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.ARCHAEOPTERYX_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> ARCHAEOPTERYX_FOSSIL_ORE = FeatureUtils.register("archaeopteryx_fossil_ore",
            Feature.ORE, new OreConfiguration(ARCHAEOPTERYX_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> COMPSOGNATHUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.COMPSOGNATHUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> COMPSOGNATHUS_FOSSIL_ORE = FeatureUtils.register("compsognathus_fossil_ore",
            Feature.ORE, new OreConfiguration(COMPSOGNATHUS_FOSSIL, 3));


    public static final List<OreConfiguration.TargetBlockState> STEGOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.STEGOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> STEGOSAURUS_FOSSIL_ORE = FeatureUtils.register("stegosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(STEGOSAURUS_FOSSIL, 3));



    //Early Jurassic - (Deepslate)
    public static final List<OreConfiguration.TargetBlockState> CRYOLOPHOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.CRYOLOPHOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> CRYOLOPHOSAURUS_FOSSIL_ORE = FeatureUtils.register("cryolophosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(CRYOLOPHOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> DILOPHOSAURUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.DILOPHOSAURUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DILOPHOSAURUS_FOSSIL_ORE = FeatureUtils.register("dilophosaurus_fossil_ore",
            Feature.ORE, new OreConfiguration(DILOPHOSAURUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> DUNKLEOSTEUS_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.DUNKLEOSTEUS_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> DUNKLEOSTEUS_FOSSIL_ORE = FeatureUtils.register("dunkloesteus_fossil_ore",
            Feature.ORE, new OreConfiguration(DUNKLEOSTEUS_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> HELICOPRION_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.HELICOPRION_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HELICOPRION_FOSSIL_ORE = FeatureUtils.register("helicoprion_fossil_ore",
            Feature.ORE, new OreConfiguration(HELICOPRION_FOSSIL, 3));

    public static final List<OreConfiguration.TargetBlockState> HYNERIA_FOSSIL = List.of(
            OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, DDPTBlocks.HYNERIA_FOSSIL.get().defaultBlockState()));
    public static final Holder<ConfiguredFeature<OreConfiguration, ?>> HYNERIA_FOSSIL_ORE = FeatureUtils.register("hyneria_fossil_ore",
            Feature.ORE, new OreConfiguration(HYNERIA_FOSSIL, 3));





    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> COOKSONIA =
            FeatureUtils.register("cooksonia", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.COOKSONIA.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CYCAS =
            FeatureUtils.register("cycas", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.CYCAS.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CYPERUS =
            FeatureUtils.register("cyperus", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.CYPERUS.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ZOSTER =
            FeatureUtils.register("zoster", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.ZOSTER.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CYCADS =
            FeatureUtils.register("cycads", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.CYCADS.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CALAMITES =
            FeatureUtils.register("calamites", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocks.CALAMITES.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HORSETAIL =
            FeatureUtils.register("horsetail", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocksDataGen.HORSETAIL.get())))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ASTEROXYLON =
            FeatureUtils.register("asteroxylon", Feature.FLOWER,
                    new RandomPatchConfiguration(15, 6, 2, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                            new SimpleBlockConfiguration(BlockStateProvider.simple(DDPTBlocksDataGen.ASTEROXYLON.get())))));



    //CONIFER
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> CONIFER = FeatureUtils.register("conifer",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DDPTBlocks.CONIFERLOG.get()),
            new GiantTrunkPlacer(17, 8, 18),
            BlockStateProvider.simple(DDPTBlocks.CONIFERLEAVES.get()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
            new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(
            new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
    public static final Holder<PlacedFeature> CONIFER_CHECKED =
            PlacementUtils.register("conifer_checked",
            CONIFER, PlacementUtils.filteredByBlockSurvival(DDPTBlocks.CONIFERSAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> CONIFER_SPAWN =
            FeatureUtils.register("conifer_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                    new WeightedPlacedFeature(CONIFER_CHECKED, 0.1F)), CONIFER_CHECKED));


    //YEW
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> YEW = FeatureUtils.register("yew",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DDPTBlocks.YEWLOG.get()),
            new StraightTrunkPlacer(2, 1, 0),
            BlockStateProvider.simple(DDPTBlocks.YEWLEAVES.get()),
            new BlobFoliagePlacer(ConstantInt.of(2), ConstantInt.of(0), 1),
            new TwoLayersFeatureSize(1, 0, 1)).ignoreVines().build());
    public static final Holder<PlacedFeature> YEW_CHECKED =
            PlacementUtils.register("yew_checked",
                    YEW, PlacementUtils.filteredByBlockSurvival(DDPTBlocks.YEWSAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> YEW_SPAWN =
            FeatureUtils.register("yew_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(YEW_CHECKED, 0.33333334F)), YEW_CHECKED));


    //SEQUOIA
    public static final Holder<ConfiguredFeature<TreeConfiguration, ?>> SEQUOIA = FeatureUtils.register("sequoia",Feature.TREE, new TreeConfiguration.TreeConfigurationBuilder(
            BlockStateProvider.simple(DDPTBlocks.SEQUOIALOG.get()),
            new GiantTrunkPlacer(17, 8, 18),
            BlockStateProvider.simple(DDPTBlocks.SEQUOIALEAVES.get()),
            new MegaPineFoliagePlacer(ConstantInt.of(0), ConstantInt.of(0), UniformInt.of(13, 17)),
            new TwoLayersFeatureSize(1, 1, 2)).decorators(ImmutableList.of(
            new AlterGroundDecorator(BlockStateProvider.simple(Blocks.PODZOL)))).build());
    public static final Holder<PlacedFeature> SEQUOIA_CHECKED =
            PlacementUtils.register("sequoia_checked",
                    SEQUOIA, PlacementUtils.filteredByBlockSurvival(DDPTBlocks.SEQUOIASAPLING.get()));
    public static final Holder<ConfiguredFeature<RandomFeatureConfiguration, ?>> SEQUOIA_SPAWN =
            FeatureUtils.register("sequoia_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfiguration(List.of(
                            new WeightedPlacedFeature(SEQUOIA_CHECKED, 0.1F)), SEQUOIA_CHECKED));

}


