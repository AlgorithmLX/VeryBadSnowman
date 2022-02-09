package com.valion.very_bad_snowman.item;

import com.valion.very_bad_snowman.setup.Registration;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import static com.valion.very_bad_snowman.VeryBadSnowman.ModId;

public class SnowCrystalArmor extends ArmorItem {
    public SnowCrystalArmor(EquipmentSlot p_40387_, Properties p_40388_) {
        super(SnowCrystalArmorTier.SNOW_CRYSTAL_ARMOR, p_40387_, p_40388_);
    }



    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player) {
        super.onArmorTick(stack, world, player);
        if(!player.getPersistentData().contains("wearingFullMatterArmor"))player.getPersistentData().putBoolean("wearingFullMatterArmor", false);

        ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
        ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
        ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
        ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

        if(!player.getPersistentData().contains("wearingFullMatterArmor"))player
                .getPersistentData().putBoolean("wearingFullMatterArmor", false);
        boolean iswearingFullMatterArmor =
                head != null && head.getItem() == Registration.SNOW_CRYSTAL_HELMET.get() &&
                        chest != null && chest.getItem() == Registration.SNOW_CRYSTAL_CHESTPLATE.get() &&
                        legs != null && legs.getItem() == Registration.SNOW_CRYSTAL_LEGGINGS.get() &&
                        feet != null && feet.getItem() == Registration.SNOW_CRYSTAL_BOOTS.get();

        boolean wasWearingMatterCrystalArmorLastTick = player.getPersistentData().getBoolean("wearingFullMatterArmor");

        if(iswearingFullMatterArmor && wasWearingMatterCrystalArmorLastTick){
            MobEffectInstance fr = new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1, 1, false, false);
            player.addEffect(fr);

            MobEffectInstance nv = new MobEffectInstance(MobEffects.NIGHT_VISION, 300, 1, false, false);
            player.addEffect(nv);
        }

        player.getPersistentData().putBoolean("wearingFullMatterArmor", iswearingFullMatterArmor);
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlot slot, String layer)
    {
        if (slot == EquipmentSlot.LEGS)
        {
            return ModId +":textures/models/armor/snow_crystal_layer_2.png";
        }
        else
        {
            return ModId +":textures/models/armor/snow_crystal_layer_1.png";
        }
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack stack) {
        return stack.copy();
    }
}
