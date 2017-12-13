/*
 * Class:           BrmcAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the BrmcAlbumService Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;

@Service
public class BrmcAlbumService 
{
	@Autowired
	AlbumRepository albumRepository;
	
	// Default Constructor
	public BrmcAlbumService(AlbumRepository albumRepository) 
	{
		super();
		this.albumRepository = albumRepository;
	}
	
	// ##############
	// Get BRMC Album
	// ##############
	public Album getBrmcAlbum(String albumTitle)
	{
		Album album = new Album();
		
//		album = albumRepostiory.findByNameOrderByNumber(albumTitle)
		
		switch(albumTitle)
		{
			case "demos":
				album = albumRepository.findOne(1);
				break;
				
			case "brmc":
				album = albumRepository.findOne(2);
				break;
				
			case "takethemononyourown":
				album = albumRepository.findOne(3);
				break;
				
			case "howl":
				album = albumRepository.findOne(4);
				break;

			case "baby81":
				album = albumRepository.findOne(5);
				break;
				
			case "theeffectsof333":
				album = albumRepository.findOne(6);
				break;	

			case "beatthedevilstattoo":
				album = albumRepository.findOne(7);
				break;
				
			case "specteratthefeast":
				album = albumRepository.findOne(8);
				break;
				
			case "wrongcreatures":
				album = albumRepository.findOne(9);
				break;	
				
			case "live":
				album = albumRepository.findOne(10);
				break;
				
			case "liveinlondon":
				album = albumRepository.findOne(11);
				break;
				
			case "liveinparis":
				album = albumRepository.findOne(12);
				break;
				
			case "screaminggun":
				album = albumRepository.findOne(13);
				break;
				
			case "formurder":
				album = albumRepository.findOne(14);
				break;
			
			case "howlsessions":
				album = albumRepository.findOne(15);
				break;
				
			case "americanxbaby81sessions":
				album = albumRepository.findOne(16);
				break;
		}
		
		return album;
	}
}