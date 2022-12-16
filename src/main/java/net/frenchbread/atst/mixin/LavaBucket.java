package net.frenchbread.atst.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Objects;

@Mixin(Item.class)
public abstract class LavaBucket {

    @Shadow public abstract String getTranslationKey();

    @Inject(method = "isFireproof", at = @At("HEAD"), cancellable = true)
    public void isFireproof(CallbackInfoReturnable<Boolean> cir) {
        if(Objects.equals(getTranslationKey(), "item.minecraft.lava_bucket")) {
            cir.setReturnValue(true);
        }
    }
}

