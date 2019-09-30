package com.pokemon.player.ranks;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public interface Rank {
	
	String getName();
	
	String getPrefix();
	
	ChatColor getColor();
	
	ArrayList<String> abilities();

}
