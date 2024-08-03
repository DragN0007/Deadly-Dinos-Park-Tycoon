package com.dragn0007.deadlydinospt.util;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import com.dragn0007.deadlydinospt.item.DDPTItems;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.checkerframework.checker.units.qual.C;

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


        public static final TagKey<Item> DINO_BONES = forgeTag("dino_bones");

        public static final TagKey<Item> LARGE_BONES = forgeTag("large_bones");
        public static final TagKey<Item> MEDIUM_BONES = forgeTag("medium_bones");
        public static final TagKey<Item> SMALL_BONES = forgeTag("small_bones");

        public static final TagKey<Item> LARGE_FOSSILS = forgeTag("large_fossils");
        public static final TagKey<Item> MEDIUM_FOSSILS = forgeTag("medium_fossils");
        public static final TagKey<Item> SMALL_FOSSILS = forgeTag("small_fossils");


        public static final TagKey<Item> SEMI_AQUATIC_FOOD = tag("semi_aquatic_food");
        public static final TagKey<Item> HERBI_FOOD = tag("herbi_food");


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

        public static final TagKey<Item> AUSTRALOVENATOR_BONES = tag("australovenator_bones");
        public static final TagKey<Item> AUSTRALOVENATOR_FOSSILS = tag("australovenator_fossils");

        public static final TagKey<Item> AUSTRORAPTOR_BONES = tag("austroraptor_bones");
        public static final TagKey<Item> AUSTRORAPTOR_FOSSILS = tag("austroraptor_fossils");

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

        public static final TagKey<Item> GIGANOTOSAURUS_BONES = tag("giganotosaurus_bones");
        public static final TagKey<Item> GIGANOTOSAURUS_FOSSILS = tag("giganotosaurus_fossils");

        public static final TagKey<Item> MAHAKALA_BONES = tag("mahakala_bones");
        public static final TagKey<Item> MAHAKALA_FOSSILS = tag("mahakala_fossils");

        public static final TagKey<Item> MAJUNGASAURUS_BONES = tag("majungasaurus_bones");
        public static final TagKey<Item> MAJUNGASAURUS_FOSSILS = tag("majungasaurus_fossils");

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


        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DeadlyDinosPT.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }

        //TODO (EVNGLX): If the array causes performance issues, see if there are alternatives
        //TODO (EVNGLX): Are this all the dinos...?
        public static final Map<TagKey<Item>, RegistryObject<Item>> FOSSIL_TO_EGG_MAP = new HashMap<>() {{
            put(ACROCANTHOSAURUS_FOSSILS, DDPTItems.ACRO_EGG);
            put(ALBERTOSAURUS_FOSSILS, DDPTItems.ALBERTO_EGG);
            put(ALLOSAURUS_FOSSILS, DDPTItems.ALLO_EGG);
            put(ANDALGALORNIS_FOSSILS, DDPTItems.ANDAL_EGG);
            put(ARCHAEOPTERYX_FOSSILS, DDPTItems.ARCHAE_EGG);
            put(AUSTRALOVENATOR_FOSSILS, DDPTItems.AUSTRALO_EGG);
            put(AUSTRORAPTOR_FOSSILS, DDPTItems.AUSTRO_EGG);
            put(CARCHARODONTOSAURUS_FOSSILS, DDPTItems.CARCHAR_EGG);
            put(CARNOTAURUS_FOSSILS, DDPTItems.CARNO_EGG);
            put(CERATOSAURUS_FOSSILS, DDPTItems.CERATO_EGG);
            put(COMPSOGNATHUS_FOSSILS, DDPTItems.COMPY_EGG);
            put(CRYOLOPHOSAURUS_FOSSILS, DDPTItems.CRYO_EGG);
            put(DEINONYCHUS_FOSSILS, DDPTItems.DEINON_EGG);
            put(DILOPHOSAURUS_FOSSILS, DDPTItems.DILO_EGG);
            put(GIGANOTOSAURUS_FOSSILS, DDPTItems.GIGA_EGG);
            put(MAHAKALA_FOSSILS, DDPTItems.MAHAKALA_EGG);
            put(MAJUNGASAURUS_FOSSILS, DDPTItems.MAJUNGA_EGG);
            put(TYRANNOSAURUS_FOSSILS, DDPTItems.REX_EGG);
            put(SPINOSAURUS_FOSSILS, DDPTItems.SPINO_EGG);
            put(TARBOSAURUS_FOSSILS, DDPTItems.TARBO_EGG);
            put(TROODON_FOSSILS, DDPTItems.TROODON_EGG);
            put(UTAHRAPTOR_FOSSILS, DDPTItems.UTAH_EGG);
            put(YUTYRANNUS_FOSSILS, DDPTItems.YUTY_EGG);
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

            return FOSSIL_TO_EGG_MAP.get(fossilTag).get().getDefaultInstance();
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
