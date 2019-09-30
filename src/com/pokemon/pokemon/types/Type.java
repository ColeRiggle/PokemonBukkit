package com.pokemon.pokemon.types;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public abstract class Type {
	
	protected ArrayList<Type> superEffective = new ArrayList<Type>();
	protected ArrayList<Type> notVeryEffective = new ArrayList<Type>();
	protected ArrayList<Type> notEffective = new ArrayList<Type>();
	
	abstract String getName();
	
	abstract ChatColor getColor();
	
	ArrayList<Type> getSuperEffective() {
		
		return superEffective;
	}
	
	ArrayList<Type> getNotVeryEffective(){
		
		return notVeryEffective;
	}
	
	ArrayList<Type> getNotEffective(){
		
		return notEffective;
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

}
