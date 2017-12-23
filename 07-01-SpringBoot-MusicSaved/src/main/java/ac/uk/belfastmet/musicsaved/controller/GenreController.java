/*
 * Class:           GenreController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         23/11/2017
 * Updated:         23/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the GenreController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
//Import Packages
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.repositories.GenreRepository;
import ac.uk.belfastmet.musicsaved.service.MusicService;

@Controller
@RequestMapping("/genres/")
public class GenreController 
{
	@Autowired
	private MusicService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public GenreController()
	{
		super();
	}
	
	public GenreController(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.genreRepository = genreRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/crud/")
	public String genreCrud(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "All Genres List");
		model.addAttribute("pageTitle1", "Genres");
		model.addAttribute("pageTitle2", "All Genres List");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "genresListPage";
	}
	
	@GetMapping("/crud/edit/{genreNameLower}/")
	public String editCrud(@PathVariable("genreNameLower") String genreNameLower, Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Genre genre = this.albumService.getGenre(genreNameLower);
		model.addAttribute("genre", genre);
		
		model.addAttribute("pageTitle", "Edit Genre");
		model.addAttribute("pageTitle1", "Genres");
		model.addAttribute("pageTitle2", "Edit Genre");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "genreEditPage";
	}
}