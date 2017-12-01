/*
 * Class:           DisneyController.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.controller
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DisneyController Class
 */

package ac.uk.belfastmet.dwarfsaved.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ac.uk.belfastmet.dwarfsaved.repositories.DwarfRepository;

@Controller
@RequestMapping("/disney/")
public class DisneyController 
{
	@Autowired
	DwarfRepository dwarfRepository;
	
	public DisneyController(DwarfRepository dwarfRepository)
	{
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	@GetMapping("/")
	public String disney(Model model)
	{
		model.addAttribute("pageTitle", "Disney Dwarfs!");
		model.addAttribute("dwarfs", dwarfRepository.findByAuthor("Disney"));
		return "disneyPage";
	}
}