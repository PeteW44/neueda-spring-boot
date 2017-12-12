/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the BRMCController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.service.Spacemen3AlbumService;

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
		model.addAttribute("pageTitle", "Spacemen 3 Albums");
		
		return "spacemen3AlbumPage";
	}
	
	@GetMapping("/media/")
	public String spacemen3Media(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Media");
		
		return "spacemen3MediaPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String brmcDemos(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		Album album = this.spacemen3AlbumService.getSpacemen3Album(albumTitle);
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}