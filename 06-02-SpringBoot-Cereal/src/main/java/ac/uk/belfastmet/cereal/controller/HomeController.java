/*
 * Class:           HomeController.java
 * Project:         Breakfast Cereal Demo
 * Package:         ac.uk.belfastmet.cereal.controller
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         11/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.cereal.controller;
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
		model.addAttribute("pageTitle", "Breakfast Cereal");
		return "indexPage";
	}
}