package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Livy;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class LivyModel extends AnimatedGeoModel<Livy> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/livymale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/livyfemale.png")),
        DEPTHS(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/livydeep.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/livy.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/livy.animation.json");



    @Override
    public ResourceLocation getModelLocation(Livy object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Livy object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Livy animatable) {
        return animation;
    }
}
