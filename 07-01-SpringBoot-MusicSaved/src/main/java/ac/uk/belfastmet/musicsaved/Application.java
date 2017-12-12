/*
 * Class:           Application.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.musicsaved;

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