/*
 * Class:           HomeController.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weatherapisimple.controller
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.weatherapisimple.controller;
// Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String home(Model model)
	{
		return "indexPage";
	}
}