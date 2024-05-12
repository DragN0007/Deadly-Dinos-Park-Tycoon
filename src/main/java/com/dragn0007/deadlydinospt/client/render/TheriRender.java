package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.TheriModel;
import com.dragn0007.deadlydinospt.entity.herbi.Theri;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TheriRender extends GeoEntityRenderer<Theri> {
    public TheriRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new TheriModel());
    }
}
