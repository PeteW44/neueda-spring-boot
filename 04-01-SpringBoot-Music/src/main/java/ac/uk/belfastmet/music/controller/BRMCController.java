/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
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
import ac.uk.belfastmet.music.service.BrmcAlbumService;

@Controller
@RequestMapping("/brmc/")
public class BRMCController 
{
	@Autowired
	private BrmcAlbumService brmcAlbumService;
	
	@GetMapping("/home/")
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
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("brmcAlbums", this.brmcAlbumService.getBrmcAlbums());
		model.addAttribute("pageTitle", "BRMC Albums");
		
		return "brmcAlbumPage";
	}
}