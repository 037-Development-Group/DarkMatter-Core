package com.groupzts.darkmattercore.config;

import com.groupzts.darkmattercore.DarkMatterCore;
import com.groupzts.darkmattercore.block.HighGravityBlock;
import com.groupzts.darkmattercore.core.DarkMatterIndexConfig;
import com.groupzts.darkmattercore.event.LivingGravityEvent;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;

public class GravityConfig {
    public static final String TAG = DarkMatterCore.MODID + ":gravity";
    private static double gravity = 1;

    public static void setGravities(LivingEntity entity, Level level) {
        Attribute attribute = ForgeMod.ENTITY_GRAVITY.get();
        AttributeInstance attributeInstance = entity.getAttribute(attribute);

        if (entity.getPersistentData().getBoolean(TAG)) {
            assert attributeInstance != null;
            setGravity(entity, attributeInstance, attribute.getDefaultValue(), false);
        }
        else {
        MinecraftForge.EVENT_BUS.post(new LivingGravityEvent(entity, attribute, attributeInstance));
    }

        if (!entity.getPersistentData().getBoolean(TAG)) {
            if ((level.getBlockState(new BlockPos(entity.getX(), entity.getY() - 1, entity.getZ()))).getBlock() instanceof HighGravityBlock) {
                gravity = 0.225F;
                assert attributeInstance != null;
                setGravity(entity, attributeInstance, gravity , true);
                entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 2,1,false,false));
            }
        }
    }
    public static void setGravity (LivingEntity entity, AttributeInstance attributeInstance,double gravity, boolean condition){
        attributeInstance.setBaseValue(gravity);
        entity.getPersistentData().putBoolean(TAG, condition);
    }

    public static double getGravity() {
        return gravity;
    }
}
