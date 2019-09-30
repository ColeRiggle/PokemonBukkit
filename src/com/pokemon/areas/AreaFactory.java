package com.pokemon.areas;

import com.pokemon.areas.routes.InvalidArea;
import com.pokemon.areas.routes.TempRoute;
import com.pokemon.areas.towns.Summerhedge;

public class AreaFactory {
	
	public Area getArea(String areaID) {
		
		if (areaID.equalsIgnoreCase("Summerhedge Town")) return new Summerhedge();
		
		if (areaID.equalsIgnoreCase("Temp Route")) return new TempRoute();
		
		return new InvalidArea();
		
	}

}
