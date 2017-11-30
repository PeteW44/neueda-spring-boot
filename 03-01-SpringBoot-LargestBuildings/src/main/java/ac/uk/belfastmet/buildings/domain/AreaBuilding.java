/*
 * Class:           AreaBuilding.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the AreaBuilding Class
 */

package ac.uk.belfastmet.buildings.domain;

public class AreaBuilding extends Building
{
	// Instance Variables
	private String floorArea;

	// Default Mythical Creature Constructor
	public AreaBuilding()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public AreaBuilding(String name, String country, String place, String floorArea, String image)
	{
		super(name, country, place, image);
		this.setFloorArea(floorArea);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getFloorArea() 
	{
		return floorArea;
	}

	public void setFloorArea(String floorArea) 
	{
		this.floorArea = floorArea;
	}
}