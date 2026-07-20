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
    }//挖掘方块速度

    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return true;
    }//挖掘方块返回为真，即必定掉落

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }//是否能被附魔

    @Override
    public int getEnchantmentValue(ItemStack stack) {
        return 30;
    }//返回附魔能力值
    public boolean supportsEnchantment(ItemStack stack, Holder<Enchantment> enchantment) {
        return enchantment.is(ModTags.UNIVERSAL_TOOL_ENCHANMENT);
    }//工具附魔js标签



}