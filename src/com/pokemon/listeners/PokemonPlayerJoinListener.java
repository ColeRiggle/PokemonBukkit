package com.pokemon.listeners;

import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.server.Server;
import com.pokemon.utils.ItemUtil;
import com.pokemon.utils.MessageUtil;

public class PokemonPlayerJoinListener implements Listener {
	
	private static Server plugin;
	
	public PokemonPlayerJoinListener() {
		
	}
	
	public PokemonPlayerJoinListener(Server plugin) {
		
		PokemonPlayerJoinListener.plugin = plugin;
	}
	
	@EventHandler(priority = EventPriority.HIGH, ignoreCancelled = true) 
	public void playerJoinEvent(PlayerJoinEvent e) {
		
		OnlinePokemonPlayer eventPlayer = new OnlinePokemonPlayer(e.getPlayer());
		
		announceJoin(eventPlayer);
		announceExpMultiplier(eventPlayer);
		addInventoryItems(eventPlayer);
		
		plugin.addOnlinePlayer(eventPlayer);
		
	}
	
	private void announceJoin(OnlinePokemonPlayer player) {
		
		Bukkit.getServer().broadcastMessage(
				MessageUtil.getPrefixSecondaryColor() + "[" + ChatColor.AQUA
						+ "+" + MessageUtil.getPrefixSecondaryColor() + "]" + " "
						+ player.getPlayer().getName());

	}
	
	private void announceExpMultiplier(OnlinePokemonPlayer player) {
		
		Bukkit.getPlayer(UUID.fromString(player.getUUID())).sendMessage(
				MessageUtil.getInfoPrefix()
						+ MessageUtil.getMessagePrimaryColor()
						+ " The current EXP booster is: " + ChatColor.RED
						+ plugin.getExpMultiplier() + MessageUtil.getPeriod());
	}
	
	private void addInventoryItems(OnlinePokemonPlayer player) {
		
		Player bukkitPlayer = player.getPlayer();
		
		bukkitPlayer.getInventory().clear();
		bukkitPlayer.getInventory().setItem(8,
				ItemUtil.applyLore(new ItemStack(Material.REDSTONE),
						ChatColor.GOLD + bukkitPlayer.getDisplayName() + "'s Backpack " + ChatColor.GRAY + "(Right Click)",
						ChatColor.GRAY + "Right Click to display the contents of your bag."));
		bukkitPlayer.updateInventory();
	}

}
