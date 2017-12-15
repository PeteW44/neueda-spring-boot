/*
 * Class:           RestTemplateConfig.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.config
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the RestTemplateConfig Class
 */

package ac.uk.belfastmet.weather.config;
// Import Packages
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Configuration
public class RestTemplateConfig 
{
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
}
