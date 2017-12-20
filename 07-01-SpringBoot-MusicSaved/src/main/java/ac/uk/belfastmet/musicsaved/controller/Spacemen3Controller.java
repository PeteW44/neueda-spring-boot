/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         20/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the BRMCController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
import java.util.Set;

//Import Packages
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
@RequestMapping("/spacemen3/")
public class Spacemen3Controller 
{
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public Spacemen3Controller()
	{
		super();
	}
	
	public Spacemen3Controller(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.genreRepository = genreRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/")
	public String spacemen3Home(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "BSpacemen 3 Home");
	
		return "spacemen3HomePage";
	}
	
	@GetMapping("/bio/")
	public String spacemen3Bio(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Spacemen 3 Bio");
		
		return "spacemen3BioPage";
	}
	
	@GetMapping("/media/")
	public String spacemen3Media(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Spacemen 3 Media");
		
		return "spacemen3MediaPage";
	}
}