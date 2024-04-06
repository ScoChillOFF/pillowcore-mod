package com.scochilloff.pillowcore.block;

import com.scochilloff.pillowcore.PillowCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    public static final Block TANZANITE_DEEPSLATE_ORE = registerBlock("tanzanite_deepslate_ore",
            new Block(FabricBlockSettings.create().strength(4.0f).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PillowCore.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PillowCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PillowCore.LOGGER.debug("Registering mod blocks for " + PillowCore.MOD_ID);
    }
}
