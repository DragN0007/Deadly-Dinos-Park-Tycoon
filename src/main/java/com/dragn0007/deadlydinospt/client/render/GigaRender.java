package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.GigaModel;
import com.dragn0007.deadlydinospt.entity.carni.Giga;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GigaRender extends GeoEntityRenderer<Giga> {
    public GigaRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GigaModel());
    }
}
