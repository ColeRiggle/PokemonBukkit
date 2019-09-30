package com.pokemon.areas.routes;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.pokemon.areas.Area;

public class InvalidArea extends Area {

	public InvalidArea() {
		super("InvalidArea", "Invalid Region. Please Return.", new Location(
				Bukkit.getWorld("Pokemon"), 0, 0, 0), new Location(
				Bukkit.getWorld("Pokemon"), 0, 0, 0), new Location(
				Bukkit.getWorld("Pokemon"), 0, 0, 0));
	}

}
