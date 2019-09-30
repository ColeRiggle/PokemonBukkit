package com.pokemon.areas;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import com.pokemon.buildings.Building;
import com.pokemon.player.OnlinePokemonPlayer;
import com.pokemon.utils.AreaUtil;

public class Area {

	private String id;
	private String greeting;
	
	private Location spawnPoint;
	
	private double maxX;
	private double maxY;
	private double maxZ;
	
	private double minX;
	private double minY;
	private double minZ;
	
	private Area parentArea;
	
	public ArrayList<Building> buildings;
	
	public Area(String id, String greeting, Location spawnPoint, Location pos1, Location pos2) {
		
		this.id = id;
		this.greeting = greeting;
		this.spawnPoint = spawnPoint;
		
	    this.maxX = AreaUtil.getMaxX(pos1, pos2);
	    this.maxY = AreaUtil.getMaxY(pos1, pos2);
	    this.maxZ = AreaUtil.getMaxZ(pos1, pos2);
	    
	    this.minX = AreaUtil.getMinX(pos1, pos2);
	    this.minY = AreaUtil.getMinY(pos1, pos2);
	    this.minZ = AreaUtil.getMinZ(pos1, pos2);
	    
	    this.buildings = new ArrayList<Building>();
	}

	public Area(String id, String greeting, Location spawnPoint, Location pos1, Location pos2, Area parentArea) {
		
		this.id = id;
		this.greeting = greeting;
		this.spawnPoint = spawnPoint;
		
	    this.maxX = AreaUtil.getMaxX(pos1, pos2);
	    this.maxY = AreaUtil.getMaxY(pos1, pos2);
	    this.maxZ = AreaUtil.getMaxZ(pos1, pos2);
	    
	    this.minX = AreaUtil.getMinX(pos1, pos2);
	    this.minY = AreaUtil.getMinY(pos1, pos2);
	    this.minZ = AreaUtil.getMinZ(pos1, pos2);
	    
	    this.parentArea = parentArea;
	}
	
	public String getid() {
		
		return id;
	}
	
	public String getGreeting() {
		
		return greeting;
	}
	
	public Location getSpawnPoint() {
		
		return spawnPoint;
	}
	
	public void teleportPlayer(OnlinePokemonPlayer player) {
		
		player.getPlayer().teleport(getSpawnPoint());
	}
	
	public void teleportPlayer(Player player) {
		
		player.teleport(getSpawnPoint());
	}
	
	public boolean contains(Location location) {
		
		return ((location.getX() < this.maxX)) && (location.getY() < this.maxY)
				&& (location.getX() > this.minX)
				&& (location.getY() > this.minY)
				&& (location.getZ() < this.maxZ)
				&& (location.getZ() > this.minZ)
				&& (location.getZ() < this.maxZ);
	}
		
	public boolean contains(OnlinePokemonPlayer player) {
		
		return contains(player.getPlayer().getLocation());
	}
	
	public boolean contains(Player player) {
		
		return contains(player.getLocation());
	}
	
	public boolean hasParent() {
		
		if (parentArea == null) {
			
			return false;
		}
		
		return true;
	}
	
	public Area getParent() {
		
		return parentArea;
	}
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public  ArrayList<Building> getBuildings() {
		return buildings;
	}
}
