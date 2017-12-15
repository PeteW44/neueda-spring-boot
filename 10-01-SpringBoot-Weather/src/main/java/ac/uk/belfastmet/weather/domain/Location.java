/*
 * Class:           Location.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.domain
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Location Class
 */

package ac.uk.belfastmet.weather.domain;
// Import Packages
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Location 
{
	// Instance Variables
	@Id
	@GeneratedValue
	private String locationName;
	private float latitude;
	private float longitude;
	
	// Default Passenger Constructor
	public Location()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Location(String locationName, float latitude, float longitude)
	{
		super();
		this.setLocationName(locationName);
		this.setLatitude(latitude);
		this.setLongitude(longitude);
	}
	
	/* 
	 * GET & SET Property Methods
	 */
	
	public String getLocationName() 
	{
		return locationName;
	}

	public void setLocationName(String locationName) 
	{
		this.locationName = locationName;
	}

	public float getLatitude() 
	{
		return latitude;
	}

	public void setLatitude(float latitude) 
	{
		this.latitude = latitude;
	}

	public float getLongitude() 
	{
		return longitude;
	}

	public void setLongitude(float longitude) 
	{
		this.longitude = longitude;
	}
}
