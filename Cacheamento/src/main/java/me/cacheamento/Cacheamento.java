package me.cacheamento;

import me.cacheamento.managers.UserManager;
import me.cacheamento.objects.User;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public final class Cacheamento extends JavaPlugin {

    private static Cacheamento instance;

    private UserManager userManager;

    @Override
    public void onEnable() {
        instance = this;

        userManager = new UserManager();

        Bukkit.getPluginManager().registerEvents(new PlayerEvents(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static Cacheamento getInstance() {
        return instance;
    }

    public UserManager getUserManager() {
        return userManager;
    }
}
