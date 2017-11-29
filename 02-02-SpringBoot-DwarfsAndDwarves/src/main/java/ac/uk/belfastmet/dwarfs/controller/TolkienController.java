/*
 * Class:           TolkienController.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.controller
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the TolkienController Class
 */

package ac.uk.belfastmet.dwarfs.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.dwarfs.service.DwarveService;

@Controller
@RequestMapping("/tolkien/")
public class TolkienController 
{
	@Autowired
	private DwarveService dwarveService;
	
	@GetMapping("/")
	public String tolkien(Model model)
	{
		model.addAttribute("pageTitle", "Tolkien Dwarves!");
		this.dwarveService = new DwarveService();
		model.addAttribute("dwarves", this.dwarveService.getTolkienDwarves());
		return "tolkienPage";
	}
}