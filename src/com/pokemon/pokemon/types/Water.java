package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Water extends Type {
	
	public Water() {
		notVeryEffective.add(new Water());
		notVeryEffective.add(new Grass());
		notVeryEffective.add(new Dragon());
		superEffective.add(new Fire());
		superEffective.add(new Ground());
		superEffective.add(new Rock());
	}

	@Override
	String getName() {
		
		return getColor() + "Water";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.BLUE;
	}
}

