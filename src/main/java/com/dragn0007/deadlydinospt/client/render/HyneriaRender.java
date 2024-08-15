package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.HyneriaModel;
import com.dragn0007.deadlydinospt.entity.marine.Hyneria;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HyneriaRender extends GeoEntityRenderer<Hyneria> {
    public HyneriaRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HyneriaModel());
    }
}
