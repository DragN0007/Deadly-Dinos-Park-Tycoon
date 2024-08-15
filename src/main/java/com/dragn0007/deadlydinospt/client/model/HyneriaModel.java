package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.marine.Hyneria;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class HyneriaModel extends AnimatedGeoModel<Hyneria> {
    
    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/hyneriamale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/hyneriafemale.png")),
        PINK(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/hyneriapink.png"));
        
        public final ResourceLocation resourceLocation;
        Variant(ResourceLocation resourceLocation) {
            this.resourceLocation = resourceLocation;
        }

        public static Variant variantFromOrdinal(int variant) { return Variant.values()[variant % Variant.values().length];
        }
    }

    public static final ResourceLocation model = new ResourceLocation(DeadlyDinosPT.MODID, "geo/hyneria.geo.json");
    public static final ResourceLocation animation = new ResourceLocation(DeadlyDinosPT.MODID, "animations/hyneria.animation.json");



    @Override
    public ResourceLocation getModelLocation(Hyneria object) {
        return model;
    }

    @Override
    public ResourceLocation getTextureLocation(Hyneria object) {
        return object.getTextureLocation();
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Hyneria animatable) {
        return animation;
    }
}
