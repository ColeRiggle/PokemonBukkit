package com.pokemon.player.ranks;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public class Ranger implements Rank {

	private ArrayList<String> abilities;
	
	public Ranger() {
		
		abilities = new ArrayList<String>();
		
		abilities.add("trainer");
		abilities.add("ranger");		
	}
	
	@Override
	public String getName() {
		
		return "Ranger";
	}

	@Override
	public String getPrefix() {
		
		return getColor() + getName();
	}

	@Override
	public ChatColor getColor() {
		
		return ChatColor.AQUA;
	}

	@Override
	public ArrayList<String> abilities() {
		
		return abilities;
		
	}

}
