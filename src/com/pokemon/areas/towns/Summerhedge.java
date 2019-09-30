package com.pokemon.areas.towns;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.pokemon.areas.Area;

public class Summerhedge extends Area {
	
	public Summerhedge() {
		
		super("Summerhedge Town", "Welcome to Summerhedge Town", new Location(
				Bukkit.getWorld("Pokemon"), -337, 72, 383), new Location(
				Bukkit.getWorld("Pokemon"), -352, 99, 357), new Location(
				Bukkit.getWorld("Pokemon"), -257, 45, 460));
		
	}

}
