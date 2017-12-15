/*
 * Class:           Application.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.weather;
// Import Packages
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}