package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.GalliModel;
import com.dragn0007.deadlydinospt.entity.herbi.Galli;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GalliRender extends GeoEntityRenderer<Galli> {
    public GalliRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GalliModel());
    }

    @Override
    public RenderType getRenderType(Galli animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        if(animatable.isBaby()) {
            stack.scale(0.4F, 0.4F, 0.4F);
        } else {
            stack.scale(1F, 1F, 1F);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
