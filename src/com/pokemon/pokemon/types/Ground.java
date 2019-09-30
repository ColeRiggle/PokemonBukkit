package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Ground extends Type {
	
	public Ground() {
		notVeryEffective.add(new Grass());
		notVeryEffective.add(new Bug());
		superEffective.add(new Fire());
		superEffective.add(new Electric());
		superEffective.add(new Poison());
		superEffective.add(new Rock());
		superEffective.add(new Steel());
		notEffective.add(new Flying());
	}

	@Override
	String getName() {
		
		return getColor() + "Ground";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.GOLD;
	}
}
