package com.pokemon.pokemon.conditions;

import java.util.ArrayList;

import org.bukkit.ChatColor;

import com.pokemon.pokemon.Pokemon;
import com.pokemon.pokemon.types.Type;

public abstract class StatusCondition {

	protected ArrayList<Type> immuneTypes = new ArrayList<Type>();
	
	private int duration, currentDuration;
	
	abstract String getName();
	
	abstract ChatColor getColor();
	
	public StatusCondition(int duration) {
		this.duration = duration;
	}
	
	ArrayList<Type> getImmuneTypes() {
		return immuneTypes;
	}
	
	boolean canHaveCondition(Pokemon pokemon) {
		
		if (getImmuneTypes().contains(new StatusConditionFactory().getCondition(pokemon.getStatusCondition()))) {
			
			return false;
		}
		
		return true;
	}
	
	@Override
	public boolean equals(Object o) {
		
		if (o.hashCode() == this.hashCode()) {
			
			return true;
		}
				
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return getName().hashCode();
	}

	public int getCurrentDuration() {
		return currentDuration;
	}

	public void setCurrentDuration(int currentDuration) {
		this.currentDuration = currentDuration;
	}

	public int getDuration() {
		return duration;
	}
	
}
