package com.dragn0007.deadlydinospt.util;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import com.mojang.datafixers.util.Pair;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class DDPTTags {

    public static class Items {
        public static final TagKey<Item> RAW_MEATS = forgeTag("raw_meats");
        public static final TagKey<Item> COOKED_MEATS = forgeTag("cooked_meats");

        public static final TagKey<Item> RAW_CHICKEN = forgeTag("raw_chicken");

        public static final TagKey<Item> RAW_DINO_MEATS = forgeTag("raw_dino_meats");
        public static final TagKey<Item> COOKED_DINO_MEATS = forgeTag("cooked_dino_meats");

        public static final TagKey<Item> MEATS = forgeTag("meats");
        public static final TagKey<Item> VEGETABLES = forgeTag("vegetables");
        public static final TagKey<Item> FISH = forgeTag("fish");

        public static final TagKey<Item> BONES = forgeTag("bones");
        public static final TagKey<Item> DOUGH = forgeTag("dough");

        public static final TagKey<Item> PLANKS = forgeTag("planks");

        public static final TagKey<Item> DINO_BONES = forgeTag("dino_bones");

        public static final TagKey<Item> LARGE_BONES = forgeTag("large_bones");
        public static final TagKey<Item> MEDIUM_BONES = forgeTag("medium_bones");
        public static final TagKey<Item> SMALL_BONES = forgeTag("small_bones");

        public static final TagKey<Item> LARGE_FOSSILS = forgeTag("large_fossils");
        public static final TagKey<Item> MEDIUM_FOSSILS = forgeTag("medium_fossils");
        public static final TagKey<Item> SMALL_FOSSILS = forgeTag("small_fossils");


        public static final TagKey<Item> SEMI_AQUATIC_FOOD = tag("semi_aquatic_food");
        public static final TagKey<Item> HERBI_FOOD = tag("herbi_food");
        public static final TagKey<Item> BEDROLL_BEDS = forgeTag("bedroll_beds");


        public static final TagKey<Item> ACROCANTHOSAURUS_BONES = tag("acrocanthosaurus_bones");
        public static final TagKey<Item> ACROCANTHOSAURUS_FOSSILS = tag("acrocanthosaurus_fossils");

        public static final TagKey<Item> ALBERTOSAURUS_BONES = tag("albertosaurus_bones");
        public static final TagKey<Item> ALBERTOSAURUS_FOSSILS = tag("albertosaurus_fossils");

        public static final TagKey<Item> ALLOSAURUS_BONES = tag("allosaurus_bones");
        public static final TagKey<Item> ALLOSAURUS_FOSSILS = tag("allosaurus_fossils");

        public static final TagKey<Item> ANDALGALORNIS_BONES = tag("andalgalornis_bones");
        public static final TagKey<Item> ANDALGALORNIS_FOSSILS = tag("andalgalornis_fossils");

        public static final TagKey<Item> ARCHAEOPTERYX_BONES = tag("archaeopteryx_bones");
        public static final TagKey<Item> ARCHAEOPTERYX_FOSSILS = tag("archaeopteryx_fossils");

        public static final TagKey<Item> ATROCIRAPTOR_BONES = tag("atrociraptor_bones");
        public static final TagKey<Item> ATROCIRAPTOR_FOSSILS = tag("atrociraptor_fossils");

        public static final TagKey<Item> AUSTRALOVENATOR_BONES = tag("australovenator_bones");
        public static final TagKey<Item> AUSTRALOVENATOR_FOSSILS = tag("australovenator_fossils");

        public static final TagKey<Item> AUSTRORAPTOR_BONES = tag("austroraptor_bones");
        public static final TagKey<Item> AUSTRORAPTOR_FOSSILS = tag("austroraptor_fossils");

        public static final TagKey<Item> BARYONYX_BONES = tag("baryonyx_bones");
        public static final TagKey<Item> BARYONYX_FOSSILS = tag("baryonyx_fossils");

        public static final TagKey<Item> CARCHARODONTOSAURUS_BONES = tag("carcharodontosaurus_bones");
        public static final TagKey<Item> CARCHARODONTOSAURUS_FOSSILS = tag("carcharodontosaurus_fossils");

        public static final TagKey<Item> CARNOTAURUS_BONES = tag("carnotaurus_bones");
        public static final TagKey<Item> CARNOTAURUS_FOSSILS = tag("carnotaurus_fossils");

        public static final TagKey<Item> CERATOSAURUS_BONES = tag("ceratosaurus_bones");
        public static final TagKey<Item> CERATOSAURUS_FOSSILS = tag("ceratosaurus_fossils");

        public static final TagKey<Item> COMPSOGNATHUS_BONES = tag("compsognathus_bones");
        public static final TagKey<Item> COMPSOGNATHUS_FOSSILS = tag("compsognathus_fossils");

        public static final TagKey<Item> CRYOLOPHOSAURUS_BONES = tag("cryolophosaurus_bones");
        public static final TagKey<Item> CRYOLOPHOSAURUS_FOSSILS = tag("cryolophosaurus_fossils");

        public static final TagKey<Item> DEINONYCHUS_BONES = tag("deinonychus_bones");
        public static final TagKey<Item> DEINONYCHUS_FOSSILS = tag("deinonychus_fossils");

        public static final TagKey<Item> DILOPHOSAURUS_BONES = tag("dilophosaurus_bones");
        public static final TagKey<Item> DILOPHOSAURUS_FOSSILS = tag("dilophosaurus_fossils");

        public static final TagKey<Item> EOCARCHARIA_BONES = tag("eocarcharia_bones");
        public static final TagKey<Item> EOCARCHARIA_FOSSILS = tag("eocarcharia_fossils");

        public static final TagKey<Item> GIGANOTOSAURUS_BONES = tag("giganotosaurus_bones");
        public static final TagKey<Item> GIGANOTOSAURUS_FOSSILS = tag("giganotosaurus_fossils");

        public static final TagKey<Item> ICHTHYOVENATOR_BONES = tag("ichthyovenator_bones");
        public static final TagKey<Item> ICHTHYOVENATOR_FOSSILS = tag("ichthyovenator_fossils");

        public static final TagKey<Item> MAHAKALA_BONES = tag("mahakala_bones");
        public static final TagKey<Item> MAHAKALA_FOSSILS = tag("mahakala_fossils");

        public static final TagKey<Item> MAJUNGASAURUS_BONES = tag("majungasaurus_bones");
        public static final TagKey<Item> MAJUNGASAURUS_FOSSILS = tag("majungasaurus_fossils");

        public static final TagKey<Item> MEGARAPTOR_BONES = tag("megaraptor_bones");
        public static final TagKey<Item> MEGARAPTOR_FOSSILS = tag("megaraptor_fossils");

        public static final TagKey<Item> TYRANNOSAURUS_BONES = tag("tyrannosaurus_bones");
        public static final TagKey<Item> TYRANNOSAURUS_FOSSILS = tag("tyrannosaurus_fossils");

        public static final TagKey<Item> SPINOSAURUS_BONES = tag("spinosaurus_bones");
        public static final TagKey<Item> SPINOSAURUS_FOSSILS = tag("spinosaurus_fossils");

        public static final TagKey<Item> TARBOSAURUS_BONES = tag("tarbosaurus_bones");
        public static final TagKey<Item> TARBOSAURUS_FOSSILS = tag("tarbosaurus_fossils");

        public static final TagKey<Item> TROODON_BONES = tag("troodon_bones");
        public static final TagKey<Item> TROODON_FOSSILS = tag("troodon_fossils");

        public static final TagKey<Item> UTAHRAPTOR_BONES = tag("utahraptor_bones");
        public static final TagKey<Item> UTAHRAPTOR_FOSSILS = tag("utahraptor_fossils");

        public static final TagKey<Item> YUTYRANNUS_BONES = tag("yutyrannus_bones");
        public static final TagKey<Item> YUTYRANNUS_FOSSILS = tag("yutyrannus_fossils");



        public static final TagKey<Item> AMARGASAURUS_BONES = tag("amargasaurus_bones");
        public static final TagKey<Item> AMARGASAURUS_FOSSILS = tag("amargasaurus_fossils");

        public static final TagKey<Item> AMPELOSAURUS_BONES = tag("ampelosaurus_bones");
        public static final TagKey<Item> AMPELOSAURUS_FOSSILS = tag("ampelosaurus_fossils");

        public static final TagKey<Item> ANKYLOSAURUS_BONES = tag("ankylosaurus_bones");
        public static final TagKey<Item> ANKYLOSAURUS_FOSSILS = tag("ankylosaurus_fossils");

        public static final TagKey<Item> AVACERATOPS_BONES = tag("avaceratops_bones");
        public static final TagKey<Item> AVACERATOPS_FOSSILS = tag("avaceratops_fossils");

        public static final TagKey<Item> CROP_SNAIL_BONES = tag("crop_snail_bones");
        public static final TagKey<Item> CROP_SNAIL_FOSSILS = tag("crop_snail_fossils");

        public static final TagKey<Item> DEINOCHERIUS_BONES = tag("deinocherius_bones");
        public static final TagKey<Item> DEINOCHERIUS_FOSSILS = tag("deinocherius_fossils");

        public static final TagKey<Item> EDMONTOSAURUS_BONES = tag("edmontosaurus_bones");
        public static final TagKey<Item> EDMONTOSAURUS_FOSSILS = tag("edmontosaurus_fossils");

        public static final TagKey<Item> GALLIMIMUS_BONES = tag("gallimimus_bones");
        public static final TagKey<Item> GALLIMIMUS_FOSSILS = tag("gallimimus_fossils");

        public static final TagKey<Item> GRYPOSAURUS_BONES = tag("gryposaurus_bones");
        public static final TagKey<Item> GRYPOSAURUS_FOSSILS = tag("gryposaurus_fossils");

        public static final TagKey<Item> IGUANODON_BONES = tag("iguanodon_bones");
        public static final TagKey<Item> IGUANODON_FOSSILS = tag("iguanodon_fossils");

        public static final TagKey<Item> PACHYCEPHALOSAURUS_BONES = tag("pachycephalosaurus_bones");
        public static final TagKey<Item> PACHYCEPHALOSAURUS_FOSSILS = tag("pachycephalosaurus_fossils");

        public static final TagKey<Item> PACHYRHINOSAURUS_BONES = tag("pachyrhinosaurus_bones");
        public static final TagKey<Item> PACHYRHINOSAURUS_FOSSILS = tag("pachyrhinosaurus_fossils");

        public static final TagKey<Item> PARASAUROLOPHUS_BONES = tag("parasaurolophus_bones");
        public static final TagKey<Item> PARASAUROLOPHUS_FOSSILS = tag("parasaurolophus_fossils");

        public static final TagKey<Item> SAUROPOSEIDON_BONES = tag("sauroposeidon_bones");
        public static final TagKey<Item> SAUROPOSEIDON_FOSSILS = tag("sauroposeidon_fossils");

        public static final TagKey<Item> SHANTUNGOSAURUS_BONES = tag("shantungosaurus_bones");
        public static final TagKey<Item> SHANTUNGOSAURUS_FOSSILS = tag("shantungosaurus_fossils");

        public static final TagKey<Item> STEGOSAURUS_BONES = tag("stegosaurus_bones");
        public static final TagKey<Item> STEGOSAURUS_FOSSILS = tag("stegosaurus_fossils");

        public static final TagKey<Item> THERIZINOSAURUS_BONES = tag("therizinosaurus_bones");
        public static final TagKey<Item> THERIZINOSAURUS_FOSSILS = tag("therizinosaurus_fossils");

        public static final TagKey<Item> TRICERATOPS_BONES = tag("triceratops_bones");
        public static final TagKey<Item> TRICERATOPS_FOSSILS = tag("triceratops_fossils");

        public static final TagKey<Item> ARGANODUS_BONES = tag("arganodus_bones");
        public static final TagKey<Item> ARGANODUS_FOSSILS = tag("arganodus_fossils");

        public static final TagKey<Item> BASILOSAURUS_BONES = tag("basilosaurus_bones");
        public static final TagKey<Item> BASILOSAURUS_FOSSILS = tag("basilosaurus_fossils");

        public static final TagKey<Item> DUNKLEOSTEUS_BONES = tag("dunkleosteus_bones");
        public static final TagKey<Item> DUNKLEOSTEUS_FOSSILS = tag("dunkleosteus_fossils");

        public static final TagKey<Item> GAR_BONES = tag("gar_bones");
        public static final TagKey<Item> GAR_FOSSILS = tag("gar_fossils");

        public static final TagKey<Item> HELICOPRION_BONES = tag("helicoprion_bones");
        public static final TagKey<Item> HELICOPRION_FOSSILS = tag("helicoprion_fossils");

        public static final TagKey<Item> HYNERIA_BONES = tag("hyneria_bones");
        public static final TagKey<Item> HYNERIA_FOSSILS = tag("hyneria_fossils");


        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DeadlyDinosPT.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        //TODO (EVNGLX): If the array causes performance issues, see if there are alternatives
        //TODO (EVNGLX): Are this all the dinos...?
        public static final Map<TagKey<Item>, Pair<RegistryObject<Item>, String>> FOSSIL_TO_EGG_MAP = new HashMap<>() {{
            put(ACROCANTHOSAURUS_FOSSILS, new Pair<>(DDPTItems.ACRO_EGG, "Acrocanthosaurus"));
            put(ACROCANTHOSAURUS_BONES, new Pair<> (DDPTItems.ACRO_EGG,"Acrocanthosaurus"));
            put(ALBERTOSAURUS_FOSSILS,new Pair<> (DDPTItems.ALBERTO_EGG,"Albertosaurus"));
            put(ALBERTOSAURUS_BONES,new Pair<> (DDPTItems.ALBERTO_EGG,"Albertosaurus"));
            put(ALLOSAURUS_FOSSILS,new Pair<> (DDPTItems.ALLO_EGG,"Allosaurus"));
            put(ALLOSAURUS_BONES,new Pair<> (DDPTItems.ALLO_EGG,"Allosaurus"));
            put(ANDALGALORNIS_FOSSILS,new Pair<> (DDPTItems.ANDAL_EGG,"Andalgalornis"));
            put(ANDALGALORNIS_BONES,new Pair<> (DDPTItems.ANDAL_EGG,"Andalgalornis"));
            put(ARCHAEOPTERYX_FOSSILS,new Pair<> (DDPTItems.ARCHAE_EGG,"Archaeopteryx"));
            put(ARCHAEOPTERYX_BONES,new Pair<> (DDPTItems.ARCHAE_EGG,"Archaeopteryx"));
            put(ATROCIRAPTOR_FOSSILS,new Pair<> (DDPTItems.ATROCI_EGG,"Atrociraptor"));
            put(ATROCIRAPTOR_BONES,new Pair<> (DDPTItems.ATROCI_EGG,"Atrociraptor"));
            put(AUSTRALOVENATOR_FOSSILS,new Pair<> (DDPTItems.AUSTRALO_EGG,"Australovenator"));
            put(AUSTRALOVENATOR_BONES,new Pair<> (DDPTItems.AUSTRALO_EGG,"Australovenator"));
            put(AUSTRORAPTOR_FOSSILS,new Pair<> (DDPTItems.AUSTRO_EGG,"Austroraptor"));
            put(AUSTRORAPTOR_BONES,new Pair<> (DDPTItems.AUSTRO_EGG,"Austroraptor"));
            put(BARYONYX_FOSSILS,new Pair<> (DDPTItems.BARY_EGG,"Baryonyx"));
            put(BARYONYX_BONES,new Pair<> (DDPTItems.BARY_EGG,"Baryonyx"));
            put(CARCHARODONTOSAURUS_FOSSILS,new Pair<> (DDPTItems.CARCHAR_EGG,"Carcharodontosaurus"));
            put(CARCHARODONTOSAURUS_BONES,new Pair<> (DDPTItems.CARCHAR_EGG,"Carcharodontosaurus"));
            put(CARNOTAURUS_FOSSILS,new Pair<> (DDPTItems.CARNO_EGG,"Carnotaurus"));
            put(CARNOTAURUS_BONES,new Pair<> (DDPTItems.CARNO_EGG,"Carnotaurus"));
            put(CERATOSAURUS_FOSSILS,new Pair<> (DDPTItems.CERATO_EGG,"Ceratosaurus"));
            put(CERATOSAURUS_BONES,new Pair<> (DDPTItems.CERATO_EGG,"Ceratosaurus"));
            put(COMPSOGNATHUS_FOSSILS,new Pair<> (DDPTItems.COMPY_EGG,"Compsognathus"));
            put(COMPSOGNATHUS_BONES,new Pair<> (DDPTItems.COMPY_EGG,"Compsognathus"));
            put(CRYOLOPHOSAURUS_FOSSILS,new Pair<> (DDPTItems.CRYO_EGG,"Cryolophosaurus"));
            put(CRYOLOPHOSAURUS_BONES,new Pair<> (DDPTItems.CRYO_EGG,"Cryolophosaurus"));
            put(DEINONYCHUS_FOSSILS,new Pair<> (DDPTItems.DEINON_EGG,"Deinonychus"));
            put(DEINONYCHUS_BONES,new Pair<> (DDPTItems.DEINON_EGG,"Deinonychus"));
            put(DILOPHOSAURUS_FOSSILS,new Pair<> (DDPTItems.DILO_EGG,"Dilophosaurus"));
            put(DILOPHOSAURUS_BONES,new Pair<> (DDPTItems.DILO_EGG,"Dilophosaurus"));
            put(EOCARCHARIA_FOSSILS,new Pair<> (DDPTItems.EOCARCHAR_EGG,"Eocarcharia"));
            put(EOCARCHARIA_BONES,new Pair<> (DDPTItems.EOCARCHAR_EGG,"Eocarcharia"));
            put(GIGANOTOSAURUS_FOSSILS,new Pair<> (DDPTItems.GIGA_EGG,"Giganotosaurus"));
            put(GIGANOTOSAURUS_BONES,new Pair<> (DDPTItems.GIGA_EGG,"Giganotosaurus"));
            put(ICHTHYOVENATOR_FOSSILS,new Pair<> (DDPTItems.ICHTHY_EGG,"Ichthyovenator"));
            put(ICHTHYOVENATOR_BONES,new Pair<> (DDPTItems.ICHTHY_EGG,"Ichthyovenator"));
            put(MAHAKALA_FOSSILS,new Pair<> (DDPTItems.MAHAKALA_EGG,"Mahakala"));
            put(MAHAKALA_BONES,new Pair<> (DDPTItems.MAHAKALA_EGG,"Mahakala"));
            put(MAJUNGASAURUS_FOSSILS,new Pair<> (DDPTItems.MAJUNGA_EGG,"Majungasaurus"));
            put(MAJUNGASAURUS_BONES,new Pair<> (DDPTItems.MAJUNGA_EGG,"Majungasaurus"));
            put(MEGARAPTOR_FOSSILS,new Pair<> (DDPTItems.MEGARAP_EGG,"Megaraptor"));
            put(MEGARAPTOR_BONES,new Pair<> (DDPTItems.MEGARAP_EGG,"Megaraptor"));
            put(TYRANNOSAURUS_FOSSILS,new Pair<> (DDPTItems.REX_EGG,"Tyrannosaurus"));
            put(TYRANNOSAURUS_BONES,new Pair<> (DDPTItems.REX_EGG,"Tyrannosaurus"));
            put(SPINOSAURUS_FOSSILS,new Pair<> (DDPTItems.SPINO_EGG,"Spinosaurus"));
            put(SPINOSAURUS_BONES,new Pair<> (DDPTItems.SPINO_EGG,"Spinosaurus"));
            put(TARBOSAURUS_FOSSILS,new Pair<> (DDPTItems.TARBO_EGG,"Tarbosaurus"));
            put(TARBOSAURUS_BONES,new Pair<> (DDPTItems.TARBO_EGG,"Tarbosaurus"));
            put(TROODON_FOSSILS,new Pair<> (DDPTItems.TROODON_EGG,"Troodon"));
            put(TROODON_BONES,new Pair<> (DDPTItems.TROODON_EGG,"Troodon"));
            put(UTAHRAPTOR_FOSSILS,new Pair<> (DDPTItems.UTAH_EGG,"Utahraptor"));
            put(UTAHRAPTOR_BONES,new Pair<> (DDPTItems.UTAH_EGG,"Utahraptor"));
            put(YUTYRANNUS_FOSSILS,new Pair<> (DDPTItems.YUTY_EGG,"Yutyrannus"));
            put(YUTYRANNUS_BONES,new Pair<> (DDPTItems.YUTY_EGG,"Yutyrannus"));

            put(AMARGASAURUS_FOSSILS,new Pair<> (DDPTItems.AMARGA_EGG,"Amargasaurus"));
            put(AMARGASAURUS_BONES,new Pair<> (DDPTItems.AMARGA_EGG,"Amargasaurus"));
            put(AMPELOSAURUS_FOSSILS,new Pair<> (DDPTItems.AMPELO_EGG,"Ampelosaurus"));
            put(AMPELOSAURUS_BONES,new Pair<> (DDPTItems.AMPELO_EGG,"Ampelosaurus"));
            put(ANKYLOSAURUS_FOSSILS,new Pair<> (DDPTItems.ANKY_EGG,"Ankylosaurus"));
            put(ANKYLOSAURUS_BONES,new Pair<> (DDPTItems.ANKY_EGG,"Ankylosaurus"));
            put(AVACERATOPS_FOSSILS,new Pair<> (DDPTItems.AVA_EGG,"Avaceratops"));
            put(AVACERATOPS_BONES,new Pair<> (DDPTItems.AVA_EGG,"Avaceratops"));
            put(CROP_SNAIL_FOSSILS,new Pair<> (DDPTItems.CROPSNAIL_EGG,"Crop Snail"));
            put(CROP_SNAIL_BONES,new Pair<> (DDPTItems.CROPSNAIL_EGG,"Crop Snail"));
            put(DEINOCHERIUS_FOSSILS,new Pair<> (DDPTItems.DEINOCH_EGG,"Deinocherius"));
            put(DEINOCHERIUS_BONES,new Pair<> (DDPTItems.DEINOCH_EGG,"Deinocherius"));
            put(EDMONTOSAURUS_FOSSILS,new Pair<> (DDPTItems.EDMONTO_EGG,"Edmontosaurus"));
            put(EDMONTOSAURUS_BONES,new Pair<> (DDPTItems.EDMONTO_EGG,"Edmontosaurus"));
            put(GALLIMIMUS_FOSSILS,new Pair<> (DDPTItems.GALLI_EGG,"Gallimimus"));
            put(GALLIMIMUS_BONES,new Pair<> (DDPTItems.GALLI_EGG,"Gallimimus"));
            put(GRYPOSAURUS_FOSSILS,new Pair<> (DDPTItems.GRYPO_EGG,"Gryposaurus"));
            put(GRYPOSAURUS_BONES,new Pair<> (DDPTItems.GRYPO_EGG,"Gryposaurus"));
            put(IGUANODON_FOSSILS,new Pair<> (DDPTItems.IGUA_EGG,"Iguanodon"));
            put(IGUANODON_BONES,new Pair<> (DDPTItems.IGUA_EGG,"Iguanodon"));
            put(PACHYCEPHALOSAURUS_FOSSILS,new Pair<> (DDPTItems.PACHY_EGG,"Pachycephalosaurus"));
            put(PACHYCEPHALOSAURUS_BONES,new Pair<> (DDPTItems.PACHY_EGG,"Pachycephalosaurus"));
            put(PACHYRHINOSAURUS_FOSSILS,new Pair<> (DDPTItems.PACHYR_EGG,"Pachyrhinosaurus"));
            put(PACHYRHINOSAURUS_BONES,new Pair<> (DDPTItems.PACHYR_EGG,"Pachyrhinosaurus"));
            put(PARASAUROLOPHUS_FOSSILS,new Pair<> (DDPTItems.PARA_EGG,"Parasaurolophus"));
            put(PARASAUROLOPHUS_BONES,new Pair<> (DDPTItems.PARA_EGG,"Parasaurolophus"));
            put(SAUROPOSEIDON_FOSSILS,new Pair<> (DDPTItems.SAURO_EGG,"Sauroposeidon"));
            put(SAUROPOSEIDON_BONES,new Pair<> (DDPTItems.SAURO_EGG,"Sauroposeidon"));
            put(SHANTUNGOSAURUS_FOSSILS,new Pair<> (DDPTItems.SHANT_EGG,"Shantungosaurus"));
            put(SHANTUNGOSAURUS_BONES,new Pair<> (DDPTItems.SHANT_EGG,"Shantungosaurus"));
            put(STEGOSAURUS_FOSSILS,new Pair<> (DDPTItems.STEGO_EGG,"Stegosaurus"));
            put(STEGOSAURUS_BONES,new Pair<> (DDPTItems.STEGO_EGG,"Stegosaurus"));
            put(THERIZINOSAURUS_FOSSILS,new Pair<> (DDPTItems.THERI_EGG,"Therizinosaurus"));
            put(THERIZINOSAURUS_BONES,new Pair<> (DDPTItems.THERI_EGG,"Therizinosaurus"));
            put(TRICERATOPS_FOSSILS,new Pair<> (DDPTItems.THERI_EGG,"Triceratops"));
            put(TRICERATOPS_BONES,new Pair<> (DDPTItems.THERI_EGG,"Triceratops"));

            put(ARGANODUS_FOSSILS,new Pair<> (DDPTItems.ARGAN_EGG,"Arganodus"));
            put(ARGANODUS_BONES,new Pair<> (DDPTItems.ARGAN_EGG,"Arganodus"));
            put(BASILOSAURUS_FOSSILS,new Pair<> (DDPTItems.BASILO_EGG,"Basilosaurus"));
            put(BASILOSAURUS_BONES,new Pair<> (DDPTItems.BASILO_EGG,"Basilosaurus"));
            put(DUNKLEOSTEUS_FOSSILS,new Pair<> (DDPTItems.DUNKLEO_EGG,"Dunkleosteus"));
            put(DUNKLEOSTEUS_BONES,new Pair<> (DDPTItems.DUNKLEO_EGG,"Dunkleosteus"));
            put(GAR_FOSSILS,new Pair<> (DDPTItems.GAR_EGG,"Alligator Gar"));
            put(GAR_BONES,new Pair<> (DDPTItems.GAR_EGG,"Alligator Gar"));
            put(HELICOPRION_FOSSILS,new Pair<> (DDPTItems.HELI_EGG,"Helicoprion"));
            put(HELICOPRION_BONES,new Pair<> (DDPTItems.HELI_EGG,"Helicoprion"));
            put(HYNERIA_FOSSILS,new Pair<> (DDPTItems.HYNERIA_EGG,"Hyneria"));
            put(HYNERIA_BONES,new Pair<> (DDPTItems.HYNERIA_EGG,"Hyneria"));
        }};

        public static CompoundTag fossilItemToTag(ItemStack fossil) {
            // it is VERY confusing that mc uses both "TAG" for nbt internally and "TAG" for the usual meaning of tag...devs
            for(TagKey<Item> fossilTag : FOSSIL_TO_EGG_MAP.keySet()) {
                if(fossil.is(fossilTag)) {
                    CompoundTag tag = new CompoundTag();
                    tag.putString("SpeciesTag", fossilTag.toString());
                    return tag;
                }
            }
            DeadlyDinosPT.LOGGER.warn("Uhh... did you like, discover a new dino or something? We can't get tissue from that, man!");
            return new CompoundTag();
        }

        public static ItemStack fossilTagToEgg(CompoundTag tag) {
            if(tag == null || !tag.contains("SpeciesTag")) {
                DeadlyDinosPT.LOGGER.warn("Gonna be honest, I don't know how you managed to make an species-less embryo...");
                return ItemStack.EMPTY;
            }

            TagKey<Item> fossilTag = null;
            for(TagKey<Item> fossilEntry : FOSSIL_TO_EGG_MAP.keySet()) {
                if(tag.getString("SpeciesTag").equals(fossilEntry.toString())) {
                    fossilTag = fossilEntry;
                }
            }

            if(fossilTag == null) {
                DeadlyDinosPT.LOGGER.warn("So...you made an embryo but of an unknown species...we, uh, can't really do anything with that.");
                return ItemStack.EMPTY;
            }

            return FOSSIL_TO_EGG_MAP.get(fossilTag).getFirst().get().getDefaultInstance();
        }
    }

    public static class Blocks {
        public static final TagKey<Block> BRUSHABLE = tag("brushable");
        public static final TagKey<Block> CHISELABLE = tag("chiselable");


        private static TagKey<Block> tag (String name) {
            return BlockTags.create(new ResourceLocation(DeadlyDinosPT.MODID, name));
        }
        private static TagKey<Block> forgeTag (String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

}
