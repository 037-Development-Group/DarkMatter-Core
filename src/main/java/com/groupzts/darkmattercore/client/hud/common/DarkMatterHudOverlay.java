package com.groupzts.darkmattercore.client.hud.common;


import com.groupzts.darkmattercore.DarkMatterCore;
import com.groupzts.darkmattercore.config.GravityConfig;
import com.groupzts.darkmattercore.core.DarkMatterIndexConfig;
import com.groupzts.darkmattercore.item.TriggerTool;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class DarkMatterHudOverlay {
    @SubscribeEvent(priority = EventPriority.NORMAL)
    public static void eventHandler(RenderGuiOverlayEvent.Pre event) {
        int w = event.getWindow().getGuiScaledWidth();
        int h = event.getWindow().getGuiScaledHeight();
        int posX = w / 2;
        int posY = h / 2;
        Level _world = null;
        double _x = 0;
        double _y = 0;
        double _z = 0;
        Player entity = Minecraft.getInstance().player;
        if (entity != null) {
            _world = entity.level;
            _x = entity.getX();
            _y = entity.getY();
            _z = entity.getZ();
        }
        Level world = _world;
        double x = _x;
        double y = _y;
        double z = _z;
        RenderSystem.disableDepthTest();
        RenderSystem.depthMask(false);
        RenderSystem.enableBlend();
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
                GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        RenderSystem.setShaderColor(1, 1, 1, 1);
        double darkMatterIndex = DarkMatterIndexConfig.normalDarkMatterIndex;
        if (entity.getMainHandItem().getItem() instanceof TriggerTool) {
            if (darkMatterIndex <= 1.4 && darkMatterIndex >= 0.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter1.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 2.4 && darkMatterIndex >= 1.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter2.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 3.4 && darkMatterIndex >= 2.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter3.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 4.4 && darkMatterIndex >= 3.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter4.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 5.4 && darkMatterIndex >= 4.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter5.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 6.4 && darkMatterIndex >= 5.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter6.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 7.4 && darkMatterIndex >= 6.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter7.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 8.4 && darkMatterIndex >= 7.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter8.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 9.4 && darkMatterIndex >= 8.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter9.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 10.4 && darkMatterIndex >= 9.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter10.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 11.4 && darkMatterIndex >= 10.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter11.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 12.4 && darkMatterIndex >= 11.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter12.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 13.4 && darkMatterIndex >= 12.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter13.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 14.4 && darkMatterIndex >= 13.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter14.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 15.4 && darkMatterIndex >= 14.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter15.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 16.4 && darkMatterIndex >= 15.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter16.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 17.4 && darkMatterIndex >= 16.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter17.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 18.4 && darkMatterIndex >= 17.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter18.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 19.4 && darkMatterIndex >= 18.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter19.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 20.4 && darkMatterIndex >= 19.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter20.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 21.4 && darkMatterIndex >= 20.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter21.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 22.4 && darkMatterIndex >= 21.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter22.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 23.4 && darkMatterIndex >= 22.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter23.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 24.4 && darkMatterIndex >= 23.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter24.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 25.4 && darkMatterIndex >= 24.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter25.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 26.4 && darkMatterIndex >= 25.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter26.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 27.4 && darkMatterIndex >= 26.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter27.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 28.4 && darkMatterIndex >= 27.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter28.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 29.4 && darkMatterIndex >= 28.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter29.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 30.4 && darkMatterIndex >= 29.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter30.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 31.4 && darkMatterIndex >= 30.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter31.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 32.4 && darkMatterIndex >= 31.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter32.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 33.4 && darkMatterIndex >= 32.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter33.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 34.4 && darkMatterIndex >= 33.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter34.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 35.4 && darkMatterIndex >= 34.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter35.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 36.4 && darkMatterIndex >= 35.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter36.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 37.4 && darkMatterIndex >= 36.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter37.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 38.4 && darkMatterIndex >= 37.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter38.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 39.4 && darkMatterIndex >= 38.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter39.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex <= 40.4 && darkMatterIndex >= 39.5) {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter40.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 115, posY + 112, 0, 0, 128, 16, 128, 16);
            } else if (darkMatterIndex > 40.4) {
                DarkMatterIndexConfig.setNormalDarkMatterIndex(40);
            } else if (darkMatterIndex < 0) {
                DarkMatterIndexConfig.setNormalDarkMatterIndex(0);
            } else {
                RenderSystem.setShaderTexture(0, new ResourceLocation(DarkMatterCore.MODID, "textures/screens/darkmatter0.png"));
                GuiComponent.blit(event.getPoseStack(), posX + 175, posY + 12, 0, 0, 128, 16, 128, 16);
            }
            RenderSystem.depthMask(true);
            RenderSystem.defaultBlendFunc();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
            RenderSystem.setShaderColor(1, 1, 1, 1);
        }
    }
}
