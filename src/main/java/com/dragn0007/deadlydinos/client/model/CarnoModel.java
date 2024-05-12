package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.carni.Carno;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CarnoModel extends AnimatedGeoModel<Carno> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carnomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carnofemale.png"));

        public final ResourceLocation resourceLocation;

        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) {
            return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/carno.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/carno.animation.json");


    @Override
    public ResourceLocation getModelLocation(Carno object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Carno object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Carno animatable) {
        return animation;
    }
}

