package net.mreskimo.gam.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mreskimo.gam.GAM;
import net.mreskimo.gam.item.GAMItems;

import java.util.function.Supplier;

public class GAMBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GAM.MOD_ID);

    public static final RegistryObject<Block> CERES_SAND = registerBlock("ceres_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> CERES_STONE = registerBlock("ceres_stone",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)));

    public static final RegistryObject<Block> CERES_WAVY_SAND = registerBlock("ceres__wavy_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));

    public static final RegistryObject<Block> CERES_DARK_SAND = registerBlock("ceres_dark_sand",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return GAMItems.ITEMS.register(name, () -> new BlockItem(block.get(), new  Item.Properties()));
    }

    public static void register(IEventBus eventBusbus) {
        BLOCKS.register(eventBusbus);
    }

}
