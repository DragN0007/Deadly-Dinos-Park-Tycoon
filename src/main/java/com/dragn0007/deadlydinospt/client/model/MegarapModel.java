package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Megarap;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MegarapModel extends AnimatedGeoModel<Megarap> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megarapmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megarapfemale.png")),
        BRICH(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/megarapbirch.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/megarap.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/megarap.animation.json");



    @Override
    public ResourceLocation getModelLocation(Megarap object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Megarap object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Megarap animatable) {
        return animation;
    }
}
