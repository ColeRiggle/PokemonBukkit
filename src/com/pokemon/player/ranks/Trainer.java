package com.pokemon.player.ranks;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public class Trainer implements Rank {

	private ArrayList<String> abilities;
	
	public Trainer() {
		
		abilities = new ArrayList<String>();
		
		abilities.add("trainer");
		
	}
	
	@Override
	public String getName() {
		
		return "Trainer";
	}

	@Override
	public String getPrefix() {
		
		return getColor() + getName();
	}

	@Override
	public ChatColor getColor() {
		
		return ChatColor.WHITE;
	}

	@Override
	public ArrayList<String> abilities() {
		
		return abilities;
	}

}
