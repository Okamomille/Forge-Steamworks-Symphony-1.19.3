package net.okamiz.ssmod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.okamiz.ssmod.SteamworksSymphonyMod;

@Mod.EventBusSubscriber(modid = SteamworksSymphonyMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab STEAMWORKS_SYMPHONY_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event){
        STEAMWORKS_SYMPHONY_TAB = event.registerCreativeModeTab(new ResourceLocation(SteamworksSymphonyMod.MOD_ID, "steamworks_symphony_tab"),
                builder -> builder.icon(() -> new ItemStack(ModItems.IRON_PLATE.get()))
                        .title(Component.translatable("creativemodetab.steamworks_symphony_tab")));
    }
}
