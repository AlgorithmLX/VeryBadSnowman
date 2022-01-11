package com.valion.very_bad_snowman.entity.render;

import com.valion.very_bad_snowman.entity.model.BadSnowmanModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

public class BadSnowmanRender extends MobRenderer
{
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ModId,"textures/entity/bad_snowman.png");

    public BadSnowmanRender(EntityRendererManager rendererManager) {
        super(rendererManager, new BadSnowmanModel(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity) {
        return TEXTURE;
    }
}
