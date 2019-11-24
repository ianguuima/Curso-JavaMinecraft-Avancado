package me.item;

import me.item.objetos.CommonItem;
import me.item.objetos.Item;
import me.item.objetos.SkullItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public final class ItemAPIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {

        Item skullItem = new SkullItem(1, "zAryon")
                .setName("§eCabeça Legal do zAryon")
                .setLore(Arrays.asList(" ", "§7Cabeça do zAryon", " "));

        Item commonItem = new CommonItem(new ItemStack(Material.APPLE))
                .setName("§7Uma maça legal!")
                .setLore(Arrays.asList(" ", "§7Uma maça do futuro!", " "));

        for (Player onlinePlayer : Bukkit.getOnlinePlayers()) {
            skullItem.give(onlinePlayer);
            commonItem.give(onlinePlayer);
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
