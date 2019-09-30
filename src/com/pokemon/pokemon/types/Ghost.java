package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Ghost extends Type {

	public Ghost() {
		notVeryEffective.add(new Dark());
		superEffective.add(new Psychic());
		superEffective.add(new Ghost());
		notEffective.add(new Normal());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Ghost";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.LIGHT_PURPLE;
	}
}

