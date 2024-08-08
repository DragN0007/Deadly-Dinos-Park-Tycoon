package com.dragn0007.deadlydinospt.block;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.block.fossil.*;
import com.dragn0007.deadlydinospt.block.other.DinoNuggetBox;
import com.dragn0007.deadlydinospt.entity.herbi.Ava;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import com.dragn0007.deadlydinospt.world.feature.tree.ConiferTreeGrower;
import com.dragn0007.deadlydinospt.world.feature.tree.SequoiaTreeGrower;
import com.dragn0007.deadlydinospt.world.feature.tree.YewTreeGrower;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DDPTBlocks {
    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, DeadlyDinosPT.MODID);

    //Box
    public static final RegistryObject<Block> DINO_GIFT_BOX = registerBlock("dino_gift_box",
            () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(0.3F)));
    public static final RegistryObject<Block> DINO_NUGGETS_BOX = registerBlock("dino_nuggets_box",
            () -> new DinoNuggetBox());

    //BLOCKS
    public static final RegistryObject<Block> RGLASS = registerBlock("rglass",
            () -> new Block(Block.Properties.of(Material.GLASS).noOcclusion()
                    .strength(2).instabreak()));
    public static final RegistryObject<Block> RSTONEBRICKS = registerBlock("rstonebricks",
            () -> new Block(Block.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 4.0F)));
    public static final RegistryObject<Block> RCOBBLESTONE = registerBlock("rcobblestone",
            () -> new Block(Block.Properties.of(Material.STONE)
                    .requiresCorrectToolForDrops().strength(3.0F, 3.0F)));




    //WOOD
    public static final RegistryObject<RotatedPillarBlock> CONIFERLOG = registerBlock("conifer_log",
            () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> CONIFERPLANKS = registerBlock("conifer_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> CONIFERLEAVES = registerBlock("conifer_leaves",
            () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> CONIFERSAPLING = registerBlock("conifer_sapling",
            () -> new SaplingBlock(new ConiferTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> RCONIFERPLANKS = registerBlock("rconifer_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 2.0F)));
    public static final RegistryObject<Block> CONIFERSTAIRS = registerBlock("conifer_stairs",
            () -> new StairBlock(CONIFERPLANKS.get().defaultBlockState(), Block.Properties.copy(CONIFERPLANKS.get())));
    public static final RegistryObject<Block> CONIFERSLAB = registerBlock("conifer_slab",
            () -> new SlabBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));


    public static final RegistryObject<RotatedPillarBlock> YEWLOG = registerBlock("yew_log",
            () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> YEWPLANKS = registerBlock("yew_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> YEWLEAVES = registerBlock("yew_leaves",
            () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> YEWSAPLING = registerBlock("yew_sapling",
            () -> new SaplingBlock(new YewTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> RYEWPLANKS = registerBlock("ryew_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 2.0F)));
    public static final RegistryObject<Block> YEWSTAIRS = registerBlock("yew_stairs",
            () -> new StairBlock(YEWPLANKS.get().defaultBlockState(), Block.Properties.copy(CONIFERPLANKS.get())));
    public static final RegistryObject<Block> YEWSLAB = registerBlock("yew_slab",
            () -> new SlabBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));


    public static final RegistryObject<RotatedPillarBlock> SEQUOIALOG = registerBlock("sequoia_log",
            () -> new RotatedPillarBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> SEQUOIAPLANKS = registerBlock("sequoia_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));
    public static final RegistryObject<Block> SEQUOIALEAVES = registerBlock("sequoia_leaves",
            () -> new LeavesBlock(Block.Properties.of(Material.LEAVES).strength(0.2F).randomTicks().sound(SoundType.GRASS).noOcclusion()));
    public static final RegistryObject<Block> SEQUOIASAPLING = registerBlock("sequoia_sapling",
            () -> new SaplingBlock(new SequoiaTreeGrower(), Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> RSEQUOIAPLANKS = registerBlock("rsequoia_planks",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0F, 2.0F)));
    public static final RegistryObject<Block> SEQUOIASTAIRS = registerBlock("sequoia_stairs",
            () -> new StairBlock(SEQUOIAPLANKS.get().defaultBlockState(), Block.Properties.copy(CONIFERPLANKS.get())));
    public static final RegistryObject<Block> SEQUOIASLAB = registerBlock("sequoia_slab",
            () -> new SlabBlock(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 3.0F)));


    public static final RegistryObject<Block> RACACIAPLANKS = registerBlock("racacia_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RBIRCHPLANKS = registerBlock("rbirch_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RCRIMSONPLANKS = registerBlock("rcrimson_planks",
            () -> new Block(Block.Properties.of(Material.NETHER_WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RDARKOAKPLANKS = registerBlock("rdark_oak_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RJUNGLEPLANKS = registerBlock("rjungle_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> ROAKPLANKS = registerBlock("roak_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RSPRUCEPLANKS = registerBlock("rspruce_planks",
            () -> new Block(Block.Properties.of(Material.WOOD)
                    .strength(2.0F, 4.0F)));
    public static final RegistryObject<Block> RWARPEDPLANKS = registerBlock("rwarped_planks",
            () -> new Block(Block.Properties.of(Material.NETHER_WOOD)
                    .strength(2.0F, 4.0F)));


    //PLANTS
    public static final RegistryObject<FlowerBlock> COOKSONIA = registerBlock("cooksonia",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> CYCAS = registerBlock("cycas",
            () -> new FlowerBlock(MobEffects.HEAL, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> CYPERUS = registerBlock("cyperus",
            () -> new FlowerBlock(MobEffects.JUMP, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<FlowerBlock> ZOSTER = registerBlock("zoster",
            () -> new FlowerBlock(MobEffects.ABSORPTION, 20, Block.Properties.of(Material.PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<TallFlowerBlock> CYCADS = registerBlock("cycads",
            () -> new TallFlowerBlock(Block.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.GRASS).noCollission()));
    public static final RegistryObject<TallFlowerBlock> CALAMITES = registerBlock("calamites",
            () -> new TallFlowerBlock(Block.Properties.of(Material.REPLACEABLE_PLANT).sound(SoundType.GRASS).noCollission()));


    //Decor
    public static final RegistryObject<Block> WIRE_FENCE_1 = registerBlock("wire_fence_1",
            () -> new IronBarsBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> WIRE_FENCE_2 = registerBlock("wire_fence_2",
            () -> new IronBarsBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> WIRE_FENCE_3 = registerBlock("wire_fence_3",
            () -> new IronBarsBlock(Block.Properties.copy(Blocks.IRON_BARS)));
    public static final RegistryObject<Block> WIRE_FENCE_4 = registerBlock("wire_fence_4",
            () -> new IronBarsBlock(Block.Properties.copy(Blocks.IRON_BARS)));

    //Fossils
    public static final RegistryObject<Block> ACROCANTHOSAURUS_FOSSIL = registerBlock("acrocanthosaurus_fossil",
            () -> new ChiselableAcroFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ACROCANTHOSAURUS_FOSSIL = registerBlock("chiseled_acrocanthosaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ALBERTOSAURUS_FOSSIL = registerBlock("albertosaurus_fossil",
            () -> new ChiselableAlbertoFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ALBERTOSAURUS_FOSSIL = registerBlock("chiseled_albertosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ALLOSAURUS_FOSSIL = registerBlock("allosaurus_fossil",
            () -> new ChiselableAlloFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ALLOSAURUS_FOSSIL = registerBlock("chiseled_allosaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ANDALGALORNIS_FOSSIL = registerBlock("andalgalornis_fossil",
            () -> new ChiselableAndalFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ANDALGALORNIS_FOSSIL = registerBlock("chiseled_andalgalornis_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ARCHAEOPTERYX_FOSSIL = registerBlock("archaeopteryx_fossil",
            () -> new ChiselableArchaeFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ARCHAEOPTERYX_FOSSIL = registerBlock("chiseled_archaeopteryx_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ATROCIRAPTOR_FOSSIL = registerBlock("atrociraptor_fossil",
            () -> new ChiselableAtrociFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ATROCIRAPTOR_FOSSIL = registerBlock("chiseled_atrociraptor_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> AUSTRALOVENATOR_FOSSIL = registerBlock("australovenator_fossil",
            () -> new ChiselableAustraloFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_AUSTRALOVENATOR_FOSSIL = registerBlock("chiseled_australovenator_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> AUSTRORAPTOR_FOSSIL = registerBlock("austroraptor_fossil",
            () -> new ChiselableAustroFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_AUSTRORAPTOR_FOSSIL = registerBlock("chiseled_austroraptor_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> BARYONYX_FOSSIL = registerBlock("baryonyx_fossil",
            () -> new ChiselableBaryFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_BARYONYX_FOSSIL = registerBlock("chiseled_baryonyx_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> CARCHARODONTOSAURUS_FOSSIL = registerBlock("carcharodontosaurus_fossil",
            () -> new ChiselableCarcharFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_CARCHARODONTOSAURUS_FOSSIL = registerBlock("chiseled_carcharodontosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> CARNOTAURUS_FOSSIL = registerBlock("carnotaurus_fossil",
            () -> new ChiselableCarnoFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_CARNOTAURUS_FOSSIL = registerBlock("chiseled_carnotaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> CERATOSAURUS_FOSSIL = registerBlock("ceratosaurus_fossil",
            () -> new ChiselableCeratoFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_CERATOSAURUS_FOSSIL = registerBlock("chiseled_ceratosaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> COMPSOGNATHUS_FOSSIL = registerBlock("compsognathus_fossil",
            () -> new ChiselableCompyFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_COMPSOGNATHUS_FOSSIL = registerBlock("chiseled_compsognathus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> CRYOLOPHOSAURUS_FOSSIL = registerBlock("cryolophosaurus_fossil",
            () -> new ChiselableCryoFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_CRYOLOPHOSAURUS_FOSSIL = registerBlock("chiseled_cryolophosaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> DEINONYCHUS_FOSSIL = registerBlock("deinonychus_fossil",
            () -> new ChiselableDeinonFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_DEINONYCHUS_FOSSIL = registerBlock("chiseled_deinonychus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> DILOPHOSAURUS_FOSSIL = registerBlock("dilophosaurus_fossil",
            () -> new ChiselableDiloFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_DILOPHOSAURUS_FOSSIL = registerBlock("chiseled_dilophosaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> EOCARCHARIA_FOSSIL = registerBlock("eocarcharia_fossil",
            () -> new ChiselableEocarFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_EOCARCHARIA_FOSSIL = registerBlock("chiseled_eocarcharia_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> GIGANOTOSAURUS_FOSSIL = registerBlock("giganotosaurus_fossil",
            () -> new ChiselableGigaFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_GIGANOTOSAURUS_FOSSIL = registerBlock("chiseled_giganotosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ICHTHYOVENATOR_FOSSIL = registerBlock("ichthyovenator_fossil",
            () -> new ChiselableIchthyFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ICHTHYOVENATOR_FOSSIL = registerBlock("chiseled_ichthyovenator_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> MAHAKALA_FOSSIL = registerBlock("mahakala_fossil",
            () -> new ChiselableMahakalaFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_MAHAKALA_FOSSIL = registerBlock("chiseled_mahakala_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> MAJUNGASAURUS_FOSSIL = registerBlock("majungasaurus_fossil",
            () -> new ChiselableMajungaFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_MAJUNGASAURUS_FOSSIL = registerBlock("chiseled_majungasaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> MEGARAPTOR_FOSSIL = registerBlock("megaraptor_fossil",
            () -> new ChiselableMegarapFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_MEGARAPTOR_FOSSIL = registerBlock("chiseled_megaraptor_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> TYRANNOSAURUS_FOSSIL = registerBlock("tyrannosaurus_fossil",
            () -> new ChiselableRexFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_TYRANNOSAURUS_FOSSIL = registerBlock("chiseled_tyrannosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> SPINOSAURUS_FOSSIL = registerBlock("spinosaurus_fossil",
            () -> new ChiselableSpinoFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_SPINOSAURUS_FOSSIL = registerBlock("chiseled_spinosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> TARBOSAURUS_FOSSIL = registerBlock("tarbosaurus_fossil",
            () -> new ChiselableTarboFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_TARBOSAURUS_FOSSIL = registerBlock("chiseled_tarbosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> TROODON_FOSSIL = registerBlock("troodon_fossil",
            () -> new ChiselableTroodonFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_TROODON_FOSSIL = registerBlock("chiseled_troodon_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> UTAHRAPTOR_FOSSIL = registerBlock("utahraptor_fossil",
            () -> new ChiselableUtahFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_UTAHRAPTOR_FOSSIL = registerBlock("chiseled_utahraptor_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> YUTYRANNUS_FOSSIL = registerBlock("yutyrannus_fossil",
            () -> new ChiselableYutyFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_YUTYRANNUS_FOSSIL = registerBlock("chiseled_yutyrannus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));



    public static final RegistryObject<Block> AMARGASAURUS_FOSSIL = registerBlock("amargasaurus_fossil",
            () -> new ChiselableAmargaFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_AMARGASAURUS_FOSSIL = registerBlock("chiseled_amargasaurus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> AMPELOSAURUS_FOSSIL = registerBlock("ampelosaurus_fossil",
            () -> new ChiselableAmpeloFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_AMPELOSAURUS_FOSSIL = registerBlock("chiseled_ampelosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> ANKYLOSAURUS_FOSSIL = registerBlock("ankylosaurus_fossil",
            () -> new ChiselableAnkyFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_ANKYLOSAURUS_FOSSIL = registerBlock("chiseled_ankylosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> AVACERATOPS_FOSSIL = registerBlock("avaceratops_fossil",
            () -> new ChiselableAvaFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_AVACERATOPS_FOSSIL = registerBlock("chiseled_avaceratops_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> CROP_SNAIL_FOSSIL = registerBlock("crop_snail_fossil",
            () -> new ChiselableSnailFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_CROP_SNAIL_FOSSIL = registerBlock("chiseled_crop_snail_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> DEINOCHERIUS_FOSSIL = registerBlock("deinocherius_fossil",
            () -> new ChiselableDeinocherFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_DEINOCHERIUS_FOSSIL = registerBlock("chiseled_deinocherius_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> EDMONTOSAURUS_FOSSIL = registerBlock("edmontosaurus_fossil",
            () -> new ChiselableEdmontoFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_EDMONTOSAURUS_FOSSIL = registerBlock("chiseled_edmontosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> GALLIMIMUS_FOSSIL = registerBlock("gallimimus_fossil",
            () -> new ChiselableGalliFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_GALLIMIMUS_FOSSIL = registerBlock("chiseled_gallimimus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> GRYPOSAURUS_FOSSIL = registerBlock("gryposaurus_fossil",
            () -> new ChiselableGrypoFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_GRYPOSAURUS_FOSSIL = registerBlock("chiseled_gryposaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> IGUANODON_FOSSIL = registerBlock("iguanodon_fossil",
            () -> new ChiselableIguaFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_IGUANODON_FOSSIL = registerBlock("chiseled_iguanodon_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> PACHYCEPHALOSAURUS_FOSSIL = registerBlock("pachycephalosaurus_fossil",
            () -> new ChiselablePachyFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_PACHYCEPHALOSAURUS_FOSSIL = registerBlock("chiseled_pachycephalosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> PACHYRHINOSAURUS_FOSSIL = registerBlock("pachyrhinosaurus_fossil",
            () -> new ChiselablePachyrFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_PACHYRHINOSAURUS_FOSSIL = registerBlock("chiseled_pachyrhinosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> PARASAUROLOPHUS_FOSSIL = registerBlock("parasaurolophus_fossil",
            () -> new ChiselableParaFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_PARASAUROLOPHUS_FOSSIL = registerBlock("chiseled_parasaurolophus_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> SAUROPOSEIDON_FOSSIL = registerBlock("sauroposeidon_fossil",
            () -> new ChiselableSauroFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_SAUROPOSEIDON_FOSSIL = registerBlock("chiseled_sauroposeidon_fossil",
            () -> new BrushableDeepslateFossil(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));

    public static final RegistryObject<Block> SHANTUNGOSAURUS_FOSSIL = registerBlock("shantungosaurus_fossil",
            () -> new ChiselablePachyrFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.STONE).requiresCorrectToolForDrops().strength(3.5f, 10.0f)));
    public static final RegistryObject<Block> CHISELED_SHANTUNGOSAURUS_FOSSIL = registerBlock("chiseled_shantungosaurus_fossil",
            () -> new BrushableStoneFossil(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.SAND).requiresCorrectToolForDrops().strength(1.5f, 6.0f)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        DDPTItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(DDPTItemGroup.BLOCK_GROUP)));
    }

    protected static <T extends Block>RegistryObject<T> registerBlockWithoutItem(String name, Supplier<T> block){
        return BLOCKS.register(name, block);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
