package me.item.interfaces;

import me.item.objetos.Item;

import java.util.List;

public interface Attributes {

    Item setName(String displayName);

    Item setLore(List<String> lore);

}
