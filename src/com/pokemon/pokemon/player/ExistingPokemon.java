package com.pokemon.pokemon.player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

import com.pokemon.player.OfflinePokemonPlayer;
import com.pokemon.pokemon.Pokemon;
import com.pokemon.utils.DatabaseUtil;

public class ExistingPokemon implements Pokemon {

	private int id;

	public ExistingPokemon(int id) {

		this.id = id;
	}

	public int getid() {

		return id;
	}

	public boolean isValid() {

		try {

			PreparedStatement statement = DatabaseUtil.getConnection()
					.prepareStatement(
							"SELECT * FROM `pokemon` WHERE `pokemon`.`id`=?");

			statement.setLong(1, getid());

			ResultSet result = statement.executeQuery();

			return result.next();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;

	}

	public OfflinePokemonPlayer getOwner() {

		return new OfflinePokemonPlayer(UUID.fromString(DatabaseUtil.getStringFromPokemon(getid(), "UUID")));
	}
	
	@Override
	public String getPokemonName() {
		
		return DatabaseUtil.getStringFromPokemon(getid(), "pokemon_name");
	}
	
	@Override
	public String getCustomName() {
		
		return DatabaseUtil.getStringFromPokemon(getid(), "custom_name");
	}
	
	@Override
	public int getExp() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "exp");
	}
	
	@Override
	public void setExp(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(),"exp", newValue);
	}
	
	@Override
	public void increaseExp(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(),"exp", (getExp() + amount));
	}
	
	@Override
	public int getLevel() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "level");
	}
	
	@Override
	public void setLevel(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "level", newValue);
	}
	
	@Override
	public void increaseLevel(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "level", (getLevel() + amount));
	}
	
	@Override
	public int getCurrentHP() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_hp");
	}
	
	@Override
	public int getMaxHP() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_hp");
	}
	
	@Override
	public void setCurrentHP(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_hp", newValue);
	}
	
	@Override
	public void setMaxHP(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_hp", newValue);
	}
	
	@Override 
	public void increaseCurrentHP(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_hp", getCurrentHP() + amount);
	}
	
	@Override 
	public void increaseMaxHP(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_hp", getMaxHP() + amount);
	}
	
	@Override
	public void heal() {
		
		restoreStats();
		
	}
	
	@Override
	public void restoreStats() {
		
		setCurrentHP(getMaxHP());
		
		setCurrentAttack(getMaxAttack());
		setCurrentDefense(getMaxDefense());
		setCurrentSpecialAttack(getMaxSpecialAttack());
		setCurrentSpecialDefense(getMaxSpecialDefense());
		setCurrentSpeed(getMaxSpeed());
		setCurrentAccuracy(getMaxAccuracy());
		
	}
	
	@Override
	public void restoreStatus() {
		
		
	}

	@Override
	public int getCurrentAttack() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_attack");
	}

	@Override
	public int getCurrentDefense() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_defense");
	}

	@Override
	public int getCurrentSpeed() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_speed");
	}

	@Override
	public int getCurrentSpecialAttack() {
	
		return DatabaseUtil.getIntFromPokemon(getid(), "current_special_attack");
	}

	@Override
	public int getCurrentSpecialDefense() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_special_defense");
	}

	@Override
	public int getCurrentAccuracy() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_accuracy");
	}

	@Override
	public int getCurrentEvasion() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "current_evasion");
	}

	@Override
	public int getMaxAttack() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_attack");
	}

	@Override
	public int getMaxDefense() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_defense");
	}

	@Override
	public int getMaxSpeed() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_speed");
	}

	@Override
	public int getMaxSpecialAttack() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_special_attack");
	}

	@Override
	public int getMaxSpecialDefense() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_special_defense");
	}

	@Override
	public int getMaxAccuracy() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_accuracy");
	}

	@Override
	public int getMaxEvasion() {
		
		return DatabaseUtil.getIntFromPokemon(getid(), "max_evasion");
	}

	@Override
	public void setCurrentAttack(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_attack", newValue);
	}

	@Override
	public void setCurrentDefense(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_defense", newValue);
	}

	@Override
	public void setCurrentSpeed(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_speed", newValue);
	}

	@Override
	public void setCurrentSpecialAttack(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_special_attack", newValue);
	}

	@Override
	public void setCurrentSpecialDefense(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_special_defense", newValue);
	}

	@Override
	public void setCurrentAccuracy(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_accuracy", newValue);
	}

	@Override
	public void setCurrentEvasion(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_evasion", newValue);
	}

	@Override
	public void setMaxAttack(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_attack", newValue);
	}

	@Override
	public void setMaxDefense(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_defense", newValue);
	}

	@Override
	public void setMaxSpeed(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_speed", newValue);
	}

	@Override
	public void setMaxSpecialAttack(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_special_attack", newValue);
	}

	@Override
	public void setMaxSpecialDefense(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_special_defense", newValue);
	}

	@Override
	public void setMaxAccuracy(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_accuracy", newValue);
	}
	
	@Override
	public void setMaxEvasion(int newValue) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_evasion", newValue);
	}
	
	@Override
	public void increaseCurrentAttack(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_attack", (getCurrentAttack() + amount));
	}

	@Override
	public void increaseCurrentDefense(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_defense", (getCurrentDefense() + amount));
	}

	@Override
	public void increaseCurrentSpeed(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_speed", (getCurrentSpeed() + amount));
	}

	@Override
	public void increaseCurrentSpecialAttack(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_special_attack", (getCurrentSpecialAttack() + amount));
	}

	@Override
	public void increaseCurrentSpecialDefense(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_defense", (getCurrentSpecialDefense() + amount));
	}

	@Override
	public void increaseCurrentAccuracy(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_accuracy", (getCurrentAccuracy() + amount));
	}

	@Override
	public void increaseCurrentEvasion(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "current_evasion", (getCurrentEvasion() + amount));
	}

	@Override
	public void increaseMaxAttack(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_attack", (getMaxAttack() + amount));
	}

	@Override
	public void increaseMaxDefense(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_defense", (getMaxDefense() + amount));
	}

	@Override
	public void increaseMaxSpeed(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_speed", (getMaxSpeed() + amount));
	}

	@Override
	public void increaseMaxSpecialAttack(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_special_attack", (getMaxSpecialAttack() + amount));
	}

	@Override
	public void increaseMaxSpecialDefense(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_special_defense", (getMaxSpecialDefense() + amount));
	}

	@Override
	public void increaseMaxAccuracy(int amount) {
		
		DatabaseUtil.setIntInPokemon(getid(), "max_accuracy", (getMaxAccuracy() + amount));
	}

	@Override
	public void increaseMaxEvasion(int amount) {

		DatabaseUtil.setIntInPokemon(getid(), "max_evasion", (getMaxEvasion() + amount));
	}

	@Override
	public void setPokemonName(String newValue) {
		
		DatabaseUtil.setStringInPokemon(getid(), "pokemon_name", newValue);
	}

	@Override
	public void setCustomName(String newValue) {
		
		DatabaseUtil.setStringInPokemon(getid(), "custom_name", newValue);
	}

	@Override
	public double getEffortValue() {
		
		return DatabaseUtil.getDoubleFromPokemon(getid(), "effort_value");
	}

	@Override
	public void setEffortValue(double newValue) {
		
		DatabaseUtil.setDoubleInPokemon(getid(), "effort_value", newValue);
	}

	@Override
	public void increaseEffortValue(double amount) {
		
		DatabaseUtil.setDoubleInPokemon(getid(), "effort_value", (getEffortValue() + amount));
	}

	@Override
	public String getNature() {
		
		return DatabaseUtil.getStringFromPokemon(getid(), "nature");
	}

	@Override
	public void setNature(String newValue) {
		
		DatabaseUtil.setStringInPokemon(getid(), "nature", newValue);
	}

	@Override
	public String getStatusCondition() {
		
		return DatabaseUtil.getStringFromPokemon(getid(), "status_condition");
	}

	@Override
	public void setStatusCondition(String newValue) {
		
		DatabaseUtil.setStringInPokemon(getid(), "status_condition", newValue);
	}

	@Override
	public void removeStatusCondition() {
		
		DatabaseUtil.setStringInPokemon(getid(), "status_condition", "none");
	}

}
