package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.nonliving.CarSide;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CarSideModel extends AnimatedGeoModel<CarSide> {

    public enum Variant {
        GREY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carg.png")),
        GREYD(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/cargdamaged.png")),

        BLACK(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/card.png")),
        BLACKD(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carddamaged.png")),

        BLUE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carb.png")),
        BLUED(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carbdamaged.png")),

        RED(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carr.png")),
        REDD(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/carrdamaged.png"));

        public final ResourceLocation resourceLocation;

        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) {
            return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/carside.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "");


    @Override
    public ResourceLocation getModelLocation(CarSide object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(CarSide object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(CarSide animatable) {
        return animation;
    }
}


