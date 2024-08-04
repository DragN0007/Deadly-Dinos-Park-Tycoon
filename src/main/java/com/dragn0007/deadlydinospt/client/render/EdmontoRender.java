package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.EdmontoModel;
import com.dragn0007.deadlydinospt.entity.herbi.Edmonto;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class EdmontoRender extends GeoEntityRenderer<Edmonto> {
    public EdmontoRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new EdmontoModel());
    }
}
