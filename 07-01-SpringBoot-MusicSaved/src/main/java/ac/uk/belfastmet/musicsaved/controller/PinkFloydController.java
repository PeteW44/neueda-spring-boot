/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         20/12/2017 22.00
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
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.repositories.GenreRepository;
import ac.uk.belfastmet.musicsaved.service.AlbumService;

@Controller
@RequestMapping("/pinkfloyd/")
public class PinkFloydController 
{
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public PinkFloydController()
	{
		super();
	}
	
	public PinkFloydController(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.genreRepository = genreRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/")
	public String pinkFloydHome(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Pink Floyd Home");
		
		return "pinkFloydHomePage";
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