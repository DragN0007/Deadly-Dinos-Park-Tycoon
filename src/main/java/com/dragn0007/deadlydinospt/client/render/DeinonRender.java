package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.DeinonModel;
import com.dragn0007.deadlydinospt.entity.carni.Deinon;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DeinonRender extends GeoEntityRenderer<Deinon> {
    public DeinonRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DeinonModel());
    }
}
