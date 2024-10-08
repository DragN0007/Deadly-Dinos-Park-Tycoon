package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.carni.Acro;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AcroModel extends AnimatedGeoModel<Acro> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/acromale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/acrofemale.png")),
        ALBINO(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/acroalbino.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/acro.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/acro.animation.json");



    @Override
    public ResourceLocation getModelLocation(Acro object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Acro object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Acro animatable) {
        return animation;
    }
}
