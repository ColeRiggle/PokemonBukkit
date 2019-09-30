package com.pokemon.pokemon.conditions;

public class StatusConditionFactory {
	
	public StatusCondition getCondition(String name) {
		
		if (name.equalsIgnoreCase("burn")) {
			
			return new Burn();
			
		}
		
		return null;
		
	}
}
