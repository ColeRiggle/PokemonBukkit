package com.pokemon.player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import org.bukkit.Bukkit;

import com.pokemon.areas.Area;
import com.pokemon.areas.AreaFactory;
import com.pokemon.player.ranks.Rank;
import com.pokemon.player.ranks.RankFactory;
import com.pokemon.utils.DatabaseUtil;

public abstract class PokemonPlayer {
	
	private String playerUUID;
	
	public PokemonPlayer(String playerUUID) {
		
		this.playerUUID = playerUUID;
		
		verifyAndAddToDatabase();
	}
	
	private void verifyAndAddToDatabase() {
		
		if (!isInDatabase()) {

			addToDatabase();

		}
	}

	private boolean isInDatabase() {
		
		try {
			
			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"SELECT * FROM `players` WHERE `players`.`UUID`=?");
			
			statement.setString(1, getUUID());

			ResultSet result = statement.executeQuery();

			return result.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return false;

	}
	
	private void addToDatabase() {
		
		addToPlayersTable();
		addToPartiesTable();
		
	}
	
	private void addToPlayersTable() {
		
		try {
			
			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement("INSERT INTO `players` (UUID, username, balance, area, rank) VALUES (?, ?, ?, ?, ?)");
			
			statement.setString(1, getUUID());
			statement.setString(2, Bukkit.getOfflinePlayer(UUID.fromString(getUUID())).getName());
			statement.setString(3, "500");
			statement.setString(4, "Summerhedge Town");
			statement.setString(5, "trainer");
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	private void addToPartiesTable() {
		
		try {
			
			PreparedStatement statement = DatabaseUtil
					.getConnection()
					.prepareStatement("INSERT INTO `parties` (UUID) VALUES (?)");
			
			statement.setString(1, getUUID());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
	}
	
	public String getUUID() {
		
		return playerUUID;
	}

	public int getBalance() {
		
		return DatabaseUtil.getIntFromPlayer(getUUID(), "balance");
	}
	
	public Area getArea() {
		
		return new AreaFactory().getArea(DatabaseUtil.getStringFromPlayer(getUUID(), "area"));
	}
	
	public void setArea(String newValue) { 
		
		DatabaseUtil.setStringInPlayer(getUUID(), "area", newValue);
	}
	
	public Rank getRank() {
		
		return new RankFactory().getRank((DatabaseUtil.getStringFromPlayer(getUUID(), "rank")));
	}
	
	public void setRank(String newRank) {
		
		DatabaseUtil.setStringInPlayer(getUUID(), "rank", newRank);
	}
}
