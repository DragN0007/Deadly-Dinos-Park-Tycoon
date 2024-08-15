package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Meg;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MegModel extends AnimatedGeoModel<Meg> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megfemale.png")),
        NAVY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megnavy.png")),
        BATTERED(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megbattered.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/meg.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/meg.animation.json");



    @Override
    public ResourceLocation getModelLocation(Meg object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Meg object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Meg animatable) {
        return animation;
    }
}
