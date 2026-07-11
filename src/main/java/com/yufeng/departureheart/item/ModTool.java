package com.yufeng.departureheart.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModTool {
    public static final Tier UNIVERSAL = new SimpleTier(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,  // 工具等级（查下类可看（要不是懒得查才不写注释呢~））
            4008,                                    //  耐久度
            12.0F,                                   // 挖掘速度
            5.0F,                                    // 攻击力加成
            20,                                      //  附魔
            () -> Ingredient.of(ModItems.YUJINSUIPIAN) // 修复材料
    );
}
