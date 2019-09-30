package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Poison extends Type {
	
	public Poison() {
		notVeryEffective.add(new Poison());
		notVeryEffective.add(new Ground());
		notVeryEffective.add(new Rock());
		notVeryEffective.add(new Ghost());
		superEffective.add(new Grass());
		superEffective.add(new Fairy());
		notEffective.add(new Steel());
	}

	@Override
	String getName() {
		
		return getColor() + "Posion";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.DARK_PURPLE;
	}
}

