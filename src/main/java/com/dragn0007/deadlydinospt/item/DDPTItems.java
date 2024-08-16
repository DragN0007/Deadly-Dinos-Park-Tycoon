package com.dragn0007.deadlydinospt.item;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.entity.util.EntityTypes;
import com.dragn0007.deadlydinospt.item.custom.*;
import com.dragn0007.deadlydinospt.item.util.DDPTItemGroup;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDPTItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DeadlyDinosPT.MODID);



    //EGGS
    public static final RegistryObject<Item> UTAH_SPAWN_EGG = ITEMS.register("utah_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.UTAH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> UTAH_EGG = ITEMS.register("utah_egg",
            () -> new DinoEggItem(EntityTypes.UTAH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> COMPY_SPAWN_EGG = ITEMS.register("compy_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.COMPY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> COMPY_EGG = ITEMS.register("compy_egg",
            () -> new DinoEggItem(EntityTypes.COMPY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ACRO_SPAWN_EGG = ITEMS.register("acro_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ACRO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ACRO_EGG = ITEMS.register("acro_egg",
            () -> new DinoEggItem(EntityTypes.ACRO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> CARNO_SPAWN_EGG = ITEMS.register("carno_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.CARNO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> CARNO_EGG = ITEMS.register("carno_egg",
            () -> new DinoEggItem(EntityTypes.CARNO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> CERATO_SPAWN_EGG = ITEMS.register("cerato_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.CERATO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> CERATO_EGG = ITEMS.register("cerato_egg",
            () -> new DinoEggItem(EntityTypes.CERATO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> GIGA_SPAWN_EGG = ITEMS.register("giga_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.GIGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> GIGA_EGG = ITEMS.register("giga_egg",
            () -> new DinoEggItem(EntityTypes.GIGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> REX_SPAWN_EGG = ITEMS.register("rex_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.REX_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> REX_EGG = ITEMS.register("rex_egg",
            () -> new DinoEggItem(EntityTypes.REX_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> SPINO_SPAWN_EGG = ITEMS.register("spino_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.SPINO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> SPINO_EGG = ITEMS.register("spino_egg",
            () -> new DinoEggItem(EntityTypes.SPINO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> MAHAKALA_SPAWN_EGG = ITEMS.register("mahakala_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.MAHAKALA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_EGG = ITEMS.register("mahakala_egg",
            () -> new DinoEggItem(EntityTypes.MAHAKALA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> AUSTRO_SPAWN_EGG = ITEMS.register("austro_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.AUSTRO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> AUSTRO_EGG = ITEMS.register("austro_egg",
            () -> new DinoEggItem(EntityTypes.AUSTRO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> DEINON_SPAWN_EGG = ITEMS.register("deinon_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.DEINON_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> DEINON_EGG = ITEMS.register("deinon_egg",
            () -> new DinoEggItem(EntityTypes.DEINON_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ALBERTO_SPAWN_EGG = ITEMS.register("alberto_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ALBERTO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ALBERTO_EGG = ITEMS.register("alberto_egg",
            () -> new DinoEggItem(EntityTypes.ALBERTO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> MAJUNGA_SPAWN_EGG = ITEMS.register("majunga_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.MAJUNGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> MAJUNGA_EGG = ITEMS.register("majunga_egg",
            () -> new DinoEggItem(EntityTypes.MAJUNGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> TROODON_SPAWN_EGG = ITEMS.register("troodon_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.TROODON_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> TROODON_EGG = ITEMS.register("troodon_egg",
            () -> new DinoEggItem(EntityTypes.TROODON_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ARCHAE_SPAWN_EGG = ITEMS.register("archae_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ARCHAE_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ARCHAE_EGG = ITEMS.register("archae_egg",
            () -> new DinoEggItem(EntityTypes.ARCHAE_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> TARBO_SPAWN_EGG = ITEMS.register("tarbo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.TARBO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> TARBO_EGG = ITEMS.register("tarbo_egg",
            () -> new DinoEggItem(EntityTypes.TARBO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ANDAL_SPAWN_EGG = ITEMS.register("andal_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ANDAL_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ANDAL_EGG = ITEMS.register("andal_egg",
            () -> new DinoEggItem(EntityTypes.ANDAL_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> CARCHAR_SPAWN_EGG = ITEMS.register("carchar_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.CARCHAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> CARCHAR_EGG = ITEMS.register("carchar_egg",
            () -> new DinoEggItem(EntityTypes.CARCHAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ALLO_SPAWN_EGG = ITEMS.register("allo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ALLO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ALLO_EGG = ITEMS.register("allo_egg",
            () -> new DinoEggItem(EntityTypes.ALLO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> DILO_SPAWN_EGG = ITEMS.register("dilo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.DILO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> DILO_EGG = ITEMS.register("dilo_egg",
            () -> new DinoEggItem(EntityTypes.DILO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> YUTY_SPAWN_EGG = ITEMS.register("yuty_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.YUTY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> YUTY_EGG = ITEMS.register("yuty_egg",
            () -> new DinoEggItem(EntityTypes.YUTY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> CRYO_SPAWN_EGG = ITEMS.register("cryo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.CRYO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> CRYO_EGG = ITEMS.register("cryo_egg",
            () -> new DinoEggItem(EntityTypes.CRYO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> AUSTRALO_SPAWN_EGG = ITEMS.register("australo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.AUSTRALO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> AUSTRALO_EGG = ITEMS.register("australo_egg",
            () -> new DinoEggItem(EntityTypes.AUSTRALO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ATROCI_SPAWN_EGG = ITEMS.register("atroci_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ATROCI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ATROCI_EGG = ITEMS.register("atroci_egg",
            () -> new DinoEggItem(EntityTypes.ATROCI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ICHTHY_SPAWN_EGG = ITEMS.register("ichthy_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ICHTHY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ICHTHY_EGG = ITEMS.register("ichthy_egg",
            () -> new DinoEggItem(EntityTypes.ICHTHY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> MEGARAP_SPAWN_EGG = ITEMS.register("megarap_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.MEGARAP_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> MEGARAP_EGG = ITEMS.register("megarap_egg",
            () -> new DinoEggItem(EntityTypes.MEGARAP_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> EOCARCHAR_SPAWN_EGG = ITEMS.register("eocarchar_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.EOCARCHAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> EOCARCHAR_EGG = ITEMS.register("eocarchar_egg",
            () -> new DinoEggItem(EntityTypes.EOCARCHAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> BARY_SPAWN_EGG = ITEMS.register("bary_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.BARY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> BARY_EGG = ITEMS.register("bary_egg",
            () -> new DinoEggItem(EntityTypes.BARY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));


    public static final RegistryObject<Item> CROPSNAIL_SPAWN_EGG = ITEMS.register("cropsnail_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.CROPSNAIL_ENTITY, 0x9648273, 0xbd864b, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> CROPSNAIL_EGG = ITEMS.register("cropsnail_egg",
            () -> new DinoEggItem(EntityTypes.CROPSNAIL_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> AMARGA_SPAWN_EGG = ITEMS.register("amarga_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.AMARGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> AMARGA_EGG = ITEMS.register("amarga_egg",
            () -> new DinoEggItem(EntityTypes.AMARGA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> PARA_SPAWN_EGG = ITEMS.register("para_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.PARA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> PARA_EGG = ITEMS.register("para_egg",
            () -> new DinoEggItem(EntityTypes.PARA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> THERI_SPAWN_EGG = ITEMS.register("theri_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.THERI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> THERI_EGG = ITEMS.register("theri_egg",
            () -> new DinoEggItem(EntityTypes.THERI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> DEINOCH_SPAWN_EGG = ITEMS.register("deinoch_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.DEINOCH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> DEINOCH_EGG = ITEMS.register("deinoch_egg",
            () -> new DinoEggItem(EntityTypes.DEINOCH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> STEGO_SPAWN_EGG = ITEMS.register("stego_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.STEGO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> STEGO_EGG = ITEMS.register("stego_egg",
            () -> new DinoEggItem(EntityTypes.STEGO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> SHANT_SPAWN_EGG = ITEMS.register("shant_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.SHANT_ENTITY, 0x3d4947, 0xf8ffff, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> SHANT_EGG = ITEMS.register("shant_egg",
            () -> new DinoEggItem(EntityTypes.SHANT_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> GALLI_SPAWN_EGG = ITEMS.register("galli_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.GALLI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> GALLI_EGG = ITEMS.register("galli_egg",
            () -> new DinoEggItem(EntityTypes.GALLI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> SAURO_SPAWN_EGG = ITEMS.register("sauro_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.SAURO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> SAURO_EGG = ITEMS.register("sauro_egg",
            () -> new DinoEggItem(EntityTypes.SAURO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ANKY_SPAWN_EGG = ITEMS.register("anky_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ANKY_ENTITY, 0xb08260, 0xe3955d, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ANKY_EGG = ITEMS.register("anky_egg",
            () -> new DinoEggItem(EntityTypes.ANKY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> AVA_SPAWN_EGG = ITEMS.register("ava_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.AVA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> AVA_EGG = ITEMS.register("ava_egg",
            () -> new DinoEggItem(EntityTypes.AVA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> GRYPO_SPAWN_EGG = ITEMS.register("grypo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.GRYPO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> GRYPO_EGG = ITEMS.register("grypo_egg",
            () -> new DinoEggItem(EntityTypes.GRYPO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> AMPELO_SPAWN_EGG = ITEMS.register("ampelo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.AMPELO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> AMPELO_EGG = ITEMS.register("ampelo_egg",
            () -> new DinoEggItem(EntityTypes.AMPELO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> PACHYR_SPAWN_EGG = ITEMS.register("pachyr_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.PACHYR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> PACHYR_EGG = ITEMS.register("pachyr_egg",
            () -> new DinoEggItem(EntityTypes.PACHYR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> TRIKE_SPAWN_EGG = ITEMS.register("trike_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.TRIKE_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> TRIKE_EGG = ITEMS.register("trike_egg",
            () -> new DinoEggItem(EntityTypes.TRIKE_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> PACHY_SPAWN_EGG = ITEMS.register("pachy_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.PACHY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> PACHY_EGG = ITEMS.register("pachy_egg",
            () -> new DinoEggItem(EntityTypes.PACHY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> EDMONTO_SPAWN_EGG = ITEMS.register("edmonto_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.EDMONTO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> EDMONTO_EGG = ITEMS.register("edmonto_egg",
            () -> new DinoEggItem(EntityTypes.EDMONTO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> IGUA_SPAWN_EGG = ITEMS.register("igua_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.IGUA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> IGUA_EGG = ITEMS.register("igua_egg",
            () -> new DinoEggItem(EntityTypes.IGUA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));


    public static final RegistryObject<Item> MOSA_SPAWN_EGG = ITEMS.register("mosa_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.MOSA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> MOSA_EGG = ITEMS.register("mosa_egg",
            () -> new DinoEggItem(EntityTypes.MOSA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> HELI_SPAWN_EGG = ITEMS.register("heli_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.HELI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> HELI_EGG = ITEMS.register("heli_egg",
            () -> new DinoEggItem(EntityTypes.HELI_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> GAR_SPAWN_EGG = ITEMS.register("gar_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.GAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> GAR_EGG = ITEMS.register("gar_egg",
            () -> new DinoEggItem(EntityTypes.GAR_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> DUNKLEO_SPAWN_EGG = ITEMS.register("dunkleo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.DUNKLEO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> DUNKLEO_EGG = ITEMS.register("dunkleo_egg",
            () -> new DinoEggItem(EntityTypes.DUNKLEO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ICHTHYO_SPAWN_EGG = ITEMS.register("ichthyo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ICHTHYO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ICHTHYO_EGG = ITEMS.register("ichthyo_egg",
            () -> new DinoEggItem(EntityTypes.ICHTHYO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> LEED_SPAWN_EGG = ITEMS.register("leed_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.LEED_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> LEED_EGG = ITEMS.register("leed_egg",
            () -> new DinoEggItem(EntityTypes.LEED_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> BASILO_SPAWN_EGG = ITEMS.register("basilo_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.BASILO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> BASILO_EGG = ITEMS.register("basilo_egg",
            () -> new DinoEggItem(EntityTypes.BASILO_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> MEG_SPAWN_EGG = ITEMS.register("meg_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.MEG_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> MEG_EGG = ITEMS.register("meg_egg",
            () -> new DinoEggItem(EntityTypes.MEG_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> LIVY_SPAWN_EGG = ITEMS.register("livy_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.LIVY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> LIVY_EGG = ITEMS.register("livy_egg",
            () -> new DinoEggItem(EntityTypes.LIVY_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> STETH_SPAWN_EGG = ITEMS.register("steth_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.STETH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> STETH_EGG = ITEMS.register("steth_egg",
            () -> new DinoEggItem(EntityTypes.STETH_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> HYNERIA_SPAWN_EGG = ITEMS.register("hyneria_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.HYNERIA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> HYNERIA_EGG = ITEMS.register("hyneria_egg",
            () -> new DinoEggItem(EntityTypes.HYNERIA_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));

    public static final RegistryObject<Item> ARGAN_SPAWN_EGG = ITEMS.register("argan_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityTypes.ARGAN_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));
    public static final RegistryObject<Item> ARGAN_EGG = ITEMS.register("argan_egg",
            () -> new DinoEggItem(EntityTypes.ARGAN_ENTITY, 0x00FFFFFF, 0x00FFFFFF, new Item.Properties().stacksTo(64).tab(DDPTItemGroup.DINO_GROUP)));



    //FOOD ITEMS
    public static final RegistryObject<Item> RAWSMALLMEAT = ITEMS.register("rawsmallmeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 250, 4) ,0.75F).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKEDSMALLMEAT = ITEMS.register("cookedsmallmeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RAWMEDIUMMEAT = ITEMS.register("rawmediummeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 5) ,0.85F).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKEDMEDIUMMEAT = ITEMS.register("cookedmediummeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RAWLARGEMEAT = ITEMS.register("rawlargemeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 300, 5) ,0.85F).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKEDLARGEMEAT = ITEMS.register("cookedlargemeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CRACKER = ITEMS.register("cracker",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINOSANDWICH = ITEMS.register("dinosandwich",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(18).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CANNEDVEGGIES = ITEMS.register("cannedveggies",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CANNEDMEAT = ITEMS.register("cannedmeat",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CANNEDSTEW = ITEMS.register("cannedstew",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> MRE = ITEMS.register("mre",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
//    public static final RegistryObject<Item> ALCOHOL = ITEMS.register("alcohol",
//            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SODA = ITEMS.register("soda",
        () -> new SodaItem(
                new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1, true, false),
                new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 1, true, false)
        ));
    public static final RegistryObject<Item> TIGER_NUTS = ITEMS.register("tiger_nuts",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> YEW_PLUM = ITEMS.register("yew_plum",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> TIGER_NUT_BUTTER = ITEMS.register("tiger_nut_butter",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> YEW_PLUM_JAM = ITEMS.register("yew_plum_jam",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(7).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> PBJ = ITEMS.register("pbj",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(14).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GLAZED_RIBS = ITEMS.register("glazed_ribs",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> RAWESCARGOT = ITEMS.register("rawescargot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0).meat().effect(() -> new MobEffectInstance(MobEffects.HUNGER, 250, 4) ,0.75F).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKEDESCARGOT = ITEMS.register("cookedescargot",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINO_NUGGET_1 = ITEMS.register("dino_nugget_1",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINO_NUGGET_2 = ITEMS.register("dino_nugget_2",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINO_NUGGET_3 = ITEMS.register("dino_nugget_3",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> HEARTY_SALAD = ITEMS.register("hearty_salad",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SMOOTHIE = ITEMS.register("smoothie",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(6).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINO_DUMPLING = ITEMS.register("dino_dumpling",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> CHICKEN_NOODLE_SOUP = ITEMS.register("chicken_noodle_soup",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(8).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DINO_ROAST = ITEMS.register("dino_roast",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(16).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BONE_MARROW = ITEMS.register("bone_marrow",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> BROTH = ITEMS.register("broth",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(1).build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> GAR = ITEMS.register("gar",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_GAR = ITEMS.register("cooked_gar",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> SHARK = ITEMS.register("shark",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(0).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_SHARK = ITEMS.register("cooked_shark",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(12).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> LARGE_FISH = ITEMS.register("large_fish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_LARGE_FISH = ITEMS.register("cooked_large_fish",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> ARGANODUS = ITEMS.register("arganodus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_ARGANODUS = ITEMS.register("cooked_arganodus",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> HYNERIA = ITEMS.register("hyneria",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(0).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));
    public static final RegistryObject<Item> COOKED_HYNERIA = ITEMS.register("cooked_hyneria",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(10).saturationMod(1).meat().build()).tab(DDPTItemGroup.FOOD_GROUP)));

    public static final RegistryObject<Item> BLUBBER = ITEMS.register("blubber",
            () -> new BlubberItem(new Item.Properties().tab(DDPTItemGroup.FOOD_GROUP)));

    //ITEMS
    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(Tiers.IRON, 1, -2.8F,
                    new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BRUSH = ITEMS.register("brush",
            () -> new BrushItem(Tiers.WOOD, 1, -2.8F,
                    new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACID_BUCKET = ITEMS.register("acid_bucket",
            () -> new Item(new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET).tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EMBRYO = ITEMS.register("embryo",
            () -> new SpeciesNBTItem());
    public static final RegistryObject<Item> FOSSILIZED_SOFT_TISSUE = ITEMS.register("fossilized_soft_tissue",
            () -> new SpeciesNBTItem());
    public static final RegistryObject<Item> PETRI_DISH = ITEMS.register("petri_dish",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DNA_PETRI_DISH = ITEMS.register("dna_petri_dish",
            () -> new SpeciesNBTItem());
    public static final RegistryObject<Item> TEST_TUBE = ITEMS.register("test_tube",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> EOCARCHARIA_ARMOR = ITEMS.register("eocarcharia_armor",
            () -> new Item(new Item.Properties().stacksTo(1).tab(DDPTItemGroup.DDD_GROUP)));


    //TROPHIES
    public static final RegistryObject<TrophyItem> ACROTROPHY = ITEMS.register("acrotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> ALBERTOTROPHY = ITEMS.register("albertotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 3,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 5, true, false)

            ));
    public static final RegistryObject<TrophyItem> ALLOTROPHY = ITEMS.register("allotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> ANDALTROPHY = ITEMS.register("andaltrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> ARCHAETROPHY = ITEMS.register("archaetrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> ATROCITROPHY = ITEMS.register("atrocitrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> AUSTRALOTROPHY = ITEMS.register("australotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> AUSTROTROPHY = ITEMS.register("austrotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2, true, false)

            ));
    public static final RegistryObject<TrophyItem> BARYTROPHY = ITEMS.register("barytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> CARCHARTROPHY = ITEMS.register("carchartrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> CARNOTROPHY = ITEMS.register("carnotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> CERATOTROPHY = ITEMS.register("ceratotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> COMPYTROPHY = ITEMS.register("compytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> CRYOTROPHY = ITEMS.register("cryotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> DEINONTROPHY = ITEMS.register("deinontrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> DILOTROPHY = ITEMS.register("dilotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.INVISIBILITY, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.LUCK, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> EOCARCHARTROPHY = ITEMS.register("eocarchartrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> GIGATROPHY = ITEMS.register("gigatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 3, true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> ICHTHYTROPHY = ITEMS.register("ichthytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> IGUATROPHY = ITEMS.register("iguatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> MAHAKALATROPHY = ITEMS.register("mahakalatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> MAJUNGATROPHY = ITEMS.register("majungatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> MEGARAPTROPHY = ITEMS.register("megaraptrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.INVISIBILITY, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> REXTROPHY = ITEMS.register("rextrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 5, true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> SPINOTROPHY = ITEMS.register("spinotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> TARBOTROPHY = ITEMS.register("tarbotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 1,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> TROODONTROPHY = ITEMS.register("troodontrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.LUCK, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2, true, false)
            ));
    public static final RegistryObject<TrophyItem> UTAHTROPHY = ITEMS.register("utahtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> YUTYTROPHY = ITEMS.register("yutytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));


    public static final RegistryObject<TrophyItem> AMARGATROPHY = ITEMS.register("amargatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> AMPELOTROPHY = ITEMS.register("ampelotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.HEAL, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> ANKYTROPHY = ITEMS.register("ankytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> AVATROPHY = ITEMS.register("avatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.HEALTH_BOOST, 2880, 2,true, false)
            ));
    public static final RegistryObject<TrophyItem> DEINOCHTROPHY = ITEMS.register("deinochtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> EDMONTOTROPHY = ITEMS.register("edmontotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> GALLITROPHY = ITEMS.register("gallitrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.JUMP, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> GRYPOTROPHY = ITEMS.register("grypotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.HEAL, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> PACHYRTROPHY = ITEMS.register("pachyrtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.HEAL, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> PARATROPHY = ITEMS.register("paratrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> SAUROTROPHY = ITEMS.register("saurotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false),
                    new MobEffectInstance(MobEffects.SATURATION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> SHANTTROPHY = ITEMS.register("shanttrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.HEALTH_BOOST, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> STEGOTROPHY = ITEMS.register("stegotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.REGENERATION, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> THERITROPHY = ITEMS.register("theritrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3, true, false)
            ));


    public static final RegistryObject<TrophyItem> TRIKETROPHY = ITEMS.register("triketrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> PACHYTROPHY = ITEMS.register("pachytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 3, true, false)
            ));





    public static final RegistryObject<TrophyItem> MOSATROPHY = ITEMS.register("mosatrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false),
                    new MobEffectInstance(MobEffects.CONDUIT_POWER, 2880, 2,true, false)
            ));
    public static final RegistryObject<TrophyItem> HELITROPHY = ITEMS.register("helitrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false)
            ));
    public static final RegistryObject<TrophyItem> DUNKLEOTROPHY = ITEMS.register("dunkleotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 5,true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 2, true, false)
            ));

    public static final RegistryObject<TrophyItem> ICHTHYOTROPHY = ITEMS.register("ichthyotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 2, true, false)
            ));

    public static final RegistryObject<TrophyItem> LEEDTROPHY = ITEMS.register("leedtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.CONDUIT_POWER, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));

    public static final RegistryObject<TrophyItem> BASILOTROPHY = ITEMS.register("basilotrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.CONDUIT_POWER, 2880, 3, true, false)
            ));

    public static final RegistryObject<TrophyItem> MEGTROPHY = ITEMS.register("megtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false)
            ));

    public static final RegistryObject<TrophyItem> LIVYTROPHY = ITEMS.register("livytrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.ABSORPTION, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2880, 3, true, false)
            ));

    public static final RegistryObject<TrophyItem> STETHTROPHY = ITEMS.register("stethtrophy",
            () -> new TrophyItem(
                    new MobEffectInstance(MobEffects.DIG_SPEED, 2880, 2,true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 2880, 3, true, false)
            ));



    //TODO; DINO BONES

    //ACROCANTHOSAURUS
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_TOOTH = ITEMS.register("acrocanthosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_SKULL = ITEMS.register("acrocanthosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_RIBS= ITEMS.register("acrocanthosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_CLAW = ITEMS.register("acrocanthosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_TAIL = ITEMS.register("acrocanthosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_SPINE = ITEMS.register("acrocanthosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_FOSSIL_LEG = ITEMS.register("acrocanthosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ACROCANTHOSAURUS_TOOTH = ITEMS.register("acrocanthosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_SKULL = ITEMS.register("acrocanthosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_RIBS= ITEMS.register("acrocanthosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_CLAW = ITEMS.register("acrocanthosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_TAIL = ITEMS.register("acrocanthosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_SPINE = ITEMS.register("acrocanthosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ACROCANTHOSAURUS_LEG = ITEMS.register("acrocanthosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ALBERTOSAURUS
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_TOOTH = ITEMS.register("albertosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_SKULL = ITEMS.register("albertosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_RIBS= ITEMS.register("albertosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_CLAW = ITEMS.register("albertosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_TAIL = ITEMS.register("albertosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_SPINE = ITEMS.register("albertosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_FOSSIL_LEG = ITEMS.register("albertosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ALBERTOSAURUS_TOOTH = ITEMS.register("albertosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_SKULL = ITEMS.register("albertosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_RIBS= ITEMS.register("albertosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_CLAW = ITEMS.register("albertosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_TAIL = ITEMS.register("albertosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_SPINE = ITEMS.register("albertosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALBERTOSAURUS_LEG = ITEMS.register("albertosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ALLOSAURUS
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_TOOTH = ITEMS.register("allosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_SKULL = ITEMS.register("allosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_RIBS= ITEMS.register("allosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_CLAW = ITEMS.register("allosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_TAIL = ITEMS.register("allosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_SPINE = ITEMS.register("allosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_FOSSIL_LEG = ITEMS.register("allosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ALLOSAURUS_TOOTH = ITEMS.register("allosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_SKULL = ITEMS.register("allosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_RIBS= ITEMS.register("allosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_CLAW = ITEMS.register("allosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_TAIL = ITEMS.register("allosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_SPINE = ITEMS.register("allosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ALLOSAURUS_LEG = ITEMS.register("allosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ANDALGALORNIS
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_TOOTH = ITEMS.register("andalgalornis_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_SKULL = ITEMS.register("andalgalornis_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_RIBS= ITEMS.register("andalgalornis_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_CLAW = ITEMS.register("andalgalornis_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_TAIL = ITEMS.register("andalgalornis_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_SPINE = ITEMS.register("andalgalornis_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_FOSSIL_LEG = ITEMS.register("andalgalornis_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ANDALGALORNIS_TOOTH = ITEMS.register("andalgalornis_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_SKULL = ITEMS.register("andalgalornis_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_RIBS= ITEMS.register("andalgalornis_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_CLAW = ITEMS.register("andalgalornis_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_TAIL = ITEMS.register("andalgalornis_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_SPINE = ITEMS.register("andalgalornis_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANDALGALORNIS_LEG = ITEMS.register("andalgalornis_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ARCHAEOPTERYX
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_TOOTH = ITEMS.register("archaeopteryx_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_SKULL = ITEMS.register("archaeopteryx_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_RIBS= ITEMS.register("archaeopteryx_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_CLAW = ITEMS.register("archaeopteryx_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_TAIL = ITEMS.register("archaeopteryx_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_SPINE = ITEMS.register("archaeopteryx_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_LEG = ITEMS.register("archaeopteryx_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_FOSSIL_RAPTOR_CLAW = ITEMS.register("archaeopteryx_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ARCHAEOPTERYX_TOOTH = ITEMS.register("archaeopteryx_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_SKULL = ITEMS.register("archaeopteryx_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_RIBS= ITEMS.register("archaeopteryx_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_CLAW = ITEMS.register("archaeopteryx_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_TAIL = ITEMS.register("archaeopteryx_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_SPINE = ITEMS.register("archaeopteryx_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_LEG = ITEMS.register("archaeopteryx_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARCHAEOPTERYX_RAPTOR_CLAW = ITEMS.register("archaeopteryx_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ATROCIRAPTOR
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_TOOTH = ITEMS.register("atrociraptor_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_SKULL = ITEMS.register("atrociraptor_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_RIBS= ITEMS.register("atrociraptor_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_CLAW = ITEMS.register("atrociraptor_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_TAIL = ITEMS.register("atrociraptor_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_SPINE = ITEMS.register("atrociraptor_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_LEG = ITEMS.register("atrociraptor_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_FOSSIL_RAPTOR_CLAW = ITEMS.register("atrociraptor_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ATROCIRAPTOR_TOOTH = ITEMS.register("atrociraptor_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_SKULL = ITEMS.register("atrociraptor_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_RIBS= ITEMS.register("atrociraptor_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_CLAW = ITEMS.register("atrociraptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_TAIL = ITEMS.register("atrociraptor_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_SPINE = ITEMS.register("atrociraptor_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_LEG = ITEMS.register("atrociraptor_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ATROCIRAPTOR_RAPTOR_CLAW = ITEMS.register("atrociraptor_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //AUSTRALOVENATOR
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_TOOTH = ITEMS.register("australovenator_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_SKULL = ITEMS.register("australovenator_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_RIBS= ITEMS.register("australovenator_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_CLAW = ITEMS.register("australovenator_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_TAIL = ITEMS.register("australovenator_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_SPINE = ITEMS.register("australovenator_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_LEG = ITEMS.register("australovenator_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_FOSSIL_RAPTOR_CLAW = ITEMS.register("australovenator_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> AUSTRALOVENATOR_TOOTH = ITEMS.register("australovenator_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_SKULL = ITEMS.register("australovenator_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_RIBS= ITEMS.register("australovenator_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_CLAW = ITEMS.register("australovenator_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_TAIL = ITEMS.register("australovenator_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_SPINE = ITEMS.register("australovenator_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_LEG = ITEMS.register("australovenator_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRALOVENATOR_RAPTOR_CLAW = ITEMS.register("australovenator_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //AUSTRORAPTOR
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_TOOTH = ITEMS.register("austroraptor_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_SKULL = ITEMS.register("austroraptor_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_RIBS= ITEMS.register("austroraptor_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_CLAW = ITEMS.register("austroraptor_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_TAIL = ITEMS.register("austroraptor_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_SPINE = ITEMS.register("austroraptor_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_LEG = ITEMS.register("austroraptor_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_FOSSIL_RAPTOR_CLAW = ITEMS.register("austroraptor_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> AUSTRORAPTOR_TOOTH = ITEMS.register("austroraptor_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_SKULL = ITEMS.register("austroraptor_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_RIBS= ITEMS.register("austroraptor_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_CLAW = ITEMS.register("austroraptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_TAIL = ITEMS.register("austroraptor_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_SPINE = ITEMS.register("austroraptor_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_LEG = ITEMS.register("austroraptor_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AUSTRORAPTOR_RAPTOR_CLAW = ITEMS.register("austroraptor_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //BARYONYX
    public static final RegistryObject<Item> BARYONYX_FOSSIL_TOOTH = ITEMS.register("baryonyx_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_SKULL = ITEMS.register("baryonyx_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_RIBS= ITEMS.register("baryonyx_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_CLAW = ITEMS.register("baryonyx_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_TAIL = ITEMS.register("baryonyx_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_SPINE = ITEMS.register("baryonyx_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_FOSSIL_LEG = ITEMS.register("baryonyx_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> BARYONYX_TOOTH = ITEMS.register("baryonyx_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_SKULL = ITEMS.register("baryonyx_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_RIBS= ITEMS.register("baryonyx_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_CLAW = ITEMS.register("baryonyx_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_TAIL = ITEMS.register("baryonyx_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_SPINE = ITEMS.register("baryonyx_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BARYONYX_LEG = ITEMS.register("baryonyx_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //CARCHARODONTOSAURUS
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_TOOTH = ITEMS.register("carcharodontosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_SKULL = ITEMS.register("carcharodontosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_RIBS= ITEMS.register("carcharodontosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_CLAW = ITEMS.register("carcharodontosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_TAIL = ITEMS.register("carcharodontosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_SPINE = ITEMS.register("carcharodontosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_FOSSIL_LEG = ITEMS.register("carcharodontosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> CARCHARODONTOSAURUS_TOOTH = ITEMS.register("carcharodontosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_SKULL = ITEMS.register("carcharodontosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_RIBS= ITEMS.register("carcharodontosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_CLAW = ITEMS.register("carcharodontosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_TAIL = ITEMS.register("carcharodontosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_SPINE = ITEMS.register("carcharodontosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARCHARODONTOSAURUS_LEG = ITEMS.register("carcharodontosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //CARNOTAURUS
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_TOOTH = ITEMS.register("carnotaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_SKULL = ITEMS.register("carnotaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_RIBS= ITEMS.register("carnotaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_CLAW = ITEMS.register("carnotaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_TAIL = ITEMS.register("carnotaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_SPINE = ITEMS.register("carnotaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_FOSSIL_LEG = ITEMS.register("carnotaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> CARNOTAURUS_TOOTH = ITEMS.register("carnotaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_SKULL = ITEMS.register("carnotaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_RIBS= ITEMS.register("carnotaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_CLAW = ITEMS.register("carnotaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_TAIL = ITEMS.register("carnotaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_SPINE = ITEMS.register("carnotaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CARNOTAURUS_LEG = ITEMS.register("carnotaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //CERATOSAURUS
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_TOOTH = ITEMS.register("ceratosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_SKULL = ITEMS.register("ceratosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_RIBS= ITEMS.register("ceratosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_CLAW = ITEMS.register("ceratosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_TAIL = ITEMS.register("ceratosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_SPINE = ITEMS.register("ceratosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_FOSSIL_LEG = ITEMS.register("ceratosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> CERATOSAURUS_TOOTH = ITEMS.register("ceratosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_SKULL = ITEMS.register("ceratosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_RIBS= ITEMS.register("ceratosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_CLAW = ITEMS.register("ceratosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_TAIL = ITEMS.register("ceratosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_SPINE = ITEMS.register("ceratosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CERATOSAURUS_LEG = ITEMS.register("ceratosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //COMPSOGNATHUS
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_TOOTH = ITEMS.register("compsognathus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_SKULL = ITEMS.register("compsognathus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_RIBS= ITEMS.register("compsognathus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_CLAW = ITEMS.register("compsognathus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_TAIL = ITEMS.register("compsognathus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_SPINE = ITEMS.register("compsognathus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_FOSSIL_LEG = ITEMS.register("compsognathus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> COMPSOGNATHUS_TOOTH = ITEMS.register("compsognathus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_SKULL = ITEMS.register("compsognathus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_RIBS= ITEMS.register("compsognathus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_CLAW = ITEMS.register("compsognathus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_TAIL = ITEMS.register("compsognathus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_SPINE = ITEMS.register("compsognathus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> COMPSOGNATHUS_LEG = ITEMS.register("compsognathus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //CRYOLOPHOSAURUS
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_TOOTH = ITEMS.register("cryolophosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_SKULL = ITEMS.register("cryolophosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_RIBS= ITEMS.register("cryolophosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_CLAW = ITEMS.register("cryolophosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_TAIL = ITEMS.register("cryolophosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_SPINE = ITEMS.register("cryolophosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_FOSSIL_LEG = ITEMS.register("cryolophosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> CRYOLOPHOSAURUS_TOOTH = ITEMS.register("cryolophosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_SKULL = ITEMS.register("cryolophosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_RIBS= ITEMS.register("cryolophosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_CLAW = ITEMS.register("cryolophosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_TAIL = ITEMS.register("cryolophosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_SPINE = ITEMS.register("cryolophosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CRYOLOPHOSAURUS_LEG = ITEMS.register("cryolophosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //DEINONYCHUS
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_TOOTH = ITEMS.register("deinonychus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_SKULL = ITEMS.register("deinonychus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_RIBS= ITEMS.register("deinonychus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_CLAW = ITEMS.register("deinonychus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_TAIL = ITEMS.register("deinonychus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_SPINE = ITEMS.register("deinonychus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_LEG = ITEMS.register("deinonychus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_FOSSIL_RAPTOR_CLAW = ITEMS.register("deinonychus_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> DEINONYCHUS_TOOTH = ITEMS.register("deinonychus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_SKULL = ITEMS.register("deinonychus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_RIBS= ITEMS.register("deinonychus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_CLAW = ITEMS.register("deinonychus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_TAIL = ITEMS.register("deinonychus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_SPINE = ITEMS.register("deinonychus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_LEG = ITEMS.register("deinonychus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINONYCHUS_RAPTOR_CLAW = ITEMS.register("deinonychus_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //DILOPHOSAURUS
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_TOOTH = ITEMS.register("dilophosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_SKULL = ITEMS.register("dilophosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_RIBS= ITEMS.register("dilophosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_CLAW = ITEMS.register("dilophosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_TAIL = ITEMS.register("dilophosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_SPINE = ITEMS.register("dilophosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_FOSSIL_LEG = ITEMS.register("dilophosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> DILOPHOSAURUS_TOOTH = ITEMS.register("dilophosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_SKULL = ITEMS.register("dilophosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_RIBS= ITEMS.register("dilophosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_CLAW = ITEMS.register("dilophosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_TAIL = ITEMS.register("dilophosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_SPINE = ITEMS.register("dilophosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DILOPHOSAURUS_LEG = ITEMS.register("dilophosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //EOCARCHARIA
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_TOOTH = ITEMS.register("eocarcharia_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_SKULL = ITEMS.register("eocarcharia_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_RIBS= ITEMS.register("eocarcharia_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_CLAW = ITEMS.register("eocarcharia_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_TAIL = ITEMS.register("eocarcharia_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_SPINE = ITEMS.register("eocarcharia_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_FOSSIL_LEG = ITEMS.register("eocarcharia_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> EOCARCHARIA_TOOTH = ITEMS.register("eocarcharia_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_SKULL = ITEMS.register("eocarcharia_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_RIBS= ITEMS.register("eocarcharia_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_CLAW = ITEMS.register("eocarcharia_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_TAIL = ITEMS.register("eocarcharia_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_SPINE = ITEMS.register("eocarcharia_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EOCARCHARIA_LEG = ITEMS.register("eocarcharia_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //GIGANOTOSAURUS
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_TOOTH = ITEMS.register("giganotosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_SKULL = ITEMS.register("giganotosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_RIBS= ITEMS.register("giganotosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_CLAW = ITEMS.register("giganotosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_TAIL = ITEMS.register("giganotosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_SPINE = ITEMS.register("giganotosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_FOSSIL_LEG = ITEMS.register("giganotosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> GIGANOTOSAURUS_TOOTH = ITEMS.register("giganotosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_SKULL = ITEMS.register("giganotosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_RIBS= ITEMS.register("giganotosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_CLAW = ITEMS.register("giganotosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_TAIL = ITEMS.register("giganotosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_SPINE = ITEMS.register("giganotosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GIGANOTOSAURUS_LEG = ITEMS.register("giganotosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ICHTHYOVENATOR
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_TOOTH = ITEMS.register("ichthyovenator_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_SKULL = ITEMS.register("ichthyovenator_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_RIBS= ITEMS.register("ichthyovenator_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_CLAW = ITEMS.register("ichthyovenator_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_TAIL = ITEMS.register("ichthyovenator_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_SPINE = ITEMS.register("ichthyovenator_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_FOSSIL_LEG = ITEMS.register("ichthyovenator_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ICHTHYOVENATOR_TOOTH = ITEMS.register("ichthyovenator_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_SKULL = ITEMS.register("ichthyovenator_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_RIBS= ITEMS.register("ichthyovenator_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_CLAW = ITEMS.register("ichthyovenator_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_TAIL = ITEMS.register("ichthyovenator_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_SPINE = ITEMS.register("ichthyovenator_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ICHTHYOVENATOR_LEG = ITEMS.register("ichthyovenator_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //MAHAKALA
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_TOOTH = ITEMS.register("mahakala_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_SKULL = ITEMS.register("mahakala_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_RIBS= ITEMS.register("mahakala_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_CLAW = ITEMS.register("mahakala_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_TAIL = ITEMS.register("mahakala_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_SPINE = ITEMS.register("mahakala_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_LEG = ITEMS.register("mahakala_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_FOSSIL_RAPTOR_CLAW = ITEMS.register("mahakala_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> MAHAKALA_TOOTH = ITEMS.register("mahakala_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_SKULL = ITEMS.register("mahakala_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_RIBS= ITEMS.register("mahakala_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_CLAW = ITEMS.register("mahakala_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_TAIL = ITEMS.register("mahakala_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_SPINE = ITEMS.register("mahakala_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_LEG = ITEMS.register("mahakala_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAHAKALA_RAPTOR_CLAW = ITEMS.register("mahakala_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //MAJUNGASAURUS
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_TOOTH = ITEMS.register("majungasaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_SKULL = ITEMS.register("majungasaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_RIBS= ITEMS.register("majungasaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_CLAW = ITEMS.register("majungasaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_TAIL = ITEMS.register("majungasaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_SPINE = ITEMS.register("majungasaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_FOSSIL_LEG = ITEMS.register("majungasaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> MAJUNGASAURUS_TOOTH = ITEMS.register("majungasaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_SKULL = ITEMS.register("majungasaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_RIBS= ITEMS.register("majungasaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_CLAW = ITEMS.register("majungasaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_TAIL = ITEMS.register("majungasaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_SPINE = ITEMS.register("majungasaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MAJUNGASAURUS_LEG = ITEMS.register("majungasaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //MEGARAPTOR
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_TOOTH = ITEMS.register("megaraptor_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_SKULL = ITEMS.register("megaraptor_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_RIBS= ITEMS.register("megaraptor_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_CLAW = ITEMS.register("megaraptor_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_TAIL = ITEMS.register("megaraptor_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_SPINE = ITEMS.register("megaraptor_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_LEG = ITEMS.register("megaraptor_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_FOSSIL_RAPTOR_CLAW = ITEMS.register("megaraptor_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> MEGARAPTOR_TOOTH = ITEMS.register("megaraptor_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_SKULL = ITEMS.register("megaraptor_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_RIBS= ITEMS.register("megaraptor_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_CLAW = ITEMS.register("megaraptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_TAIL = ITEMS.register("megaraptor_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_SPINE = ITEMS.register("megaraptor_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_LEG = ITEMS.register("megaraptor_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> MEGARAPTOR_RAPTOR_CLAW = ITEMS.register("megaraptor_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //TYRANNOSAURUS
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_TOOTH = ITEMS.register("tyrannosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_SKULL = ITEMS.register("tyrannosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_RIBS= ITEMS.register("tyrannosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_CLAW = ITEMS.register("tyrannosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_TAIL = ITEMS.register("tyrannosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_SPINE = ITEMS.register("tyrannosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_FOSSIL_LEG = ITEMS.register("tyrannosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> TYRANNOSAURUS_TOOTH = ITEMS.register("tyrannosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_SKULL = ITEMS.register("tyrannosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_RIBS= ITEMS.register("tyrannosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_CLAW = ITEMS.register("tyrannosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_TAIL = ITEMS.register("tyrannosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_SPINE = ITEMS.register("tyrannosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TYRANNOSAURUS_LEG = ITEMS.register("tyrannosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //SPINOSAURUS
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_TOOTH = ITEMS.register("spinosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_SKULL = ITEMS.register("spinosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_RIBS= ITEMS.register("spinosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_CLAW = ITEMS.register("spinosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_TAIL = ITEMS.register("spinosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_SPINE = ITEMS.register("spinosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_FOSSIL_LEG = ITEMS.register("spinosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> SPINOSAURUS_TOOTH = ITEMS.register("spinosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_SKULL = ITEMS.register("spinosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_RIBS= ITEMS.register("spinosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_CLAW = ITEMS.register("spinosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_TAIL = ITEMS.register("spinosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_SPINE = ITEMS.register("spinosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SPINOSAURUS_LEG = ITEMS.register("spinosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //TARBOSAURUS
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_TOOTH = ITEMS.register("tarbosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_SKULL = ITEMS.register("tarbosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_RIBS= ITEMS.register("tarbosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_CLAW = ITEMS.register("tarbosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_TAIL = ITEMS.register("tarbosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_SPINE = ITEMS.register("tarbosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_FOSSIL_LEG = ITEMS.register("tarbosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> TARBOSAURUS_TOOTH = ITEMS.register("tarbosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_SKULL = ITEMS.register("tarbosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_RIBS= ITEMS.register("tarbosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_CLAW = ITEMS.register("tarbosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_TAIL = ITEMS.register("tarbosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_SPINE = ITEMS.register("tarbosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TARBOSAURUS_LEG = ITEMS.register("tarbosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //TROODON
    public static final RegistryObject<Item> TROODON_FOSSIL_TOOTH = ITEMS.register("troodon_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_SKULL = ITEMS.register("troodon_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_RIBS= ITEMS.register("troodon_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_CLAW = ITEMS.register("troodon_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_TAIL = ITEMS.register("troodon_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_SPINE = ITEMS.register("troodon_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_LEG = ITEMS.register("troodon_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_FOSSIL_RAPTOR_CLAW = ITEMS.register("troodon_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> TROODON_TOOTH = ITEMS.register("troodon_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_SKULL = ITEMS.register("troodon_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_RIBS= ITEMS.register("troodon_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_CLAW = ITEMS.register("troodon_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_TAIL = ITEMS.register("troodon_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_SPINE = ITEMS.register("troodon_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_LEG = ITEMS.register("troodon_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TROODON_RAPTOR_CLAW = ITEMS.register("troodon_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //UTAHRAPTOR
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_TOOTH = ITEMS.register("utahraptor_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_SKULL = ITEMS.register("utahraptor_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_RIBS= ITEMS.register("utahraptor_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_CLAW = ITEMS.register("utahraptor_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_TAIL = ITEMS.register("utahraptor_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_SPINE = ITEMS.register("utahraptor_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_LEG = ITEMS.register("utahraptor_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_FOSSIL_RAPTOR_CLAW = ITEMS.register("utahraptor_fossil_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> UTAHRAPTOR_TOOTH = ITEMS.register("utahraptor_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_SKULL = ITEMS.register("utahraptor_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_RIBS= ITEMS.register("utahraptor_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_CLAW = ITEMS.register("utahraptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_TAIL = ITEMS.register("utahraptor_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_SPINE = ITEMS.register("utahraptor_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_LEG = ITEMS.register("utahraptor_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> UTAHRAPTOR_RAPTOR_CLAW = ITEMS.register("utahraptor_raptor_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //YUTYRANNUS
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_TOOTH = ITEMS.register("yutyrannus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_SKULL = ITEMS.register("yutyrannus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_RIBS= ITEMS.register("yutyrannus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_CLAW = ITEMS.register("yutyrannus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_TAIL = ITEMS.register("yutyrannus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_SPINE = ITEMS.register("yutyrannus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_FOSSIL_LEG = ITEMS.register("yutyrannus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> YUTYRANNUS_TOOTH = ITEMS.register("yutyrannus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_SKULL = ITEMS.register("yutyrannus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_RIBS= ITEMS.register("yutyrannus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_CLAW = ITEMS.register("yutyrannus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_TAIL = ITEMS.register("yutyrannus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_SPINE = ITEMS.register("yutyrannus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> YUTYRANNUS_LEG = ITEMS.register("yutyrannus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));



    //AMARGASAURUS
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_TOOTH = ITEMS.register("amargasaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_SKULL = ITEMS.register("amargasaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_RIBS= ITEMS.register("amargasaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_CLAW = ITEMS.register("amargasaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_TAIL = ITEMS.register("amargasaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_SPINE = ITEMS.register("amargasaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_FOSSIL_LEG = ITEMS.register("amargasaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> AMARGASAURUS_TOOTH = ITEMS.register("amargasaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_SKULL = ITEMS.register("amargasaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_RIBS= ITEMS.register("amargasaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_CLAW = ITEMS.register("amargasaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_TAIL = ITEMS.register("amargasaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_SPINE = ITEMS.register("amargasaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMARGASAURUS_LEG = ITEMS.register("amargasaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //AMPELOSAURUS
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_TOOTH = ITEMS.register("ampelosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_SKULL = ITEMS.register("ampelosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_RIBS= ITEMS.register("ampelosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_CLAW = ITEMS.register("ampelosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_TAIL = ITEMS.register("ampelosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_SPINE = ITEMS.register("ampelosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_FOSSIL_LEG = ITEMS.register("ampelosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> AMPELOSAURUS_TOOTH = ITEMS.register("ampelosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_SKULL = ITEMS.register("ampelosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_RIBS= ITEMS.register("ampelosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_CLAW = ITEMS.register("ampelosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_TAIL = ITEMS.register("ampelosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_SPINE = ITEMS.register("ampelosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AMPELOSAURUS_LEG = ITEMS.register("ampelosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ANKYLOSAURUS
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_TOOTH = ITEMS.register("ankylosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_SKULL = ITEMS.register("ankylosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_RIBS= ITEMS.register("ankylosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_CLAW = ITEMS.register("ankylosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_TAIL = ITEMS.register("ankylosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_SPINE = ITEMS.register("ankylosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_FOSSIL_LEG = ITEMS.register("ankylosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> ANKYLOSAURUS_TOOTH = ITEMS.register("ankylosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_SKULL = ITEMS.register("ankylosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_RIBS= ITEMS.register("ankylosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_CLAW = ITEMS.register("ankylosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_TAIL = ITEMS.register("ankylosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_SPINE = ITEMS.register("ankylosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ANKYLOSAURUS_LEG = ITEMS.register("ankylosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //AVACERATOPS
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_TOOTH = ITEMS.register("avaceratops_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_SKULL = ITEMS.register("avaceratops_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_RIBS= ITEMS.register("avaceratops_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_CLAW = ITEMS.register("avaceratops_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_TAIL = ITEMS.register("avaceratops_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_SPINE = ITEMS.register("avaceratops_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_FOSSIL_LEG = ITEMS.register("avaceratops_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> AVACERATOPS_TOOTH = ITEMS.register("avaceratops_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_SKULL = ITEMS.register("avaceratops_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_RIBS= ITEMS.register("avaceratops_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_CLAW = ITEMS.register("avaceratops_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_TAIL = ITEMS.register("avaceratops_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_SPINE = ITEMS.register("avaceratops_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> AVACERATOPS_LEG = ITEMS.register("avaceratops_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //CROP SNAIL
    public static final RegistryObject<Item> CROP_SNAIL_FOSSIL_SHELL = ITEMS.register("crop_snail_fossil_shell",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> CROP_SNAIL_SHELL = ITEMS.register("crop_snail_shell",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //DEINOCHERIUS
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_TOOTH = ITEMS.register("deinocherius_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_SKULL = ITEMS.register("deinocherius_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_RIBS= ITEMS.register("deinocherius_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_CLAW = ITEMS.register("deinocherius_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_TAIL = ITEMS.register("deinocherius_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_SPINE = ITEMS.register("deinocherius_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_FOSSIL_LEG = ITEMS.register("deinocherius_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> DEINOCHERIUS_TOOTH = ITEMS.register("deinocherius_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_SKULL = ITEMS.register("deinocherius_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_RIBS= ITEMS.register("deinocherius_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_CLAW = ITEMS.register("deinocherius_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_TAIL = ITEMS.register("deinocherius_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_SPINE = ITEMS.register("deinocherius_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DEINOCHERIUS_LEG = ITEMS.register("deinocherius_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //EDMONTOSAURUS
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_TOOTH = ITEMS.register("edmontosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_SKULL = ITEMS.register("edmontosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_RIBS= ITEMS.register("edmontosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_CLAW = ITEMS.register("edmontosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_TAIL = ITEMS.register("edmontosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_SPINE = ITEMS.register("edmontosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_FOSSIL_LEG = ITEMS.register("edmontosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> EDMONTOSAURUS_TOOTH = ITEMS.register("edmontosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_SKULL = ITEMS.register("edmontosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_RIBS= ITEMS.register("edmontosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_CLAW = ITEMS.register("edmontosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_TAIL = ITEMS.register("edmontosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_SPINE = ITEMS.register("edmontosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> EDMONTOSAURUS_LEG = ITEMS.register("edmontosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //GALLIMIMUS
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_TOOTH = ITEMS.register("gallimimus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_SKULL = ITEMS.register("gallimimus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_RIBS= ITEMS.register("gallimimus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_CLAW = ITEMS.register("gallimimus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_TAIL = ITEMS.register("gallimimus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_SPINE = ITEMS.register("gallimimus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_FOSSIL_LEG = ITEMS.register("gallimimus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> GALLIMIMUS_TOOTH = ITEMS.register("gallimimus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_SKULL = ITEMS.register("gallimimus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_RIBS= ITEMS.register("gallimimus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_CLAW = ITEMS.register("gallimimus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_TAIL = ITEMS.register("gallimimus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_SPINE = ITEMS.register("gallimimus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GALLIMIMUS_LEG = ITEMS.register("gallimimus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //GRYPOSAURUS
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_TOOTH = ITEMS.register("gryposaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_SKULL = ITEMS.register("gryposaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_RIBS= ITEMS.register("gryposaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_CLAW = ITEMS.register("gryposaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_TAIL = ITEMS.register("gryposaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_SPINE = ITEMS.register("gryposaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_FOSSIL_LEG = ITEMS.register("gryposaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> GRYPOSAURUS_TOOTH = ITEMS.register("gryposaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_SKULL = ITEMS.register("gryposaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_RIBS= ITEMS.register("gryposaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_CLAW = ITEMS.register("gryposaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_TAIL = ITEMS.register("gryposaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_SPINE = ITEMS.register("gryposaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GRYPOSAURUS_LEG = ITEMS.register("gryposaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //IGUANODON
    public static final RegistryObject<Item> IGUANODON_FOSSIL_TOOTH = ITEMS.register("iguanodon_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_SKULL = ITEMS.register("iguanodon_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_RIBS= ITEMS.register("iguanodon_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_CLAW = ITEMS.register("iguanodon_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_TAIL = ITEMS.register("iguanodon_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_SPINE = ITEMS.register("iguanodon_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_FOSSIL_LEG = ITEMS.register("iguanodon_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> IGUANODON_TOOTH = ITEMS.register("iguanodon_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_SKULL = ITEMS.register("iguanodon_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_RIBS= ITEMS.register("iguanodon_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_CLAW = ITEMS.register("iguanodon_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_TAIL = ITEMS.register("iguanodon_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_SPINE = ITEMS.register("iguanodon_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> IGUANODON_LEG = ITEMS.register("iguanodon_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //PACHYCEPHALOSAURUS
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_TOOTH = ITEMS.register("pachycephalosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_SKULL = ITEMS.register("pachycephalosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_RIBS= ITEMS.register("pachycephalosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_CLAW = ITEMS.register("pachycephalosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_TAIL = ITEMS.register("pachycephalosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_SPINE = ITEMS.register("pachycephalosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_FOSSIL_LEG = ITEMS.register("pachycephalosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_TOOTH = ITEMS.register("pachycephalosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_SKULL = ITEMS.register("pachycephalosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_RIBS= ITEMS.register("pachycephalosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_CLAW = ITEMS.register("pachycephalosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_TAIL = ITEMS.register("pachycephalosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_SPINE = ITEMS.register("pachycephalosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYCEPHALOSAURUS_LEG = ITEMS.register("pachycephalosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //PACHYRHINOSAURUS
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_TOOTH = ITEMS.register("pachyrhinosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_SKULL = ITEMS.register("pachyrhinosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_RIBS= ITEMS.register("pachyrhinosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_CLAW = ITEMS.register("pachyrhinosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_TAIL = ITEMS.register("pachyrhinosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_SPINE = ITEMS.register("pachyrhinosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_FOSSIL_LEG = ITEMS.register("pachyrhinosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> PACHYRHINOSAURUS_TOOTH = ITEMS.register("pachyrhinosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_SKULL = ITEMS.register("pachyrhinosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_RIBS= ITEMS.register("pachyrhinosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_CLAW = ITEMS.register("pachyrhinosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_TAIL = ITEMS.register("pachyrhinosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_SPINE = ITEMS.register("pachyrhinosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PACHYRHINOSAURUS_LEG = ITEMS.register("pachyrhinosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //PARASAUROLOPHUS
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_TOOTH = ITEMS.register("parasaurolophus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_SKULL = ITEMS.register("parasaurolophus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_RIBS= ITEMS.register("parasaurolophus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_CLAW = ITEMS.register("parasaurolophus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_TAIL = ITEMS.register("parasaurolophus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_SPINE = ITEMS.register("parasaurolophus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_FOSSIL_LEG = ITEMS.register("parasaurolophus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> PARASAUROLOPHUS_TOOTH = ITEMS.register("parasaurolophus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_SKULL = ITEMS.register("parasaurolophus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_RIBS= ITEMS.register("parasaurolophus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_CLAW = ITEMS.register("parasaurolophus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_TAIL = ITEMS.register("parasaurolophus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_SPINE = ITEMS.register("parasaurolophus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> PARASAUROLOPHUS_LEG = ITEMS.register("parasaurolophus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //SAUROPOSEIDON
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_TOOTH = ITEMS.register("sauroposeidon_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_SKULL = ITEMS.register("sauroposeidon_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_RIBS= ITEMS.register("sauroposeidon_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_CLAW = ITEMS.register("sauroposeidon_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_TAIL = ITEMS.register("sauroposeidon_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_SPINE = ITEMS.register("sauroposeidon_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_FOSSIL_LEG = ITEMS.register("sauroposeidon_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> SAUROPOSEIDON_TOOTH = ITEMS.register("sauroposeidon_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_SKULL = ITEMS.register("sauroposeidon_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_RIBS= ITEMS.register("sauroposeidon_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_CLAW = ITEMS.register("sauroposeidon_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_TAIL = ITEMS.register("sauroposeidon_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_SPINE = ITEMS.register("sauroposeidon_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SAUROPOSEIDON_LEG = ITEMS.register("sauroposeidon_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //SHANTUNGOSAURUS
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_TOOTH = ITEMS.register("shantungosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_SKULL = ITEMS.register("shantungosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_RIBS= ITEMS.register("shantungosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_CLAW = ITEMS.register("shantungosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_TAIL = ITEMS.register("shantungosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_SPINE = ITEMS.register("shantungosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_FOSSIL_LEG = ITEMS.register("shantungosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> SHANTUNGOSAURUS_TOOTH = ITEMS.register("shantungosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_SKULL = ITEMS.register("shantungosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_RIBS= ITEMS.register("shantungosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_CLAW = ITEMS.register("shantungosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_TAIL = ITEMS.register("shantungosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_SPINE = ITEMS.register("shantungosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> SHANTUNGOSAURUS_LEG = ITEMS.register("shantungosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //STEGOSAURUS
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_TOOTH = ITEMS.register("stegosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_SKULL = ITEMS.register("stegosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_RIBS= ITEMS.register("stegosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_CLAW = ITEMS.register("stegosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_TAIL = ITEMS.register("stegosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_SPINE = ITEMS.register("stegosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_FOSSIL_LEG = ITEMS.register("stegosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> STEGOSAURUS_TOOTH = ITEMS.register("stegosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_SKULL = ITEMS.register("stegosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_RIBS= ITEMS.register("stegosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_CLAW = ITEMS.register("stegosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_TAIL = ITEMS.register("stegosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_SPINE = ITEMS.register("stegosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> STEGOSAURUS_LEG = ITEMS.register("stegosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //THERIZINOSAURUS
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_TOOTH = ITEMS.register("therizinosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_SKULL = ITEMS.register("therizinosaurus_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_RIBS= ITEMS.register("therizinosaurus_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_CLAW = ITEMS.register("therizinosaurus_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_TAIL = ITEMS.register("therizinosaurus_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_SPINE = ITEMS.register("therizinosaurus_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_FOSSIL_LEG = ITEMS.register("therizinosaurus_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> THERIZINOSAURUS_TOOTH = ITEMS.register("therizinosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_SKULL = ITEMS.register("therizinosaurus_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_RIBS= ITEMS.register("therizinosaurus_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_CLAW = ITEMS.register("therizinosaurus_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_TAIL = ITEMS.register("therizinosaurus_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_SPINE = ITEMS.register("therizinosaurus_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> THERIZINOSAURUS_LEG = ITEMS.register("therizinosaurus_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //TRICERATOPS
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_TOOTH = ITEMS.register("triceratops_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_SKULL = ITEMS.register("triceratops_fossil_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_RIBS= ITEMS.register("triceratops_fossil_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_CLAW = ITEMS.register("triceratops_fossil_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_TAIL = ITEMS.register("triceratops_fossil_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_SPINE = ITEMS.register("triceratops_fossil_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_FOSSIL_LEG = ITEMS.register("triceratops_fossil_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    public static final RegistryObject<Item> TRICERATOPS_TOOTH = ITEMS.register("triceratops_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_SKULL = ITEMS.register("triceratops_skull",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_RIBS= ITEMS.register("triceratops_ribs",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_CLAW = ITEMS.register("triceratops_claw",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_TAIL = ITEMS.register("triceratops_tail",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_SPINE = ITEMS.register("triceratops_spine",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> TRICERATOPS_LEG = ITEMS.register("triceratops_leg",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));


    //ARGANODUS
    public static final RegistryObject<Item> ARGANODUS_FOSSIL_SKELETON = ITEMS.register("arganodus_fossil_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> ARGANODUS_SKELETON = ITEMS.register("arganodus_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //BASILOSAURUS
    public static final RegistryObject<Item> BASILOSAURUS_FOSSIL_TOOTH = ITEMS.register("basilosaurus_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> BASILOSAURUS_TOOTH = ITEMS.register("basilosaurus_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //DUNKLEOSTEUS
    public static final RegistryObject<Item> DUNKLEOSTEUS_FOSSIL_SKELETON = ITEMS.register("dunkleosteus_fossil_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> DUNKLEOSTEUS_SKELETON = ITEMS.register("dunkleosteus_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //GAR
    public static final RegistryObject<Item> GAR_FOSSIL_SKELETON = ITEMS.register("gar_fossil_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> GAR_SKELETON = ITEMS.register("gar_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //HELICOPRION
    public static final RegistryObject<Item> HELICOPRION_FOSSIL_TOOTH = ITEMS.register("helicoprion_fossil_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> HELICOPRION_TOOTH = ITEMS.register("helicoprion_tooth",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));

    //HYNERIA
    public static final RegistryObject<Item> HYNERIA_FOSSIL_SKELETON = ITEMS.register("hyneria_fossil_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));
    public static final RegistryObject<Item> HYNERIA_SKELETON = ITEMS.register("hyneria_skeleton",
            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));





    //TODO;
//    public static final RegistryObject<Item> ARCHAE_HARNESS = ITEMS.register("archae_harness",
//            () -> new Item(new Item.Properties().tab(DDPTItemGroup.DDD_GROUP)));



    //MOD ITEM TABS (UNOBTAINABLE)
    public static final RegistryObject<Item> DDDITEMS = ITEMS.register("ddditems",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DDDENTITIES = ITEMS.register("dddentities",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DDDFOOD = ITEMS.register("dddfood",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DDDBLOCKS = ITEMS.register("dddblocks",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}