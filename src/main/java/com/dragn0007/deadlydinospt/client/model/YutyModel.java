package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Yuty;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class YutyModel extends AnimatedGeoModel<Yuty> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/yutymale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/yutyfemale.png")),
        ICY(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/yutyicy.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/yuty.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/yuty.animation.json");



    @Override
    public ResourceLocation getModelLocation(Yuty object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Yuty object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Yuty animatable) {
        return animation;
    }
}
