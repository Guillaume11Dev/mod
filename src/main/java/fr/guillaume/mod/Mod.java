package fr.guillaume.mod;

import fr.guillaume.item.ModItemGroups;
import fr.guillaume.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mod implements ModInitializer {
    public static final String MOD_ID = "mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {

        ModItems.registerModItems();
        ModItemGroups.registerItemGroups();
    }
}
