package io.github.tanishworks.deathbanmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DeathBanMod implements ModInitializer {
    public static final String MOD_ID = "death-ban-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Death Ban Mod Loaded");

        DeathEvents.register();
    }
}
