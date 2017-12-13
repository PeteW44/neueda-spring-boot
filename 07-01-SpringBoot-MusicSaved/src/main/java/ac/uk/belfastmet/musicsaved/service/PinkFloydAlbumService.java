/*
 * Class:           PinkFloydAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydAlbumService Class
 */

package ac.uk.belfastmet.musicsaved.service;
import org.springframework.beans.factory.annotation.Autowired;
// Import Packages
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;

@Service
public class PinkFloydAlbumService 
{
	@Autowired
	AlbumRepository albumRepository;
	
	// Default Constructor
	public PinkFloydAlbumService(AlbumRepository albumRepository) 
	{
		super();
		this.albumRepository = albumRepository;
	}
	
	// ####################
	// Get Pink Floyd Album
	// ####################
	public Album getPinkFloydAlbum(String albumTitle)
	{
		Album album = new Album();
		
		switch(albumTitle)
		{
			case "thepiperatthegatesofdawn":
				album = albumRepository.findOne(23);
				break;
			
			case "asaucerfulofsecrets":
				album = albumRepository.findOne(24);
				break;
			
			case "more":
				album = albumRepository.findOne(25);
				break;
			
			case "ummagumma":
				album = albumRepository.findOne(26);
				break;
				
			case "atomheartmother":
				album = albumRepository.findOne(27);
				break;
				
			case "meddle":
				album = albumRepository.findOne(28);
				break;
				
			case "obscuredbyclouds":
				album = albumRepository.findOne(29);
				break;
				
			case "thedarksideofthemoon":
				album = albumRepository.findOne(30);
				break;
				
			case "wishyouwerehere":
				album = albumRepository.findOne(31);
				break;
				
			case "animals":
				album = albumRepository.findOne(32);
				break;	
				
			case "thewall":
				album = albumRepository.findOne(33);
				break;
				
			case "thefinalcut":
				album = albumRepository.findOne(34);
				break;
				
			case "amomentarylapseofreason":
				album = albumRepository.findOne(35);
				break;
				
			case "delicatesoundofthunder":
				album = albumRepository.findOne(36);
				break;
				
			case "thedivisionbell":
				album = albumRepository.findOne(37);
				break;
				
			case "pulse":
				album = albumRepository.findOne(38);
				break;
				
			case "isthereanybodyouttherethewalllive":
				album = albumRepository.findOne(39);
				break;
				
			case "theendlessriver":
				album = albumRepository.findOne(40);
				break;
		}
		
		return album;
	}
}