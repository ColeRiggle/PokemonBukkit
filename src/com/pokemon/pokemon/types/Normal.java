package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Normal extends Type {
	
	public Normal() {
		notVeryEffective.add(new Rock());
		notVeryEffective.add(new Steel());
		notEffective.add(new Ghost());
	}

	@Override
	String getName() {
		
		return getColor() + "Normal";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.GRAY;
	}
}
