package com.pokemon.pokemon.render;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.ItemFrame;
import org.bukkit.inventory.ItemStack;
import org.bukkit.map.MapView;

import com.mcplugindev.slipswhitley.sketchmap.SketchMapAPI;
import com.mcplugindev.slipswhitley.sketchmap.SketchMapUtils;
import com.mcplugindev.slipswhitley.sketchmap.map.RelativeLocation;
import com.mcplugindev.slipswhitley.sketchmap.map.SketchMap;

public class PokemonRenderer {
	
	public void renderPokemonImage(Location location, String id) {

		SketchMap map = SketchMapAPI.getMapByID(id);

		Block targetBlock = location.getBlock();
		if (targetBlock.getType() == Material.AIR) {
			Bukkit.getLogger().severe("Could not render pokemon (Material Error 1): " + id);
			return;
		}
		String direction = "west";
		BlockFace face = getBlockFace(direction);

		World world = targetBlock.getWorld();
		int x = targetBlock.getX();
		int y = targetBlock.getY();
		int z = targetBlock.getZ();

		Set<ItemFrame> iFrames = new HashSet<ItemFrame>();

		Map<RelativeLocation, MapView> mapCollection = map.getMapCollection();
		for (RelativeLocation relLoc : mapCollection.keySet()) {
			MapView mapView = (MapView) mapCollection.get(relLoc);

			Location loc = null;
			Location backLoc = null;
			if (direction.equalsIgnoreCase("north")) {
				loc = new Location(world, x + relLoc.getX(), y - relLoc.getY(), z + 1);
				backLoc = new Location(world, x + relLoc.getX(), y - relLoc.getY(), z);
			}
			if (direction.equalsIgnoreCase("south")) {
				loc = new Location(world, x - relLoc.getX(), y - relLoc.getY(), z - 1);
				backLoc = new Location(world, x - relLoc.getX(), y - relLoc.getY(), z);
			}
			if (direction.equalsIgnoreCase("east")) {
				loc = new Location(world, x - 1, y - relLoc.getY(), z + relLoc.getX());
				backLoc = new Location(world, x, y - relLoc.getY(), z + relLoc.getX());
			}
			if (direction.equalsIgnoreCase("west")) {
				loc = new Location(world, x + 1, y - relLoc.getY(), z - relLoc.getX());
				backLoc = new Location(world, x, y - relLoc.getY(), z - relLoc.getX());
			}
			if (loc == null) {
				return;
			}
			if ((loc.getBlock().getType() != Material.AIR) || (backLoc.getBlock().getType() == Material.AIR)) {
				Bukkit.getLogger().severe("Could not render pokemon (Material Error 2): " + id);
				for (ItemFrame iFrame : iFrames) {
					iFrame.remove();
				}
				return;
			}
			try {
				ItemFrame iFrame = (ItemFrame) world.spawnEntity(loc, EntityType.ITEM_FRAME);
				iFrame.setFacingDirection(face);

				ItemStack iStack = new ItemStack(Material.MAP, 1);
				iStack.setDurability(SketchMapUtils.getMapID(mapView));

				iFrame.setItem(iStack);
				iFrames.add(iFrame);
			} catch (Exception ex) {
				for (ItemFrame iFrame : iFrames) {
					iFrame.remove();
				}
				Bukkit.getLogger().severe("Could not render pokemon (Exception): " + id);
				return;
			}
		}
		Bukkit.getLogger().severe("Pokemon rendered successfully: " + id);
		return;
	}

	private BlockFace getBlockFace(String direction) {
		String str;
		switch ((str = direction).hashCode()) {
		case 3105789:
			if (str.equals("east")) {
			}
			break;
		case 3645871:
			if (str.equals("west")) {
			}
			break;
		case 105007365:
			if (str.equals("north")) {
				break;
			}
			break;
		case 109627853:
			if (!str.equals("south")) {

				return BlockFace.SOUTH;
			} else {
				return BlockFace.NORTH;
			}
		}
		return BlockFace.NORTH;
	}
}
