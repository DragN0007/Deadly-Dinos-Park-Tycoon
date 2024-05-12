package com.dragn0007.deadlydinospt.datagen.biglooter;

import com.dragn0007.deadlydinospt.block.DDDBlocksDataGen;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class DDDBlockLootTables extends BlockLoot {
    @Override
    protected void addTables() {
        this.dropSelf(DDDBlocksDataGen.PARA_PLUSHY_1.get());
        this.dropSelf(DDDBlocksDataGen.PARA_PLUSHY_2.get());
        this.dropSelf(DDDBlocksDataGen.ACRO_PLUSHY_1.get());
        this.dropSelf(DDDBlocksDataGen.ACRO_PLUSHY_2.get());


        this.dropSelf(DDDBlocksDataGen.ASTEROXYLON.get());
        this.dropSelf(DDDBlocksDataGen.HORSETAIL.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DDDBlocksDataGen.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
