package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Fairy extends Type {

	public Fairy() {
		superEffective.add(new Fighting());
		superEffective.add(new Dragon());
		superEffective.add(new Dark());
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Poison());
		notVeryEffective.add(new Steel());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Fairy";
	}

	@Override
	ChatColor getColor() {
		return ChatColor.LIGHT_PURPLE;
	}

}
