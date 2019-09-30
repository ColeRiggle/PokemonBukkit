package com.pokemon.utils;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.pokemon.areas.Area;
import com.pokemon.areas.routes.InvalidArea;

public final class MapUtil {
	
	private static ArrayList<Area> areas = new ArrayList<Area>();
	
	public static ArrayList<Area> getAreas() {
		
		return areas;
	}
	
	public static Area getArea(Player player) {
		
		for (Area a: areas) {
			
			if (a.contains(player)) {
				
				return a;
			}
		}
		
		return new InvalidArea();
		
	}
	
	public static Area getArea(Location location) {
		
		for (Area a: areas) {
			
			if (a.contains(location)) {
				
				return a;
			}
		}
		
		return new InvalidArea();
		
	}

}
