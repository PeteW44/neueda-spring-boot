/*
 * Class:           AlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         17/11/2017
 * Updated:         18/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumService Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;

@Service
public class AlbumService 
{
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	// Default Constructor
	public AlbumService() 
	{
		super();
	}
		
	// Constructor 1
	public AlbumService(BandRepository bandRepository, AlbumRepository albumRepository) 
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}

	// Constructor 2
	public AlbumService(AlbumRepository albumRepository) 
	{
		super();
		this.albumRepository = albumRepository;
	}
	
	// ###################
	// Get All BRMC Albums
	// ###################
	public Set<Album> getAllBrmcAlbums()
	{
		Band band = bandRepository.findByBandName("Black Rebel Motorcycle Club");
		Set<Album> albums;
		albums = (Set<Album>) albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// #########################
	// Get All Pink Floyd Albums
	// #########################
	public Set<Album> getAllPinkFloydAlbums()
	{
		Band band = bandRepository.findByBandName("Pink Floyd");
		Set<Album> albums;
		albums = (Set<Album>) albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// #########################
	// Get All Spacemen 3 Albums
	// #########################
	public Set<Album> getAllSpacemen3Albums()
	{
		Band band = bandRepository.findByBandName("Spacemen 3");
		Set<Album> albums;
		albums = (Set<Album>) albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// ###################
	// Get All Live Albums
	// ###################
	public Set<Album> getAllLiveAlbums()
	{
		Set<Album> albums;
		albums = (Set<Album>) albumRepository.findByIsLiveOrderByReleaseYear(true);
		
		return albums;
	}
	
	// #####################
	// Get All Studio Albums
	// #####################
	public Set<Album> getAllStudioAlbums()
	{
		Set<Album> albums;
		albums = (Set<Album>) albumRepository.findByIsLiveOrderByReleaseYear(false);
		
		return albums;
	}
		
	// ################
	// Get Single Album
	// ################
	public Album getAlbum(String albumTitleLower)
	{
		Album album = albumRepository.findByAlbumTitleLower(albumTitleLower);
		
		return album;
	}
}