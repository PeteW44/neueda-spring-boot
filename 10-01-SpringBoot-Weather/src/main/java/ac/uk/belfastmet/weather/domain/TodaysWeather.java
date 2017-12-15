/*
 * Class:           TodaysWeather.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.domain
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the TodaysWeather Class
 */

package ac.uk.belfastmet.weather.domain;
// Import Packages
import javax.persistence.Entity;

@Entity
public class TodaysWeather 
{
	// Instance Variables
	private Location location;
	private Wind wind;

	// Default Passenger Constructor
	public TodaysWeather()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public TodaysWeather(Location location, Wind wind)
	{
		super();
		this.setLocation(location);
		this.setWind(wind);
	}

	/* 
	 * GET & SET Property Methods
	 */
	
	public Location getLocation() 
	{
		return location;
	}

	public void setLocation(Location location) 
	{
		this.location = location;
	}

	public Wind getWind() 
	{
		return wind;
	}

	public void setWind(Wind wind) 
	{
		this.wind = wind;
	}
}
