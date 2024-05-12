package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.carni.Allo;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlloModel extends AnimatedGeoModel<Allo> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/allomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/allofemale.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/allo.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/allo.animation.json");

    public static final ResourceLocation white_banner = new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/banner/dino_banner_white.png");
    public static final ResourceLocation black_banner = new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/banner/dino_banner_black.png");


    public static final ResourceLocation baby_model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/baby_allo.geo.json");
    @Override
    public ResourceLocation getModelLocation(Allo object) {
        if(object.isBaby())
            return baby_model;
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Allo object) {
        if(object.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/allobaby.png"));
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Allo animatable) {
        if(animatable.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "animations/baby_allo.animation.json"));
        return animation;
    }
}
