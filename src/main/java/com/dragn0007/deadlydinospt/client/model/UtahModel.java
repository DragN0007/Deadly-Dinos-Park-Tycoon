package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Utah;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class UtahModel extends AnimatedGeoModel<Utah> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/utahmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/utahfemale.png")),
        CHARCOAL(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/utahcharcoal.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/utah.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/utah.animation.json");



    @Override
    public ResourceLocation getModelLocation(Utah object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Utah object) {
        return object.getTextureLocation();

    }

    @Override
    public ResourceLocation getAnimationFileLocation(Utah animatable) {
        return animation;
    }
}
