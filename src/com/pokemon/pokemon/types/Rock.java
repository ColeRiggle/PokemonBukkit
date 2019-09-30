package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Rock extends Type {
	
	public Rock() {
		notVeryEffective.add(new Fighting());
		notVeryEffective.add(new Ground());
		notVeryEffective.add(new Steel());
		superEffective.add(new Fire());
		superEffective.add(new Ice());
		superEffective.add(new Flying());
		superEffective.add(new Bug());
	}
	
	@Override
	String getName() {
		
		return getColor() + "Rock";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.GRAY;
	}
}
