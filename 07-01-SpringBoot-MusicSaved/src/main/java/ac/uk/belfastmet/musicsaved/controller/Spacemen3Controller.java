/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         18/12/2017 23.30
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
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
	
	public Spacemen3Controller(BandRepository bandRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/")
	public String spacemen3Home(Model model)
	{
		model.addAttribute("pageTitle", "BSpacemen 3 Home");
	
		return "spacemen3HomePage";
	}
	
	@GetMapping("/bio/")
	public String spacemen3Bio(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Bio");
		
		return "spacemen3BioPage";
	}
	
	@GetMapping("/albums/")
	public String spacemen3Albums(Model model)
	{
		this.albumService = new AlbumService(bandRepository, albumRepository);
		Set<Album> albums = this.albumService.getAllSpacemen3Albums();
		model.addAttribute("albums", albums);
		model.addAttribute("pageTitle", "Spacemen 3 Albums");
		model.addAttribute("pageTitle1", "Spacemen 3");
		model.addAttribute("pageTitle2", "Studio and Live");
		model.addAttribute("pageTitle3", "Albums");
		
		return "albumsPage";
	}
	
	@GetMapping("/media/")
	public String spacemen3Media(Model model)
	{
		model.addAttribute("pageTitle", "Spacemen 3 Media");
		
		return "spacemen3MediaPage";
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