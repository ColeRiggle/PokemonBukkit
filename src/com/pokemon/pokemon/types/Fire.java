package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Fire extends Type {
	
	public Fire() {
		notVeryEffective.add(new Fire());
		notVeryEffective.add(new Water());
		notVeryEffective.add(new Rock());
		notVeryEffective.add(new Dragon());
		superEffective.add(new Grass());
		superEffective.add(new Ice());
		superEffective.add(new Bug());
		superEffective.add(new Steel());
	}

	@Override
	String getName() {
		
		return getColor() + "Fire";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.RED;
	}
}

