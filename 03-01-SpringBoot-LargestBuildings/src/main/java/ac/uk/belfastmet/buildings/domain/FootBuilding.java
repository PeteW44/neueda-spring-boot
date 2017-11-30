/*
 * Class:           FootBuilding.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the FootBuilding Class
 */

package ac.uk.belfastmet.buildings.domain;

public class FootBuilding extends Building
{
	// Instance Variables
	private String footprint;

	// Default Mythical Creature Constructor
	public FootBuilding()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public FootBuilding(String name, String country, String place, String footprint, String image)
	{
		super(name, country, place, image);
		this.setFootprint(footprint);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getFootprint() 
	{
		return footprint;
	}

	public void setFootprint(String footprint) 
	{
		this.footprint = footprint;
	}
}