package com.pokemon.pokemon.types;

public class TypeFactory {
	
	public Type getType(String name) {
		
		if (name.equalsIgnoreCase("Normal")) {
			
			return new Normal();
		} 
		
		else if (name.equalsIgnoreCase("Fire")) {
			
			return new Fire();
		}
		
		else if (name.equalsIgnoreCase("Water")) {
			
			return new Water();
		}
		
		else if (name.equalsIgnoreCase("Grass")) {
			
			return new Grass();
		}
		
		else if (name.equalsIgnoreCase("Ice")) {
			
			return new Ice();
		}
		
		else if (name.equalsIgnoreCase("Fighting")) {
			
			return new Fighting();
		}
		
		else if (name.equalsIgnoreCase("Poison")) {
			
			return new Poison();
		}
		
		else if (name.equalsIgnoreCase("Ground")) {
			
			return new Ground();
		}
		
		else if (name.equalsIgnoreCase("Flying")) {
			
			return new Flying();
		}
		
		else if (name.equalsIgnoreCase("Psychic")) {
			
			return new Psychic();
		}
		
		else if (name.equalsIgnoreCase("Bug")) {
			
			return new Bug();
		}
		
		else if (name.equalsIgnoreCase("Rock")) {
			
			return new Rock();
		}
		
		else if (name.equalsIgnoreCase("Ghost")) {
			
			return new Ghost();
		}
		
		else if (name.equalsIgnoreCase("Dragon")) {
			
			return new Dragon();
		}
		
		else if (name.equalsIgnoreCase("Dark")) {
			
			return new Dark();
		}
		
		else if (name.equalsIgnoreCase("Steel")) {
			
			return new Steel();
		}
		
		return new Normal();
	}

}
