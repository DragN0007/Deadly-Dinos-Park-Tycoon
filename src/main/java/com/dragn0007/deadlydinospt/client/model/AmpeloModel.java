package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Ampelo;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmpeloModel extends AnimatedGeoModel<Ampelo> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/ampelomale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/ampelofemale.png")),
        LAVENDER(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/ampelolavender.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/ampelo.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/ampelo.animation.json");



    public static final ResourceLocation baby_model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/baby_ampelo.geo.json");
    @Override
    public ResourceLocation getModelLocation(Ampelo object) {
        if(object.isBaby())
            return baby_model;
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Ampelo object) {
        if(object.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/ampelobaby.png"));
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Ampelo animatable) {
        if(animatable.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "animations/baby_ampelo.animation.json"));
        return animation;
    }
}
