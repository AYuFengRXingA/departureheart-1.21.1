package com.yufeng.departureheart.item;

import net.minecraft.core.Holder;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;

import net.minecraft.world.level.block.state.BlockState;

public class UniversalTool extends DiggerItem {
    public UniversalTool(Tier tier, Properties properties) {
        super(tier, BlockTags.MINEABLE_WITH_PICKAXE, properties);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return this.getTier().getSpeed() * 2f;
    }

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return 30;
    }
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(ModTags.UNIVERSAL_TOOL_ENCHANMENT);
    }



}