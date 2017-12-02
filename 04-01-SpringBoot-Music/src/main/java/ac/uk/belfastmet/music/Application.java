/*
 * Class:           Application.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.music
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         02/12/2017 18.30
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

 package ac.uk.belfastmet.music;
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