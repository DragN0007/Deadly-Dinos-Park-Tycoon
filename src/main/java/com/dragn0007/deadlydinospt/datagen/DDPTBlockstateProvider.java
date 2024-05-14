package com.dragn0007.deadlydinospt.datagen;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.DDPTBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDPTBlockstateProvider extends BlockStateProvider {
    public DDPTBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DeadlyDinosPT.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll("allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/stone_fossil_med_carni_1")));

        simpleBlock(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll("chiseled_allosaurus_fossil", new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));
        simpleBlockItem(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get(), models().cubeAll(DDPTBlocks.CHISELED_ALLOSAURUS_FOSSIL.get().getRegistryName().getPath(),
                new ResourceLocation(DeadlyDinosPT.MODID, "block/chiseled_stone_fossil_med_carni_1")));

    }

}
