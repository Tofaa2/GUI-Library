package me.tofaa.gui.example;

import me.tofaa.gui.GUI;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Collections;

public class ExampleGUI extends GUI {

    public ExampleGUI(){
        super("&6&lExample GUI", 3);
    }


    @Override
    public void onClick(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lYou clicked on an item in the Example GUI"));
    }

    @Override
    public void setContents() {
        ItemStack item = createInventoryItem(Material.COMPASS, 1, "&cExample Compass", Collections.singletonList(" "), false, (short) 0);
        getInventory().setItem(0, item);

    }
}
