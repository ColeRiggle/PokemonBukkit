package com.pokemon.pokemon.conditions;

import org.bukkit.ChatColor;

import com.pokemon.pokemon.types.Fire;

public class Burn extends StatusCondition {

	public Burn() {
		super(4);
		immuneTypes.add(new Fire());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Burn";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.RED;
	}

}
