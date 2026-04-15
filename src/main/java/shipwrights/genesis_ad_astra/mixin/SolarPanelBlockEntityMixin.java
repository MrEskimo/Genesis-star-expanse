package shipwrights.genesis_ad_astra.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import earth.terrarium.adastra.common.blockentities.machines.SolarPanelBlockEntity;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import shipwrights.genesis.GenesisMod;

@Mixin(value = SolarPanelBlockEntity.class, remap = false)
public class SolarPanelBlockEntityMixin {

    @WrapOperation(method = "serverTick", at = @At(value = "INVOKE", target = "Learth/terrarium/adastra/common/blockentities/machines/SolarPanelBlockEntity;isDay()Z"))
    public boolean isDayWrap(SolarPanelBlockEntity instance, Operation<Boolean> original) {
        Level level = instance.getLevel();
        if (level != null && GenesisMod.isSpaceDimension(level)) {
            return true;
        }

        return original.call(instance);
    }
}
