/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         31/11/2017
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
import ac.uk.belfastmet.music.service.BrmcAlbumService;

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
	
	//############
	// Album Pages
	//############
	
	@GetMapping("/albums/demos/")
	public String brmcDemos(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumDemos());
		model.addAttribute("pageTitle", "Demos 1999");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/brmc/")
	public String brmcBlackRebelMotorcycleClub(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumBlackRebelMotorcycleClub());
		model.addAttribute("pageTitle", "BRMC");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/takethemononyourown/")
	public String brmcTakeThemOnOnYourOwn(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumTakeThemOnOnYourOwn());
		model.addAttribute("pageTitle", "Take Them On, On Your Own");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/howl/")
	public String brmcHowl(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumHowl());
		model.addAttribute("pageTitle", "Howl");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/howlsessions/")
	public String brmcHowlSessions(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumHowlSessions());
		model.addAttribute("pageTitle", "Howl Sessions");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/baby81/")
	public String brmcBaby81(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumBaby81());
		model.addAttribute("pageTitle", "Baby 81");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/americanxbaby81sessions/")
	public String brmcAmericanXBaby81Sessions(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumAmericanXBaby81Sessions());
		model.addAttribute("pageTitle", "American X Baby 81 Sessions");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/live/")
	public String brmcLive(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumLive());
		model.addAttribute("pageTitle", "Live");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/beatthedevilstattoo/")
	public String brmcBeatTheDevilsTattoo(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumBeatTheDevilsTattoo());
		model.addAttribute("pageTitle", "Beat The Devils Tattoo");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/liveinlondon/")
	public String brmcLiveInLondon(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumLiveInLondon());
		model.addAttribute("pageTitle", "Live In London");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/specteratthefeast/")
	public String brmcSpecterAtTheFeast(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumSpecterAtTheFeast());
		model.addAttribute("pageTitle", "Specter At The Feast");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/liveinparis/")
	public String brmcLiveInParis(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumLiveInParis());
		model.addAttribute("pageTitle", "Live In Paris");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/wrongcreatures/")
	public String brmcWrongCreatures(Model model)
	{
		this.brmcAlbumService = new BrmcAlbumService();
		model.addAttribute("album", this.brmcAlbumService.getBrmcAlbumWrongCreatures());
		model.addAttribute("pageTitle", "Wrong Creatures");
		
		return "albumPage";
	}
}