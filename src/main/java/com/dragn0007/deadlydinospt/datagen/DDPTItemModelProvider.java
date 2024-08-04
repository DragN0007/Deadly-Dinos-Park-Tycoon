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
        simpleItem(DDPTItems.TRIKETROPHY.get());
        simpleItem(DDPTItems.TRIKE_SPAWN_EGG.get());
        simpleItem(DDPTItems.MEGARAPTROPHY.get());
        simpleItem(DDPTItems.MEGARAP_SPAWN_EGG.get());
        simpleItem(DDPTItems.EOCARCHARTROPHY.get());
        simpleItem(DDPTItems.EOCARCHAR_SPAWN_EGG.get());
        simpleItem(DDPTItems.EDMONTOTROPHY.get());
        simpleItem(DDPTItems.EDMONTO_SPAWN_EGG.get());
        simpleItem(DDPTItems.ATROCITROPHY.get());
        simpleItem(DDPTItems.ATROCI_SPAWN_EGG.get());
        simpleItem(DDPTItems.MOSATROPHY.get());
//        simpleItem(DDPTItems.MOSA_SPAWN_EGG.get());
        simpleItem(DDPTItems.HELITROPHY.get());
//        simpleItem(DDPTItems.HELI_SPAWN_EGG.get());
        simpleItem(DDPTItems.DUNKLEOTROPHY.get());
//        simpleItem(DDPTItems.DUNKLEO_SPAWN_EGG.get());
        simpleItem(DDPTItems.ICHTHYOTROPHY.get());
//        simpleItem(DDPTItems.ICHTHYO_SPAWN_EGG.get());
        simpleItem(DDPTItems.LEEDTROPHY.get());
//        simpleItem(DDPTItems.LEED_SPAWN_EGG.get());
        simpleItem(DDPTItems.BARYTROPHY.get());
        simpleItem(DDPTItems.BARY_SPAWN_EGG.get());
        simpleItem(DDPTItems.PACHYTROPHY.get());
        simpleItem(DDPTItems.PACHY_SPAWN_EGG.get());
        simpleItem(DDPTItems.ICHTHYTROPHY.get());
        simpleItem(DDPTItems.ICHTHY_SPAWN_EGG.get());
        simpleItem(DDPTItems.BARYTROPHY.get());
        simpleItem(DDPTItems.BARY_SPAWN_EGG.get());
        simpleItem(DDPTItems.BASILOTROPHY.get());
//        simpleItem(DDPTItems.BASILO_SPAWN_EGG.get());
        simpleItem(DDPTItems.MEGTROPHY.get());
//        simpleItem(DDPTItems.MEG_SPAWN_EGG.get());
        simpleItem(DDPTItems.IGUATROPHY.get());
        simpleItem(DDPTItems.IGUA_SPAWN_EGG.get());
