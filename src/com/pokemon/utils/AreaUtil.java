package com.pokemon.utils;

import org.bukkit.Location;

public final class AreaUtil {
	
	public static double getMaxX(Location first, Location second) {

		return Math.max(first.getX(), second.getX());
	}

	public static double getMaxY(Location first, Location second) {

		return Math.max(first.getY(), second.getY());
	}

	public static double getMaxZ(Location first, Location second) {

		return Math.max(first.getZ(), second.getZ());
	}

	public static double getMinX(Location first, Location second) {

		return Math.min(first.getX(), second.getX());
	}

	public static double getMinY(Location first, Location second) {

		return Math.min(first.getY(), second.getY());
	}

	public static double getMinZ(Location first, Location second) {

		return Math.min(first.getZ(), second.getZ());
	}

}
