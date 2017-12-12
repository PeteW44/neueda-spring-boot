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
// Import Packages
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;

@Service
public class PinkFloydAlbumService 
{
	// Default Constructor
	public PinkFloydAlbumService() 
	{
		super();
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
				album = getPinkFloydThePiperAtTheGatesOfDawn();
				break;
			
			case "asaucerfulofsecrets":
				album = getPinkFloydASaucerfulOfSecrets();
				break;
			
			case "more":
				album = getPinkFloydMore();
				break;
			
			case "ummagumma":
				album = getPinkFloydUmmagumma();
				break;
				
			case "atomheartmother":
				album = getPinkFloydAtomHeartMother();
				break;
				
			case "meddle":
				album = getPinkFloydMeddle();
				break;
				
			case "obscuredbyclouds":
				album = getPinkFloydObscuredByClouds();
				break;
				
			case "thedarksideofthemoon":
				album = getPinkFloydTheDarkSideOfTheMoon();
				break;
				
			case "wishyouwerehere":
				album = getPinkFloydWishYouWereHere();
				break;
				
			case "animals":
				album = getPinkFloydAnimals();
				break;	
				
			case "thewall":
				album = getPinkFloydTheWall();
				break;
				
			case "thefinalcut":
				album = getPinkFloydTheFinalCut();
				break;
				
			case "amomentarylapseofreason":
				album = getPinkFloydAMomentaryLapseOfReason();
				break;
				
			case "delicatesoundofthunder":
				album = getPinkFloydDelicateSoundOfThunder();
				break;
				
			case "thedivisionbell":
				album = getPinkFloydTheDivisionBell();
				break;
				
			case "pulse":
				album = getPinkFloydPulse();
				break;
				
			case "isthereanybodyouttherethewalllive":
				album = getPinkFloydIsThereAnybodyOutThereTheWallLive();
				break;
				
			case "theendlessriver":
				album = getPinkFloydTheEndlessRiver();
				break;
		}
		
		return album;
	}
	
	// #########################################
	// Pink Floyd The Piper At The Gates Of Dawn
	// #########################################
	private Album getPinkFloydThePiperAtTheGatesOfDawn()
	{
		// Create Album Object
		Album pinkFloydThePiperAtTheGatesOfDawnAlbum = new Album();
		
		return pinkFloydThePiperAtTheGatesOfDawnAlbum;
	}
	
	// #################################
	// Pink Floyd A Saucerful Of Secrets
	// #################################
	private Album getPinkFloydASaucerfulOfSecrets()
	{
		// Create Album Object
		Album pinkFloydASaucerfulOfSecretsAlbum = new Album();
		
		return pinkFloydASaucerfulOfSecretsAlbum;
	}
	
	// ###############
	// Pink Floyd More
	// ###############
	private Album getPinkFloydMore()
	{
		// Create Album Object
		Album pinkFloydMoreAlbum = new Album();
		
		return pinkFloydMoreAlbum;
	}
	
	// ####################
	// Pink Floyd Ummagumma
	// ####################
	private Album getPinkFloydUmmagumma()
	{
		// Create Album Object
		Album pinkFloydUmmagummaAlbum = new Album();
		
		return pinkFloydUmmagummaAlbum;
	}
	
	// ############################
	// Pink Floyd Atom Heart Mother
	// ############################
	private Album getPinkFloydAtomHeartMother()
	{
		// Create Album Object
		Album pinkFloydAtomHeartMotherAlbum = new Album();
		
		return pinkFloydAtomHeartMotherAlbum;
	}
	
	// #################
	// Pink Floyd Meddle
	// #################
	private Album getPinkFloydMeddle()
	{
		// Create Album Object
		Album pinkFloydMeddleAlbum = new Album();
		
		return pinkFloydMeddleAlbum;
	}
	
	// #############################
	// Pink Floyd Obscured By Clouds
	// #############################
	private Album getPinkFloydObscuredByClouds()
	{
		// Create Album Object
		Album pinkFloydObscuredByCloudsAlbum = new Album();
		
		return pinkFloydObscuredByCloudsAlbum;
	}
	
	// ####################################
	// Pink Floyd The Dark Side Of The Moon
	// ####################################
	private Album getPinkFloydTheDarkSideOfTheMoon()
	{
		// Create Album Object
		Album pinkFloydTheDarkSideOfTheMoonAlbum = new Album();
		
		return pinkFloydTheDarkSideOfTheMoonAlbum;
	}
	
	// #############################
	// Pink Floyd Wish You Were Here
	// #############################
	private Album getPinkFloydWishYouWereHere()
	{
		// Create Album Object
		Album pinkFloydWishYouWereHereAlbum = new Album();
		
		return pinkFloydWishYouWereHereAlbum;
	}
	
	// ##################
	// Pink Floyd Animals
	// ##################
	private Album getPinkFloydAnimals()
	{
		// Create Album Object
		Album pinkFloydAnimalsAlbum = new Album();
		
		return pinkFloydAnimalsAlbum;
	}
	
	// ###################
	// Pink Floyd The Wall
	// ###################
	private Album getPinkFloydTheWall()
	{
		// Create Album Object
		Album pinkFloydTheWallAlbum = new Album();
		
		return pinkFloydTheWallAlbum;
	}
	
	// ########################
	// Pink Floyd The Final Cut
	// ########################
	private Album getPinkFloydTheFinalCut()
	{
		// Create Album Object
		Album pinkFloydTheFinalCutAlbum = new Album();
		
		return pinkFloydTheFinalCutAlbum;
	}
	
	// ######################################
	// Pink Floyd A Momentary Lapse Of Reason
	// ######################################
	private Album getPinkFloydAMomentaryLapseOfReason()
	{
		// Create Album Object
		Album pinkFloydAMomentaryLapseOfReasonAlbum = new Album();
		
		return pinkFloydAMomentaryLapseOfReasonAlbum;
	}
	
	// ####################################
	// Pink Floyd Delicate Sound Of Thunder
	// ####################################
	private Album getPinkFloydDelicateSoundOfThunder()
	{
		// Create Album Object
		Album pinkFloydDelicateSoundOfThunderAlbum = new Album();
		
		return pinkFloydDelicateSoundOfThunderAlbum;
	}
	
	// ############################
	// Pink Floyd The Division Bell
	// ############################
	private Album getPinkFloydTheDivisionBell()
	{
		// Create Album Object
		Album pinkFloydTheDivisionBellAlbum = new Album();
		
		return pinkFloydTheDivisionBellAlbum;
	}
	
	// ################
	// Pink Floyd Pulse
	// ################
	private Album getPinkFloydPulse()
	{
		// Create Album Object
		Album pinkFloydPulseAlbum = new Album();
		
		return pinkFloydPulseAlbum;
	}
	
	// ###################################################
	// Pink Floyd Is There Anybody Out There The Wall Live
	// ###################################################
	private Album getPinkFloydIsThereAnybodyOutThereTheWallLive()
	{
		// Create Album Object
		Album pinkFloydIsThereAnybodyOutThereTheWallLiveAlbum = new Album();
		
		return pinkFloydIsThereAnybodyOutThereTheWallLiveAlbum;
	}
		
	// ############################
	// Pink Floyd The Endless River
	// ############################
	private Album getPinkFloydTheEndlessRiver()
	{
		// Create Album Object
		Album pinkFloydTheEndlessRiverAlbum = new Album();
		
		return pinkFloydTheEndlessRiverAlbum;
	}
}