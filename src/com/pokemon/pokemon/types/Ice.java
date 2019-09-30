package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Ice extends Type {
	
	public Ice() {
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Water());
		notVeryEffective.add(new Ice());
		notVeryEffective.add(new Steel());
		superEffective.add(new Grass());
		superEffective.add(new Ground());
		superEffective.add(new Rock());
	}

	@Override
	String getName() {
		
		return getColor() + "ice";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.AQUA;
	}
}
