package com.dragn0007.deadlydinos.client.model;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import com.dragn0007.deadlydinos.entity.herbi.Amarga;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AmargaModel extends AnimatedGeoModel<Amarga> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/amargamale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/amargafemale.png")),
        CITRINE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/amargacitrine.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/amarga.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/amarga.animation.json");



    public static final ResourceLocation baby_model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/baby_amarga.geo.json");
    @Override
    public ResourceLocation getModelLocation(Amarga object) {
        if(object.isBaby())
            return baby_model;
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Amarga object) {
        if(object.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/amargababy.png"));
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Amarga animatable) {
        if(animatable.isBaby())
            return (new ResourceLocation(DeadlyDinosPT.MODID, "animations/baby_amarga.animation.json"));
        return animation;
    }
}
