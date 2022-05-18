package me.tofaa.gui.example;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ExampleGUIOnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if (!(commandSender instanceof Player)) return false;

        Player player = (Player) commandSender;
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6&lOpening a test GUI"));
        new ExampleGUI().open(player);

        return false;
    }
}
