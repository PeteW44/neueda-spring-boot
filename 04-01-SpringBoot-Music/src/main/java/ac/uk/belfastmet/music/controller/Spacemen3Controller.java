/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 23.30
 * Author:          Peter Wightman
 * Description:     This is the BRMCController Class
 */

package ac.uk.belfastmet.music.controller;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.music.service.Spacemen3AlbumService;

@Controller
@RequestMapping("/spacemen3/")
public class Spacemen3Controller 
{
	@Autowired
	private Spacemen3AlbumService spacemen3AlbumService;
	
	@GetMapping("/")
	public String spacemen3Home(Model model)
	{
		model.addAttribute("pageTitle", "BSpacemen 3 Home");
	
		return "spacemen3HomePage";
	}
	
	@GetMapping("/bio/")
	public String spacemen3Bio(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Bio");
		
		return "spacemen3BioPage";
	}
	
	@GetMapping("/albums/")
	public String spacemen3Albums(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("spacemen3Albums", this.spacemen3AlbumService.getSpacemen3Albums());
		model.addAttribute("pageTitle", "Spacemen 3 Albums");
		
		return "spacemen3AlbumPage";
	}
	
	@GetMapping("/media/")
	public String spacemen3Media(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Media");
		
		return "spacemen3MediaPage";
	}
}