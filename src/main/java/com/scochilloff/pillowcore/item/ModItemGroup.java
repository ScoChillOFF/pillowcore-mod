package com.scochilloff.pillowcore.item;

import com.scochilloff.pillowcore.PillowCore;
import com.scochilloff.pillowcore.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    private static final ItemGroup TANZANITE_GROUP = registerItemGroup(
            "tanzanite_group",
            FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.TANZANITE))
            .displayName(Text.translatable("itemGroup.pillowcore.tanzanite_group"))
            .entries((content, entries) -> {
                entries.add(ModItems.RAW_TANZANITE);
                entries.add(ModItems.TANZANITE);
                entries.add(ModBlocks.TANZANITE_BLOCK);
                entries.add(ModBlocks.TANZANITE_ORE);
                entries.add(ModBlocks.TANZANITE_DEEPSLATE_ORE);
            })
            .build());

    private static ItemGroup registerItemGroup(String name, ItemGroup itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, new Identifier(PillowCore.MOD_ID, name), itemGroup);
    }

    public static void registerModItemGroups() {
        PillowCore.LOGGER.debug("Registering item groups for " + PillowCore.MOD_ID);
    }
}
