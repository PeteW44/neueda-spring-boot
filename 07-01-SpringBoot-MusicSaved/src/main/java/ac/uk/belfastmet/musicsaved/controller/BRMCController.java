/*
 * Class:           BRMCController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         17/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the BRMCController Class
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
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.service.AlbumService;

@Controller
@RequestMapping("/brmc/")
public class BRMCController 
{
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	public BRMCController(BandRepository bandRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/")
	public String brmcHome(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Home");
		
		return "brmcHomePage";
	}
	
	@GetMapping("/bio/")
	public String brmcBio(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Bio");
		
		return "brmcBioPage";
	}
	
	@GetMapping("/albums/")
	public String brmcAlbums(Model model)
	{
		this.albumService = new AlbumService(bandRepository, albumRepository);
		Set<Album> albums = this.albumService.getAllBrmcAlbums();
		model.addAttribute("albums", albums);
		model.addAttribute("pageTitle", "BRMC Albums");
		
		return "brmcAlbumsPage";
	}
	
	@GetMapping("/media/")
	public String brmcMedia(Model model)
	{
		model.addAttribute("pageTitle", "BRMC Media");
		
		return "brmcMediaPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String brmcAlbum(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.albumService = new AlbumService(albumRepository);
		Album album = this.albumService.getAlbum(albumTitle);
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}