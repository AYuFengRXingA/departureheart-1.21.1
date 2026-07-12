package com.yufeng.departureheart.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Set;

public class UniversalTool extends DiggerItem {
    public UniversalTool(Tier tier, Properties properties) {
        super(tier, BlockTags.MINEABLE_WITH_PICKAXE, properties);


    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return this.getTier().getSpeed()*2f;


       /* if (state.is(BlockTags.MINEABLE_WITH_PICKAXE) ||
                state.is(BlockTags.MINEABLE_WITH_AXE) ||
                state.is(BlockTags.MINEABLE_WITH_SHOVEL) ||
                state.is(BlockTags.MINEABLE_WITH_HOE)) {
            return this.getTier().getSpeed()*2f;  // 使用工具本身的挖掘速度
        }
        return super.getDestroySpeed(stack, state);  // 普通速度 1.0*/
    }
    @Override
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return true;  // 永远返回 true，意味着这个工具可以挖任何方块并使其掉落
    }




}
