package com.pokemon.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.server.Server;
import com.pokemon.utils.MessageUtil;

public class PokemonPlayerQuitListener implements Listener {

private static Server plugin;
	
	public PokemonPlayerQuitListener() {
		
	}
	
	public PokemonPlayerQuitListener(Server plugin) {
		
		PokemonPlayerQuitListener.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true) 
	public void playerLeaveEvent(PlayerQuitEvent e) {
		
		OnlinePokemonPlayer eventPlayer = plugin.getOnlinePlayer(e.getPlayer().getName());
		
		announceleave(eventPlayer);
		
		Bukkit.getLogger().severe("" + plugin.getOnlinePokemonPlayers().size());
		
		plugin.removeOnlinePlayer(eventPlayer);
	
		Bukkit.getLogger().severe("" + plugin.getOnlinePokemonPlayers().size());
	}
	
	private void announceleave(OnlinePokemonPlayer player) {
		
		Bukkit.getServer().broadcastMessage(
				MessageUtil.getPrefixSecondaryColor() + "[" + ChatColor.RED
						+ "-" + MessageUtil.getPrefixSecondaryColor() + "]" + " "
						+ player.getPlayer().getName());

	}
	
}
