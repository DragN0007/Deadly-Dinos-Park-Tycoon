package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.GalliModel;
import com.dragn0007.deadlydinospt.entity.herbi.Galli;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GalliRender extends GeoEntityRenderer<Galli> {
    public GalliRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GalliModel());
    }
}
