package com.yourname.soldiervisuals;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawableHelper;
import net.minecraft.client.util.math.MatrixStack;

public class HUD {

    private final Config config;
    private final MinecraftClient client = MinecraftClient.getInstance();

    public HUD(Config config) {
        this.config = config;
    }

    public void update() {
        // Обновляем данные HUD (FPS, Ping и т.д.)
    }

    public void render(MatrixStack matrices) {
        if(!config.hudEnabled) return;

        int x = 5;
        int y = 5;
        String hudText = "[S] SoldierVisuals BETA | FPS: " + client.fps + " | Ping: " + getPing();
        DrawableHelper.drawStringWithShadow(matrices, client.textRenderer, hudText, x, y, 0xFFFFFFFF);
    }

    private int getPing() {
        if (client.getNetworkHandler() == null || client.player == null) return 0;
        return client.getNetworkHandler().getPlayerListEntry(client.player.getUuid()) != null ?
                client.getNetworkHandler().getPlayerListEntry(client.player.getUuid()).getLatency() : 0;
    }
}
