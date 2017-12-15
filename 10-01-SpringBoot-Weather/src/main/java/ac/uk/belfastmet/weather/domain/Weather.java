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
public class Weather
{
	// Instance Variables
	@Id
	@GeneratedValue
	private String description;
	private String precipitation;
	private Integer temperature;
	private String humidity;
	private String pressure;
	private Integer cloudcover;
	private Wind wind;
	private String image;

	// Default Passenger Constructor
	public Weather()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Weather(String description, String precipitation, Integer temperature, String humidity,
				   String pressure, Integer cloudcover, Wind wind, String image)
	{
		super();
		this.setDescription(description);
		this.setPrecipitation(precipitation);
		this.setTemperature(temperature);
		this.setHumidity(humidity);
		this.setPressure(pressure);
		this.setCloudcover(cloudcover);
		this.setWind(wind);
		this.setImage(image);
	}

	/* 
	 * GET & SET Property Methods
	 */
	
	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public String getPrecipitation() 
	{
		return precipitation;
	}

	public void setPrecipitation(String precipitation) 
	{
		this.precipitation = precipitation;
	}

	public Integer getTemperature() 
	{
		return temperature;
	}

	public void setTemperature(Integer temperature) 
	{
		this.temperature = temperature;
	}

	public String getHumidity() 
	{
		return humidity;
	}

	public void setHumidity(String humidity) 
	{
		this.humidity = humidity;
	}

	public String getPressure() 
	{
		return pressure;
	}

	public void setPressure(String pressure) 
	{
		this.pressure = pressure;
	}

	public Integer getCloudcover() 
	{
		return cloudcover;
	}

	public void setCloudcover(Integer cloudcover) 
	{
		this.cloudcover = cloudcover;
	}

	public Wind getWind() 
	{
		return wind;
	}

	public void setWind(Wind wind) 
	{
		this.wind = wind;
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
