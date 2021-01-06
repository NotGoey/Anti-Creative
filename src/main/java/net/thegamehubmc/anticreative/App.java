package net.thegamehubmc.anticreative;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    public static App instance;
    @Override
    public void onEnable() {
        getLogger().info("Hello, Anti Gamemode!");
        instance = this;
        Bukkit.getPluginManager().registerEvents(new event(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("See you again, Anti Gamemode!");
    }
}