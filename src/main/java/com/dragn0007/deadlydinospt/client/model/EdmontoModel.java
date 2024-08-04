package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Edmonto;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class EdmontoModel extends AnimatedGeoModel<Edmonto> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/edmontomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/edmontofemale.png")),
        PLUM(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/edmontoplum.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/edmonto.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/edmonto.animation.json");



    @Override
    public ResourceLocation getModelLocation(Edmonto object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Edmonto object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Edmonto animatable) {
        return animation;
    }
}
