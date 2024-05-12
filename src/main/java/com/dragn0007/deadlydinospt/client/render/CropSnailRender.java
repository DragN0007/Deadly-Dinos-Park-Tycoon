package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.CropSnailModel;
import com.dragn0007.deadlydinospt.entity.herbi.CropSnail;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CropSnailRender extends GeoEntityRenderer<CropSnail> {
    public CropSnailRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CropSnailModel());
    }
}
