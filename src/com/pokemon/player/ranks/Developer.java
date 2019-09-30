package com.pokemon.player.ranks;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public class Developer implements Rank {

	private ArrayList<String> abilities;
	
	public Developer() {
		
		abilities = new ArrayList<String>();
		
		abilities.add("trainer");
		abilities.add("ranger");
		abilities.add("developer");
		
	}
	
	@Override
	public String getName() {
		
		return "Developer";
	}

	@Override
	public String getPrefix() {
		
		return getName() + getColor();
	}

	@Override
	public ChatColor getColor() {
		
		return ChatColor.RED;
	}

	@Override
	public ArrayList<String> abilities() {
		
		return abilities;
	}

}
