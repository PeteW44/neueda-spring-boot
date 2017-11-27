/*
 * Class:           Application.java
 * Project:         Spring Boot Demo
 * Package:         ac.uk.belfastmet.springbootdemo
 * Version:         1.0
 * Created:         27/11/2017
 * Updated:         27/11/2017 15.30
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.springbootdemo;
//Import Packages
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
		
		logger.info("Hellow Spring Boot!");
		logger.info("Hellow Again");
	}
}
