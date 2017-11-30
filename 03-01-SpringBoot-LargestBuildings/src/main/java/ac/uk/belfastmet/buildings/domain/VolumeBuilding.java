/*
 * Class:           VolumeBuilding.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the VolumeBuilding Class
 */

package ac.uk.belfastmet.buildings.domain;

public class VolumeBuilding extends Building
{
	// Instance Variables
	private String volume;

	// Default Mythical Creature Constructor
	public VolumeBuilding()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public VolumeBuilding(String name, String country, String place, String volume, String image)
	{
		super(name, country, place, image);
		this.setVolume(volume);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getVolume() 
	{
		return volume;
	}

	public void setVolume(String volume) 
	{
		this.volume = volume;
	}
}