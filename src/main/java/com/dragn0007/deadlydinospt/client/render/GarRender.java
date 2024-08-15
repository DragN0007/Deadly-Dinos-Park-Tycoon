package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.GarModel;
import com.dragn0007.deadlydinospt.entity.marine.Gar;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GarRender extends GeoEntityRenderer<Gar> {
    public GarRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GarModel());
    }
}
