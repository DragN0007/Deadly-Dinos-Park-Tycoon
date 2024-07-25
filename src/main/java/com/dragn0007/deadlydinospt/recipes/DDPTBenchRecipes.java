package com.dragn0007.deadlydinospt.recipes;

import com.dragn0007.deadlydinospt.DeadlyDinosPT;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDPTBenchRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DeadlyDinosPT.MODID);

    public static final RegistryObject<RecipeSerializer<AcidVatRecipe>> ACID_VAT_SERIALIZER =
            SERIALIZERS.register("dissolve_fossils", () -> AcidVatRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}