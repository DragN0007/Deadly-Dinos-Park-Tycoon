package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Basilo;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BasiloModel extends AnimatedGeoModel<Basilo> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/basilomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/basilofemale.png")),
        NAVY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/basilonavy.png")),
        WHITE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/basilowhite.png")),
        WINE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/basilowine.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/basilo.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/basilo.animation.json");



    @Override
    public ResourceLocation getModelLocation(Basilo object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Basilo object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Basilo animatable) {
        return animation;
    }
}
