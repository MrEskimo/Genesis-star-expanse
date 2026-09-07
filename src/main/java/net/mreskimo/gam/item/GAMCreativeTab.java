package net.mreskimo.gam.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.mreskimo.gam.GAM;
import net.mreskimo.gam.blocks.GAMBlocks;

public class GAMCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GAM.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GENESIS_SOLAR_EXPANSE_TAB = CREATIVE_MODE_TABS.register("genesis_solar_expanse_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.gam.genesis_solar_expanse_tab"))
                    .icon(GAMBlocks.CERES_STONE.get().asItem()::getDefaultInstance)
                    .displayItems((displayParameters, output) -> {
                        output.accept(GAMBlocks.CERES_STONE.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.CERES_SAND.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.CERES_LIGHT_ROCKY_SAND.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.CERES_ROCKY_SAND.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.CERES_LIGHT_SAND.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.ICY_DUST.get().asItem().getDefaultInstance());

                        output.accept(GAMBlocks.PHOBOS_STONE.get().asItem().getDefaultInstance());
                        output.accept(GAMBlocks.DEIMOS_STONE.get().asItem().getDefaultInstance());
                    })
                    .build());

    public static void register(IEventBus eventBusbus) {
        CREATIVE_MODE_TABS.register(eventBusbus);
    }

}
