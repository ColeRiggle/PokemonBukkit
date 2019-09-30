package com.pokemon.listeners;

import org.bukkit.Location;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.server.Server;
import com.pokemon.utils.MapUtil;

public class PokemonPlayerMoveListener implements Listener {
	
	private static Server plugin;
	
	public PokemonPlayerMoveListener() {
		
	}
	
	public PokemonPlayerMoveListener(Server plugin) {
		
		PokemonPlayerMoveListener.plugin = plugin;
	}
	
	@EventHandler (priority = EventPriority.NORMAL) 
	public void playerMoveEvent(PlayerMoveEvent e) {
		
		Location toLocation = e.getTo();
		Location fromLocation = e.getFrom();
		
		if ((toLocation.getBlockX() == fromLocation.getBlockX())
				&& (toLocation.getBlockY() == fromLocation.getBlockY())
				&& (toLocation.getBlockZ() == fromLocation.getBlockZ())) {
			
			return;

		}
		
		OnlinePokemonPlayer player = plugin.getOnlinePlayer(e.getPlayer().getName());
		
		checkForRegionChange(toLocation, player);
	}
	
	public void checkForRegionChange(Location toLocation, OnlinePokemonPlayer player) {
		
		if (player.getArea().contains(toLocation)) return;
		
		player.setArea(MapUtil.getArea(toLocation).getid());
		
		if (player.getArea().getid().equals("InvalidArea")) return;
		
		player.sendTitleBarMessage(MapUtil.getArea(toLocation).getGreeting());
	}
			 
}
