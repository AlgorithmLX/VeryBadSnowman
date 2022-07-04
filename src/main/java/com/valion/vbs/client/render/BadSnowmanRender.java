package com.valion.vbs.client.render;


import static com.valion.vbs.common.VeryBadSnowman.ModId;

import com.valion.vbs.client.model.BadSnowmanModel;
import com.valion.vbs.common.entity.BadSnowman;

import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

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
