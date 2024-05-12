package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.TarboModel;
import com.dragn0007.deadlydinospt.entity.carni.Tarbo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TarboRender extends GeoEntityRenderer<Tarbo> {
    public TarboRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TarboModel());
    }
}
