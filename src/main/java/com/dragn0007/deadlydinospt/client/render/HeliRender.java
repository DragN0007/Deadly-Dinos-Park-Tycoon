package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.HeliModel;
import com.dragn0007.deadlydinospt.entity.marine.Heli;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class HeliRender extends GeoEntityRenderer<Heli> {
    public HeliRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new HeliModel());
    }
}
