package com.pokemon.pokemon.types;

import org.bukkit.ChatColor;

public class Psychic extends Type {

	public Psychic() {
		notVeryEffective.add(new Psychic());
		notVeryEffective.add(new Steel());
		superEffective.add(new Fighting());
		superEffective.add(new Poison());
		notEffective.add(new Dark());
	}

	@Override
	String getName() {
		
		return getColor() + "Psychic";
	}

	@Override
	ChatColor getColor() {
		
		return ChatColor.LIGHT_PURPLE;
	}
}
