package com.scochilloff.pillowcore.item;

import com.scochilloff.pillowcore.PillowCore;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite",
            new Item(new FabricItemSettings()));

    public static final Item TANZANITE = registerItem("tanzanite",
            new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PillowCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PillowCore.LOGGER.debug("Registering mod items for " + PillowCore.MOD_ID);
    }
}
