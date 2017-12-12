/*
 * Class:           Application.java
 * Project:         Breakfast Cereal Demo
 * Package:         ac.uk.belfastmet.cereal
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         12/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.cereal;
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