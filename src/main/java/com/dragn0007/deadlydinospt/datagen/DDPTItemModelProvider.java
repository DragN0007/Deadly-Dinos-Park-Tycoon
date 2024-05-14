package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDPTItemModelProvider extends ItemModelProvider {
    public DDPTItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DeadlyDinosPT.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        simpleItem(DDPTItems.GRYPOTROPHY.get());
        simpleItem(DDPTItems.GRYPO_SPAWN_EGG.get());
        simpleItem(DDPTItems.ALLOTROPHY.get());
        simpleItem(DDPTItems.ALLO_SPAWN_EGG.get());
        simpleItem(DDPTItems.DILOTROPHY.get());
        simpleItem(DDPTItems.DILO_SPAWN_EGG.get());
        simpleItem(DDPTItems.AMPELOTROPHY.get());
        simpleItem(DDPTItems.AMPELO_SPAWN_EGG.get());

        simpleItem(DDPTItems.DINO_NUGGET_1.get());
        simpleItem(DDPTItems.DINO_NUGGET_2.get());
        simpleItem(DDPTItems.DINO_NUGGET_3.get());
        simpleItem(DDPTItems.HEARTY_SALAD.get());
        simpleItem(DDPTItems.SMOOTHIE.get());
        simpleItem(DDPTItems.DINO_DUMPLING.get());
        simpleItem(DDPTItems.DOUGH.get());
        simpleItem(DDPTItems.BROTH.get());
        simpleItem(DDPTItems.BONE_MARROW.get());
        simpleItem(DDPTItems.CHICKEN_NOODLE_SOUP.get());
        simpleItem(DDPTItems.DINO_ROAST.get());

        simpleItem(DDPTItems.UTAH_EGG .get());
        simpleItem(DDPTItems.COMPY_EGG.get());
        simpleItem(DDPTItems.ACRO_EGG.get());
        simpleItem(DDPTItems.CARNO_EGG.get());
        simpleItem(DDPTItems.CERATO_EGG.get());
        simpleItem(DDPTItems.GIGA_EGG.get());
        simpleItem(DDPTItems.REX_EGG.get());
        simpleItem(DDPTItems.SPINO_EGG.get());
        simpleItem(DDPTItems.MAHAKALA_EGG.get());
        simpleItem(DDPTItems.AUSTRO_EGG.get());
        simpleItem(DDPTItems.DEINON_EGG.get());
        simpleItem(DDPTItems.ALBERTO_EGG.get());
        simpleItem(DDPTItems.MAJUNGA_EGG.get());
        simpleItem(DDPTItems.TROODON_EGG.get());
        simpleItem(DDPTItems.ARCHAE_EGG.get());
        simpleItem(DDPTItems.TARBO_EGG.get());
        simpleItem(DDPTItems.ANDAL_EGG.get());
        simpleItem(DDPTItems.CARCHAR_EGG.get());
        simpleItem(DDPTItems.ALLO_EGG.get());
        simpleItem(DDPTItems.DILO_EGG.get());
        simpleItem(DDPTItems.CROPSNAIL_EGG.get());
        simpleItem(DDPTItems.AMARGA_EGG.get());
        simpleItem(DDPTItems.PARA_EGG.get());
        simpleItem(DDPTItems.THERI_EGG.get());
        simpleItem(DDPTItems.DEINOCH_EGG.get());
        simpleItem(DDPTItems.STEGO_EGG.get());
        simpleItem(DDPTItems.SHANT_EGG.get());
        simpleItem(DDPTItems.GALLI_EGG.get());
        simpleItem(DDPTItems.SAURO_EGG.get());
        simpleItem(DDPTItems.ANKY_EGG.get());
        simpleItem(DDPTItems.AVA_EGG.get());
        simpleItem(DDPTItems.GRYPO_EGG.get());
        simpleItem(DDPTItems.AMPELO_EGG.get());


        simpleSpriteBlockItem(DDPTBlocksDataGen.ASTEROXYLON.get());
        simpleSpriteBlockItem(DDPTBlocksDataGen.HORSETAIL.get());
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