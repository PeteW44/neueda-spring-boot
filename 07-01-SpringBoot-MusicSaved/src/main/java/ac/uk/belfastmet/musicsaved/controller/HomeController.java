/*
 * Class:           HomeController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
// Import Packages
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.service.BandServiceImpl;
import ac.uk.belfastmet.musicsaved.service.GenreServiceImpl;

@Controller
@RequestMapping("/")
public class HomeController
{
	@Autowired
	private BandServiceImpl bandService;
	
	@Autowired
	private GenreServiceImpl genreService;
	
	// Default Constructor
	public HomeController()
	{
		super();
	}
	
	// Parameterised Constructor
	public HomeController(BandServiceImpl bandService, GenreServiceImpl genreService)
	{
		super();
		this.bandService = bandService;
		this.genreService = genreService;
	}
	
	@GetMapping("/")
	public String home(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Music Discography");
		
		return "indexPage";
	}
}