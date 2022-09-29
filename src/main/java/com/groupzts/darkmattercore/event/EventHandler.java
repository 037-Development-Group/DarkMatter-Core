package com.groupzts.darkmattercore.event;

import com.groupzts.darkmattercore.config.GravityConfig;
import com.groupzts.darkmattercore.core.DarkMatterIndexConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT)
public class EventHandler {
    @SubscribeEvent
    public static void renderOverLay(RenderGuiOverlayEvent event) {


    }

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        LivingEntity entity = event.player;
        Level level = event.player.level;
        BlockPos min = new BlockPos(entity.getX() - 5, entity.getY() - 5, entity.getZ() - 5);
        BlockPos max = new BlockPos(entity.getX() + 5, entity.getY() + 5, entity.getZ() + 5);
        GravityConfig.setGravities(entity, level);
        DarkMatterIndexConfig.aoeBlocks(level,min,max);
    }
}
