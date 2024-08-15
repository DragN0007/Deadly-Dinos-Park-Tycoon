package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Dunkleo;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DunkleoModel extends AnimatedGeoModel<Dunkleo> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/dunkleomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/dunkleofemale.png")),
        SANDY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/dunkleosandy.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/dunkleo.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/dunkleo.animation.json");



    @Override
    public ResourceLocation getModelLocation(Dunkleo object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Dunkleo object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Dunkleo animatable) {
        return animation;
    }
}
