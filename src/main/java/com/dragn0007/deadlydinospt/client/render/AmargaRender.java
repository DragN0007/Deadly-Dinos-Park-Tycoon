package com.dragn0007.deadlydinospt.client.render;

import com.dragn0007.deadlydinospt.client.model.AmargaModel;
import com.dragn0007.deadlydinospt.entity.herbi.Amarga;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.ItemTransforms;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.geo.render.built.GeoBone;
import software.bernie.geckolib3.geo.render.built.GeoModel;
import software.bernie.geckolib3.renderers.geo.ExtendedGeoEntityRenderer;

public class AmargaRender extends ExtendedGeoEntityRenderer<Amarga> {
    public AmargaRender(EntityRendererProvider.Context renderManager) {
        super(renderManager, new AmargaModel());
    }


    @Override
    public void render(GeoModel model, Amarga animatable, float partialTick, RenderType type, PoseStack poseStack, MultiBufferSource bufferSource, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {

        if(animatable.isChested()) {
            model.getBone("SaddleBags").ifPresent(b -> b.setHidden(false));
        } else {
            model.getBone("SaddleBags").ifPresent(b -> b.setHidden(true));
        }

        if(animatable.isSaddled()) {
            model.getBone("Saddle").ifPresent(b -> b.setHidden(false));
            model.getBone("Saddle2").ifPresent(b -> b.setHidden(false));
            model.getBone("UnderSaddleHorns").ifPresent(b -> b.setHidden(true));
        } else {
            model.getBone("Saddle").ifPresent(b -> b.setHidden(true));
            model.getBone("Saddle2").ifPresent(b -> b.setHidden(true));
            model.getBone("UnderSaddleHorns").ifPresent(b -> b.setHidden(false));
        }

        super.render(model, animatable, partialTick, type, poseStack, bufferSource, buffer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    protected boolean isArmorBone(GeoBone bone) {
        return false;
    }

    @Nullable
    @Override
    protected ResourceLocation getTextureForBone(String boneName, Amarga animatable) {
        return null;
    }

    @Nullable
    @Override
    protected ItemStack getHeldItemForBone(String boneName, Amarga animatable) {
        return null;
    }

    @Override
    protected ItemTransforms.TransformType getCameraTransformForItemAtBone(ItemStack stack, String boneName) {
        return null;
    }

    @Nullable
    @Override
    protected BlockState getHeldBlockForBone(String boneName, Amarga animatable) {
        return null;
    }

    @Override
    protected void preRenderItem(PoseStack poseStack, ItemStack stack, String boneName, Amarga animatable, IBone bone) {

    }

    @Override
    protected void preRenderBlock(PoseStack poseStack, BlockState state, String boneName, Amarga animatable) {

    }

    @Override
    protected void postRenderItem(PoseStack poseStack, ItemStack stack, String boneName, Amarga animatable, IBone bone) {

    }

    @Override
    protected void postRenderBlock(PoseStack poseStack, BlockState state, String boneName, Amarga animatable) {

    }
}
