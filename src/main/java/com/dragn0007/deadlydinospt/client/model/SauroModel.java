package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Sauro;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SauroModel extends AnimatedGeoModel<Sauro> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/sauromale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/saurofemale.png")),
        SPECIAL(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/saurospecial.png")),
        DARK(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/saurodark.png"));

        public final ResourceLocation resourceLocation;

        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) {
            return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/sauro.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/sauro.animation.json");


    @Override
    public ResourceLocation getModelLocation(Sauro object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Sauro object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Sauro animatable) {
        return animation;
    }
}
