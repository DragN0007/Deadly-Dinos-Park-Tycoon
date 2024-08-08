package com.dragn0007.deadlydinospt.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DeadlyDinosPTCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TROPHYITEM_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> BIG_DINO_BREAK_RADIUS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SMALL_DINO_BREAK_RADIUS;
    public static final ForgeConfigSpec.ConfigValue<Integer> ACRO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ALBERTO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ALLO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANDAL_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMARGA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AMPELO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ANKY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ARCHAE_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> ATROCI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AUSTRALO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AUSTRO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> AVA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> BARY_FOSSIL_WEIGHT;
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
    public static final ForgeConfigSpec.ConfigValue<Integer> ICHTHY_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> IGUA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAHAKALA_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> MAJUNGA_FOSSIL_WEIGHT;
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
    public static final ForgeConfigSpec.ConfigValue<Integer> TARBO_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> THERI_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> TRIKE_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> TROODON_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> UTAH_FOSSIL_WEIGHT;
    public static final ForgeConfigSpec.ConfigValue<Integer> YUTY_FOSSIL_WEIGHT;


    static {
        BUILDER.push("Configs for Deadly Dinos!");

        TROPHYITEM_DURABILITY = BUILDER.comment("Amount of uses of Dino Trophies. Set to 0 for infinite durability. Default is 10.")
                .define("How much durabiltiy should Dino Trophies have?", 10);


        //Large Dinos - How many blocks should they break?
        BIG_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Large Deadly Dinos can destroy when attacking? 5 Blocks is Default.")
                .define("Large Dino destroy radius", 5);

        //Small Dinos - How many blocks should they break?
        SMALL_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Small Deadly Dinos can destroy when attacking? 3 Blocks is Default.")
                .define("Small Dino destroy radius", 3);


        
        ACRO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ACRO Fossil Spawn Weight", 1);

        ALBERTO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ALBERTO Fossil Spawn Weight", 1);

        ALLO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ALLO Fossil Spawn Weight", 1);

        ANDAL_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ANDAL Fossil Spawn Weight", 1);

        AMARGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("AMARGA Fossil Spawn Weight", 1);

        AMPELO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("AMPELO Fossil Spawn Weight", 1);

        ANKY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ANKY Fossil Spawn Weight", 1);

        ARCHAE_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ARCHAE Fossil Spawn Weight", 1);

        ATROCI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ATROCI Fossil Spawn Weight", 1);

        AUSTRALO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("AUSTRALO Fossil Spawn Weight", 1);

        AUSTRO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("AUSTRO Fossil Spawn Weight", 1);

        AVA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("AVA Fossil Spawn Weight", 1);

        BARY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("BARY Fossil Spawn Weight", 1);

        CARCHAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("CARCHAR Fossil Spawn Weight", 1);

        CARNO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("CARNO Fossil Spawn Weight", 1);

        CERATO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("CERATO Fossil Spawn Weight", 1);

        COMPY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("COMPY Fossil Spawn Weight", 1);

        CROPSNAIL_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("CROPSNAIL Fossil Spawn Weight", 1);

        CRYO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("CRYO Fossil Spawn Weight", 1);

        DEINOCH_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("DEINOCH Fossil Spawn Weight", 1);

        DEINON_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("DEINON Fossil Spawn Weight", 1);

        DILO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("DILO Fossil Spawn Weight", 1);

        DUNKLEO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("DUNKLEO Fossil Spawn Weight", 1);

        EDMONTO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("EDMONTO Fossil Spawn Weight", 1);

        EOCARCHAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("EOCARCHAR Fossil Spawn Weight", 1);

        GALLI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("GALLI Fossil Spawn Weight", 1);

        GAR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("GAR Fossil Spawn Weight", 1);

        GIGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("GIGA Fossil Spawn Weight", 1);

        GRYPO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("GRYPO Fossil Spawn Weight", 1);

        HELI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("HELI Fossil Spawn Weight", 1);

        ICHTHY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("ICHTHY Fossil Spawn Weight", 1);

        IGUA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("IGUA Fossil Spawn Weight", 1);

        MAHAKALA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("MAHAKALA Fossil Spawn Weight", 1);

        MAJUNGA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("MAJUNGA Fossil Spawn Weight", 1);

        MEGARAP_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("MEGARAP Fossil Spawn Weight", 1);

        MOSA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("MOSA Fossil Spawn Weight", 1);

        PACHY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("PACHY Fossil Spawn Weight", 1);

        PACHYR_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("PACHYR Fossil Spawn Weight", 1);

        PARA_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("PARA Fossil Spawn Weight", 1);

        REX_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("REX Fossil Spawn Weight", 1);

        SAURO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("SAURO Fossil Spawn Weight", 1);

        SHANT_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("SHANT Fossil Spawn Weight", 1);

        SPINO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("SPINO Fossil Spawn Weight", 1);

        STEGO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("STEGO Fossil Spawn Weight", 1);

        TARBO_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("TARBO Fossil Spawn Weight", 1);

        THERI_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("THERI Fossil Spawn Weight", 1);

        TRIKE_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("TRIKE Fossil Spawn Weight", 1);

        TROODON_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("TROODON Fossil Spawn Weight", 1);

        UTAH_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("UTAH Fossil Spawn Weight", 1);

        YUTY_FOSSIL_WEIGHT = BUILDER.comment("How often should this fossil spawn? Default is 1.")
                .define("YUTY Fossil Spawn Weight", 1);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
