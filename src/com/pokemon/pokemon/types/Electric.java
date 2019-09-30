package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Electric extends Type {
	
	public Electric() {
		superEffective.add(new Water());
		superEffective.add(new Flying());
		notVeryEffective.add(new Electric());
		notVeryEffective.add(new Grass());
		notVeryEffective.add(new Dragon());
		notEffective.add(new Ground());
	}

	@Override
	String getName() {
		
		return getColor() + "Electric";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.YELLOW;
	}
}
