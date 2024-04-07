package com.scochilloff.pillowcore.item;

import com.scochilloff.pillowcore.PillowCore;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(PillowCore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PillowCore.LOGGER.debug("Registering ModItems for " + PillowCore.MOD_ID);
    }
}
