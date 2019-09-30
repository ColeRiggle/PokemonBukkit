package com.pokemon.areas.routes;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.pokemon.areas.Area;

public class TempRoute extends Area {

	public TempRoute() {

		super("Temp Route", "Temp Route", new Location(
				Bukkit.getWorld("Pokemon"), -337, 72, 383), new Location(
				Bukkit.getWorld("Pokemon"), -257, 71, 460), new Location(
				Bukkit.getWorld("Pokemon"), -264, 75, 465));
	}
}
