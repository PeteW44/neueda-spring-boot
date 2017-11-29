/*
 * Class:           DisneyController.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.controller
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DisneyController Class
 */

package ac.uk.belfastmet.dwarfs.controller;
//Import Packages
import ac.uk.belfastmet.dwarfs.service.DwarfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disney/")
public class DisneyController 
{
	@Autowired
	private DwarfService dwarfService;
	
	@GetMapping("/")
	public String disney(Model model)
	{
		model.addAttribute("pageTitle", "Disney Dwarfs!");
		this.dwarfService = new DwarfService();
		model.addAttribute("dwarfs", this.dwarfService.getDisneyDwarfs());
		return "disneyPage";
	}
}