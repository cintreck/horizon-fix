package com.codex.horizonfix;

import net.fabricmc.api.ClientModInitializer;

/**
 * Wires Horizon Fix into the Fabric client lifecycle.
 */
public final class HorizonFixClientInitializer implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        HorizonFixModData.LOGGER.info("Horizon Fix client initialized.");
    }
}
