package com.dragn0007.deadlydinospt.world.feature;

import com.dragn0007.deadlydinospt.util.config.DeadlyDinosPTCommonConfig;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class DDPTPlacedFeatures {


    //Pilocene
    public static final Holder<PlacedFeature> ANDALGALORNIS_FOSSIL = PlacementUtils.register("andalgalornis_fossil_placed",
            DDPTConfigFeatures.ANDALGALORNIS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ANDAL_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(40), VerticalAnchor.aboveBottom(100))));

    public static final Holder<PlacedFeature> CROP_SNAIL_FOSSIL = PlacementUtils.register("crop_snail_fossil_placed",
            DDPTConfigFeatures.CROP_SNAIL_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.CROPSNAIL_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(40), VerticalAnchor.aboveBottom(100))));


    //Late Cretaceous
    public static final Holder<PlacedFeature> ALBERTOSAURUS_FOSSIL = PlacementUtils.register("albertosaurus_fossil_placed",
            DDPTConfigFeatures.ALBERTOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ALBERTO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> ATROCIRAPTOR_FOSSIL = PlacementUtils.register("atrociraptor_fossil_placed",
            DDPTConfigFeatures.ATROCIRAPTOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ATROCI_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> AUSTRORAPTOR_FOSSIL = PlacementUtils.register("austroraptor_fossil_placed",
            DDPTConfigFeatures.AUSTRORAPTOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.AUSTRO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> CARCHARODONTOSAURUS_FOSSIL = PlacementUtils.register("carcharodontosaurus_fossil_placed",
            DDPTConfigFeatures.CARCHARODONTOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.CARCHAR_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> CARNOTAURUS_FOSSIL = PlacementUtils.register("carnotaurus_fossil_placed",
            DDPTConfigFeatures.CARNOTAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.CARNO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> GIGANOTOSAURUS_FOSSIL = PlacementUtils.register("giganotosaurus_fossil_placed",
            DDPTConfigFeatures.GIGANOTOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.GIGA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> MAJUNGASAURUS_FOSSIL = PlacementUtils.register("majungasaurus_fossil_placed",
            DDPTConfigFeatures.MAJUNGASAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.MAJUNGA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> MEGARAPTOR_FOSSIL = PlacementUtils.register("megaraptor_fossil_placed",
            DDPTConfigFeatures.MEGARAPTOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.MEGARAP_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> TYRANNOSAURUS_FOSSIL = PlacementUtils.register("tyrannosaurus_fossil_placed",
            DDPTConfigFeatures.TYRANNOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.REX_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> SPINOSAURUS_FOSSIL = PlacementUtils.register("spinosaurus_fossil_placed",
            DDPTConfigFeatures.SPINOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.SPINO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> TARBOSAURUS_FOSSIL = PlacementUtils.register("tarbosaurus_fossil_placed",
            DDPTConfigFeatures.TARBOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.TARBO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> TROODON_FOSSIL = PlacementUtils.register("troodon_fossil_placed",
            DDPTConfigFeatures.TROODON_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.TROODON_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));


    public static final Holder<PlacedFeature> AMPELOSAURUS_FOSSIL = PlacementUtils.register("ampelosaurus_fossil_placed",
            DDPTConfigFeatures.AMPELOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.AMPELO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> ANKYLOSAURUS_FOSSIL = PlacementUtils.register("ankylosaurus_fossil_placed",
            DDPTConfigFeatures.ANKYLOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ANKY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> AVACERATOPS_FOSSIL = PlacementUtils.register("avaceratops_fossil_placed",
            DDPTConfigFeatures.AVACERATOPS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.AVA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> DEINOCHERIUS_FOSSIL = PlacementUtils.register("deinocherius_fossil_placed",
            DDPTConfigFeatures.DEINOCHERIUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.DEINOCH_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> EDMONTOSAURUS_FOSSIL = PlacementUtils.register("edmontosaurus_fossil_placed",
            DDPTConfigFeatures.EDMONTOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.EDMONTO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> GALLIMIMUS_FOSSIL = PlacementUtils.register("gallimimus_fossil_placed",
            DDPTConfigFeatures.GALLIMIMUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.GALLI_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> GRYPOSAURUS_FOSSIL = PlacementUtils.register("gryposaurus_fossil_placed",
            DDPTConfigFeatures.GRYPOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.GRYPO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> PACHYCEPHALOSAURUS_FOSSIL = PlacementUtils.register("pachycephalosaurus_fossil_placed",
            DDPTConfigFeatures.PACHYCEPHALOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.PACHY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> PARASAUROLOPHUS_FOSSIL = PlacementUtils.register("parasaurolophus_fossil_placed",
            DDPTConfigFeatures.PARASAUROLOPHUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.PARA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> SHANTUNGOSAURUS_FOSSIL = PlacementUtils.register("shantungosaurus_fossil_placed",
            DDPTConfigFeatures.SHANTUNGOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.SHANT_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> THERIZINOSAURUS_FOSSIL = PlacementUtils.register("therizinosaurus_fossil_placed",
            DDPTConfigFeatures.THERIZINOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.THERI_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> TRICERATOPS_FOSSIL = PlacementUtils.register("triceratops_fossil_placed",
            DDPTConfigFeatures.TRICERATOPS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.TRIKE_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));


    //Early Cretaceous
    public static final Holder<PlacedFeature> ACROCANTHOSAURUS_FOSSIL = PlacementUtils.register("acrocanthosaurus_fossil_placed",
            DDPTConfigFeatures.ACROCANTHOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ACRO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> AUSTRALOVENATOR_FOSSIL = PlacementUtils.register("australovenator_fossil_placed",
            DDPTConfigFeatures.AUSTRALOVENATOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.AUSTRALO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> BARYONYX_FOSSIL = PlacementUtils.register("baryonyx_fossil_placed",
            DDPTConfigFeatures.BARYONYX_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.BARY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> DEINONYCHUS_FOSSIL = PlacementUtils.register("deinonychus_fossil_placed",
            DDPTConfigFeatures.DEINONYCHUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.DEINON_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> EOCARCHARIA_FOSSIL = PlacementUtils.register("eocarcharia_fossil_placed",
            DDPTConfigFeatures.EOCARCHARIA_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.EOCARCHAR_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> ICHTHYOVENATOR_FOSSIL = PlacementUtils.register("ichthyovenator_fossil_placed",
            DDPTConfigFeatures.ICHTHYOVENATOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ICHTHY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> MAHAKALA_FOSSIL = PlacementUtils.register("mahakala_fossil_placed",
            DDPTConfigFeatures.MAHAKALA_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.MAHAKALA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> UTAHRAPTOR_FOSSIL = PlacementUtils.register("utahraptor_fossil_placed",
            DDPTConfigFeatures.UTAHRAPTOR_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.UTAH_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> YUTYRANNUS_FOSSIL = PlacementUtils.register("yutyrannus_fossil_placed",
            DDPTConfigFeatures.YUTYRANNUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.YUTY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));


    public static final Holder<PlacedFeature> AMARGASAURUS_FOSSIL = PlacementUtils.register("amargasaurus_fossil_placed",
            DDPTConfigFeatures.AMARGASAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.AMARGA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> IGUANODON_FOSSIL = PlacementUtils.register("iguanodon_fossil_placed",
            DDPTConfigFeatures.IGUANODON_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.IGUA_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> PACHYRHINOSAURUS_FOSSIL = PlacementUtils.register("pachyrhinosaurus_fossil_placed",
            DDPTConfigFeatures.PACHYRHINOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.PACHYR_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));

    public static final Holder<PlacedFeature> SAUROPOSEIDON_FOSSIL = PlacementUtils.register("sauroposeidon_fossil_placed",
            DDPTConfigFeatures.SAUROPOSEIDON_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.SAURO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));



    //Late Jurassic
    public static final Holder<PlacedFeature> ALLOSAURUS_FOSSIL = PlacementUtils.register("allosaurus_fossil_placed",
            DDPTConfigFeatures.ALLOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ALLO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> CERATOSAURUS_FOSSIL = PlacementUtils.register("ceratosaurus_fossil_placed",
            DDPTConfigFeatures.CERATOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.CERATO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> ARCHAEOPTERYX_FOSSIL = PlacementUtils.register("archaeopteryx_fossil_placed",
            DDPTConfigFeatures.ARCHAEOPTERYX_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.ARCHAE_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> COMPSOGNATHUS_FOSSIL = PlacementUtils.register("compsognathus_fossil_placed",
            DDPTConfigFeatures.COMPSOGNATHUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.COMPY_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));



    public static final Holder<PlacedFeature> STEGOSAURUS_FOSSIL = PlacementUtils.register("stegosaurus_fossil_placed",
            DDPTConfigFeatures.STEGOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.STEGO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));


    //Early Jurassic
    public static final Holder<PlacedFeature> CRYOLOPHOSAURUS_FOSSIL = PlacementUtils.register("cryolophosaurus_fossil_placed",
            DDPTConfigFeatures.CRYOLOPHOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.CRYO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(0))));

    public static final Holder<PlacedFeature> DILOPHOSAURUS_FOSSIL = PlacementUtils.register("dilophosaurus_fossil_placed",
            DDPTConfigFeatures.DILOPHOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.DILO_FOSSIL_WEIGHT.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(0))));






    //TREES
    public static final Holder<PlacedFeature> CONIFER_PLACED =
            PlacementUtils.register("conifer_placed",
                    DDPTConfigFeatures.CONIFER_SPAWN,
                    treePlacement(PlacementUtils.countExtra(1, 0.01F, 1)));

    public static final Holder<PlacedFeature> YEW_PLACED =
            PlacementUtils.register("yew_placed",
                    DDPTConfigFeatures.YEW_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));

    public static final Holder<PlacedFeature> SEQUOIA_PLACED =
            PlacementUtils.register("sequoia_placed",
                    DDPTConfigFeatures.SEQUOIA_SPAWN,
                    treePlacement(PlacementUtils.countExtra(0, 0.01F, 1)));


    //PLANTS
    public static final Holder<PlacedFeature> COOKSONIA_PLACED =
            PlacementUtils.register("cooksonia_placed",
                    DDPTConfigFeatures.COOKSONIA,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CYPERUS_PLACED =
            PlacementUtils.register("cyperus_placed",
                    DDPTConfigFeatures.CYPERUS,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CYCAS_PLACED =
            PlacementUtils.register("cycas_placed",
                    DDPTConfigFeatures.CYCAS,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CYCADS_PLACED =
            PlacementUtils.register("cycads_placed",
                    DDPTConfigFeatures.CYCADS,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> ZOSTER_PLACED =
            PlacementUtils.register("zoster_placed",
                    DDPTConfigFeatures.ZOSTER,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> CALAMITES_PLACED =
            PlacementUtils.register("calamites_placed",
                    DDPTConfigFeatures.CALAMITES,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> HORSETAIL_PLACED =
            PlacementUtils.register("horsetail_placed",
                    DDPTConfigFeatures.HORSETAIL,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());
    public static final Holder<PlacedFeature> ASTEROXYLON_PLACED =
            PlacementUtils.register("asteroxylon_placed",
                    DDPTConfigFeatures.ASTEROXYLON,
                    RarityFilter.onAverageOnceEvery(16),
                    InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());


}
