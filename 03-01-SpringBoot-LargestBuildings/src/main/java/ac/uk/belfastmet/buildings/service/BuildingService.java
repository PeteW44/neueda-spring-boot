/*
 * Class:           BuildingService.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the BuildingService Class
 */

package ac.uk.belfastmet.buildings.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.buildings.domain.Building;

@Service
public class BuildingService 
{
	private ArrayList<Building> buildings;
	
	public BuildingService() 
	{
		super();
	}

	public ArrayList<Building> getBuildings()
	{
		// Local Variables
		ArrayList<Building> buildings = new ArrayList<Building>();
		
		// Building Image Files
		final String build01 = "images/Buildings/Building01.jpg";
		final String build02 = "images/Buildings/Building02.jpg";
		final String build03 = "images/Buildings/Building03.jpg";
		final String build04 = "images/Buildings/Building04.jpg";
		final String build05 = "images/Buildings/Building05.jpg";
		final String build06 = "images/Buildings/Building06.jpg";
		final String build07 = "images/Buildings/Building07.jpg";
		final String build08 = "images/Buildings/Building08.jpg";
		final String build09 = "images/Buildings/Building09.jpg";
		final String build10 = "images/Buildings/Building10.jpg";
				
		// Create The Buildings
		Building building01 = new Building("Boeing Everett Factory", "United States", "Everett, Washington", "398,000 m2", "13.3 million m3", build01);
		Building building02 = new Building("Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", "356,000  m2", "8  million m3", build02);
		Building building03 = new Building("Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", "122,500  m2", "5.6 million m3", build03);
		Building building04 = new Building("Boeing Composite Wing Center", "United States", "Everett, Washington", "111,500 m2", "3.7 million m3", build04);
		Building building05 = new Building("Aerium", "Germany", "Halbe, Brandenburg", "70,000 m2", "5.2 million m3", build05);
		Building building06 = new Building("Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedersachsen", "63,000 m2", "4.72 million m3", build06);
		Building building07 = new Building("NASA Vehicle Assembly Building", "United States", "Brevard County, Florida", "232,374 m2", "3.66 million m3", build07);
		Building building08 = new Building("The O2", "United Kingdom", "London", "104,634 m2", "2.79 million m3", build08);
		Building building09 = new Building("Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", "80,194 m2", "1.55 million m3", build09);
		Building building10 = new Building("Target Import Warehouse", "United States", "Savannah, Georgia", "187,664 m2", "1.5 million m3", build10);
		
		// Add The Buildings To ArrayList
		buildings.add(building01);
		buildings.add(building02);
		buildings.add(building03);
		buildings.add(building04);
		buildings.add(building05);
		buildings.add(building06);
		buildings.add(building07);
		buildings.add(building08);
		buildings.add(building09);
		buildings.add(building10);

		return buildings;
	}
}