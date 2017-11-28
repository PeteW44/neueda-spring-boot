/*
 * Class:           Application.java
 * Project:         Spring Boot Demo
 * Package:         ac.uk.belfastmet.titanic
 * Version:         1.0
 * Created:         27/11/2017
 * Updated:         27/11/2017 15.30
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.titanic;
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