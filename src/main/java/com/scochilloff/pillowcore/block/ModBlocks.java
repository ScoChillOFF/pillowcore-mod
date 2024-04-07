package com.scochilloff.pillowcore.block;

import com.scochilloff.pillowcore.PillowCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        BlockItem blockItem = registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(PillowCore.MOD_ID, name), block);
    }

    private static BlockItem registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(PillowCore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        PillowCore.LOGGER.debug("Registering ModBlocks for " + PillowCore.MOD_ID);
    }
}
