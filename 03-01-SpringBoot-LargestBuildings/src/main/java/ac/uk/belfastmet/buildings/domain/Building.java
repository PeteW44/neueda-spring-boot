/*
 * Class:           Building.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Building Class
 */

package ac.uk.belfastmet.buildings.domain;

public class Building 
{
	private String name;
	private String country;
	private String place;
	private String floorArea;
	private String volume;
	private String image;

	// Default Mythical Creature Constructor
	public Building()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public Building(String name, String country, String place, String floorArea, String volume, String image)
	{
		this.setName(name);
		this.setCountry(country);
		this.setPlace(place);
		this.setFloorArea(floorArea);
		this.setVolume(volume);
		this.setImage(image);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getCountry()
	{
		return country;
	}

	public void setCountry(String country) 
	{
		this.country = country;
	}

	public String getPlace() 
	{
		return place;
	}

	public void setPlace(String place) 
	{
		this.place = place;
	}

	public String getFloorArea() 
	{
		return floorArea;
	}

	public void setFloorArea(String floorArea) 
	{
		this.floorArea = floorArea;
	}

	public String getVolume() 
	{
		return volume;
	}

	public void setVolume(String volume) 
	{
		this.volume = volume;
	}

	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}
}
