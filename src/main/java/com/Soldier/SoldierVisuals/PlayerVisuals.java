package com.yourname.soldiervisuals;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.player.PlayerEntity;

public class PlayerVisuals {

    private final Config config;
    private final MinecraftClient client = MinecraftClient.getInstance();

    public PlayerVisuals(Config config) {
        this.config = config;
    }

    public void update() {
        // Обновляем позиции эффектов (Head, TargetVisuals)
    }

    public void renderHeadEffects(MatrixStack matrices, PlayerEntity player) {
        if(!config.playerVisualsEnabled) return;
        // Тут рендерим Crown, Nimb, ChinaHat, Aura Sparks
    }

    public void renderTargetVisuals(MatrixStack matrices, PlayerEntity target) {
        if(!config.targetVisualsEnabled) return;
        // Тут рендерим Hitbox, Target Circle, Floating Particles, Health Bar
    }
}
