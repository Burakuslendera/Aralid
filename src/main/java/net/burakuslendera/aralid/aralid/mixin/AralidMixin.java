package net.burakuslendera.aralid.aralid.mixin;

import net.burakuslendera.aralid.aralid.Aralid;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AralidMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        // Just To Check
        Aralid.LOGGER.info("This line is printed by mixin!");
    }
}
