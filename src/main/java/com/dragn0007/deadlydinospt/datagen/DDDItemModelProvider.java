package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDDBlocksDataGen;
import com.dragn0007.deadlydinospt.item.DDDItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDDItemModelProvider extends ItemModelProvider {
    public DDDItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DeadlyDinosPT.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(DDDItems.GRYPOTROPHY.get());
        simpleItem(DDDItems.GRYPO_SPAWN_EGG.get());
        simpleItem(DDDItems.ALLOTROPHY.get());
        simpleItem(DDDItems.ALLO_SPAWN_EGG.get());
        simpleItem(DDDItems.DILOTROPHY.get());
        simpleItem(DDDItems.DILO_SPAWN_EGG.get());
        simpleItem(DDDItems.AMPELOTROPHY.get());
        simpleItem(DDDItems.AMPELO_SPAWN_EGG.get());

        simpleItem(DDDItems.DINO_NUGGET_1.get());
        simpleItem(DDDItems.DINO_NUGGET_2.get());
        simpleItem(DDDItems.DINO_NUGGET_3.get());
        simpleItem(DDDItems.HEARTY_SALAD.get());
        simpleItem(DDDItems.SMOOTHIE.get());
        simpleItem(DDDItems.DINO_DUMPLING.get());
        simpleItem(DDDItems.DOUGH.get());
        simpleItem(DDDItems.BROTH.get());
        simpleItem(DDDItems.BONE_MARROW.get());
        simpleItem(DDDItems.CHICKEN_NOODLE_SOUP.get());
        simpleItem(DDDItems.DINO_ROAST.get());

        simpleSpriteBlockItem(DDDBlocksDataGen.ASTEROXYLON.get());
        simpleSpriteBlockItem(DDDBlocksDataGen.HORSETAIL.get());
    }

    private ItemModelBuilder simpleSpriteBlockItem(Block block) {
        return withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"items/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"items/" + item.getRegistryName().getPath()));
    }
}