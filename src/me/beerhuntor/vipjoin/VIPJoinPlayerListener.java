package me.beerhuntor.vipjoin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class VIPJoinPlayerListener implements Listener
{
public VIPJoin plugin;


public VIPJoinPlayerListener(VIPJoin instance) {
this.plugin = instance;
}

@EventHandler
public void onPlayerJoin(PlayerJoinEvent event){

Player player = event.getPlayer();
String name = event.getPlayer().getName();

     if (player.hasPermission("VIPJoin.thunder")) {
     Location loc = event.getPlayer().getLocation();
     loc.getWorld().strikeLightningEffect(loc);
    
     Bukkit.broadcastMessage(ChatColor.AQUA +"[Attention] " + ChatColor.RED + name + " has joined the server!");
    
     return;
     }
   }
}