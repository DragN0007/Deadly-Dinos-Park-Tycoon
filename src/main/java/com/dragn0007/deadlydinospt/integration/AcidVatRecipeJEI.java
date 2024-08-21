package com.dragn0007.deadlydinospt.integration;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.block.science.AcidVatEntity;
import com.dragn0007.deadlydinospt.client.menu.AcidVatMenu;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import javax.annotation.Nonnull;

//public class AcidVatRecipeJEI implements IRecipeCategory<AcidVatEntity> {
//    public final static ResourceLocation UID = new ResourceLocation(DeadlyDinosPT.MODID, "acid_vat");
//    public final static ResourceLocation TEXTURE =
//            new ResourceLocation(DeadlyDinosPT.MODID, "textures/gui/acid_vat.png");
//
//    private final IDrawable background;
//    private final IDrawable icon;
//
//    public AcidVatRecipeJEI(IGuiHelper helper) {
//        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
//        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM, new ItemStack(DDPTBlocksDataGen.ACID_VAT.get()));
//    }
//
//    @Override
//    public ResourceLocation getUid() {
//        return UID;
//    }
//
//    @Override
//    public Class<? extends AcidVatEntity> getRecipeClass() {
//        return AcidVatEntity.class;
//    }
//
//    @Override
//    public Component getTitle() {
//        return new TranslatableComponent("container.acid_vat");
//    }
//
//    @Override
//    public IDrawable getBackground() {
//        return this.background;
//    }
//
//    @Override
//    public IDrawable getIcon() {
//        return this.icon;
//    }
//
//    @Override
//    public void setRecipe(@Nonnull IRecipeLayoutBuilder builder, @Nonnull AcidVatMenu entity, @Nonnull IFocusGroup focusGroup) {
//
//        builder.addSlot(RecipeIngredientRole.INPUT, 33, 34).addIngredients(Ingredient.of(DDPTItems.ACID_BUCKET.get())); //Acid
//        builder.addSlot(RecipeIngredientRole.INPUT, 79, 17).addIngredients(entity.getIngredients().get(0)); //Fossil
//
//        builder.addSlot(RecipeIngredientRole.OUTPUT, 56, 51).addItemStack(entity.getResultItem()); //Tissue
//        builder.addSlot(RecipeIngredientRole.OUTPUT, 102, 51).addItemStack(entity.getResultItem()); //Bonemeal
//    }
//}
