package com.pokemon.inventory;

import org.bukkit.inventory.Inventory;

import com.pokemon.player.OnlinePokemonPlayer;

public abstract class InventoryItem {

	abstract public void openInventory(OnlinePokemonPlayer player);
	
	protected Inventory inv;
	
}
