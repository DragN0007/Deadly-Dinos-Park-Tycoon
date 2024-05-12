package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.herbi.Para;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ParaModel extends AnimatedGeoModel<Para> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/paramale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafemale.png")),
        PERIDOT(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/paraperidot.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/para.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/para.animation.json");



    @Override
    public ResourceLocation getModelLocation(Para object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Para object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Para animatable) {
        return animation;
    }
}
