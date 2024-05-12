package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Giga;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GigaModel extends AnimatedGeoModel<Giga> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gigamale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/gigafemale.png"));

        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/giga.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/giga.animation.json");



    @Override
    public ResourceLocation getModelLocation(Giga object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Giga object) {return object.getTextureLocation();}

    @Override
    public ResourceLocation getAnimationFileLocation(Giga animatable) {
        return animation;
    }
}
