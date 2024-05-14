package com.dragn0007.deadlydinospt.util.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class DeadlyDinosPTCommonConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Integer> TROPHYITEM_DURABILITY;
    public static final ForgeConfigSpec.ConfigValue<Integer> BIG_DINO_BREAK_RADIUS;
    public static final ForgeConfigSpec.ConfigValue<Integer> SMALL_DINO_BREAK_RADIUS;





    static {
        BUILDER.push("Configs for Deadly Dinos!");

        TROPHYITEM_DURABILITY = BUILDER.comment("Amount of uses of Dino Trophies. Set to 0 for inifinite durability. Default is 10.")
                .define("How much durabiltiy should Dino Trophies have?", 10);

//        DINO_GRIEFING_ENABLED = BUILDER.comment("Should Dinos be able to break blocks? True or False. Default: True")
//                .define("Dino Grief", true);

        //Large Dinos - How many blocks should they break?
        BIG_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Large Deadly Dinos can destroy when attacking? 5 Blocks is Default.")
                .define("Large Dino destroy radius", 5);

        //Small Dinos - How many blocks should they break?
        SMALL_DINO_BREAK_RADIUS = BUILDER.comment("What should the radius be that Small Deadly Dinos can destroy when attacking? 3 Blocks is Default.")
                .define("Small Dino destroy radius", 3);




        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
