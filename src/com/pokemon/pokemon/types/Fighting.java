package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Fighting extends Type {
	
	public Fighting() {
		superEffective.add(new Normal());
		superEffective.add(new Ice());
		superEffective.add(new Rock());
		superEffective.add(new Dark());
		superEffective.add(new Steel());
		notVeryEffective.add(new Poison());
		notVeryEffective.add(new Flying());
		notVeryEffective.add(new Psychic());
		notVeryEffective.add(new Bug());
		notVeryEffective.add(new Fairy());
		notEffective.add(new Ghost());
	}

	@Override
	String getName() {
		
		return getColor() + "Fighting";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.DARK_RED;
	}
}

