package com.pokemon.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public final class DatabaseUtil {

	private static Connection databaseConnection;

	private DatabaseUtil() {

	}

	public static synchronized void enableDatabase() {

		try {

			if (databaseConnection == null || databaseConnection.isClosed())
				openConnection();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static synchronized void disableDatabase() {

		try {

			if (databaseConnection != null && !databaseConnection.isClosed())
				databaseConnection.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static synchronized Connection getConnection() {

		enableDatabase();

		return databaseConnection;

	}

	private static synchronized void openConnection() {

		try {

			databaseConnection = DriverManager.getConnection(
					"jdbc:mysql://68.62.29.66/pokemon", "pokemon_user",
					"hBKpTaQZZztCx9NG");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	
	private static synchronized int getIntFromTable(String id, String tableName, String queryColumnName, String resultColumnName) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"SELECT * FROM `" + tableName + "` WHERE `" + tableName + "`.`" + queryColumnName + "`= ?");
			
			statement.setString(1, id);
			
			ResultSet result = statement.executeQuery();
			
			result.next();
			
			int r = result.getInt(resultColumnName);
			
			result.close();
			statement.close();
			
			return r;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return 0;
	}
	
	private static synchronized double getDoubleFromTable(String id, String tableName, String queryColumnName, String resultColumnName) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"SELECT * FROM `" + tableName + "` WHERE `" + tableName + "`.`" + queryColumnName + "`=?");
			
			statement.setString(1, id);
			
			ResultSet result = statement.executeQuery();
			
			result.next();
			
			double r = result.getDouble(resultColumnName);
			
			result.close();
			statement.close();
			
			return r;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return 0.0;
	}
	
	private static synchronized String getStringFromTable(String id, String tableName, String queryColumnName, String resultColumnName) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"SELECT * FROM `" + tableName + "` WHERE `" + tableName + "`.`" + queryColumnName + "`= ?");
			
			statement.setString(1, id);
			
			ResultSet result = statement.executeQuery();
			
			result.next();
			
			String r = result.getString(resultColumnName);
			
			result.close();
			statement.close();
			
			return r;

		} catch (SQLException e) {

			e.printStackTrace();
		}
		
		return null;
	}
	
	private static synchronized void setIntInTable(String id, String tableName, String updateColumnName, String primaryKeyColumnName, int newValue) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"UPDATE `" + tableName + "` SET `" + tableName + "`.`" + updateColumnName
									+ "` = ? WHERE `" + tableName + "`.`" + primaryKeyColumnName + "` = ?");

			statement.setInt(1, newValue);
			statement.setString(2, id);

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	private static synchronized void setStringInTable(String id, String tableName, String updateColumnName, String primaryKeyColumnName,  String newValue) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"UPDATE `" + tableName + "` SET `" + tableName + "`.`" + updateColumnName
									+ "` = ? WHERE `" + tableName + "`.`" + primaryKeyColumnName + "` = ?");

			statement.setString(1, newValue);
			statement.setString(2, id);

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	private static synchronized void setDoubleInTable(String id, String tableName, String updateColumnName, String primaryKeyColumnName, double newValue) {
		
		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"UPDATE `" + tableName + "` SET `" + tableName + "`.`" + updateColumnName
									+ "` = ? WHERE `" + tableName + "`.`" + primaryKeyColumnName + "` = ?");

			statement.setDouble(1, newValue);
			statement.setString(2, id);

			statement.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public static synchronized int getIntFromPlayer(String UUID,
			String columnName) {

		return getIntFromTable(UUID, "players", "UUID", columnName);
	}
	
	public static synchronized String getStringFromPlayer(String UUID,
			String columnName) {

		return getStringFromTable(UUID, "players", "UUID", columnName);
	}
	
	public static synchronized String getDoubleFromPlayer(String UUID,
			String columnName) {

		return getStringFromTable(UUID, "pokemon", "UUID", columnName);
	}
	
	public static synchronized void setIntInPlayer(String UUID, String columnName,
			int newValue) {

		setIntInTable(UUID, "players", columnName, "UUID", newValue);
	}

	public static synchronized void setStringInPlayer(String UUID, String columnName,
			String newValue) {
		
		setStringInTable(UUID, "players", columnName, "UUID", newValue);
	}
	
	public static synchronized void setDoubleInPlayer(String UUID, String columnName,
			Double newValue) {

		setDoubleInTable(UUID, "players", columnName, "UUID", newValue);
	}
	
	
	public static synchronized int getIntFromPokemon(int id, String columnName) {

		return getIntFromTable(Integer.toString(id), "pokemon", "id",
				columnName);
	}
	
	public static synchronized String getStringFromPokemon(int id,
			String columnName) {

		return getStringFromTable(Integer.toString(id), "pokemon", "id", columnName);
	}

	public static synchronized double getDoubleFromPokemon(int id,
			String columnName) {
		
		return getDoubleFromTable(Integer.toString(id), "pokemon", "id", columnName);
	}
	
	
	public static synchronized void setIntInPokemon(int id, String columnName,
			int newValue) {

		setIntInTable(Integer.toString(id), "pokemon", columnName, "id", newValue);
	}

	public static synchronized void setStringInPokemon(int id, String columnName, String newValue) {
		
		setStringInTable(Integer.toString(id), "pokemon", columnName, "id", newValue);	
	}

	public static synchronized void setDoubleInPokemon(int id,
			String columnName, double newValue) {

		setDoubleInTable(Integer.toString(id), "pokemon", columnName, "id", newValue);
		
	}
}
