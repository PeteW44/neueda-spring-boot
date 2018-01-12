/*
 * Class:           LiveController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         18/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the LiveController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
//Import Packages
import java.util.Collection;
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
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.service.BandServiceImpl;
import ac.uk.belfastmet.musicsaved.service.GenreServiceImpl;
import ac.uk.belfastmet.musicsaved.service.AlbumServiceImpl;

@Controller
@RequestMapping("/albums/")
public class AlbumController 
{
	@Autowired
	private BandServiceImpl bandService;
	
	@Autowired
	private GenreServiceImpl genreService;
	
	@Autowired
	private AlbumServiceImpl albumService;
	
	// Default Constructor
	public AlbumController()
	{
		super();
	}
	
	// Parameterised Constructor
	public AlbumController(BandServiceImpl bandService, GenreServiceImpl genreService, AlbumServiceImpl albumService)
	{
		super();
		this.bandService = bandService;
		this.genreService = genreService;
		this.albumService = albumService;
	}
	
	//#################
	// Live Album Tiles
	//#################
	@GetMapping("/live/all/")
	public String liveAlbums(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection<Album> albums = this.albumService.getAllLiveAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Live Albums");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", "Various Artists");
		model.addAttribute("pageTitle3", "Live");
		
		return "albumsTilePage";
	}
	
	//###################
	// Studio Album Tiles
	//###################
	@GetMapping("/studio/all/")
	public String studioAlbums(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection<Album> albums = this.albumService.getAllStudioAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Studio Albums");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", "Various Artists");
		model.addAttribute("pageTitle3", "Studio");
		
		return "albumsTilePage";
	}
	
	//#################
	// Band Album Tiles
	//#################
	@GetMapping("/band/{bandNameLower}/")
	public String bandAlbums(@PathVariable("bandNameLower") String bandNameLower, Model model)
	{
		Band band = this.bandService.getBandByName(bandNameLower);
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection<Album> albums = this.albumService.getAllAlbumsByBand(band);
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Albums By Band");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", band.getBandName());
		model.addAttribute("pageTitle3", "Studio and Live");
		
		return "albumsTilePage";
	}
	
	//##################
	// Genre Album Tiles
	//##################
	@GetMapping("/genre/{genreNameLower}/")
	public String genreAlbums(@PathVariable("genreNameLower") String genreNameLower, Model model)
	{
		Genre genre = this.genreService.getGenreByName(genreNameLower);
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection<Album> albums = this.albumService.getAllAlbumsByGenre(genre);
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Albums By Genre");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", genre.getGenreName());
		model.addAttribute("pageTitle3", "Studio and Live");
		
		return "albumsTilePage";
	}
	
	/*
	 * Album C.R.U.D. Views
	 */
	
	//################
	// Album CRUD List
	//################
	@GetMapping("/crud/")
	public String crudAlbums(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection<Album> albums = this.albumService.getAllAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Album List");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", "List");
		model.addAttribute("pageTitle3", "C.R.U.D");
		
		return "albumsListPage";
	}
	
	//#############
	// Create Album
	//#############
	@GetMapping("/crud/add/")
	public String addAlbumCrud(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Collection	<Album> albums = this.albumService.getAllAlbums();
		model.addAttribute("albums", albums);
		model.addAttribute("album", new Album());
		
		model.addAttribute("pageTitle", "Add New Album");
		model.addAttribute("pageTitle1", "Albums and EP's");
		model.addAttribute("pageTitle2", "Add New");
		model.addAttribute("pageTitle3", "Album");
		
		return "albumEditPage";
	}
	
	//###########
	// Read Album
	//###########
	@RequestMapping("/*/*/{albumTitleLower}")
	public String viewAlbum(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Album album = this.albumService.getAlbumByName(albumTitleLower);
		model.addAttribute("album", album);
		
		model.addAttribute("pageTitle", album.getAlbumTitle());
		model.addAttribute("pageTitle1", album.getBand().getBandName());
		model.addAttribute("pageTitle2", album.getAlbumTitle());
		model.addAttribute("pageTitle3", album.getReleaseYear());
		return "albumViewPage";
	}
	
//	@GetMapping("/crud/view/{albumTitleLower}/")
//	public String viewAlbum(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
//	{
//		Set<Band> bands = this.albumService.getAllBands();
//		model.addAttribute("bands", bands);
//		Set<Genre> genres = this.albumService.getAllGenres();
//		model.addAttribute("genres", genres);
//		Album album = this.albumService.getAlbum(albumTitleLower);
//		model.addAttribute("album", album);
//		
//		model.addAttribute("pageTitle", "View Album");
//		model.addAttribute("pageTitle1", "Various Artists");
//		model.addAttribute("pageTitle2", "View Album");
//		model.addAttribute("pageTitle3", "C.R.U.D");
//		
//		return "albumPage";
//	}
	
	//#############
	// Update Album
	//#############
	@GetMapping("/crud/edit/{albumTitleLower}/")
	public String editAlbumCrud(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Album album = this.albumService.getAlbumByName(albumTitleLower);
		model.addAttribute("album", album);
		
		model.addAttribute("pageTitle", "Edit Album");
		model.addAttribute("pageTitle1", album.getBand().getBandName());
		model.addAttribute("pageTitle2", album.getAlbumTitle());
		model.addAttribute("pageTitle3", "Edit Album");
		
		return "albumEditPage";
	}
	
	//#############
	// Delete Album
	//#############
	@GetMapping("/crud/delete/{albumId}/")
	public String deleteAlbumCrud(@PathVariable("albumId") Integer albumId, RedirectAttributes redirectAtts)
	{
		Album album = this.albumService.getAlbumById(albumId);
		this.albumService.deleteAlbum(album.getAlbumId());
		redirectAtts.addFlashAttribute("message", "Album was Deleted");
		
		return "redirect:/albums/crud/";
	}
	
	//###########
	// Save Album
	//###########
	@PostMapping("/crud/save/")
	public String saveAlbum(@Valid Album album, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "albumEditPage";
		}
		
		else
		{
			Album savedAlbum = this.albumService.saveAlbum(album);
			
			return "redirect:/albums/crud/view/" + savedAlbum.getAlbumTitleLower() + "/";
		}
	}
}