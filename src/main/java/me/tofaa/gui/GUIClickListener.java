package me.tofaa.gui;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;

public class GUIClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event){
        InventoryHolder holder = event.getInventory().getHolder();
        if (!(holder instanceof GUI)) return;
        event.setCancelled(true);
        GUI gui = (GUI) holder;
        gui.playClickSound((Player) event.getWhoClicked());
        gui.onClick(event);
    }


}
