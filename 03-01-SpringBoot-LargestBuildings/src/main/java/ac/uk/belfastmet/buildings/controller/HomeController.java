/*
 * Class:           HomeController.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.buildings.controller;
// Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home/")
public class HomeController
{
	@GetMapping("/")
	public String home(Model model)
	{
		return "indexPage";
	}
}