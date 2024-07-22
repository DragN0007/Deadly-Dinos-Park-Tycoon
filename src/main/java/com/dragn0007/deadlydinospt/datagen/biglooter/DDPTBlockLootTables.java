package com.dragn0007.deadlydinospt.datagen.biglooter;

import com.dragn0007.deadlydinospt.block.DDPTBlocksDataGen;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class DDPTBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(DDPTBlocksDataGen.PARA_PLUSHY_1.get());
        this.dropSelf(DDPTBlocksDataGen.PARA_PLUSHY_2.get());
        this.dropSelf(DDPTBlocksDataGen.ACRO_PLUSHY_1.get());
        this.dropSelf(DDPTBlocksDataGen.ACRO_PLUSHY_2.get());

        this.dropSelf(DDPTBlocksDataGen.ACID_VAT.get());
        this.dropSelf(DDPTBlocksDataGen.DNA_EXTRACTOR.get());
        this.dropSelf(DDPTBlocksDataGen.EMBRYO_INITIATOR.get());
        this.dropSelf(DDPTBlocksDataGen.EMBRYO_INJECTOR.get());

        this.dropSelf(DDPTBlocksDataGen.ASTEROXYLON.get());
        this.dropSelf(DDPTBlocksDataGen.HORSETAIL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DDPTBlocksDataGen.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
