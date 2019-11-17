package me.pluginexemplo;

import org.bukkit.plugin.java.JavaPlugin;

public final class PluginExemploMain extends JavaPlugin {

    @Override
    public void onEnable() {

        User carlos = new User("Carlos", "Masculino", 3000.0);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}