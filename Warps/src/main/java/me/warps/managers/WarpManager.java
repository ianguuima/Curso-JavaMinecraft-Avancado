package me.warps.managers;

import me.warps.LocationSerializer;
import me.warps.Warps;
import me.warps.objects.Warp;
import org.bukkit.Location;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WarpManager {

    private static final Warps INSTANCE = Warps.getInstance();
    private final ConfigurationSection config = INSTANCE.getConfig().getConfigurationSection("Warps");

    private ArrayList<Warp> warpList;

    public WarpManager() {
        warpList = new ArrayList<>();
        load();
    }

    public Warp get(String warpName){
        return warpList.stream().filter(w -> w.getName().equalsIgnoreCase(warpName)).findFirst().orElse(null);
    }

    public void go(Player player, Warp warp){
        if (warp == null) {
            player.sendMessage("A warp não existe!");
            return;
        }
        player.teleport(warp.getLocation());
        player.sendMessage("§7Você teletransportou com sucesso para a warp " + warp.getName());
    }

    public String list(){
        List<String> warpNameList = warpList.stream().map(Warp::getName).collect(Collectors.toList());
        String list = String.join(", ", warpNameList);

        return "Lista de Warps: §c" + list;
    }

    public void insert(Warp warp){
        warpList.add(warp);
        save(warp);
    }

    public boolean delete(String warpName){
        Warp warp = get(warpName);
        if (warp != null){
            warpList.remove(warp);
            config.set(warpName, null);
            INSTANCE.saveConfig();
            return true;
        }
        return false;
    }

    private void save(Warp warp){
        config.set(warp.getName(), LocationSerializer.serialize(warp.getLocation()));
        INSTANCE.saveConfig();
    }

    private void load(){
        for (String key : config.getKeys(false)) {
            Location location = LocationSerializer.unserialize(config.getString(key));
            Warp warp = new Warp(key, location);
            warpList.add(warp);
        }
        System.out.println("[Warp] " + warpList.size() + " warps foram carregadas!");
    }

}
