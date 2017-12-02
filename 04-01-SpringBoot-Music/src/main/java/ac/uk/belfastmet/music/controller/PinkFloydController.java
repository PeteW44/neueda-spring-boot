/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.controller
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         02/12/2017 18.30
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
	
	//############
	// Album Pages
	//############
	
	@GetMapping("/albums/thepiperatthegatesofdawn/")
	public String pinkFloydThePiperAtTheGatesOfDawn(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydThePiperAtTheGatesOfDawn());
		model.addAttribute("pageTitle", "The Piper At The Gates Of Dawn");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/asaucerfulofsecrets/")
	public String pinkFloydASaucerfulOfSecrets(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydASaucerfulOfSecrets());
		model.addAttribute("pageTitle", "A Saucerful Of Secrets");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/more/")
	public String pinkFloydMore(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydMore());
		model.addAttribute("pageTitle", "More");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/ummagumma/")
	public String pinkFloydUmmagumma(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydUmmagumma());
		model.addAttribute("pageTitle", "Ummagumma");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/atomheartmother/")
	public String pinkFloydAtomHeartMother(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydAtomHeartMother());
		model.addAttribute("pageTitle", "Atom Heart Mother");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/meddle/")
	public String pinkFloydMeddle(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydMeddle());
		model.addAttribute("pageTitle", "Meddle");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/obscuredbyclouds/")
	public String pinkFloydObscuredByClouds(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydObscuredByClouds());
		model.addAttribute("pageTitle", "Obscured By Clouds");
		
		return "albumPage";
	}

	@GetMapping("/albums/thedarksideofthemoon/")
	public String pinkFloydTheDarkSideOfTheMoon(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydTheDarkSideOfTheMoon());
		model.addAttribute("pageTitle", "The Dark Side Of The Moon");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/wishyouwerehere/")
	public String pinkFloydWishYouWereHere(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydWishYouWereHere());
		model.addAttribute("pageTitle", "Wish You Were Here");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/animals/")
	public String pinkFloydAnimals(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydAnimals());
		model.addAttribute("pageTitle", "Animals");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/thewall/")
	public String pinkFloydTheWall(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydTheWall());
		model.addAttribute("pageTitle", "The Wall");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/thefinalcut/")
	public String pinkFloydTheFinalCut(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydTheFinalCut());
		model.addAttribute("pageTitle", "The Final Cut");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/amomentarylapseofreason/")
	public String pinkFloydAMomentaryLapseOfReason(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydAMomentaryLapseOfReason());
		model.addAttribute("pageTitle", "A Momentary Lapse Of Reason");
		
		return "albumPage";
	}

	@GetMapping("/albums/delicatesoundofthunder/")
	public String pinkFloydDelicateSoundOfThunder(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydDelicateSoundOfThunder());
		model.addAttribute("pageTitle", "Delicate Sound Of Thunder");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/thedivisionbell/")
	public String pinkFloydTheDivisionBell(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydTheDivisionBell());
		model.addAttribute("pageTitle", "The Division Bell");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/pulse/")
	public String pinkFloydPulse(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydPulse());
		model.addAttribute("pageTitle", "Pulse");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/isthereanybodyouttherethewalllive/")
	public String pinkFloydIsThereAnybodyOutThereTheWallLive(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydIsThereAnybodyOutThereTheWallLive());
		model.addAttribute("pageTitle", "Is There Anybody Out There The Wall Live");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/theendlessriver/")
	public String pinkFloydTheEndlessRiver(Model model)
	{
		this.pinkFloydAlbumService = new PinkFloydAlbumService();
		model.addAttribute("album", this.pinkFloydAlbumService.getPinkFloydTheEndlessRiver());
		model.addAttribute("pageTitle", "The Endless River");
		
		return "albumPage";
	}
}