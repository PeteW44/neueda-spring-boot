/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydController Class
 */

package ac.uk.belfastmet.music.controller;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.music.service.PinkFloydAlbumService;

@Controller
@RequestMapping("/pinkfloyd/")
public class PinkFloydController 
{
	@Autowired
	private PinkFloydAlbumService pinkFloydAlbumService;
	
	@GetMapping("/home/")
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
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("pinkfloydAlbums", this.pinkFloydAlbumService.getPinkFloydAlbums());
		model.addAttribute("pageTitle", "Pink Floyd Albums");
		
		return "pinkFloydAlbumPage";
	}
}