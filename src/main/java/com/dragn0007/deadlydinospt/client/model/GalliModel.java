package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Galli;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GalliModel extends AnimatedGeoModel<Galli> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gallimale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gallifemale.png")),
        SUNNY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gallisunny.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/galli.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/galli.animation.json");



    @Override
    public ResourceLocation getModelLocation(Galli object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Galli object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Galli animatable) {
        return animation;
    }
}
