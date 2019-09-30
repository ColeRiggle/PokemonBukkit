package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Flying extends Type {
	
	public Flying() {
		notVeryEffective.add(new Electric());
		notVeryEffective.add(new Rock());
		notVeryEffective.add(new Steel());
		superEffective.add(new Grass());
		superEffective.add(new Fighting());
		superEffective.add(new Bug());
	}

	@Override
	String getName() {
		
		return getColor() + "Flying";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.BLUE;
	}
}
