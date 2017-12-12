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
// Import Packages
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;

@Service
public class Spacemen3AlbumService 
{
	// Default Constructor
	public Spacemen3AlbumService() 
	{
		super();
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
				album = getSpacemen3AlbumSoundOfConfusion();
				break;
			
			case "theperfectprescription":
				album = getSpacemen3AlbumThePerfectPrescription();
				break;
			
			case "playingwithfire":
				album = getSpacemen3AlbumPlayingWithFire();
				break;
			
			case "liveineurope1989":
				album = getSpacemen3AlbumLiveInEurope1989();
				break;
				
			case "recurring":
				album = getSpacemen3AlbumRecurring();
				break;
				
			case "dreamweapon":
				album = getSpacemen3AlbumDreamweapon();
				break;
		}
		
		return album;
	}
	
	// #############################
	// Spacemen 3 Sound Of Confusion
	// #############################
	private Album getSpacemen3AlbumSoundOfConfusion()
	{
		// Create Album Object
		Album spacemen3SoundOfConfusionAlbum = new Album();
		
		return spacemen3SoundOfConfusionAlbum;
	}
	
	// ###################################
	// Spacemen 3 The Perfect Prescription
	// ###################################
	private Album getSpacemen3AlbumThePerfectPrescription()
	{
		// Create Album Object
		Album spacemen3ThePerfectPrescriptionAlbum = new Album();
		
		return spacemen3ThePerfectPrescriptionAlbum;
	}
	
	// ############################
	// Spacemen 3 Playing With Fire
	// ############################
	private Album getSpacemen3AlbumPlayingWithFire()
	{
		// Create Album Object
		Album spacemen3PlayingWithFireAlbum = new Album();
		
		return spacemen3PlayingWithFireAlbum;
	}
	
	// ##############################
	// Spacemen 3 Live In Europe 1989
	// ##############################
	private Album getSpacemen3AlbumLiveInEurope1989()
	{
		// Create Album Object
		Album spacemen3LiveInEurope1989Album = new Album();
		
		return spacemen3LiveInEurope1989Album;
	}
	
	// ####################
	// Spacemen 3 Recurring
	// ####################
	private Album getSpacemen3AlbumRecurring()
	{
		// Create Album Object
		Album spacemen3RecurringAlbum = new Album();
		
		return spacemen3RecurringAlbum;
	}
	
	// ######################
	// Spacemen 3 Dreamweapon
	// ######################
	private Album getSpacemen3AlbumDreamweapon()
	{
		// Create Album Object
		Album spacemen3DreamweaponAlbum = new Album();
		
		return spacemen3DreamweaponAlbum;
	}
}