package com.dragn0007.deadlydinospt.block;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.other.Plushy;
import com.dragn0007.deadlydinospt.block.science.AcidVat;
import com.dragn0007.deadlydinospt.block.science.DNAExtractor;
import com.dragn0007.deadlydinospt.block.science.EmbryoInitiator;
import com.dragn0007.deadlydinospt.block.science.EmbryoInjector;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DDPTBlocksDataGen {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DeadlyDinosPT.MODID);


    public static final RegistryObject<Block> PARA_PLUSHY_1 = registerBlock("para_plushy_1",
            () -> new Plushy());
    public static final RegistryObject<Block> PARA_PLUSHY_2 = registerBlock("para_plushy_2",
            () -> new Plushy());

    public static final RegistryObject<Block> ACRO_PLUSHY_1 = registerBlock("acro_plushy_1",
            () -> new Plushy());
    public static final RegistryObject<Block> ACRO_PLUSHY_2 = registerBlock("acro_plushy_2",
            () -> new Plushy());


    public static final RegistryObject<Block> ACID_VAT = registerBlock("acid_vat",
            () -> new AcidVat(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));
    public static final RegistryObject<Block> DNA_EXTRACTOR = registerBlock("dna_extractor",
            () -> new DNAExtractor(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F)));
    public static final RegistryObject<Block> EMBRYO_INITIATOR = registerBlock("embryo_initiator",
            () -> new EmbryoInitiator(BlockBehaviour.Properties.of(Material.WOOD).requiresCorrectToolForDrops().strength(1f)));
    public static final RegistryObject<Block> EMBRYO_INJECTOR = registerBlock("embryo_injector",
            () -> new EmbryoInjector(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(1f)));


    public static final RegistryObject<FlowerBlock> ASTEROXYLON = registerBlock("asteroxylon",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> HORSETAIL = registerBlock("horsetail",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));



    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DDPTItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(DDPTItemGroup.BLOCK_GROUP)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
