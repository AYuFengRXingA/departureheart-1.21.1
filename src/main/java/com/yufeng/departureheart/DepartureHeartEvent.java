package com.yufeng.departureheart;

import com.yufeng.departureheart.item.ModItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.gameevent.GameEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;

public class DepartureHeartEvent {

    @SubscribeEvent
    public void onLivingDeath(LivingDeathEvent event) {
        // 1. 只有玩家触发
        if(!(event.getEntity() instanceof Player player)) return;
        ItemStack mainHand = player.getMainHandItem();
        ItemStack offHand = player.getOffhandItem();
        // 2. 检查玩家
        boolean hasTotem = mainHand.is(ModItems.BUMIETUTENG.get()) ||
                offHand.is(ModItems.BUMIETUTENG.get());

        if (!hasTotem) return;

        event.setCanceled(true);

        player.setHealth(20F);

        player.removeAllEffects();

        player.gameEvent(GameEvent.DRINK);





    }
}