//
//        simpleItem(DDPTItems.GAR_SPAWN_EGG.get());

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
        simpleItem(DDPTItems.GAR.get());
        simpleItem(DDPTItems.COOKED_GAR.get());
        simpleItem(DDPTItems.SHARK.get());
        simpleItem(DDPTItems.COOKED_SHARK.get());
        simpleItem(DDPTItems.LARGE_FISH.get());
        simpleItem(DDPTItems.COOKED_LARGE_FISH.get());
        simpleItem(DDPTItems.BLUBBER.get());

        simpleItem(DDPTItems.EOCARCHARIA_ARMOR.get());

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
        simpleItem(DDPTItems.TRIKE_EGG.get());
        simpleItem(DDPTItems.ICHTHY_EGG.get());
        simpleItem(DDPTItems.EOCARCHAR_EGG.get());
        simpleItem(DDPTItems.ATROCI_EGG.get());
        simpleItem(DDPTItems.PACHY_EGG.get());
        simpleItem(DDPTItems.IGUA_EGG.get());
        simpleItem(DDPTItems.EDMONTO_EGG.get());
        simpleItem(DDPTItems.BARY_EGG.get());
        simpleItem(DDPTItems.MEGARAP_EGG.get());

        handheldItem(DDPTItems.CHISEL.get());
        handheldItem(DDPTItems.BRUSH.get());
        handheldItem(DDPTItems.ACID_BUCKET.get());
        handheldItem(DDPTItems.EMBRYO.get());
        handheldItem(DDPTItems.FOSSILIZED_SOFT_TISSUE.get());
        handheldItem(DDPTItems.PETRI_DISH.get());
        handheldItem(DDPTItems.DNA_PETRI_DISH.get());
        handheldItem(DDPTItems.TEST_TUBE.get());


        simpleSpriteBlockItem(DDPTBlocksDataGen.ASTEROXYLON.get());
        simpleSpriteBlockItem(DDPTBlocksDataGen.HORSETAIL.get());



        simpleItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.ACROCANTHOSAURUS_SKULL.get());
        advancedItem(DDPTItems.ACROCANTHOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.ACROCANTHOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.ALBERTOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.ALBERTOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.ALBERTOSAURUS_SKULL.get());
        advancedItem(DDPTItems.ALBERTOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.ALBERTOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.ALBERTOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.ALBERTOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.ALBERTOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.ALBERTOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.ALLOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.ALLOSAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.ALLOSAURUS_SKULL.get());
        advancedItem(DDPTItems.ALLOSAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.ALLOSAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.ALLOSAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.ALLOSAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.ALLOSAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.ALLOSAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.ANDALGALORNIS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.ANDALGALORNIS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.ANDALGALORNIS_SKULL.get());
        advancedItem(DDPTItems.ANDALGALORNIS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.ANDALGALORNIS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.ANDALGALORNIS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.ANDALGALORNIS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.ANDALGALORNIS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.ANDALGALORNIS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_LEG.get(), "small_carni_fossil_leg");
        advancedItem(DDPTItems.ARCHAEOPTERYX_FOSSIL_RAPTOR_CLAW.get(), "small_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.ARCHAEOPTERYX_SKULL.get());
        advancedItem(DDPTItems.ARCHAEOPTERYX_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.ARCHAEOPTERYX_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.ARCHAEOPTERYX_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.ARCHAEOPTERYX_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.ARCHAEOPTERYX_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.ARCHAEOPTERYX_LEG.get(), "small_carni_leg");
        advancedItem(DDPTItems.ARCHAEOPTERYX_RAPTOR_CLAW.get(), "small_carni_raptor_claw");


        simpleItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_LEG.get(), "medium_carni_fossil_leg");
        advancedItem(DDPTItems.AUSTRALOVENATOR_FOSSIL_RAPTOR_CLAW.get(), "medium_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.AUSTRALOVENATOR_SKULL.get());
        advancedItem(DDPTItems.AUSTRALOVENATOR_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.AUSTRALOVENATOR_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.AUSTRALOVENATOR_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.AUSTRALOVENATOR_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.AUSTRALOVENATOR_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.AUSTRALOVENATOR_LEG.get(), "medium_carni_leg");
        advancedItem(DDPTItems.AUSTRALOVENATOR_RAPTOR_CLAW.get(), "medium_carni_raptor_claw");


        simpleItem(DDPTItems.AUSTRORAPTOR_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_LEG.get(), "small_carni_fossil_leg");
        advancedItem(DDPTItems.AUSTRORAPTOR_FOSSIL_RAPTOR_CLAW.get(), "small_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.AUSTRORAPTOR_SKULL.get());
        advancedItem(DDPTItems.AUSTRORAPTOR_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.AUSTRORAPTOR_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.AUSTRORAPTOR_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.AUSTRORAPTOR_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.AUSTRORAPTOR_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.AUSTRORAPTOR_LEG.get(), "small_carni_leg");
        advancedItem(DDPTItems.AUSTRORAPTOR_RAPTOR_CLAW.get(), "small_carni_raptor_claw");


        simpleItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.CARCHARODONTOSAURUS_SKULL.get());
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.CARCHARODONTOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.CARNOTAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.CARNOTAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.CARNOTAURUS_SKULL.get());
        advancedItem(DDPTItems.CARNOTAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.CARNOTAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.CARNOTAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.CARNOTAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.CARNOTAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.CARNOTAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.CERATOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.CERATOSAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.CERATOSAURUS_SKULL.get());
        advancedItem(DDPTItems.CERATOSAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.CERATOSAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.CERATOSAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.CERATOSAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.CERATOSAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.CERATOSAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.COMPSOGNATHUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.COMPSOGNATHUS_FOSSIL_LEG.get(), "small_carni_fossil_leg");

        simpleItem(DDPTItems.COMPSOGNATHUS_SKULL.get());
        advancedItem(DDPTItems.COMPSOGNATHUS_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.COMPSOGNATHUS_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.COMPSOGNATHUS_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.COMPSOGNATHUS_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.COMPSOGNATHUS_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.COMPSOGNATHUS_LEG.get(), "small_carni_leg");


        simpleItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.CRYOLOPHOSAURUS_SKULL.get());
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.CRYOLOPHOSAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.DEINONYCHUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_LEG.get(), "small_carni_fossil_leg");
        advancedItem(DDPTItems.DEINONYCHUS_FOSSIL_RAPTOR_CLAW.get(), "small_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.DEINONYCHUS_SKULL.get());
        advancedItem(DDPTItems.DEINONYCHUS_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.DEINONYCHUS_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.DEINONYCHUS_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.DEINONYCHUS_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.DEINONYCHUS_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.DEINONYCHUS_LEG.get(), "small_carni_leg");
        advancedItem(DDPTItems.DEINONYCHUS_RAPTOR_CLAW.get(), "small_carni_raptor_claw");


        simpleItem(DDPTItems.DILOPHOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.DILOPHOSAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.DILOPHOSAURUS_SKULL.get());
        advancedItem(DDPTItems.DILOPHOSAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.DILOPHOSAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.DILOPHOSAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.DILOPHOSAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.DILOPHOSAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.DILOPHOSAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.GIGANOTOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.GIGANOTOSAURUS_SKULL.get());
        advancedItem(DDPTItems.GIGANOTOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.GIGANOTOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.GIGANOTOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.GIGANOTOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.GIGANOTOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.GIGANOTOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.MAHAKALA_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_LEG.get(), "small_carni_fossil_leg");
        advancedItem(DDPTItems.MAHAKALA_FOSSIL_RAPTOR_CLAW.get(), "small_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.MAHAKALA_SKULL.get());
        advancedItem(DDPTItems.MAHAKALA_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.MAHAKALA_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.MAHAKALA_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.MAHAKALA_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.MAHAKALA_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.MAHAKALA_LEG.get(), "small_carni_leg");
        advancedItem(DDPTItems.MAHAKALA_RAPTOR_CLAW.get(), "small_carni_raptor_claw");


        simpleItem(DDPTItems.MAJUNGASAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.MAJUNGASAURUS_FOSSIL_LEG.get(), "medium_carni_fossil_leg");

        simpleItem(DDPTItems.MAJUNGASAURUS_SKULL.get());
        advancedItem(DDPTItems.MAJUNGASAURUS_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.MAJUNGASAURUS_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.MAJUNGASAURUS_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.MAJUNGASAURUS_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.MAJUNGASAURUS_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.MAJUNGASAURUS_LEG.get(), "medium_carni_leg");


        simpleItem(DDPTItems.TYRANNOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.TYRANNOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.TYRANNOSAURUS_SKULL.get());
        advancedItem(DDPTItems.TYRANNOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.TYRANNOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.TYRANNOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.TYRANNOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.TYRANNOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.TYRANNOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.SPINOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.SPINOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.SPINOSAURUS_SKULL.get());
        advancedItem(DDPTItems.SPINOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.SPINOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.SPINOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.SPINOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.SPINOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.SPINOSAURUS_LEG.get(), "large_carni_leg");


        simpleItem(DDPTItems.TARBOSAURUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.TARBOSAURUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.TARBOSAURUS_SKULL.get());
        advancedItem(DDPTItems.TARBOSAURUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.TARBOSAURUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.TARBOSAURUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.TARBOSAURUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.TARBOSAURUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.TARBOSAURUS_LEG.get(), "large_carni_leg");



        simpleItem(DDPTItems.TROODON_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.TROODON_FOSSIL_TOOTH.get(), "small_carni_fossil_tooth");
        advancedItem(DDPTItems.TROODON_FOSSIL_RIBS.get(), "small_carni_fossil_ribs");
        advancedItem(DDPTItems.TROODON_FOSSIL_CLAW.get(), "small_carni_fossil_claw");
        advancedItem(DDPTItems.TROODON_FOSSIL_TAIL.get(), "small_carni_fossil_tail");
        advancedItem(DDPTItems.TROODON_FOSSIL_SPINE.get(), "small_carni_fossil_spine");
        advancedItem(DDPTItems.TROODON_FOSSIL_LEG.get(), "small_carni_fossil_leg");
        advancedItem(DDPTItems.TROODON_FOSSIL_RAPTOR_CLAW.get(), "small_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.TROODON_SKULL.get());
        advancedItem(DDPTItems.TROODON_TOOTH.get(), "small_carni_tooth");
        advancedItem(DDPTItems.TROODON_RIBS.get(), "small_carni_ribs");
        advancedItem(DDPTItems.TROODON_CLAW.get(), "small_carni_claw");
        advancedItem(DDPTItems.TROODON_TAIL.get(), "small_carni_tail");
        advancedItem(DDPTItems.TROODON_SPINE.get(), "small_carni_spine");
        advancedItem(DDPTItems.TROODON_LEG.get(), "small_carni_leg");
        advancedItem(DDPTItems.TROODON_RAPTOR_CLAW.get(), "small_carni_raptor_claw");



        simpleItem(DDPTItems.UTAHRAPTOR_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_TOOTH.get(), "medium_carni_fossil_tooth");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_RIBS.get(), "medium_carni_fossil_ribs");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_CLAW.get(), "medium_carni_fossil_claw");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_TAIL.get(), "medium_carni_fossil_tail");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_SPINE.get(), "medium_carni_fossil_spine");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_LEG.get(), "medium_carni_fossil_leg");
        advancedItem(DDPTItems.UTAHRAPTOR_FOSSIL_RAPTOR_CLAW.get(), "medium_carni_fossil_raptor_claw");

        simpleItem(DDPTItems.UTAHRAPTOR_SKULL.get());
        advancedItem(DDPTItems.UTAHRAPTOR_TOOTH.get(), "medium_carni_tooth");
        advancedItem(DDPTItems.UTAHRAPTOR_RIBS.get(), "medium_carni_ribs");
        advancedItem(DDPTItems.UTAHRAPTOR_CLAW.get(), "medium_carni_claw");
        advancedItem(DDPTItems.UTAHRAPTOR_TAIL.get(), "medium_carni_tail");
        advancedItem(DDPTItems.UTAHRAPTOR_SPINE.get(), "medium_carni_spine");
        advancedItem(DDPTItems.UTAHRAPTOR_LEG.get(), "medium_carni_leg");
        advancedItem(DDPTItems.UTAHRAPTOR_RAPTOR_CLAW.get(), "medium_carni_raptor_claw");



        simpleItem(DDPTItems.YUTYRANNUS_FOSSIL_SKULL.get());
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_TOOTH.get(), "large_carni_fossil_tooth");
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_RIBS.get(), "large_carni_fossil_ribs");
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_CLAW.get(), "large_carni_fossil_claw");
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_TAIL.get(), "large_carni_fossil_tail");
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_SPINE.get(), "large_carni_fossil_spine");
        advancedItem(DDPTItems.YUTYRANNUS_FOSSIL_LEG.get(), "large_carni_fossil_leg");

        simpleItem(DDPTItems.YUTYRANNUS_SKULL.get());
        advancedItem(DDPTItems.YUTYRANNUS_TOOTH.get(), "large_carni_tooth");
        advancedItem(DDPTItems.YUTYRANNUS_RIBS.get(), "large_carni_ribs");
        advancedItem(DDPTItems.YUTYRANNUS_CLAW.get(), "large_carni_claw");
        advancedItem(DDPTItems.YUTYRANNUS_TAIL.get(), "large_carni_tail");
        advancedItem(DDPTItems.YUTYRANNUS_SPINE.get(), "large_carni_spine");
        advancedItem(DDPTItems.YUTYRANNUS_LEG.get(), "large_carni_leg");
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

    private ItemModelBuilder advancedItem(Item item, String getTextureName) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"item/" + getTextureName));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.getRegistryName().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DeadlyDinosPT.MODID,"item/" + item.getRegistryName().getPath()));
    }
}