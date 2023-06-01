package net.okamiz.steamworkssymphonymod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.okamiz.steamworkssymphonymod.item.ModCreativeModeTabs;
import net.okamiz.steamworkssymphonymod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SteamworksSymphonyMod.MOD_ID)
public class SteamworksSymphonyMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "steamworkssymphonymod";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public SteamworksSymphonyMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        // if(event.getTab() == CreativeModeTabs.INGREDIENTS){
        //    event.accept(ModItems.WOODEN_PLATE);
        //    event.accept(ModItems.IRON_PLATE);
        //}

        if(event.getTab() == ModCreativeModeTabs.STEAMWORKS_SYMPHONY_TAB){
            event.accept(ModItems.WOODEN_PLATE);
            event.accept(ModItems.IRON_PLATE);
        }

    }


    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
