package io.github.tanishworks.deathbanmod;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;

public class DeathEvents {
    public static void register() {
        DeathBanMod.LOGGER.info("Registering death events");
        ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
            if (!(entity instanceof ServerPlayer player)) {
                return;
            }

            var server = player.level().getServer();
            if (server == null) {
                return;
            }

            // Play wither sound globally
            server.getPlayerList().getPlayers().forEach(target -> {
                target.level().playSound(
                    null,
                    target.blockPosition(),
                    SoundEvents.WITHER_SPAWN,
                    SoundSource.MASTER,
                    1.0f,
                    1.0f
                );
            });

            // Ban by running the vanilla /ban command as the server
            String playerName = player.getName().getString();
              server.getCommands().performPrefixedCommand(
              server.createCommandSourceStack().withSuppressedOutput(),
                "ban-ip " + playerName + " You died!"
            );

            // Kick them
            player.connection.disconnect(
                Component.literal("You have been banned for dying!")
            );

            DeathBanMod.LOGGER.info("{} died and was banned", playerName);
        });
    }
}
