package com.jaxx.heat.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab HEAT_TAB = new CreativeModeTab("heattab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FORGE_HAMMER.get());
        }
    };
}
