/*
 * Class:           HomeController.java
 * Project:         Forms Demo
 * Package:         ac.uk.belfastmet.forms.Controller
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         11/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.forms.controller;
// Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/form/")
	public String home(Model model)
	{
		model.addAttribute("pageTitle", "Form");
		return "formPage";
	}
	
	@PostMapping("/result/")
	public String postResult(@RequestParam("firstname") String firstName, 
						 @RequestParam("lastname") String lastName, 
						 @RequestParam("gender") String gender, Model model)
	{
		model.addAttribute("firstname", firstName);
		model.addAttribute("lastname", lastName);
		model.addAttribute("gender", gender);
		
		model.addAttribute("pageTitle", "Post Result");
		return "resultPage";
	}
	
	@GetMapping("/result/")
	public String getResult(String firstName, String lastName, String gender, Model model)
	{
		model.addAttribute("firstname", "Peter2");
		model.addAttribute("lastname", "Wightman2");
		model.addAttribute("gender", "Unsure");
		
		model.addAttribute("pageTitle", "Get Result");
		return "resultPage";
	}
}