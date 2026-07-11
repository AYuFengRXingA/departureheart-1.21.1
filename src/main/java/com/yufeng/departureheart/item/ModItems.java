package com.yufeng.departureheart.item;

import com.yufeng.departureheart.DepartureHeart;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(DepartureHeart.MOD_ID);
     public static final DeferredItem<Item> QICHENG_ZHIXING = ITEMS.register("qicheng_zhixing",()->new Item(new Item.Properties()
             .stacksTo(64)
             .rarity(Rarity.UNCOMMON)
     ));
     public static final  DeferredItem<Item> JIXIAN_ZHIXING = ITEMS.register("jixian_zhixing",()->new Item(new Item.Properties()
     .stacksTo(64)
             .rarity(Rarity.RARE)
     ));
     public static final DeferredItem<Item> CHIXINGZHUOMI = ITEMS.register("chixingzhuomi",()->new Item(new Item.Properties()
             .food(new FoodProperties.Builder()
                     .nutrition(10)
                     .saturationModifier(1f)
                     .alwaysEdible().effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE,20000,1),1F)
                     .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE,20000,4),1f)
                     .effect(new MobEffectInstance(MobEffects.REGENERATION,20000,5),1f)
                     .effect(new MobEffectInstance(MobEffects.DIG_SPEED,20000,3),1f)
                     .effect(new MobEffectInstance(MobEffects.NIGHT_VISION,20000,1),1f)
                     .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED,20000,3),1f)
                     .build())
             .fireResistant()
             .stacksTo(32)
             .rarity(Rarity.EPIC)));
     public static final DeferredItem<Item> YUJINSUIPIAN = ITEMS.register("yujinsuipian",()->new Item(new Item.Properties()
             .stacksTo(64)
             .rarity(Rarity.RARE)));
     public static final DeferredItem<Item> BUMIETUTENG = ITEMS.register("bumietuteng",()->new Item(new Item.Properties()
             .stacksTo(1)
             .rarity(Rarity.EPIC)
             .fireResistant()));
    public static final DeferredItem<UniversalTool> UNIVERSAL_TOOL =
            ITEMS.register("universal_tool",
                    () -> new UniversalTool(
                            ModTool.UNIVERSAL,
                            new Item.Properties()
                                    .attributes(DiggerItem.createAttributes(ModTool.UNIVERSAL, 3.0F, -2.4F))
                                    .fireResistant()
                                    .rarity(Rarity.EPIC)
                                    .component(DataComponents.UNBREAKABLE, new Unbreakable(true))  // 无限耐久
                    )
            );
    public  static final DeferredItem<Item> JIXIEZHIXING = ITEMS.register("jixiezhixing",()->new Item(new Item.Properties()
            .stacksTo(64)
            .rarity(Rarity.EPIC)));
    public  static final DeferredItem<Item> NOJIXIEZHIXING = ITEMS.register("nojixiezhixing",()->new Item(new Item.Properties()
            .stacksTo(1)
            .rarity(Rarity.EPIC)));

     public static void register(IEventBus eventBus) {
         ITEMS.register(eventBus);

    }

}