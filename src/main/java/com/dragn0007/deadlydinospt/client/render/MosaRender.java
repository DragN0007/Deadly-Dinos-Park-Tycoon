package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.MosaModel;
import com.dragn0007.deadlydinospt.entity.marine.Mosa;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MosaRender extends GeoEntityRenderer<Mosa> {
    public MosaRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MosaModel());
    }
}
