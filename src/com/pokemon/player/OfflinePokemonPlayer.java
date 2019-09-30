package com.pokemon.player;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;

public class OfflinePokemonPlayer extends PokemonPlayer {
	
	public OfflinePokemonPlayer(OfflinePlayer player) {
		
		super(player.getUniqueId().toString());
		
	}
	
	public OfflinePokemonPlayer(UUID id) {
		
		super(id.toString());
		
	}
	
	@SuppressWarnings("deprecation")
	public OfflinePokemonPlayer(String playerName) {
		
		super(Bukkit.getOfflinePlayer(playerName).getUniqueId().toString());
		
	}

	public OfflinePlayer getOfflinePlayer() {
		
		return Bukkit.getOfflinePlayer(UUID.fromString(getUUID()));
		
	}

}
