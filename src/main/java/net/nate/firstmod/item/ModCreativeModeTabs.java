package net.nate.firstmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.nate.firstmod.FirstMod;
import net.nate.firstmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEM_TAB = CREATIVE_MODE_TABS.register("mod_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.goldfish.get()))
                    .title(Component.translatable("creative_tab.first_mod"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.cheezit.get());
                        output.accept(ModItems.goldfish.get());
                        output.accept(ModBlocks.cheezit_block.get());
                        output.accept(ModBlocks.sound_block.get());
                        output.accept(ModItems.killa_helmet.get());

                        output.accept(Items.BELL);


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}





