package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.AcroModel;
import com.dragn0007.deadlydinospt.entity.carni.Acro;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class AcroRender extends GeoEntityRenderer<Acro> {
    public AcroRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AcroModel());
    }
}
