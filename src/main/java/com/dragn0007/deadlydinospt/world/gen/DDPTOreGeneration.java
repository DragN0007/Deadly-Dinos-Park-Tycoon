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
        base.add(DDPTPlacedFeatures.ATROCIRAPTOR_FOSSIL);
        base.add(DDPTPlacedFeatures.AUSTRALOVENATOR_FOSSIL);
        base.add(DDPTPlacedFeatures.AUSTRORAPTOR_FOSSIL);
        base.add(DDPTPlacedFeatures.BARYONYX_FOSSIL);
        base.add(DDPTPlacedFeatures.CARCHARODONTOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.CARNOTAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.CERATOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.COMPSOGNATHUS_FOSSIL);
        base.add(DDPTPlacedFeatures.CRYOLOPHOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.DEINONYCHUS_FOSSIL);
        base.add(DDPTPlacedFeatures.DILOPHOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.EOCARCHARIA_FOSSIL);
        base.add(DDPTPlacedFeatures.GIGANOTOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.ICHTHYOVENATOR_FOSSIL);
        base.add(DDPTPlacedFeatures.MAHAKALA_FOSSIL);
        base.add(DDPTPlacedFeatures.MAJUNGASAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.MEGARAPTOR_FOSSIL);
        base.add(DDPTPlacedFeatures.TYRANNOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.SPINOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.TARBOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.TROODON_FOSSIL);
        base.add(DDPTPlacedFeatures.UTAHRAPTOR_FOSSIL);
        base.add(DDPTPlacedFeatures.YUTYRANNUS_FOSSIL);

        base.add(DDPTPlacedFeatures.AMARGASAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.AMPELOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.ANKYLOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.AVACERATOPS_FOSSIL);
        base.add(DDPTPlacedFeatures.CROP_SNAIL_FOSSIL);
        base.add(DDPTPlacedFeatures.DEINOCHERIUS_FOSSIL);
        base.add(DDPTPlacedFeatures.EDMONTOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.GALLIMIMUS_FOSSIL);
        base.add(DDPTPlacedFeatures.GRYPOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.IGUANODON_FOSSIL);
        base.add(DDPTPlacedFeatures.PACHYCEPHALOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.PACHYRHINOSAURUS_FOSSIL);
        base.add(DDPTPlacedFeatures.PARASAUROLOPHUS_FOSSIL);
        base.add(DDPTPlacedFeatures.SAUROPOSEIDON_FOSSIL);
        base.add(DDPTPlacedFeatures.SHANTUNGOSAURUS_FOSSIL);
    }
}
