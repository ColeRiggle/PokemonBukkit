package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Dark extends Type {

	public Dark() {
		superEffective.add(new Psychic());
		superEffective.add(new Ghost());
		notVeryEffective.add(new Fighting());
		notVeryEffective.add(new Dark());
		notVeryEffective.add(new Fairy());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Dark";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.BLACK;
	}
}
