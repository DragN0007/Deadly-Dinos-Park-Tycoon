package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.RexModel;
import com.dragn0007.deadlydinospt.entity.carni.Rex;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RexRender extends GeoEntityRenderer<Rex> {
    public RexRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RexModel());
    }
}
