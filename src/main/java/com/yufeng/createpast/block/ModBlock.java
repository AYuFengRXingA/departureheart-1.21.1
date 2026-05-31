package com.yufeng.createpast.block;
import net.minecraft.world.item.BlockItem;
import com.yufeng.createpast.CreatePast;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.openjdk.nashorn.internal.ir.Block;

public class ModBlock {
    // 方块注册器
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CreatePast.MOD_ID);
    // 物品注册器（用来注册方块物品）也就是物品栏上拿的
  public static final DeferredRegister.Items ITEMS =
          DeferredRegister.createItems(CreatePast.MOD_ID);

    // 注册方块物品的方法，也就是放在世界里的方块
    private static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block) {
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
  public static final DeferredBlock<Block> XING_BLOCK = BLOCKS.register("xing_block",
          ()->new Block(BlockBehaviour.Properties.of().strength(2.55f,6.0f)));
    static {
        registerBlockItems("xing_block", XING_BLOCK);
    }

}
