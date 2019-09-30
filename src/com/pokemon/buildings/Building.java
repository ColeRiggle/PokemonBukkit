package com.pokemon.buildings;

import java.util.ArrayList;

import org.bukkit.Location;

import com.pokemon.areas.Area;
import com.pokemon.player.ranks.Rank;

public abstract class Building {

	private String name;
	private ArrayList<Location> entryDoors;
	private Location exitDoor;
	private Area area; 
	private boolean global;
	private Rank requiredRank;
	
	public Building(String name, ArrayList<Location> entryDoors, Location exitDoor, boolean global, Rank requiredRank, Area area) {
		this.name = name;
		this.entryDoors = entryDoors;
		this.exitDoor = exitDoor;
		this.global = global;
		this.requiredRank = requiredRank;
		this.area = area;
		area.addBuilding(this);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Location> getEntryDoors() {
		return entryDoors;
	}

	public Location getExitDoor() {
		return exitDoor;
	}

	public Area getArea() {
		return area;
	}

	public boolean isGloballyAccessable() {
		return global;
	}

	public Rank getRequiredRank() {
		return requiredRank;
	}
	
}
