package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.util.DDPTTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class DDPTRecipeMaker extends RecipeProvider implements IConditionBuilder {
    public DDPTRecipeMaker(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {

        ShapedRecipeBuilder.shaped(DDPTBlocks.WIRE_FENCE_1.get())
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .pattern("BAB")
                .pattern("BBB")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocks.WIRE_FENCE_2.get())
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .pattern("BAB")
                .pattern("BAB")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocks.WIRE_FENCE_3.get())
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .pattern("AAA")
                .pattern("BAB")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocks.WIRE_FENCE_4.get())
                .define('A', Items.IRON_NUGGET)
                .pattern("AAA")
                .pattern("AAA")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);



        ShapedRecipeBuilder.shaped(DDPTItems.EOCARCHARIA_ARMOR.get())
                .define('A', Items.LEATHER)
                .define('B', Items.IRON_BLOCK)
                .pattern("BBB")
                .pattern("BA ")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_BLOCK).build()))
                .save(pFinishedRecipeConsumer);


        //Benches, crafting
        ShapedRecipeBuilder.shaped(DDPTBlocksDataGen.ACID_VAT.get())
                .define('A', Items.IRON_BLOCK)
                .define('B', Items.IRON_INGOT)
                .define('C', Items.GLASS_PANE)
                .pattern("BBB")
                .pattern("CCC")
                .pattern("ABA")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocksDataGen.DNA_EXTRACTOR.get())
                .define('B', Items.IRON_INGOT)
                .define('C', Items.GLASS_PANE)
                .pattern("BCB")
                .pattern("C C")
                .pattern("BBB")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocksDataGen.EMBRYO_INITIATOR.get())
                .define('A', DDPTTags.Items.PLANKS)
                .define('B', DDPTItems.TEST_TUBE.get())
                .define('C', DDPTItems.PETRI_DISH.get())
                .pattern("BBB")
                .pattern("ACA")
                .pattern("AAA")
                .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.PLANKS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocksDataGen.EMBRYO_INJECTOR.get())
                .define('B', Items.IRON_INGOT)
                .define('C', DDPTItems.TEST_TUBE.get())
                .pattern(" C ")
                .pattern("BBB")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.TEST_TUBE.get())
                .define('B', Items.IRON_NUGGET)
                .define('C', Items.GLASS_PANE)
                .pattern("CBC")
                .pattern("C C")
                .pattern("CCC")
                .unlockedBy("has_iron_nugget", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_NUGGET).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.PETRI_DISH.get())
                .define('B', Items.IRON_INGOT)
                .define('C', Items.GLASS_PANE)
                .pattern("CBC")
                .pattern("CCC")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.ACID_BUCKET.get())
                .requires(Items.REDSTONE)
                .requires(Items.GUNPOWDER)
                .requires(Items.FERMENTED_SPIDER_EYE)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_water_bucket", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WATER_BUCKET).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.CHISEL.get())
                .define('A', Items.IRON_NUGGET)
                .define('B', Items.IRON_INGOT)
                .define('C', Items.STICK)
                .pattern("A")
                .pattern("B")
                .pattern("C")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.BRUSH.get())
                .define('A', Items.WHEAT)
                .define('B', Items.IRON_INGOT)
                .define('C', Items.STICK)
                .pattern("A")
                .pattern("B")
                .pattern("C")
                .unlockedBy("has_iron", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.IRON_INGOT).build()))
                .save(pFinishedRecipeConsumer);




        //Small
        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 2)
                .requires(DDPTTags.Items.SMALL_BONES)
                .unlockedBy("has_small_bone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.SMALL_BONES)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_small_bones"));

        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 1)
                .requires(DDPTTags.Items.SMALL_FOSSILS)
                .unlockedBy("has_small_fossil", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.SMALL_FOSSILS)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_small_fossils"));

        //Medium
        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 4)
                .requires(DDPTTags.Items.MEDIUM_BONES)
                .unlockedBy("has_medium_bone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.MEDIUM_BONES)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_medium_bones"));

        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 2)
                .requires(DDPTTags.Items.MEDIUM_FOSSILS)
                .unlockedBy("has_medium_fossil", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.MEDIUM_FOSSILS)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_medium_fossils"));

        //Large
        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 6)
                .requires(DDPTTags.Items.LARGE_BONES)
                .unlockedBy("has_large_bone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.LARGE_BONES)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_large_bones"));

        ShapelessRecipeBuilder.shapeless(Items.BONE_MEAL, 3)
                .requires(DDPTTags.Items.LARGE_FOSSILS)
                .unlockedBy("has_large_fossil", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.LARGE_FOSSILS)
                        .build()))
                .save(pFinishedRecipeConsumer, new ResourceLocation("deadlydinospt", "bonemeal_from_large_fossils"));




        //Food
        ShapelessRecipeBuilder.shapeless(DDPTItems.DINO_ROAST.get())
                .requires(DDPTTags.Items.MEATS)
                .requires(DDPTTags.Items.VEGETABLES)
                .requires(DDPTTags.Items.VEGETABLES)
                .requires(DDPTBlocks.CYPERUS.get())
                .requires(DDPTItems.BONE_MARROW.get())
                .unlockedBy("has_meat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.MEATS)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.CHICKEN_NOODLE_SOUP.get())
                .requires(DDPTTags.Items.RAW_CHICKEN)
                .requires(DDPTItems.BROTH.get())
                .requires(DDPTTags.Items.DOUGH)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTItems.DOUGH.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.DINO_DUMPLING.get())
                .requires(DDPTTags.Items.MEATS)
                .requires(DDPTTags.Items.VEGETABLES)
                .requires(DDPTTags.Items.DOUGH)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTItems.DOUGH.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.SMOOTHIE.get())
                .requires(DDPTItems.TIGER_NUTS.get())
                .requires(DDPTItems.YEW_PLUM.get())
                .unlockedBy("has_plum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTItems.YEW_PLUM.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.HEARTY_SALAD.get())
                .requires(DDPTTags.Items.VEGETABLES)
                .requires(DDPTTags.Items.VEGETABLES)
                .requires(DDPTBlocks.COOKSONIA.get())
                .requires(DDPTItems.TIGER_NUTS.get())
                .unlockedBy("has_veggies", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.VEGETABLES)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.DOUGH.get())
                .requires(Items.WHEAT)
                .requires(Items.POTION)
                .unlockedBy("has_wheat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.WHEAT)
                        .build()))
                .save(pFinishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(DDPTItems.BROTH.get())
                .requires(DDPTItems.BONE_MARROW.get())
                .unlockedBy("has_bone_marrow", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTItems.BONE_MARROW.get())
                        .build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DDPTTags.Items.BONES), DDPTItems.BONE_MARROW.get(), 0.35F, 200)
                .unlockedBy("has_bone", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.BONES).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smoking(Ingredient.of(DDPTItems.DOUGH.get()), Items.BREAD, 0.35F, 200)
                .unlockedBy("has_dough", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.DOUGH).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTBlocks.DINO_NUGGETS_BOX.get())
                .define('A', DDPTTags.Items.RAW_CHICKEN)
                .define('B', Items.PAPER)
                .define('C', Items.BREAD)
                .pattern("BBB")
                .pattern("AAA")
                .pattern("CCC")
                .unlockedBy("has_chicken", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.RAW_CHICKEN).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.SODA.get())
                .define('A', Items.SUGAR)
                .define('B', Items.IRON_NUGGET)
                .define('C', Items.POTION)
                .pattern(" B ")
                .pattern(" AC")
                .pattern(" B ")
                .unlockedBy("has_sugar", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.SUGAR).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.MRE.get())
                .define('A', DDPTTags.Items.MEATS)
                .define('C', DDPTTags.Items.VEGETABLES)
                .define('B', DDPTItems.CRACKER.get())
                .pattern(" B ")
                .pattern(" AC")
                .pattern(" B ")
                .unlockedBy("has_veggies", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.VEGETABLES).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.DINOSANDWICH.get())
                .define('A', DDPTItems.COOKEDMEDIUMMEAT.get())
                .define('C', DDPTTags.Items.VEGETABLES)
                .define('B', Items.BREAD)
                .pattern(" B ")
                .pattern(" AC")
                .pattern(" B ")
                .unlockedBy("has_veggies", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.VEGETABLES).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.CANNEDVEGGIES.get())
                .define('A', DDPTTags.Items.VEGETABLES)
                .define('B', Items.IRON_NUGGET)
                .pattern(" B ")
                .pattern(" AA")
                .pattern(" B ")
                .unlockedBy("has_veggies", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.VEGETABLES).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.CANNEDSTEW.get())
                .define('A', DDPTTags.Items.MEATS)
                .define('C', DDPTTags.Items.VEGETABLES)
                .define('B', Items.IRON_NUGGET)
                .pattern(" B ")
                .pattern(" AC")
                .pattern(" B ")
                .unlockedBy("has_meat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.MEATS).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(DDPTItems.CANNEDMEAT.get())
                .define('A', DDPTTags.Items.MEATS)
                .define('B', Items.IRON_NUGGET)
                .pattern(" B ")
                .pattern(" AA")
                .pattern(" B ")
                .unlockedBy("has_meat", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(DDPTTags.Items.MEATS).build()))
                .save(pFinishedRecipeConsumer);

    }
}