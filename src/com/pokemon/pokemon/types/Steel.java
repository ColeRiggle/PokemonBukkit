package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Steel extends Type {
	
	public Steel() {
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Water());
		notVeryEffective.add(new Electric());
		notVeryEffective.add(new Steel());
		superEffective.add(new Ice());
		superEffective.add(new Rock());
		superEffective.add(new Fairy());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Steel";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.DARK_GRAY;
	}
}

