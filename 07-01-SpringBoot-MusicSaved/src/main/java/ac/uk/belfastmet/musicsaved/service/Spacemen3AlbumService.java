/*
 * Class:           Spacemen3AlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the Spacemen3AlbumService Class
 */

package ac.uk.belfastmet.musicsaved.service;
import org.springframework.beans.factory.annotation.Autowired;
// Import Packages
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;

@Service
public class Spacemen3AlbumService 
{
	@Autowired
	AlbumRepository albumRepository;
	
	// Default Constructor
	public Spacemen3AlbumService(AlbumRepository albumRepository) 
	{
		super();
		this.albumRepository = albumRepository;
	}
	
	// ####################
	// Get Spacemen 3 Album
	// ####################
	public Album getSpacemen3Album(String albumTitle)
	{
		Album album = new Album();
		
		switch(albumTitle)
		{
			case "soundofconfusion":
				album = albumRepository.findOne(17);
				break;
			
			case "theperfectprescription":
				album = albumRepository.findOne(18);
				break;
			
			case "playingwithfire":
				album = albumRepository.findOne(19);
				break;
			
			case "liveineurope1989":
				album = albumRepository.findOne(20);
				break;
				
			case "recurring":
				album = albumRepository.findOne(21);
				break;
				
			case "dreamweapon":
				album = albumRepository.findOne(22);
				break;
		}
		
		return album;
	}
}