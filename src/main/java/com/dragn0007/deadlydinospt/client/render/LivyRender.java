package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.LivyModel;
import com.dragn0007.deadlydinospt.entity.marine.Livy;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class LivyRender extends GeoEntityRenderer<Livy> {
    public LivyRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new LivyModel());
    }
}
