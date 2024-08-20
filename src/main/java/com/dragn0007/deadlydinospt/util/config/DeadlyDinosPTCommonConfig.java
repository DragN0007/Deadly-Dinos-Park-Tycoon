package com.dragn0007.deadlydinospt.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

import java.lang.module.Configuration;

public class DeadlyDinosPTCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TROPHYITEM_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> BIG_DINO_BREAK_RADIUS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SMALL_DINO_BREAK_RADIUS;

    public static final ForgeConfigSpec.ConfigValue<Integer> ACID_VAT_FOSSIL_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DNA_EXTRACTOR_FOSSIL_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMBRYO_INITIATOR_FOSSIL_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMBRYO_INJECTOR_FOSSIL_SUCCESS_RATE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ACID_VAT_BONE_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> DNA_EXTRACTOR_BONE_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMBRYO_INITIATOR_BONE_SUCCESS_RATE;
    public static final ForgeConfigSpec.ConfigValue<Integer> EMBRYO_INJECTOR_BONE_SUCCESS_RATE;

    public static final ForgeConfigSpec.ConfigValue<Integer> ACRO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ALBERTO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ALLO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANDAL_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMARGA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMPELO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANKY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ARCHAE_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ARGAN_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ATROCI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AUSTRALO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AUSTRO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AVA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> BARY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> BASILO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CARCHAR_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CARNO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CERATO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> COMPY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CROPSNAIL_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> CRYO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEINOCH_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> DEINON_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> DILO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> DUNKLEO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> EDMONTO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> EOCARCHAR_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALLI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> GAR_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> GIGA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> GRYPO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> HELI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> HYNERIA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ICHTHY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ICHTHYO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> IGUA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> LEED_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> LIVY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAHAKALA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAJUNGA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MEG_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MEGARAP_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOSA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> PACHY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> PACHYR_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> PARA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> REX_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> SAURO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> SHANT_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> SPINO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> STEGO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> STETH_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> TARBO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> THERI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> TRIKE_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> TROODON_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> UTAH_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> YUTY_FOSSIL_WEIGHT;


    static {
        BUILDER.push("Deadly Dinos: Park Tycoon");
        BUILDER.push("Misc Configs");

        TROPHYITEM_DURABILITY = BUILDER.comment("Amount of uses of Dino Trophies. Set to 0 for infinite durability. Default is 10.")
                .define("How much durabiltiy should Dino Trophies have?", 10);


        //Large Dinos - How many blocks should they break?
        BIG_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Large Deadly Dinos can destroy when attacking? 5 Blocks is Default.")
                .define("Large Dino destroy radius", 5);

        //Small Dinos - How many blocks should they break?
        SMALL_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Small Deadly Dinos can destroy when attacking? 3 Blocks is Default.")
                .define("Small Dino destroy radius", 3);
        BUILDER.pop();
    }

    static {
        BUILDER.push("Creation Configs");


        ACID_VAT_BONE_SUCCESS_RATE = BUILDER.comment("Acid Vat success rate, as a percentage. Default is 50. " +
                        "Bones generally have a higher success rate, as they're fresher.")
                .define("Acid Vat success rate percent: Bones", 50);

        DNA_EXTRACTOR_BONE_SUCCESS_RATE = BUILDER.comment("DNA Extractor success rate, as a percentage. Default is 50.")
                .define("DNA Extractor success rate percent: Bones", 50);

        EMBRYO_INITIATOR_BONE_SUCCESS_RATE = BUILDER.comment("Embryo Initiator success rate, as a percentage. Default is 50.")
                .define("Embryo Initiator success rate percent: Bones", 50);

        EMBRYO_INJECTOR_BONE_SUCCESS_RATE = BUILDER.comment("Embryo Injector success rate, as a percentage. Default is 85.")
                .define("Embryo Injector success rate percent: Bones", 85);


        ACID_VAT_FOSSIL_SUCCESS_RATE = BUILDER.comment("Acid Vat success rate, as a percentage. Default is 33. " +
                        "Fossils generally have a lower success rate, as they're much older.")
                .define("Acid Vat success rate percent: Fossils", 33);

        DNA_EXTRACTOR_FOSSIL_SUCCESS_RATE = BUILDER.comment("DNA Extractor success rate, as a percentage. Default is 33.")
                .define("DNA Extractor success rate percent: Fossils", 33);

        EMBRYO_INITIATOR_FOSSIL_SUCCESS_RATE = BUILDER.comment("Embryo Initiator success rate, as a percentage. Default is 25.")
                .define("Embryo Initiator success rate percent: Fossils", 25);

        EMBRYO_INJECTOR_FOSSIL_SUCCESS_RATE = BUILDER.comment("Embryo Injector success rate, as a percentage. Default is 75.")
                .define("Embryo Injector success rate percent: Fossils", 75);
        BUILDER.pop();
    }

    static {
        BUILDER.push("Fossil Spawn Weight Configs");

        ACRO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Acrocanthosaurus Fossil Spawn Weight", 1);

        ALBERTO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Albertosaurus Fossil Spawn Weight", 1);

        ALLO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Allosaurus Fossil Spawn Weight", 1);

        ANDAL_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Andalgalornis Fossil Spawn Weight", 1);

        AMARGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Amargasaurus Fossil Spawn Weight", 1);

        AMPELO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Ampelosaurus Fossil Spawn Weight", 1);

        ANKY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Ankylosaurus Fossil Spawn Weight", 1);

        ARCHAE_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Archaeopteryx Fossil Spawn Weight", 1);

        ARGAN_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Arganodus Fossil Spawn Weight", 1);

        ATROCI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Atrociraptor Fossil Spawn Weight", 1);

        AUSTRALO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Australovenator Fossil Spawn Weight", 1);

        AUSTRO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Austroraptor Fossil Spawn Weight", 1);

        AVA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Avaceratops Fossil Spawn Weight", 1);

        BARY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Baryonyx Fossil Spawn Weight", 1);

        BASILO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Basilosaurus Fossil Spawn Weight", 1);

        CARCHAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Carcharodontosaurus Fossil Spawn Weight", 1);

        CARNO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Carnotaurus Fossil Spawn Weight", 1);

        CERATO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Ceratosaurus Fossil Spawn Weight", 1);

        COMPY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Compsognathus Fossil Spawn Weight", 1);

        CROPSNAIL_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Crop Snail Fossil Spawn Weight", 1);

        CRYO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Cryolophosaurus Fossil Spawn Weight", 1);

        DEINOCH_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Deinocherius Fossil Spawn Weight", 1);

        DEINON_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Deinonychus Fossil Spawn Weight", 1);

        DILO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Dilophosaurus Fossil Spawn Weight", 1);

        DUNKLEO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Dunkleosteus Fossil Spawn Weight", 1);

        EDMONTO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Edmontosaurus Fossil Spawn Weight", 1);

        EOCARCHAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Eocarcharia Fossil Spawn Weight", 1);

        GALLI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Gallimimus Fossil Spawn Weight", 1);

        GAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Alligator Gar Fossil Spawn Weight", 1);

        GIGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Giganotosaurus Fossil Spawn Weight", 1);

        GRYPO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Gryposaurus Fossil Spawn Weight", 1);

        HELI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Helicoprion Fossil Spawn Weight", 1);

        HYNERIA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Hyneria Fossil Spawn Weight", 1);

        ICHTHY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Ichthyovenator Fossil Spawn Weight", 1);

        ICHTHYO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Ichthyosaurus Fossil Spawn Weight", 1);

        IGUA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Iguanodon Fossil Spawn Weight", 1);

        LEED_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Leedsichthys Fossil Spawn Weight", 1);

        LIVY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Livyatan Fossil Spawn Weight", 1);

        MAHAKALA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Mahakala Fossil Spawn Weight", 1);

        MAJUNGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Majungasaurus Fossil Spawn Weight", 1);

        MEG_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Megalodon Fossil Spawn Weight", 1);

        MEGARAP_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Megaraptor Fossil Spawn Weight", 1);

        MOSA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Mosasaurus Fossil Spawn Weight", 1);

        PACHY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Pachycephalosaurus Fossil Spawn Weight", 1);

        PACHYR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Pachyrhino Fossil Spawn Weight", 1);

        PARA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Parasaurolophus Fossil Spawn Weight", 1);

        REX_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Tyrannosaurus Rex Fossil Spawn Weight", 1);

        SAURO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Sauroposeidon Fossil Spawn Weight", 1);

        SHANT_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Shantungosaurus Fossil Spawn Weight", 1);

        SPINO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Spinosaurus Fossil Spawn Weight", 1);

        STEGO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Stegosaurus Fossil Spawn Weight", 1);

        STETH_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Stethacanthus Fossil Spawn Weight", 1);

        TARBO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Tarbosaurus Fossil Spawn Weight", 1);

        THERI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Therizinosaurus Fossil Spawn Weight", 1);

        TRIKE_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Triceratops Fossil Spawn Weight", 1);

        TROODON_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Troodon Fossil Spawn Weight", 1);

        UTAH_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Utahraptor Fossil Spawn Weight", 1);

        YUTY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("Yutyrannus Fossil Spawn Weight", 1);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
