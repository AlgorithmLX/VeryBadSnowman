package com.valion.very_bad_snowman.item;

import com.valion.very_bad_snowman.setup.Registration;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

public class SnowCrystalArmor extends ArmorItem {
    public SnowCrystalArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties builderIn) {
        super(materialIn, slot, builderIn);
    }

    @Override
    public void onArmorTick(ItemStack stack, World level, PlayerEntity player) {
        super.onArmorTick(stack, level, player);
        if(!player.getPersistentData().contains("wearingFullArmor"))player.getPersistentData()
                .putBoolean("wearingFullArmor", false);

        ItemStack head = player.getItemStackFromSlot(EquipmentSlotType.HEAD);
        ItemStack chest = player.getItemStackFromSlot(EquipmentSlotType.CHEST);
        ItemStack legs = player.getItemStackFromSlot(EquipmentSlotType.LEGS);
        ItemStack feet = player.getItemStackFromSlot(EquipmentSlotType.FEET);

        if(!player.getPersistentData().contains("wearingFullArmor"))player
                .getPersistentData().putBoolean("wearingFullArmor", false);
        boolean iswearingFullArmor =
                head != null && head.getItem() == Registration.SNOW_CRYSTAL_HELMET.get() &&
                        chest != null && chest.getItem() == Registration.SNOW_CRYSTAL_CHESTPLATE.get() &&
                        legs != null && legs.getItem() == Registration.SNOW_CRYSTAL_LEGGINGS.get() &&
                        feet != null && feet.getItem() == Registration.SNOW_CRYSTAL_BOOTS.get();

        boolean wasWearingArmorLastTick = player.getPersistentData()
                .getBoolean("wearingFullMatterArmor");

        if(iswearingFullArmor && wasWearingArmorLastTick) {
            EffectInstance nv = new EffectInstance
                    (Effects.NIGHT_VISION, 0, 10, false, false);
            player.addPotionEffect(nv);
            EffectInstance resistance = new EffectInstance
                    (Effects.FIRE_RESISTANCE, 0, 10, false, false);
            player.addPotionEffect(resistance);
        }
        player.getPersistentData().putBoolean("wearingFullArmor", iswearingFullArmor);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlotType slot, String layer)
    {
        if (slot == EquipmentSlotType.LEGS)
        {
            return ModId +":textures/models/armor/snow_crystal_layer_2.png";
        }
        else
        {
            return ModId +":textures/models/armor/snow_crystal_layer_1.png";
        }
    }
}
