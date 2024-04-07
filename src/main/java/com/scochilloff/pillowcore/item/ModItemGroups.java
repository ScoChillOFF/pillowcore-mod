package com.scochilloff.pillowcore.item;

import com.scochilloff.pillowcore.PillowCore;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    private static ItemGroup registerItemGroup(String name, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(PillowCore.MOD_ID, name), itemGroup);
    }

    public static void registerModItemGroups() {
        PillowCore.LOGGER.debug("Registering ModItemGroups for " + PillowCore.MOD_ID);
    }
}
