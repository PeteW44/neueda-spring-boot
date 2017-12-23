/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         23/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
//Import Packages
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.service.MusicService;

@Controller
@RequestMapping("/pinkfloyd/")
public class PinkFloydController 
{
	@Autowired
	private MusicService albumService;
	
	public PinkFloydController()
	{
		super();
	}

	@GetMapping("/images/")
	public String pinkFloydHome(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Pink Floyd Images");
		
		return "pinkFloydImagesPage";
	}
	
	@GetMapping("/bio/")
	public String pinkFloydBio(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Pink Floyd Bio");
		
		return "pinkFloydBioPage";
	}
	
	@GetMapping("/media/")
	public String pinkfloydMedia(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Pink Floyd Media");
		
		return "pinkFloydMediaPage";
	}
}