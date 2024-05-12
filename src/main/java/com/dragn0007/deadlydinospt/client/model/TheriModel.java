package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Theri;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class TheriModel extends AnimatedGeoModel<Theri> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/therimale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/therifemale.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/theri.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/theri.animation.json");



    @Override
    public ResourceLocation getModelLocation(Theri object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Theri object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Theri animatable) {
        return animation;
    }
}
