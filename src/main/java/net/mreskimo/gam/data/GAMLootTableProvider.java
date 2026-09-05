package net.mreskimo.gam.data;

import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.mreskimo.gam.data.loot.GAMBlockLootTables;

import java.util.List;
import java.util.Set;

public class GAMLootTableProvider {
    public static LootTableProvider create(PackOutput output) {
        return new LootTableProvider(output, Set.of(), List.of(
                new LootTableProvider.SubProviderEntry(GAMBlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}