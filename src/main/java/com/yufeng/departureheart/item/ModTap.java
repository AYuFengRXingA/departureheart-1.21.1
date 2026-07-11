package com.yufeng.departureheart.item;

import com.yufeng.departureheart.DepartureHeart;
import com.yufeng.departureheart.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModTap {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS=
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DepartureHeart.MOD_ID);
    public static final Supplier<CreativeModeTab> DEPARTUREHEAT_TAB =

            CREATIVE_MODE_TABS.register("departureheart_tab", () -> CreativeModeTab.builder()
                    .icon(() -> ModItems.QICHENG_ZHIXING.get().getDefaultInstance())
                    .title(Component.translatable("itemGroup.departureheart_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.QICHENG_ZHIXING);
                        output.accept(ModBlocks.XING_BLOCK);
                        output.accept(ModItems.JIXIAN_ZHIXING);
                        output.accept(ModItems.CHIXINGZHUOMI);
                        output.accept(ModItems.YUJINSUIPIAN);
                        output.accept(ModItems.BUMIETUTENG);
                        output.accept(ModItems.UNIVERSAL_TOOL);
                        output.accept(ModItems.JIXIEZHIXING);
                        output.accept(ModItems.NOJIXIEZHIXING);
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }



}