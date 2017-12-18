/*
 * Class:           TodaysWeather.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weatherapisimple.domain
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the TodaysWeather Class
 */

package ac.uk.belfastmet.weatherapisimple.domain;

public class TodaysWeather 
{
	// Instance Variables
	private Location location;
	private Weather weather;

	// Default Constructor
	public TodaysWeather()
	{
		super();
	}
	
	// Parameterised Constructor
	public TodaysWeather(Location location, Weather weather)
	{
		super();
		this.setLocation(location);
		this.setWeather(weather);
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

	public Weather getWeather() 
	{
		return weather;
	}

	public void setWeather(Weather weather) 
	{
		this.weather = weather;
	}

	/* 
	 * Over Ride To String Method
	 */
	
	@Override
	public String toString() 
	{
		return "TodaysWeather [Location [locationName=" + location.getLocationName() + 
			   ", latitude=" + location.getLatitude() + 
			   ", longitude=" + location.getLongitude() + "]" +
			   ", Weather [description=" + weather.getDescription() + 
			   ", precipitation=" + weather.getPrecipitation() + 
			   ", temperature=" + weather.getTemperature() + 
			   ", humidity=" + weather.getHumidity() + 
			   ", pressure=" + weather.getPressure() + 
			   ", cloudcover=" + weather.getCloudcover() + 
			   ", Wind [windspeed=" + weather.getWind().getSpeed() + 
			   ", winddirection=" + weather.getWind().getDirection() + "]" +
			   ", image=" + weather.getImage() + "]";
	}
}
