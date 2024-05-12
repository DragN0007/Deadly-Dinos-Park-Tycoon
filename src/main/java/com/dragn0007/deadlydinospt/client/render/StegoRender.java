package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.StegoModel;
import com.dragn0007.deadlydinospt.entity.herbi.Stego;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class StegoRender extends GeoEntityRenderer<Stego> {
    public StegoRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new StegoModel());
    }
}
