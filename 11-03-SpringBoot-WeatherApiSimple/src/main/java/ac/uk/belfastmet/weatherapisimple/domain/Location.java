/*
 * Class:           Location.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weatherapisimple.domain
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Location Class
 */

package ac.uk.belfastmet.weatherapisimple.domain;

public class Location 
{
	// Instance Variables
	private String locationName;
	private Float latitude;
	private Float longitude;
	
	// Default Constructor
	public Location()
	{
		super();
	}
	
	// Parameterised Constructor
	public Location(String locationName, Float latitude, Float longitude)
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

	public Float getLatitude() 
	{
		return latitude;
	}

	public void setLatitude(Float latitude) 
	{
		this.latitude = latitude;
	}

	public Float getLongitude() 
	{
		return longitude;
	}

	public void setLongitude(Float longitude) 
	{
		this.longitude = longitude;
	}

	/* 
	 * Over Ride To String Method
	 */
	
	@Override
	public String toString() 
	{
		return "Location [locationName=" + locationName + 
			   ", latitude=" + latitude + 
			   ", longitude=" + longitude + "]";
	}
}
