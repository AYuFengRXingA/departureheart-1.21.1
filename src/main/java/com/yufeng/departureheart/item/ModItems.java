package com.yufeng.departureheart.item;

import com.yufeng.departureheart.DepartureHeart;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DepartureHeart.MOD_ID);
     public static final DeferredItem<Item> QICHENG_ZHIXING = ITEMS.register("qicheng_zhixing",()->new Item(new Item.Properties()
             .stacksTo(64)
     ));

     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);

    }

}