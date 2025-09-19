package com.codex.horizonfix.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.SkyRendering;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Disables the sunrise/sunset glow fan while keeping the sun, moon, and stars.
 * This mirrors the visual result of turning off sun/moon without removing them,
 * eliminating the colored horizon ring that clashes with distance fog.
 */
@Mixin(SkyRendering.class)
@Environment(EnvType.CLIENT)
public abstract class HorizonFixClientDisableTwilightRingMixin {

    @Inject(method = "renderGlowingSky", at = @At("HEAD"), cancellable = true)
    private void horizonfix$skipTwilightRing(CallbackInfo ci) {
        // This method is only invoked by WorldRenderer for overworld dawn/dusk
        // when DimensionEffects#isSunRisingOrSetting returns true. Canceling here
        // removes the colored ring but keeps the sun/moon and stars rendering.
        ci.cancel();
    }
}

