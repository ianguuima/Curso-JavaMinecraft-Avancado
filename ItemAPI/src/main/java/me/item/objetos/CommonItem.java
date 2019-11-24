package me.item.objetos;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CommonItem extends Item{

    ItemMeta itemMeta = itemStack.getItemMeta();

    public CommonItem(ItemStack itemStack) {
        super(itemStack);
    }

    @Override
    public Item setName(String displayName) {
        itemMeta.setDisplayName(displayName);
        itemStack.setItemMeta(itemMeta);
        return this;
    }

    @Override
    public Item setLore(List<String> lore) {
        itemMeta.setLore(lore);
        itemStack.setItemMeta(itemMeta);
        return this;
    }
}
