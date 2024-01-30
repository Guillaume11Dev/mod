package fr.guillaume.mod;

import fr.guillaume.mod.block.ModBlocks;
import fr.guillaume.mod.item.ModItemGroups;
import fr.guillaume.mod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
    public static final String MOD_ID = "mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
        ModBlocks.registerModBlock();

        FuelRegistry.INSTANCE.add(ModItems.COAL_BRIQUETTE,200);

    }
}
