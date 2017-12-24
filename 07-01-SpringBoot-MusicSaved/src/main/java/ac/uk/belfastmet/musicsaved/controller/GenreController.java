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

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.service.MusicService;

@Controller
@RequestMapping("/genres/")
public class GenreController 
{
	@Autowired
	private MusicService albumService;
	
	public GenreController()
	{
		super();
	}

	/*
	 * Genre C.R.U.D. Views
	 */
	
	//################
	// Genre CRUD List
	//################
	@GetMapping("/crud/")
	public String genreCrud(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Genre List");
		model.addAttribute("pageTitle1", "Music Genres");
		model.addAttribute("pageTitle2", "List");
		model.addAttribute("pageTitle3", "C.R.U.D");
		
		return "genresListPage";
	}
	
	//#############
	// Create Genre
	//#############
	@GetMapping("/crud/add/")
	public String addGenreCrud(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		model.addAttribute("genre", new Genre());
		
		model.addAttribute("pageTitle", "Add New Genre");
		model.addAttribute("pageTitle1", "Music Genres");
		model.addAttribute("pageTitle2", "Add New");
		model.addAttribute("pageTitle3", "Genre");
		
		return "genreEditPage";
	}
	
	//###########
	// Read Genre
	//###########
	@GetMapping("/crud/view/{genreNameLower}/")
	public String viewGenre(@PathVariable("genreNameLower") String genreNameLower, Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Genre genre = this.albumService.getGenre(genreNameLower);
		model.addAttribute("genre", genre);
		
		model.addAttribute("pageTitle", "View Genre");
		model.addAttribute("pageTitle1", "Music Genres");
		model.addAttribute("pageTitle2", genre.getGenreName());
		model.addAttribute("pageTitle3", "View Genre");
		
		return "genreViewPage";
	}
	
	//#############
	// Update Genre
	//#############
	@GetMapping("/crud/edit/{genreNameLower}/")
	public String editGenreCrud(@PathVariable("genreNameLower") String genreNameLower, Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Genre genre = this.albumService.getGenre(genreNameLower);
		model.addAttribute("genre", genre);
		
		model.addAttribute("pageTitle", "Edit Genre");
		model.addAttribute("pageTitle1", "Music Genres");
		model.addAttribute("pageTitle2", genre.getGenreName());
		model.addAttribute("pageTitle3", "Edit Genre");
		
		return "genreEditPage";
	}
	
	//#############
	// Delete Genre
	//#############
	@GetMapping("/crud/delete/{genreNameLower}/")
	public String deleteGenreCrud(@PathVariable("genreNameLower") String genreNameLower, RedirectAttributes redirectAtts)
	{
		Genre genre = this.albumService.getGenre(genreNameLower);
		this.albumService.deleteGenre(genre.getGenreId());
		redirectAtts.addFlashAttribute("message", "Genre was Deleted");
		
		return "redirect:/genres/crud/";
	}
	
	//###########
	// Save Genre
	//###########
	@PostMapping("/crud/save/")
	public String saveGenre(@Valid Genre genre, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "genreEditPage";
		}
		
		else
		{
			Genre savedGenre = this.albumService.saveGenre(genre);
			
			return "redirect:/genres/crud/view/" + savedGenre.getGenreNameLower() + "/";
		}
	}
}