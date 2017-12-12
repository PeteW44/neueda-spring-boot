/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydController Class
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
import ac.uk.belfastmet.musicsaved.service.PinkFloydAlbumService;

@Controller
@RequestMapping("/pinkfloyd/")
public class PinkFloydController 
{
	@Autowired
	private PinkFloydAlbumService pinkFloydAlbumService;
	
	@GetMapping("/")
	public String pinkFloydHome(Model model)
	{
		model.addAttribute("pageTitle", "Pink Floyd Home");
		
		return "pinkFloydHomePage";
	}
	
	@GetMapping("/bio/")
	public String pinkFloydBio(Model model)
	{
		model.addAttribute("pageTitle", "Pink Floyd Bio");
		
		return "pinkFloydBioPage";
	}
	
	@GetMapping("/albums/")
	public String pinkFloydAlbums(Model model)
	{
		model.addAttribute("pageTitle", "Pink Floyd Albums");
		
		return "pinkFloydAlbumPage";
	}
	
	@GetMapping("/media/")
	public String pinkfloydMedia(Model model)
	{
		model.addAttribute("pageTitle", "Pink Floyd Media");
		
		return "pinkFloydMediaPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String brmcDemos(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		Album album = this.pinkFloydAlbumService.getPinkFloydAlbum(albumTitle);
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}