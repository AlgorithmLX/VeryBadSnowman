package com.valion.very_bad_snowman.entity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

public class RegEntity {
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ModId);

    public static final RegistryObject<EntityType<BadSnowman>> BAD_SNOWMAN =
            ENTITY_TYPES.register("bad_snowman",
                    () -> EntityType.Builder.create(BadSnowman::new,
                                    EntityClassification.MONSTER).size(1f, 2f)
                            .build(new ResourceLocation(ModId, "bad_snowman").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
