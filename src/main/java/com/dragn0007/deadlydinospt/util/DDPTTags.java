package com.dragn0007.deadlydinospt.util;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDPTTags {

    public static class Items {
        public static final TagKey<Item> RAW_MEATS = forgeTag("raw_meats");
        public static final TagKey<Item> COOKED_MEATS = forgeTag("cooked_meats");

        public static final TagKey<Item> RAW_CHICKEN = forgeTag("raw_chicken");

        public static final TagKey<Item> RAW_DINO_MEATS = forgeTag("raw_dino_meats");
        public static final TagKey<Item> COOKED_DINO_MEATS = forgeTag("cooked_dino_meats");

        public static final TagKey<Item> MEATS = forgeTag("meats");
        public static final TagKey<Item> VEGETABLES = forgeTag("vegetables");

        public static final TagKey<Item> BONES = forgeTag("bones");
        public static final TagKey<Item> DOUGH = forgeTag("dough");


        public static final TagKey<Item> LARGE_BONES = forgeTag("large_bones");
        public static final TagKey<Item> MEDIUM_BONES = forgeTag("medium_bones");
        public static final TagKey<Item> SMALL_BONES = forgeTag("small_bones");

        public static final TagKey<Item> LARGE_FOSSILS = forgeTag("large_fossils");
        public static final TagKey<Item> MEDIUM_FOSSILS = forgeTag("medium_fossils");
        public static final TagKey<Item> SMALL_FOSSILS = forgeTag("small_fossils");



        public static final TagKey<Item> ACROCANTHOSAURUS_BONES = tag("acrocanthosaurus_bones");
        public static final TagKey<Item> ACROCANTHOSAURUS_FOSSILS = tag("acrocanthosaurus_fossils");

        public static final TagKey<Item> ALBERTOSAURUS_BONES = tag("albertosaurus_bones");
        public static final TagKey<Item> ALBERTOSAURUS_FOSSILS = tag("albertosaurus_fossils");

        public static final TagKey<Item> ALLOSAURUS_BONES = tag("allosaurus_bones");
        public static final TagKey<Item> ALLOSAURUS_FOSSILS = tag("allosaurus_fossils");

        public static final TagKey<Item> ANDALGALORNIS_BONES = tag("andalgalornis_bones");
        public static final TagKey<Item> ANDALGALORNIS_FOSSILS = tag("andalgalornis_fossils");

        public static final TagKey<Item> CERATOSAURUS_BONES = tag("ceratosaurus_bones");
        public static final TagKey<Item> CERATOSAURUS_FOSSILS = tag("ceratosaurus_fossils");

        public static final TagKey<Item> ARCHAEOPTERYX_BONES = tag("archaeopteryx_bones");
        public static final TagKey<Item> ARCHAEOPTERYX_FOSSILS = tag("archaeopteryx_fossils");


        private static TagKey<Item> tag (String name) {
            return ItemTags.create(new ResourceLocation(DeadlyDinosPT.MODID, name));
        }
        private static TagKey<Item> forgeTag (String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
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
