package com.dragn0007.deadlydinospt.world.gen;

import com.dragn0007.deadlydinospt.world.feature.DDPTPlacedFeatures;
import net.minecraft.core.Holder;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.List;

public class DDPTOreGeneration {
    public static void generateOres(final BiomeLoadingEvent event) {
        List<Holder<PlacedFeature>> base =
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        base.add(DDPTPlacedFeatures.ACROCANTHOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.ALBERTOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.ALLOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.ANDALGALORNIS_FOSSIL);
        base.add(DDPTPlacedFeatures.ARCHAEOPTERYX_FOSSIL);
        base.add(DDPTPlacedFeatures.AUSTRALOVENATOR_FOSSIL);
        base.add(DDPTPlacedFeatures.CERATOSAURUS_FOSSIL);

    }


}
