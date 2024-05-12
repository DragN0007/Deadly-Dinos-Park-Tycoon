package com.dragn0007.deadlydinos.datagen;

import com.dragn0007.deadlydinos.DeadlyDinosPT;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDDBlockstateProvider extends BlockStateProvider {
    public DDDBlockstateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DeadlyDinosPT.MODID, exFileHelper);
    }
    @Override
    protected void registerStatesAndModels() {


    }

}
