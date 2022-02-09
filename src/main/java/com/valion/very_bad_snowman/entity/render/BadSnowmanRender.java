package com.valion.very_bad_snowman.entity.render;


import com.valion.very_bad_snowman.entity.BadSnowman;
import com.valion.very_bad_snowman.entity.model.BadSnowmanModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

public class BadSnowmanRender extends MobRenderer<BadSnowman, BadSnowmanModel<BadSnowman>> {
    protected static final ResourceLocation TEXTURE =
            new ResourceLocation(ModId, "textures/entity/bad_snowman.png");

    public BadSnowmanRender(EntityRendererProvider.Context rendererManager) {
        super(rendererManager, new BadSnowmanModel<BadSnowman>(rendererManager.bakeLayer(ModelLayers.SNOW_GOLEM)), 0.5F);
    }

    @Override
    public ResourceLocation getTextureLocation(BadSnowman p_114482_) {
        return TEXTURE;
    }
}
