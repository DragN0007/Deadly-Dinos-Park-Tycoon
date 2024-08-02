package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.science.EmbryoInitiatorEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class EmbryoInitiatorScreen extends AbstractContainerScreen<EmbryoInitiatorMenu> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(DeadlyDinosPT.MODID, "textures/gui/embryo_initiator.png");

    public EmbryoInitiatorScreen(EmbryoInitiatorMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, partialTick);
        this.renderTooltip(poseStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTick, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        this.blit(poseStack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);

        int p = 24 * this.menu.data.get(0) / EmbryoInitiatorEntity.MAX_INITIALIZATION_TIME;
        this.blit(poseStack, this.leftPos + 84, this.topPos + 34, 176, 14, p, 16);
    }
}
