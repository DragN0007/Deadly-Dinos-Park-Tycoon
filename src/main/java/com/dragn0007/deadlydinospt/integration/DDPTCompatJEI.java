package com.dragn0007.deadlydinospt.integration;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.constants.RecipeTypes;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.crafting.RecipeType;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

//public class DDPTCompatJEI implements IModPlugin {
//    @Override
//    public ResourceLocation getPluginUid() {
//        return new ResourceLocation(DeadlyDinosPT.MODID, "jei_plugin");
//    }
//
//    @Override
//    public void registerCategories(IRecipeCategoryRegistration registration) {
//        registration.addRecipeCategories(new AcidVatRecipeJEI(registration.getJeiHelpers().getGuiHelper()));
//    }
//
//    @Override
//    public void registerRecipes(IRecipeRegistration registration) {
//        RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
//        List<AcidVatEntity> recipes = recipeManager.getAllRecipesFor(AcidVatRecipeType.INSTANCE);
//
//        registration.addRecipes(new RecipeType<>(GemCuttingStationRecipeCategory.UID, GemCuttingStationRecipe.class), recipes);
//    }
//}