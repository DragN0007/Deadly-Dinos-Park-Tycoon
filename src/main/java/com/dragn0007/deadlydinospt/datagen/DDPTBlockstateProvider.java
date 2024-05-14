package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDPTBlockstateProvider extends BlockStateProvider {
    public DDPTBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DeadlyDinosPT.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {

        simpleBlock(DDPTBlocks.STONE_FOSSIL_MED_CARNI_1.get());
        simpleBlockItem(DDPTBlocks.STONE_FOSSIL_MED_CARNI_1.get(), models().cubeAll(DDPTBlocks.STONE_FOSSIL_MED_CARNI_1.get().getRegistryName().getPath(),
                blockTexture(DDPTBlocks.STONE_FOSSIL_MED_CARNI_1.get())));

        simpleBlock(DDPTBlocks.STONE_FOSSIL_MED_CARNI_2.get());
        simpleBlockItem(DDPTBlocks.STONE_FOSSIL_MED_CARNI_2.get(), models().cubeAll(DDPTBlocks.STONE_FOSSIL_MED_CARNI_2.get().getRegistryName().getPath(),
                blockTexture(DDPTBlocks.STONE_FOSSIL_MED_CARNI_2.get())));

        simpleBlock(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_1.get());
        simpleBlockItem(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_1.get(), models().cubeAll(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_1.get().getRegistryName().getPath(),
                blockTexture(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_1.get())));

        simpleBlock(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_2.get());
        simpleBlockItem(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_2.get(), models().cubeAll(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_2.get().getRegistryName().getPath(),
                blockTexture(DDPTBlocks.CHISELED_STONE_FOSSIL_MED_CARNI_2.get())));

    }

}
