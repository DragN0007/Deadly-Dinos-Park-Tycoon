package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.MegModel;
import com.dragn0007.deadlydinospt.entity.marine.Meg;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MegRender extends GeoEntityRenderer<Meg> {
    public MegRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MegModel());
    }
}
