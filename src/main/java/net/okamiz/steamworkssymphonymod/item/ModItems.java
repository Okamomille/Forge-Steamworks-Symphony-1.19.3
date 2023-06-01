package net.okamiz.steamworkssymphonymod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.okamiz.steamworkssymphonymod.SteamworksSymphonyMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SteamworksSymphonyMod.MOD_ID);

public static final RegistryObject<Item> WOODEN_PLATE = ITEMS.register("wooden_plate",
        () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
