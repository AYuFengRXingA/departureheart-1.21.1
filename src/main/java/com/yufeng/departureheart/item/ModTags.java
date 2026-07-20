package com.yufeng.departureheart.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.enchantment.Enchantment;

public class ModTags {
    public static final TagKey<Enchantment> UNIVERSAL_TOOL_ENCHANMENT =
            TagKey.create(Registries.ENCHANTMENT,
                    ResourceLocation.fromNamespaceAndPath("departureheart", "universal_tool_enchantment"));
}
