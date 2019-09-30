package com.pokemon.listeners;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import com.pokemon.server.Server;

public class PokemonServerListPingListener implements Listener {
	
	private static Server plugin;
	
	public PokemonServerListPingListener() {
		
	}
	
	public PokemonServerListPingListener(Server plugin) {
		
		PokemonServerListPingListener.plugin = plugin;
	}
	
	@EventHandler (priority = EventPriority.HIGH, ignoreCancelled=true) 
	public void listPingEvent(ServerListPingEvent e){
		
		e.setMaxPlayers(Bukkit.getServer().getOnlinePlayers().size() + 1);
		e.setMotd(ChatColor.RED + "Pokemon " + ChatColor.WHITE + ">> " + ChatColor.GRAY + "EXP Booster: " + ChatColor.RED + plugin.getExpMultiplier());
		
	}

}
