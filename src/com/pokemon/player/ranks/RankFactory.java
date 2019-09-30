package com.pokemon.player.ranks;

public class RankFactory {
	
	public Rank getRank(String name) {
		
		if (name.equalsIgnoreCase("Trainer")) {
			
			return new Trainer();
		}
		
		else if (name.equalsIgnoreCase("Ranger")) {
			
			return new Ranger();
		}
		
		else if (name.equalsIgnoreCase("Developer")) {
			
			return new Developer();
		}
		
		return new Trainer();
	}

}
