package shipwrights.genesis_ad_astra.mixin;

import com.llamalad7.mixinextras.injector.wrapmethod.WrapMethod;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import earth.terrarium.adastra.common.blockentities.machines.SolarPanelBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import shipwrights.genesis.GenesisMod;

@Mixin(value = SolarPanelBlockEntity.class, remap = false)
public class SolarPanelBlockEntityMixin extends BlockEntity {

    public SolarPanelBlockEntityMixin(BlockEntityType<?> p_155228_, BlockPos p_155229_, BlockState p_155230_) {
        super(p_155228_, p_155229_, p_155230_);
    }

    @WrapMethod(method = "isDay()Z")
    public boolean isDayWrap(Operation<Boolean> original) {
        Level level = this.level;
        if (level != null && GenesisMod.isSpaceDimension(level)) {
            return true;
        }

        return original.call();
    }
}
