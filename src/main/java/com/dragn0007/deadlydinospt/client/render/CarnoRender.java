package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.CarnoModel;
import com.dragn0007.deadlydinospt.entity.carni.Carno;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CarnoRender extends GeoEntityRenderer<Carno> {
    public CarnoRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CarnoModel());
    }
}
