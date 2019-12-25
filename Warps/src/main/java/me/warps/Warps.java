package me.warps;

import me.warps.commands.WarpCommand;
import me.warps.managers.WarpManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Warps extends JavaPlugin {

    private static Warps instance;

    private WarpManager warpManager;

    @Override
    public void onEnable() {
        instance = this;
        loadConfig();


        warpManager = new WarpManager();

        getCommand("warp").setExecutor(new WarpCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    private void loadConfig(){
        getConfig().options().copyDefaults(true);
        saveDefaultConfig();
    }

    public static Warps getInstance() {
        return instance;
    }

    public WarpManager getWarpManager() {
        return warpManager;
    }
}
