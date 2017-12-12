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
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;

@Service
public class BrmcAlbumService 
{
	// Default Constructor
	public BrmcAlbumService() 
	{
		super();
	}
	
	// ##############
	// Get BRMC Album
	// ##############
	public Album getBrmcAlbum(String albumTitle)
	{
		Album album = new Album();
		
		switch(albumTitle)
		{
			case "demos":
				album = getBrmcAlbumDemos();
				break;
			
			case "screaminggun":
				album = getBrmcAlbumScreamingGun();
				break;
			
			case "brmc":
				album = getBrmcAlbumBlackRebelMotorcycleClub();
				break;
			
			case "formurder":
				album = getBrmcAlbumForMurder();
				break;
				
			case "takethemononyourown":
				album = getBrmcAlbumTakeThemOnOnYourOwn();
				break;
				
			case "howl":
				album = getBrmcAlbumHowl();
				break;
				
			case "howlsessions":
				album = getBrmcAlbumHowlSessions();
				break;
				
			case "baby81":
				album = getBrmcAlbumBaby81();
				break;
				
			case "americanxbaby81sessions":
				album = getBrmcAlbumAmericanXBaby81Sessions();
				break;
				
			case "theeffectsof333":
				album = getBrmcAlbumTheEffectsOf333();
				break;	
				
			case "live":
				album = getBrmcAlbumLive();
				break;
				
			case "beatthedevilstattoo":
				album = getBrmcAlbumBeatTheDevilsTattoo();
				break;
				
			case "liveinlondon":
				album = getBrmcAlbumLiveInLondon();
				break;
				
			case "specteratthefeast":
				album = getBrmcAlbumSpecterAtTheFeast();
				break;
				
			case "liveinparis":
				album = getBrmcAlbumLiveInParis();
				break;
				
			case "wrongcreatures":
				album = getBrmcAlbumWrongCreatures();
				break;	
		}
		
		return album;
	}
	
	// ##########
	// BRMC Demos
	// ##########
	private Album getBrmcAlbumDemos()
	{
		// Create Album Object
		Album brmcDemosAlbum = new Album();
		
		return brmcDemosAlbum;
	}
	
	// ################################
	// BRMC Black Rebel Motorcycle Club
	// ################################
	private Album getBrmcAlbumBlackRebelMotorcycleClub()
	{
		// Create Album Object
		Album brmcDemosAlbum = new Album();
		
		return brmcDemosAlbum;
	}
	
	// #############################
	// BRMC Take Them On On Your Own
	// #############################
	private Album getBrmcAlbumTakeThemOnOnYourOwn()
	{
		// Create Album Object
		Album brmcTakeThemOnOnYourOwnAlbum = new Album();
		
		return brmcTakeThemOnOnYourOwnAlbum;
	}
	
	// #########
	// BRMC Howl
	// #########
	private Album getBrmcAlbumHowl()
	{
		// Create Album Object
		Album brmcHowlAlbum = new Album();
		
		return brmcHowlAlbum;
	}
	
	// ############
	// BRMC Baby 81
	// ############
	private Album getBrmcAlbumBaby81()
	{
		// Create Album Object
		Album brmcBaby81Album = new Album();
		
		return brmcBaby81Album;
	}
	
	// #######################
	// BRMC The Effects Of 333
	// #######################
	private Album getBrmcAlbumTheEffectsOf333()
	{
		// Create Album Object
		Album brmcTheEffectsOf333Album = new Album();
		
		return brmcTheEffectsOf333Album;
	}
	
	// ###########################
	// BRMC Beat The Devils Tattoo
	// ###########################
	
	// #####
	// ALBUM
	// #####
	private Album getBrmcAlbumBeatTheDevilsTattoo()
	{
		// Create Album Object
		Album brmcBeatTheDevilsTattooAlbum = new Album();
		
		return brmcBeatTheDevilsTattooAlbum;
	}
	
	// #########################
	// BRMC Specter At The Feast
	// #########################
	private Album getBrmcAlbumSpecterAtTheFeast()
	{
		// Create Album Object
		Album brmcSpecterAtTheFeastAlbum = new Album();
		
		return brmcSpecterAtTheFeastAlbum;
	}
	
	// ####################
	// BRMC Wrong Creatures
	// ####################
	private Album getBrmcAlbumWrongCreatures()
	{
		// Create Album Object
		Album brmcWrongCreaturesAlbum = new Album();
		
		return brmcWrongCreaturesAlbum;
	}
	
	// #########
	// BRMC Live
	// #########
	private Album getBrmcAlbumLive()
	{
		// Create Album Object
		Album brmcLiveAlbum = new Album();
		
		return brmcLiveAlbum;
	}
	
	// ###################
	// BRMC Live In London
	// ###################
	private Album getBrmcAlbumLiveInLondon()
	{
		// Create Album Object
		Album brmcLiveInLondonAlbum = new Album();
		
		return brmcLiveInLondonAlbum;
	}
	
	// ##################
	// BRMC Live In Paris
	// ##################
	private Album getBrmcAlbumLiveInParis()
	{
		// Create Album Object
		Album brmcLiveInParisAlbum = new Album();
		
		return brmcLiveInParisAlbum;
	}
	
	// ##################
	// BRMC Screaming Gun
	// ##################
	private Album getBrmcAlbumScreamingGun()
	{
		// Create Album Object
		Album brmcScreamingGunAlbum = new Album();
		
		return brmcScreamingGunAlbum;
	}
	
	// ##################
	// BRMC ForMurder
	// ##################
	private Album getBrmcAlbumForMurder()
	{
		// Create Album Object
		Album brmcForMurderAlbum = new Album();
		
		return brmcForMurderAlbum;
	}
	
	// ##################
	// BRMC Howl Sessions
	// ##################
	private Album getBrmcAlbumHowlSessions()
	{
		// Create Album Object
		Album brmcHowlSessionsAlbum = new Album();
		
		return brmcHowlSessionsAlbum;
	}
	
	// ################################
	// BRMC American X Baby 81 Sessions
	// ################################
	private Album getBrmcAlbumAmericanXBaby81Sessions()
	{
		// Create Album Object
		Album brmcAmericanXBaby81SessionsAlbum = new Album();
		
		return brmcAmericanXBaby81SessionsAlbum;
	}
}