package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Steth;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class StethModel extends AnimatedGeoModel<Steth> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/stethmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/stethfemale.png")),
        POWDER(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/stethpowder.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/steth.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/steth.animation.json");



    @Override
    public ResourceLocation getModelLocation(Steth object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Steth object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Steth animatable) {
        return animation;
    }
}
