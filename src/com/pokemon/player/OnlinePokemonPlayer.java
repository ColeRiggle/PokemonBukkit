package com.pokemon.player;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.connorlinfoot.titleapi.TitleAPI;

public class OnlinePokemonPlayer extends PokemonPlayer {
	
	public OnlinePokemonPlayer(Player player) {
		
		super(player.getUniqueId().toString());
		
	}
	
	public OnlinePokemonPlayer(String playerName) {
		
		super(Bukkit.getPlayer(playerName).getUniqueId().toString());
		
	}

	public Player getPlayer() {
		
		return Bukkit.getPlayer(UUID.fromString(getUUID()));
		
	}
	
	@SuppressWarnings("deprecation")
	public void sendTitleBarMessage(String message) {
		
		TitleAPI.sendTitle(getPlayer(), 1, 3, 1, message);
		
	}
}
