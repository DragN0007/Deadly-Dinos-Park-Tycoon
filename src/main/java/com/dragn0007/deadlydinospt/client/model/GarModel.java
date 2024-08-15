package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Gar;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GarModel extends AnimatedGeoModel<Gar> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/garmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/garfemale.png")),
        GREEN(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gargreen.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/gar.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/gar.animation.json");



    @Override
    public ResourceLocation getModelLocation(Gar object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Gar object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Gar animatable) {
        return animation;
    }
}
