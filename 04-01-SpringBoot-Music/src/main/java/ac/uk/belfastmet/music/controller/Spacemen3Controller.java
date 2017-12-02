/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         02/12/2017 18.30
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
		model.addAttribute("pageTitle", "Spacemen 3 Albums");
		
		return "spacemen3AlbumPage";
	}
	
	@GetMapping("/media/")
	public String spacemen3Media(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Media");
		
		return "spacemen3MediaPage";
	}
	
	//############
	// Album Pages
	//############
	
	@GetMapping("/albums/soundofconfusion/")
	public String spacemen3SoundOfConfusion(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumSoundOfConfusion());
		model.addAttribute("pageTitle", "Sound Of Confusion");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/theperfectprescription/")
	public String spacemen3ThePerfectPrescription(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumThePerfectPrescription());
		model.addAttribute("pageTitle", "The Perfect Prescription");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/playingwithfire/")
	public String spacemen3PlayingWithFire(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumPlayingWithFire());
		model.addAttribute("pageTitle", "Playing With Fire");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/liveineurope1989/")
	public String spacemen3LiveInEurope1989(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumLiveInEurope1989());
		model.addAttribute("pageTitle", "Live In Europe 1989");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/recurring/")
	public String spacemen3Recurring(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumRecurring());
		model.addAttribute("pageTitle", "Recurring");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/dreamweapon/")
	public String spacemen3Dreamweapon(Model model)
	{
		this.spacemen3AlbumService = new Spacemen3AlbumService();
		model.addAttribute("album", this.spacemen3AlbumService.getSpacemen3AlbumDreamweapon());
		model.addAttribute("pageTitle", "Dreamweapon");
		
		return "albumPage";
	}
}