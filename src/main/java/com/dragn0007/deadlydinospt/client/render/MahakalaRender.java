package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.MahakalaModel;
import com.dragn0007.deadlydinospt.entity.carni.Mahakala;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MahakalaRender extends GeoEntityRenderer<Mahakala> {
    public MahakalaRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MahakalaModel());
    }
}
