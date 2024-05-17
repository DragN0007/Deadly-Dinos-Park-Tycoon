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
            DDPTConfigFeatures.ANDALGALORNIS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(40), VerticalAnchor.aboveBottom(100))));


    //Late Cretaceous
    public static final Holder<PlacedFeature> ALBERTOSAURUS_FOSSIL = PlacementUtils.register("albertosaurus_fossil_placed",
            DDPTConfigFeatures.ALBERTOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.aboveBottom(80))));


    //Early Cretaceous
    public static final Holder<PlacedFeature> ACROCANTHOSAURUS_FOSSIL = PlacementUtils.register("acrocanthosaurus_fossil_placed",
            DDPTConfigFeatures.ACROCANTHOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.aboveBottom(60))));


    //Late Jurassic
    public static final Holder<PlacedFeature> ALLOSAURUS_FOSSIL = PlacementUtils.register("allosaurus_fossil_placed",
            DDPTConfigFeatures.ALLOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));
    public static final Holder<PlacedFeature> CERATOSAURUS_FOSSIL = PlacementUtils.register("ceratosaurus_fossil_placed",
            DDPTConfigFeatures.CERATOSAURUS_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));

    public static final Holder<PlacedFeature> ARCHAEOPTERYX_FOSSIL = PlacementUtils.register("archaeopteryx_fossil_placed",
            DDPTConfigFeatures.ARCHAEOPTERYX_FOSSIL_ORE, DDPTOrePlacement.commonOrePlacement(DeadlyDinosPTCommonConfig.FOSSIL_VEIN_PER_CHUNK.get(),
                    HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(-20), VerticalAnchor.aboveBottom(40))));


    //Early Jurassic







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
