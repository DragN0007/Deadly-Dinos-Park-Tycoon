package com.dragn0007.deadlydinospt.client.model;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.herbi.Para;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ParaModel extends AnimatedGeoModel<Para> {

    public enum Variant {
        MALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/paramale.png")),
        FEMALE(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafemale.png")),
        PERIDOT(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/paraperidot.png")),
        FROGGYFRIEND_1(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafroggy.png")), //Texture funded by FroggyFriend
        FROGGYFRIEND_2(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafroggy2.png")), //Texture funded by FroggyFriend
        FROGGYFRIEND_3(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafroggy3.png")), //Texture funded by FroggyFriend
        FROGGYFRIEND_4(new ResourceLocation(DeadlyDinosPT.MODID, "textures/entity/parafroggy4.png")); //Texture funded by FroggyFriend

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
