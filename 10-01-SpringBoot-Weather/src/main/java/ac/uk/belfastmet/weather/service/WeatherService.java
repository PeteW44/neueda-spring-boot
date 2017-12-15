/*
 * Class:           WeatherService.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.service
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the WeatherService Class
 */

package ac.uk.belfastmet.weather.service;
// Import Packages
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ac.uk.belfastmet.weather.domain.TodaysWeather;

@Service
public class WeatherService 
{
	private String belfastWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=belfast";
	private String dublinWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=dublin";
	private String londonWeatherUrl = "http://www.codingfury.net/training/weathersample/weather.php?location=london";
	
	private RestTemplate restTemplate;
	
	public WeatherService(RestTemplate restTemplate) 
	{
		super();
		this.restTemplate = restTemplate;
	}
	
	public TodaysWeather getTodaysWeather()
	{
		String todaysWeatherUrl = this.belfastWeatherUrl;
		
		TodaysWeather todaysWeather = restTemplate.getForObject(todaysWeatherUrl, TodaysWeather.class);
		
		return todaysWeather;
	}
}