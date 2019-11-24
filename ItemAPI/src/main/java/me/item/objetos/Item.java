package me.item.objetos;

import me.item.interfaces.Attributes;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public abstract class Item implements Attributes {

    protected ItemStack itemStack;

    public Item(ItemStack itemStack) {
        this.itemStack = itemStack;
    }

    public void give(Player player){
        player.getInventory().addItem(itemStack);
    }
}
