package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Rex;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RexModel extends AnimatedGeoModel<Rex> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/rexmale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/rexfemale.png")),
        CORAL(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/rexcoral.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/rex.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/rex.animation.json");



    @Override
    public ResourceLocation getModelLocation(Rex object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Rex object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Rex animatable) {
        return animation;
    }
}
