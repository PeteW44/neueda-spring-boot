/*
 * Class:           Application.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.buildings;
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