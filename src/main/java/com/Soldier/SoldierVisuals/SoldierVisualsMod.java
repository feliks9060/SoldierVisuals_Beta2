package com.yourname.soldiervisuals;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class SoldierVisualsMod implements ModInitializer {

    public static HUD hud;
    public static PlayerVisuals playerVisuals;
    public static Config config;

    @Override
    public void onInitialize() {
        System.out.println("SoldierVisuals Loaded!");

        config = new Config();
        hud = new HUD(config);
        playerVisuals = new PlayerVisuals(config);

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            hud.update();
            playerVisuals.update();
        });
    }
}
