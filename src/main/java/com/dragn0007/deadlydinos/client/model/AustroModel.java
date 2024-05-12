package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.carni.Austro;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AustroModel extends AnimatedGeoModel<Austro> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/austromale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/austrofemale.png")),
        SKY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/austrosky.png"));

        public final ResourceLocation resourceLocation;

        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/austro.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/austro.animation.json");



    @Override
    public ResourceLocation getModelLocation(Austro object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Austro object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Austro animatable) {
        return animation;
    }
}
