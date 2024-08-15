package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.ArganModel;
import com.dragn0007.deadlydinospt.entity.marine.Argan;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class ArganRender extends GeoEntityRenderer<Argan> {
    public ArganRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ArganModel());
    }
}
