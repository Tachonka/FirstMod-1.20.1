package net.nate.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nate.firstmod.FirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> cheezit = ITEMS.register("cheezit",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> goldfish = ITEMS.register("goldfish",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
