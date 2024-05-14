package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Majunga;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MajungaModel extends AnimatedGeoModel<Majunga> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/majungamale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/majungafemale.png")),
        SPECIAL(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/majungaspecial.png")),
        RED(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/majungared.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/majunga.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/majunga.animation.json");



    @Override
    public ResourceLocation getModelLocation(Majunga object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Majunga object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Majunga animatable) {
        return animation;
    }
}
