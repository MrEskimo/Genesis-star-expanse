package net.mreskimo.gam.data.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.mreskimo.gam.blocks.GAMBlocks;

import java.util.Set;

public class GAMBlockLootTables extends BlockLootSubProvider {
    public GAMBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(GAMBlocks.CERES_LIGHT_SAND.get());
        this.dropSelf(GAMBlocks.CERES_SAND.get());
        this.dropSelf(GAMBlocks.CERES_ROCKY_SAND.get());
        this.dropSelf(GAMBlocks.CERES_STONE.get());
        this.dropSelf(GAMBlocks.CERES_SALT_DEPOSIT.get());
        this.dropSelf(GAMBlocks.CERES_LIGHT_ROCKY_SAND.get());
        this.dropSelf(GAMBlocks.ICY_DUST.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return GAMBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
