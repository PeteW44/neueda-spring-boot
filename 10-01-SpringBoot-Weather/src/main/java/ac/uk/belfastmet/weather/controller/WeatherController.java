/*
 * Class:           WeatherController.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.controller
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the WeatherController Class
 */

package ac.uk.belfastmet.weather.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import ac.uk.belfastmet.weather.domain.TodaysWeather;
import ac.uk.belfastmet.weather.service.WeatherService;

@Controller
@RequestMapping("/")
public class WeatherController
{
	@Autowired
	WeatherService weatherService;
	
	private TodaysWeather todaysWeather;
	
	@GetMapping("/")
	public TodaysWeather home(Model model)
	{
		model.addAttribute("pageTitle", "Weather");
		RestTemplate restTemplate = new RestTemplate();
		this.todaysWeather = restTemplate.getForObject("http://www.codingfury.net/training/weathersample/weather.php?location=belfast", TodaysWeather);
		
		return this.todaysWeather;
	}
}