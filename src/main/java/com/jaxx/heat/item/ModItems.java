package com.jaxx.heat.item;

import com.jaxx.heat.Heat;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Heat.MOD_ID);

    public static final RegistryObject<Item> FORGE_IRON = ITEMS.register("forge_iron",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEAT_TAB)));
    public static final RegistryObject<Item> RAW_FORGE_IRON = ITEMS.register("raw_forge_iron",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.HEAT_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
