package com.pokemon.server;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import com.pokemon.areas.routes.TempRoute;
import com.pokemon.areas.towns.Summerhedge;
import com.pokemon.commands.BalanceCommand;
import com.pokemon.listeners.PokemonPlayerJoinListener;
import com.pokemon.listeners.PokemonPlayerMoveListener;
import com.pokemon.listeners.PokemonPlayerQuitListener;
import com.pokemon.listeners.PokemonServerListPingListener;
import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.utils.DatabaseUtil;
import com.pokemon.utils.MapUtil;
  
public class Server extends JavaPlugin {
	
	private static ArrayList<OnlinePokemonPlayer> onlinePokemonPlayers = new ArrayList<OnlinePokemonPlayer>();

	public Server() {
		
	}
	
	@Override
	public void onEnable() {
		
		Bukkit.getLogger().info("Pokemon enabling");
		
		DatabaseUtil.enableDatabase();

		addListeners();
		addCommands();
		initializeMap();
	
		
		loadConfiguration();
		
		for (Player p : Bukkit.getOnlinePlayers()) {
			Server.onlinePokemonPlayers.add(new OnlinePokemonPlayer(p));
		}
		
		new PokemonPlayerMoveListener(this);
		
	}
	
	  
	@Override
	public void onDisable() {
		
		DatabaseUtil.disableDatabase();
	}
	
	private void addListeners() {
		
		Bukkit.getServer().getPluginManager().registerEvents(new PokemonPlayerJoinListener(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PokemonPlayerQuitListener(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PokemonServerListPingListener(this), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PokemonPlayerMoveListener(), this);
	}
	
	private void addCommands() {
		
		getCommand("balance").setExecutor(new BalanceCommand());
	}
	
	private void initializeMap() {
		
		MapUtil.getAreas().add(new TempRoute());
		MapUtil.getAreas().add(new Summerhedge());
	}
	
	private void loadConfiguration() {
		
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	
	public ArrayList<OnlinePokemonPlayer> getOnlinePokemonPlayers() {
		
		return onlinePokemonPlayers;
	}
	
	public void addOnlinePlayer(OnlinePokemonPlayer player) {
		
		Server.onlinePokemonPlayers.add(player);
	}
	
	public void removeOnlinePlayer(OnlinePokemonPlayer player) {
		
		Server.onlinePokemonPlayers.remove(player);
	}
	
	public OnlinePokemonPlayer getOnlinePlayer(String username) {
		
		for (OnlinePokemonPlayer player: Server.onlinePokemonPlayers) {
			
			if (player.getPlayer().getName().equalsIgnoreCase(username)) {
				
				return player;
			}
			
		}
		
		return null;
	}
	
	public double getExpMultiplier() {
		
		return getConfig().getDouble("exp_multiplier");
	}
	
}
