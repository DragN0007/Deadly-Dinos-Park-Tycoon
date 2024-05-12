package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.TroodonModel;
import com.dragn0007.deadlydinospt.entity.carni.Troodon;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TroodonRender extends GeoEntityRenderer<Troodon> {
    public TroodonRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TroodonModel());
    }
}
