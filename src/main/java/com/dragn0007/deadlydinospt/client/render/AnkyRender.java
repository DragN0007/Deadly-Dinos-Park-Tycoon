package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.AnkyModel;
import com.dragn0007.deadlydinospt.entity.herbi.Anky;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AnkyRender extends GeoEntityRenderer<Anky> {
    public AnkyRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AnkyModel());
    }
}
