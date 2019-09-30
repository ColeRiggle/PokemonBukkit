package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Dragon extends Type {
	
	public Dragon() {
		superEffective.add(new Dragon());
		notVeryEffective.add(new Steel());
		notEffective.add(new Fairy());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Dragon";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.DARK_PURPLE;
	}
}

