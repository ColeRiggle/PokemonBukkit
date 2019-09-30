package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public final class Bug extends Type {
	
	public Bug() {
		superEffective.add(new Grass());
		superEffective.add(new Psychic());
		superEffective.add(new Dragon());
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Fighting());
		notVeryEffective.add(new Poison());
		notVeryEffective.add(new Flying());
		notVeryEffective.add(new Steel());
		notVeryEffective.add(new Fairy());
	}

	@Override
	String getName() {
		
		return getColor() + "Bug";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.GREEN;
	}
}

