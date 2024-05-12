package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.DiloModel;
import com.dragn0007.deadlydinospt.entity.carni.Dilo;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class DiloRender extends GeoEntityRenderer<Dilo> {
    public DiloRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new DiloModel());
    }
}
