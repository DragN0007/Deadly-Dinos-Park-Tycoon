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
        simpleItem(DDPTItems.YUTYTROPHY.get());
        simpleItem(DDPTItems.YUTY_SPAWN_EGG.get());
        simpleItem(DDPTItems.CRYOTROPHY.get());
        simpleItem(DDPTItems.CRYO_SPAWN_EGG.get());
        simpleItem(DDPTItems.PACHYRTROPHY.get());
        simpleItem(DDPTItems.PACHYR_SPAWN_EGG.get());
        simpleItem(DDPTItems.AUSTRALOTROPHY.get());
        simpleItem(DDPTItems.AUSTRALO_SPAWN_EGG.get());

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
        simpleItem(DDPTItems.YUTY_EGG.get());
        simpleItem(DDPTItems.PACHYR_EGG.get());
        simpleItem(DDPTItems.CRYO_EGG.get());
        simpleItem(DDPTItems.AUSTRALO_EGG.get());

        handheldItem(DDPTItems.CHISEL.get());
        handheldItem(DDPTItems.BRUSH.get());

        simpleSpriteBlockItem(DDPTBlocksDataGen.ASTEROXYLON.get());
        simpleSpriteBlockItem(DDPTBlocksDataGen.HORSETAIL.get());



        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_LEG.get());

        simpleItem(DDPTItems.ACROCANTHOSAURUS_TOOTH.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_SKULL.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_RIBS.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_CLAW.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_TAIL.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_SPINE.get());
        simpleItem(DDPTItems.ACROCANTHOSAURUS_LEG.get());


        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_LEG.get());

        simpleItem(DDPTItems.ALBERTOSAURUS_TOOTH.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_SKULL.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_RIBS.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_CLAW.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_TAIL.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_SPINE.get());
        simpleItem(DDPTItems.ALBERTOSAURUS_LEG.get());


        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_LEG.get());

        simpleItem(DDPTItems.ALLOSAURUS_TOOTH.get());
        simpleItem(DDPTItems.ALLOSAURUS_SKULL.get());
        simpleItem(DDPTItems.ALLOSAURUS_RIBS.get());
        simpleItem(DDPTItems.ALLOSAURUS_CLAW.get());
        simpleItem(DDPTItems.ALLOSAURUS_TAIL.get());
        simpleItem(DDPTItems.ALLOSAURUS_SPINE.get());
        simpleItem(DDPTItems.ALLOSAURUS_LEG.get());


        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_LEG.get());

        simpleItem(DDPTItems.ANDALGALORNIS_TOOTH.get());
        simpleItem(DDPTItems.ANDALGALORNIS_SKULL.get());
        simpleItem(DDPTItems.ANDALGALORNIS_RIBS.get());
        simpleItem(DDPTItems.ANDALGALORNIS_CLAW.get());
        simpleItem(DDPTItems.ANDALGALORNIS_TAIL.get());
        simpleItem(DDPTItems.ANDALGALORNIS_SPINE.get());
        simpleItem(DDPTItems.ANDALGALORNIS_LEG.get());


        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_LEG.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_RAPTOR_CLAW.get());

        simpleItem(DDPTItems.ARCHAEOPTERYX_TOOTH.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_SKULL.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_RIBS.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_CLAW.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_TAIL.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_SPINE.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_LEG.get());
        simpleItem(DDPTItems.ARCHAEOPTERYX_RAPTOR_CLAW.get());


        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_TOOTH.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_SKULL.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_RIBS.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_CLAW.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_TAIL.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_SPINE.get());
        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_LEG.get());

        simpleItem(DDPTItems.CERATOSAURUS_TOOTH.get());
        simpleItem(DDPTItems.CERATOSAURUS_SKULL.get());
        simpleItem(DDPTItems.CERATOSAURUS_RIBS.get());
        simpleItem(DDPTItems.CERATOSAURUS_CLAW.get());
        simpleItem(DDPTItems.CERATOSAURUS_TAIL.get());
        simpleItem(DDPTItems.CERATOSAURUS_SPINE.get());
        simpleItem(DDPTItems.CERATOSAURUS_LEG.get());



    }

    private ItemModelBuilder simpleSpriteBlockItem(Block block) {
        return withExistingParent(block.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"block/" + block.getRegistryName().getPath()));
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"item/" + item.getRegistryName().getPath()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"item/" + item.getRegistryName().getPath()));
    }
}