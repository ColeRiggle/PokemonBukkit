package com.pokemon.pokemon;

public interface Pokemon {
	
	String getPokemonName();
	void setPokemonName(String newValue);
	
	String getCustomName();
	void setCustomName(String newValue);
	
	int getExp();
	void setExp(int newAmount);
	void increaseExp(int amount);
	
	int getLevel();
	void setLevel(int newValue);
	void increaseLevel(int amount);
	
	double getEffortValue();
	void setEffortValue(double newValue);
	void increaseEffortValue(double amount);
	
	String getNature();
	void setNature(String newValue);
	
	String getStatusCondition();
	void setStatusCondition(String newValue);
	void removeStatusCondition();
	
	int getCurrentHP();
	int getMaxHP();
	
	void setCurrentHP(int newValue);
	void setMaxHP(int newValue);
	void increaseCurrentHP(int amount);
	void increaseMaxHP(int amount);
	
	void heal();
	void restoreStats();
	void restoreStatus();
	
	int getCurrentAttack();
	int getCurrentDefense();
	int getCurrentSpeed();
	int getCurrentSpecialAttack();
	int getCurrentSpecialDefense();
	int getCurrentAccuracy();
	int getCurrentEvasion();
	
	int getMaxAttack();
	int getMaxDefense();
	int getMaxSpeed();
	int getMaxSpecialAttack();
	int getMaxSpecialDefense();
	int getMaxAccuracy();
	int getMaxEvasion();
	
	void setCurrentAttack(int newValue);
	void setCurrentDefense(int newValue);
	void setCurrentSpeed(int newValue);
	void setCurrentSpecialAttack(int newValue);
	void setCurrentSpecialDefense(int newValue);
	void setCurrentAccuracy(int newValue);
	void setCurrentEvasion(int newValue);
	
	void setMaxAttack(int newValue);
	void setMaxDefense(int newValue);
	void setMaxSpeed(int newValue);
	void setMaxSpecialAttack(int newValue);
	void setMaxSpecialDefense(int newValue);
	void setMaxAccuracy(int newValue);
	void setMaxEvasion(int newValue);
	
	void increaseCurrentAttack(int amount);
	void increaseCurrentDefense(int amount);
	void increaseCurrentSpeed(int amount);
	void increaseCurrentSpecialAttack(int amount);
	void increaseCurrentSpecialDefense(int amount);
	void increaseCurrentAccuracy(int amount);
	void increaseCurrentEvasion(int amount);
	
	void increaseMaxAttack(int amount);
	void increaseMaxDefense(int amount);
	void increaseMaxSpeed(int amount);
	void increaseMaxSpecialAttack(int amount);
	void increaseMaxSpecialDefense(int amount);
	void increaseMaxAccuracy(int amount);
	void increaseMaxEvasion(int amount);
}
