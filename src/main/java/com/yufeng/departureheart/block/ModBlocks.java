package com.yufeng.departureheart.block;

import com.yufeng.departureheart.DepartureHeart;
import com.yufeng.departureheart.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;

public class ModBlocks {
    // 方块注册器
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(DepartureHeart.MOD_ID);
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // 注册示例方块
    public static final DeferredBlock<Block> XING_BLOCK = registerBlock("xing_block",
            () -> new Block(BlockBehaviour.Properties.of().strength(1.5f, 1.0f)));
    public static final DeferredBlock<Block> STARLIGHT = registerBlock("starlight",
            ()-> new Block(BlockBehaviour.Properties.of().strength(1.5f, 1.0f)));



    // 注册方法
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}