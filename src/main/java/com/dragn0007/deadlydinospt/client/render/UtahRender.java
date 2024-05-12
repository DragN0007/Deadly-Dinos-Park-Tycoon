package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.UtahModel;
import com.dragn0007.deadlydinospt.entity.carni.Utah;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class UtahRender extends GeoEntityRenderer<Utah> {
    public UtahRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new UtahModel());
    }
}
