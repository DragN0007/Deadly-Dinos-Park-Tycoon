package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Igua;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IguaModel extends AnimatedGeoModel<Igua> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/iguamale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/iguafemale.png")),
        PERIDOT(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/iguagold.png")),
        BEE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/iguabee.png")), //Texture funded by BumbleBeez32
        FOX(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/iguafox.png")); //Texture funded by Foxx

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/igua.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/igua.animation.json");



    @Override
    public ResourceLocation getModelLocation(Igua object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Igua object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Igua animatable) {
        return animation;
    }
}
