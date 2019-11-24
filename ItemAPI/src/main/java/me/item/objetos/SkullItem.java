package me.item.objetos;

import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;

public class SkullItem extends Item {

    SkullMeta skullMeta = (SkullMeta) itemStack.getItemMeta();

    public SkullItem(int quantidade, String owner) {
        super(new ItemStack(Material.SKULL_ITEM, quantidade, (short) SkullType.PLAYER.ordinal()));

        skullMeta.setOwner(owner);
        itemStack.setItemMeta(skullMeta);
    }

    @Override
    public Item setName(String displayName) {
        skullMeta.setDisplayName(displayName);
        itemStack.setItemMeta(skullMeta);
        return this;
    }

    @Override
    public Item setLore(List<String> lore) {
        skullMeta.setLore(lore);
        itemStack.setItemMeta(skullMeta);
        return this;
    }
}
