/*
 * Class:           Application.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.titanicsaved;
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