package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Heli;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HeliModel extends AnimatedGeoModel<Heli> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/helimale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/helifemale.png")),
        DEPTHS(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/helidepths.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/heli.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/heli.animation.json");



    @Override
    public ResourceLocation getModelLocation(Heli object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Heli object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Heli animatable) {
        return animation;
    }
}
