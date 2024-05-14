package com.dragn0007.deadlydinospt.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.treePlacement;

public class DDPTPlacedFeatures {

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
