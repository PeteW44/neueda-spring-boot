/*
 * Class:           DisneyController.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.controller
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         28/10/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the DisneyController Class
 */

package ac.uk.belfastmet.dwarfs.controller;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/disney/")
public class DisneyController 
{
	@GetMapping("/")
	public String disney(Model model)
	{
		return "disneyPage";
	}
}