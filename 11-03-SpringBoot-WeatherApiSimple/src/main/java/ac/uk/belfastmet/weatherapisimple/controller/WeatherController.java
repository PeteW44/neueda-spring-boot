/*
 * Class:           WeatherController.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weatherapisimple.controller
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the WeatherController Class
 */

package ac.uk.belfastmet.weatherapisimple.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import ac.uk.belfastmet.weatherapisimple.domain.TodaysWeather;
import ac.uk.belfastmet.weatherapisimple.domain.Weather;

@Controller
@RequestMapping("/todaysweather/")
public class WeatherController
{
	@Value("${api.baseWeatherUrl}")
	private String baseWeatherURL;
	
	public WeatherController() 
	{
		super();
	}
	
	@GetMapping("/belfast/")
	public String weatherTodayBelfast(Model model)
	{
		String belfastWeatherURL = this.baseWeatherURL + "belfast";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(belfastWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("pageTitle", " Belfast's Weather Today");
		model.addAttribute("weather", weather);
		
		return "todaysWeatherPage";
	}
	
	@GetMapping("/dublin/")
	public String weatherTodayDublin(Model model)
	{
		String dublinWeatherURL = this.baseWeatherURL + "dublin";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(dublinWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("pageTitle", " Dublin's Weather Today");
		model.addAttribute("weather", weather);
		
		return "todaysWeatherPage";
	}
	
	@GetMapping("/london/")
	public String weatherTodayLondon(Model model)
	{
		String londonWeatherURL = this.baseWeatherURL + "london";
		RestTemplate restTemplate = new RestTemplate();
		TodaysWeather todaysWeather = restTemplate.getForObject(londonWeatherURL, TodaysWeather.class);
		Weather weather = todaysWeather.getWeather();
		
		model.addAttribute("pageTitle", " London's Weather Today");
		model.addAttribute("weather", weather);
		
		return "todaysWeatherPage";
	}
}