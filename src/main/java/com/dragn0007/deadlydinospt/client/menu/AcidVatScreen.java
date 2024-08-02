package com.dragn0007.deadlydinospt.client.menu;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;

public class AcidVatScreen extends AbstractContainerScreen<AcidVatMenu> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(DeadlyDinosPT.MODID, "textures/gui/acid_vat.png");
    public static final int[] ACID_BUBBLES = {28, 23, 18, 13, 9, 5, 0};

    public AcidVatScreen(AcidVatMenu menu, Inventory playerInventory, Component component) {
        super(menu, playerInventory, component);
    }

    @Override
    public void render(PoseStack poseStack, int mouseX, int mouseY, float partialTick) {
        this.renderBackground(poseStack);
        super.render(poseStack, mouseX, mouseY, partialTick);
        this.renderTooltip(poseStack, mouseX, mouseY);
    }

    @Override
    protected void renderBg(PoseStack poseStack, float partialTick, int pMouseX, int pMouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1f, 1f, 1f, 1f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        this.blit(poseStack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);


        int acidLevel = this.menu.data.get(0);
        int boilTime = this.menu.data.get(1);

        int acid = 18 * acidLevel / AcidVatEntity.MAX_ACID_LEVEL;
        this.blit(poseStack, this.leftPos + 60, this.topPos + 44, 176, 29, acid, 4);

        int boil = 28 * boilTime / AcidVatEntity.MAX_BOIL_TIME;
        this.blit(poseStack, this.leftPos + 97, this.topPos + 17, 176, 0, 8, boil);

        if(boil > 0) {
            int bubble = ACID_BUBBLES[boilTime / 2 % ACID_BUBBLES.length];
            this.blit(poseStack, this.leftPos + 63, this.topPos + 14 + bubble, 184, bubble, 13, 28 - bubble);
        }

    }
}