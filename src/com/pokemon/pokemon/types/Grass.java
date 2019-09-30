package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Grass extends Type {
	
	public Grass() {
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Grass());
		notVeryEffective.add(new Poison());
		notVeryEffective.add(new Flying());
		notVeryEffective.add(new Bug());
		notVeryEffective.add(new Dragon());
		notVeryEffective.add(new Steel());
		superEffective.add(new Water());
		superEffective.add(new Ground());
		superEffective.add(new Rock());
	}

	@Override
	String getName() {
		
		return getColor() + "Grass";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.GREEN;
	}
}
