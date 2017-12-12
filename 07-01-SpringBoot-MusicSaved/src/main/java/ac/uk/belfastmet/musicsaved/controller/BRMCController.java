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
import ac.uk.belfastmet.musicsaved.service.BrmcAlbumService;

@Controller
@RequestMapping("/brmc/")
public class BRMCController 
{
	@Autowired
	private BrmcAlbumService brmcAlbumService;
	
	@GetMapping("/")
	public String brmcHome(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Home");
		
		return "brmcHomePage";
	}
	
	@GetMapping("/bio/")
	public String brmcBio(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Bio");
		
		return "brmcBioPage";
	}
	
	@GetMapping("/albums/")
	public String brmcAlbums(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Albums");
		
		return "brmcAlbumPage";
	}
	
	@GetMapping("/media/")
	public String brmcMedia(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Media");
		
		return "brmcMediaPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String brmcDemos(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		Album album = this.brmcAlbumService.getBrmcAlbum(albumTitle);
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}