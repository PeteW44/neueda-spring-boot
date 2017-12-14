/*
 * Class:           HomeController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.controller
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.titaniccrud.controller;
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
		model.addAttribute("pageTitle", "Titanic Passengers");
		return "indexPage";
	}
}