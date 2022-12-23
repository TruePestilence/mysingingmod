package net.truepestilence.msm.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.truepestilence.msm.MySingingMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MySingingMod.MOD_ID);

    public static final RegistryObject<Item> VEGIDIA = ITEMS.register("vegidia",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));
    public static final RegistryObject<Item> FROZIUM = ITEMS.register("frozium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));
    public static final RegistryObject<Item> SKYLITE = ITEMS.register("skylite",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));
    public static final RegistryObject<Item> AQUANINE = ITEMS.register("aquanine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));
    public static final RegistryObject<Item> STONYX = ITEMS.register("stonyx",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));

    public static final RegistryObject<Item> KRYSTILLIUM = ITEMS.register("krystillium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MSM_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
