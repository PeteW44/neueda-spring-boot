/*
 * Class:           LiveController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         18/11/2017
 * Updated:         18/12/2017 22.00
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
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.service.AlbumService;

@Controller
@RequestMapping("/live/")
public class LiveController 
{
	@Autowired
	private AlbumService albumService;
	
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	public LiveController(BandRepository bandRepository, AlbumRepository albumRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}
	
	@GetMapping("/albums/")
	public String liveAlbums(Model model)
	{
		this.albumService = new AlbumService(bandRepository, albumRepository);
		Set<Album> albums = this.albumService.getAllLiveAlbums();
		model.addAttribute("albums", albums);
		model.addAttribute("pageTitle", "BRMC Albums");
		
		return "liveAlbumsPage";
	}
	
	//###################
	// Dynamic Album Page
	//###################
	
	@RequestMapping("/albums/{albumTitle}")
	public String liveAlbum(@PathVariable("albumTitle") String albumTitle, Model model)
	{
		this.albumService = new AlbumService(albumRepository);
		Album album = this.albumService.getAlbum(albumTitle);
		
		model.addAttribute("album", album);
		model.addAttribute("pageTitle", album.getAlbumTitle());
		
		return "albumPage";
	}
}