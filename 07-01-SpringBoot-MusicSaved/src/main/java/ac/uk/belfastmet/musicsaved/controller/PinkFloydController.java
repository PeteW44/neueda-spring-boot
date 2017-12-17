/*
 * Class:           PinkFloydController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         17/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
import java.util.Set;

//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
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
	
	public PinkFloydController(BandRepository bandRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}
	
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
		this.albumService = new AlbumService(bandRepository, albumRepository);
		Set<Album> albums = this.albumService.getAllPinkFloydAlbums();
		model.addAttribute("albums", albums);
		model.addAttribute("pageTitle", "Pink Floyd Albums");
		
		return "pinkFloydAlbumsPage";
	}
	
	@GetMapping("/media/")
	public String pinkfloydMedia(Model model)
	{
		model.addAttribute("pageTitle", "Pink Floyd Media");
		
		return "pinkFloydMediaPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String brmcDemos(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.albumService = new AlbumService(albumRepository);
		Album album = this.albumService.getAlbum(albumTitle);
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}