package com.groupzts.darkmattercore.core;


import com.groupzts.darkmattercore.block.HighGravityBlock;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

import java.util.Set;


public class DarkMatterIndexConfig {
    public static double normalDarkMatterIndex = 1;

    public static void aoeBlocks(Level level,BlockPos min, BlockPos max) {
        int a = 0;
        for (int lx = min.getX(); lx < max.getX(); ++lx) {
            for (int ly = min.getY(); ly < max.getY(); ++ly) {
                for (int lz = min.getZ(); lz < max.getZ(); ++lz) {
                    if(isHighGravityBlock(level, lx, ly, lz)){
                        a++;
                            setNormalDarkMatterIndex(a);
                    }
                    if(lx > max.getX() || ly > max.getY() || lz > max.getZ()){
                        break;
                    }
                }
            }
        }
    }
    private static boolean isHighGravityBlock(Level level, int x, int y, int z){
        return level.getBlockState(new BlockPos(x, y, z)).getBlock() instanceof HighGravityBlock;
    }
    public static void setNormalDarkMatterIndex(double normalDarkMatterIndex) {
        DarkMatterIndexConfig.normalDarkMatterIndex = normalDarkMatterIndex;
    }

}
