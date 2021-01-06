package net.thegamehubmc.anticreative;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class event implements Listener {
    @EventHandler
    public void onGamemodeChange(PlayerGameModeChangeEvent event) {
        if (event.getNewGameMode().equals(GameMode.CREATIVE) || event.getNewGameMode().equals(GameMode.SPECTATOR)) {
            event.getPlayer().sendMessage("GET THE FUCK OUT OF " + String.valueOf(event.getNewGameMode().name()));
            App.getPlugin(App.class).getLogger().warning(event.getPlayer().getName() + "Went into " + event.getNewGameMode().name());
            event.setCancelled(true);
        }
    }
}
