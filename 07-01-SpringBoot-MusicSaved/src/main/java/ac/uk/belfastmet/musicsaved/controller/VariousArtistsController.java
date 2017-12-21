/*
 * Class:           LiveController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         18/11/2017
 * Updated:         20/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the LiveController Class
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
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.repositories.GenreRepository;
import ac.uk.belfastmet.musicsaved.service.AlbumService;

@Controller
@RequestMapping("/variousartists/")
public class VariousArtistsController 
{
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public VariousArtistsController()
	{
		super();
	}
	
	public VariousArtistsController(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
		this.genreRepository = genreRepository;
	}
	
	@GetMapping("/albums/live/all/")
	public String liveAlbums(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllLiveAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Live Albums");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "Live");
		model.addAttribute("pageTitle3", "Albums");
		
		return "albumsPage";
	}
	
	@GetMapping("/albums/studio/all/")
	public String studioAlbums(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllStudioAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Studio Albums");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "Studio");
		model.addAttribute("pageTitle3", "Albums");
		
		return "albumsPage";
	}
	
	@GetMapping("/albums/band/{bandNameLower}/")
	public String bandAlbums(@PathVariable("bandNameLower") String bandNameLower, Model model)
	{
		Band band = this.albumService.getBand(bandNameLower);
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllAlbumsByBand(band);
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Albums By Band");
		model.addAttribute("pageTitle1", band.getBandName());
		model.addAttribute("pageTitle2", "Studio and Live");
		model.addAttribute("pageTitle3", "Albums");
		
		return "albumsPage";
	}
	
	@GetMapping("/albums/genre/{genreNameLower}/")
	public String genreAlbums(@PathVariable("genreNameLower") String genreNameLower, Model model)
	{
		Genre genre = this.albumService.getGenre(genreNameLower);
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllAlbumsByGenre(genre);
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "Albums By Genre");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", genre.getGenreName());
		model.addAttribute("pageTitle3", "Albums");
		
		return "albumsPage";
	}
	
	@GetMapping("/albums/crud/")
	public String crudAlbums(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "All Albums List");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "All Albums List");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "albumsListPage";
	}
	
	@GetMapping("/albums/crud/view/{albumTitleLower}/")
	public String viewAlbums(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Album album = this.albumService.getAlbum(albumTitleLower);
		model.addAttribute("album", album);
		
		model.addAttribute("pageTitle", "View Albums");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "View Album");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "albumPage";
	}
	
	@GetMapping("/albums/crud/edit/{albumTitleLower}/")
	public String editAlbums(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Album album = this.albumService.getAlbum(albumTitleLower);
		model.addAttribute("album", album);
		
		model.addAttribute("pageTitle", "Edit Album");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "Edit Album");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "albumEditPage";
	}
	
	@GetMapping("/albums/crud/delete/")
	public String deleteAlbums(Model model)
	{
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		Set<Album> albums = this.albumService.getAllAlbums();
		model.addAttribute("albums", albums);
		
		model.addAttribute("pageTitle", "All Albums List");
		model.addAttribute("pageTitle1", "Various Artists");
		model.addAttribute("pageTitle2", "All Albums List");
		model.addAttribute("pageTitle3", "C.R.U.D.");
		
		return "albumsListPage";
	}
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/*/*/{albumTitleLower}")
	public String liveAlbum(@PathVariable("albumTitleLower") String albumTitleLower, Model model)
	{
		Album album = this.albumService.getAlbum(albumTitleLower);
		Set<Band> bands = this.albumService.getAllBands();
		model.addAttribute("bands", bands);
		Set<Genre> genres = this.albumService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}