/*
 * Class:           BrmcAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the BrmcAlbumService Class
 */

package ac.uk.belfastmet.music.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.music.domain.Album;
import ac.uk.belfastmet.music.domain.Song;

@Service
public class BrmcAlbumService 
{
	// Instance Variables
	private ArrayList<Song> brmcDemos;
	private ArrayList<Song> brmcBlackRebelMotorcycleClub;
	private ArrayList<Song> brmcTakeThemOnOnYourOwn;
	private ArrayList<Song> brmcHowl;
	private ArrayList<Song> brmcBaby81;
	private ArrayList<Song> brmcTheEffectsOf333;
	private ArrayList<Song> brmcBeatTheDevilsTattoo;
	private ArrayList<Song> brmcBrmcSpecterAtTheFeast;
	private ArrayList<Song> brmcLive;
	private ArrayList<Song> brmcLiveInLondon;
	private ArrayList<Song> brmcLiveInParis;
	
	// Default Constructor
	public BrmcAlbumService() 
	{
		super();
	}
	
	// Get All Black Rebel Motorcycle Club Albums
	public ArrayList<Album> getBrmcAlbums()
	{
		// Local Variables
		ArrayList<Album> brmcAlbums = new ArrayList<Album>();
		
		// Add BRMC Albums
		brmcAlbums.add(getBrmcAlbumDemos());
		brmcAlbums.add(getBrmcAlbumBlackRebelMotorcycleClub());
		brmcAlbums.add(getBrmcAlbumTakeThemOnOnYourOwn());
		brmcAlbums.add(getBrmcAlbumHowl());
		brmcAlbums.add(getBrmcAlbumBaby81());
		brmcAlbums.add(getBrmcAlbumLive());
		brmcAlbums.add(getBrmcAlbumTheEffectsOf333());
		brmcAlbums.add(getBrmcAlbumBeatTheDevilsTattoo());
		brmcAlbums.add(getBrmcAlbumLiveInLondon());
		brmcAlbums.add(getBrmcAlbumSpecterAtTheFeast());
		brmcAlbums.add(getBrmcAlbumLiveInParis());

		return brmcAlbums;
	}
	
	// ##########
	// BRMC Demos
	// ##########
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumDemos()
	{
		// Album Cover Image File
		final String brmcDemosCover = "images/albumCovers/BRMC/BRMC-Demos.jpg";
		
		// Get Album Tracks
		ArrayList<Song> brmcDemosAlbumTracks = new ArrayList<Song>();
		brmcDemosAlbumTracks = getBrmcDemosTracks();
		
		// Create Album Object
		Album brmcDemosAlbum = new Album("Black Rebel Motorcycle Club", "Demos", 1999, 13, brmcDemosAlbumTracks, brmcDemosCover);
		
		return brmcDemosAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcDemosTracks()
	{
		// Local Variables
		ArrayList<Song> brmcDemos = new ArrayList<Song>();
		
		// Create BRMC Demo Songs
		Song brmcDemos01 = new Song(1, "Love Burns");
		Song brmcDemos02 = new Song(2, "Too Real");
		Song brmcDemos03 = new Song(3, "Red Eyes And Tears");
		Song brmcDemos04 = new Song(4, "Us Government");
		Song brmcDemos05 = new Song(5, "Evol");
		Song brmcDemos06 = new Song(6, "Suddenly");
		Song brmcDemos07 = new Song(7, "Screaming Gun");
		Song brmcDemos08 = new Song(8, "At My Door");
		Song brmcDemos09 = new Song(9, "White Palms");
		Song brmcDemos10 = new Song(10, "Rifles");
		Song brmcDemos11 = new Song(11, "Down Here");
		Song brmcDemos12 = new Song(12, "Fail-Safe");
		Song brmcDemos13 = new Song(13, "Salvation");
		
		// Add The Songs To ArrayList
		brmcDemos.add(brmcDemos01);
		brmcDemos.add(brmcDemos02);
		brmcDemos.add(brmcDemos03);
		brmcDemos.add(brmcDemos04);
		brmcDemos.add(brmcDemos05);
		brmcDemos.add(brmcDemos06);
		brmcDemos.add(brmcDemos07);
		brmcDemos.add(brmcDemos08);
		brmcDemos.add(brmcDemos09);
		brmcDemos.add(brmcDemos10);
		brmcDemos.add(brmcDemos11);
		brmcDemos.add(brmcDemos12);
		brmcDemos.add(brmcDemos13);
		
		return brmcDemos;
	}
		
	// ################################
	// BRMC Black Rebel Motorcycle Club
	// ################################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumBlackRebelMotorcycleClub()
	{
		// Album Cover Image File
		final String brmcBlackRebelMotorcycleClubCover = "images/albumCovers/BRMC/BRMC-BlackRebelMotorcycleClub.jpg";
		
		// Create Album Object
		Album brmcDemosAlbum = new Album("Black Rebel Motorcycle Club", "BRMC", 2001, 11, getBrmcBlackRebelMotorcycleClubTracks(), brmcBlackRebelMotorcycleClubCover);
		
		return brmcDemosAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcBlackRebelMotorcycleClubTracks()
	{
		// Local Variables
		ArrayList<Song> brmcBlackRebelMotorcycleClub = new ArrayList<Song>();
		
		// Create BRMC Black Rebel Motorcycle Club Songs
		Song brmcBlackRebelMotorcycleClub01 = new Song(1, "Love Burns");
		Song brmcBlackRebelMotorcycleClub02 = new Song(2, "Red Eyes And Tears");
		Song brmcBlackRebelMotorcycleClub03 = new Song(3, "Whatever Happened To My Rock ‘N’ Roll (Punk Song)");
		Song brmcBlackRebelMotorcycleClub04 = new Song(4, "Awake");
		Song brmcBlackRebelMotorcycleClub05 = new Song(5, "White Palms");
		Song brmcBlackRebelMotorcycleClub06 = new Song(6, "As Sure As The Sun");
		Song brmcBlackRebelMotorcycleClub07 = new Song(7, "Rifles");
		Song brmcBlackRebelMotorcycleClub08 = new Song(8, "Too Real");
		Song brmcBlackRebelMotorcycleClub09 = new Song(9, "Spread Your Love");
		Song brmcBlackRebelMotorcycleClub10 = new Song(10, "Head Up High");
		Song brmcBlackRebelMotorcycleClub11 = new Song(11, "Salvation");
		
		// Add The Songs To ArrayList
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub01);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub02);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub03);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub04);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub05);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub06);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub07);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub08);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub09);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub10);
		brmcBlackRebelMotorcycleClub.add(brmcBlackRebelMotorcycleClub11);
		
		return brmcBlackRebelMotorcycleClub;
	}
	
	// #############################
	// BRMC Take Them On On Your Own
	// #############################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumTakeThemOnOnYourOwn()
	{
		// Album Cover Image File
		final String brmcTakeThemOnOnYourOwnCover = "images/albumCovers/BRMC/BRMC-TakeThemOnOnYourOwn.jpg";
		
		// Create Album Object
		Album brmcTakeThemOnOnYourOwnAlbum = new Album("Black Rebel Motorcycle Club", "Take Them On, On Your Own", 2003, 12, getBrmcBlackRebelMotorcycleClubTracks(), brmcTakeThemOnOnYourOwnCover);
		
		return brmcTakeThemOnOnYourOwnAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcTakeThemOnOnYourOwn()
	{
		// Local Variables
		ArrayList<Song> brmcTakeThemOnOnYourOwn = new ArrayList<Song>();
		
		// Create BRMC Take Them On, On Your Own Songs
		Song brmcTakeThemOnOnYourOwn01 = new Song(1, "Stop");
		Song brmcTakeThemOnOnYourOwn02 = new Song(2, "Six Barrel Shotgun");
		Song brmcTakeThemOnOnYourOwn03 = new Song(3, "We’re All In Love");
		Song brmcTakeThemOnOnYourOwn04 = new Song(4, "In Like The Rose");
		Song brmcTakeThemOnOnYourOwn05 = new Song(5, "Ha Ha High Babe");
		Song brmcTakeThemOnOnYourOwn06 = new Song(6, "Generation");
		Song brmcTakeThemOnOnYourOwn07 = new Song(7, "Shade Of Blue");
		Song brmcTakeThemOnOnYourOwn08 = new Song(8, "Us Government");
		Song brmcTakeThemOnOnYourOwn09 = new Song(9, "Suddenly");
		Song brmcTakeThemOnOnYourOwn10 = new Song(10, "Rise Or Fall");
		Song brmcTakeThemOnOnYourOwn11 = new Song(11, "Going Under");
		Song brmcTakeThemOnOnYourOwn12 = new Song(12, "Heart + Soul");
			
		// Add The Songs To ArrayList
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn01);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn02);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn03);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn04);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn05);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn06);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn07);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn08);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn09);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn10);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn11);
		brmcTakeThemOnOnYourOwn.add(brmcTakeThemOnOnYourOwn12);
		
		return brmcTakeThemOnOnYourOwn;
	}
	
	// #########
	// BRMC Howl
	// #########
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumHowl()
	{
		// Album Cover Image File
		final String brmcHowlCover = "images/albumCovers/BRMC/BRMC-Howl.jpg";
		
		// Create Album Object
		Album brmcHowlAlbum = new Album("Black Rebel Motorcycle Club", "Howl", 2005, 14, getBrmcHowlTracks(), brmcHowlCover);
		
		return brmcHowlAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcHowlTracks()
	{
		// Local Variables
		ArrayList<Song> brmcHowl = new ArrayList<Song>();
		
		// Create BRMC Howl Songs
		Song brmcHowl01 = new Song(1, "Shuffle Your Feet");
		Song brmcHowl02 = new Song(2, "Howl");
		Song brmcHowl03 = new Song(3, "Devil’s Waitin’");
		Song brmcHowl04 = new Song(4, "Ain’t No Easy Way");
		Song brmcHowl05 = new Song(5, "Still Suspicion Holds You Tight");
		Song brmcHowl06 = new Song(6, "Fault Line");
		Song brmcHowl07 = new Song(7, "Promise");
		Song brmcHowl08 = new Song(8, "Weight Of The World");
		Song brmcHowl09 = new Song(9, "Restless Sinner");
		Song brmcHowl10 = new Song(10, "Gospel Song");
		Song brmcHowl11 = new Song(11, "Complicated Situation");
		Song brmcHowl12 = new Song(12, "Sympathetic Noise");
		Song brmcHowl13 = new Song(13, "The Line");
		Song brmcHowl14 = new Song(14, "Open Invitation");
				
		// Add The Songs To ArrayList
		brmcHowl.add(brmcHowl01);
		brmcHowl.add(brmcHowl02);
		brmcHowl.add(brmcHowl03);
		brmcHowl.add(brmcHowl04);
		brmcHowl.add(brmcHowl05);
		brmcHowl.add(brmcHowl06);
		brmcHowl.add(brmcHowl07);
		brmcHowl.add(brmcHowl08);
		brmcHowl.add(brmcHowl09);
		brmcHowl.add(brmcHowl10);
		brmcHowl.add(brmcHowl11);
		brmcHowl.add(brmcHowl12);
		brmcHowl.add(brmcHowl13);
		brmcHowl.add(brmcHowl14);
		
		return brmcHowl;
	}
	
	// ############
	// BRMC Baby 81
	// ############
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumBaby81()
	{
		// Album Cover Image File
		final String brmcBaby81Cover = "images/albumCovers/BRMC/BRMC-Baby81.jpg";
		
		// Create Album Object
		Album brmcBaby81Album = new Album("Black Rebel Motorcycle Club", "Baby 81", 2007, 14, getBrmcBaby81Tracks(), brmcBaby81Cover);
		
		return brmcBaby81Album;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcBaby81Tracks()
	{
		// Local Variables
		ArrayList<Song> brmcBaby81 = new ArrayList<Song>();
		
		// Create BRMC Baby 81 Songs
		Song brmcBaby8101 = new Song(1, "Love Burns");
		Song brmcBaby8102 = new Song(2, "Took Out A Loan");
		Song brmcBaby8103 = new Song(3, "Berlin");
		Song brmcBaby8104 = new Song(4, "Weapon Of Choice");
		Song brmcBaby8105 = new Song(5, "Windows");
		Song brmcBaby8106 = new Song(6, "Cold Wind");
		Song brmcBaby8107 = new Song(7, "Not What You Wanted");
		Song brmcBaby8108 = new Song(8, "666 Conducer");
		Song brmcBaby8109 = new Song(9, "All You Do Is Talk");
		Song brmcBaby8110 = new Song(10, "Lien On Your Dreams");
		Song brmcBaby8111 = new Song(11, "Need Some Air");
		Song brmcBaby8112 = new Song(12, "Killing The Light");
		Song brmcBaby8113 = new Song(13, "American X");
		Song brmcBaby8114 = new Song(14, "Am I Only");
				
		// Add The Songs To ArrayList
		brmcBaby81.add(brmcBaby8101);
		brmcBaby81.add(brmcBaby8102);
		brmcBaby81.add(brmcBaby8103);
		brmcBaby81.add(brmcBaby8104);
		brmcBaby81.add(brmcBaby8105);
		brmcBaby81.add(brmcBaby8106);
		brmcBaby81.add(brmcBaby8107);
		brmcBaby81.add(brmcBaby8108);
		brmcBaby81.add(brmcBaby8109);
		brmcBaby81.add(brmcBaby8110);
		brmcBaby81.add(brmcBaby8111);
		brmcBaby81.add(brmcBaby8112);
		brmcBaby81.add(brmcBaby8113);
		brmcBaby81.add(brmcBaby8114);
		
		return brmcBaby81;
	}
	
	// #######################
	// BRMC The Effects Of 333
	// #######################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumTheEffectsOf333()
	{
		// Album Cover Image File
		final String brmcTheEffectsOf333Cover = "images/albumCovers/BRMC/BRMC-TheEffectsOf333.jpg";
		
		// Create Album Object
		Album brmcTheEffectsOf333Album = new Album("Black Rebel Motorcycle Club", "The Effects Of 333", 2009, 10, getBrmcTheEffectsOf333Tracks(), brmcTheEffectsOf333Cover);
		
		return brmcTheEffectsOf333Album;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcTheEffectsOf333Tracks()
	{
		// Local Variables
		ArrayList<Song> brmcTheEffectsOf333 = new ArrayList<Song>();
		
		// Create BRMC The Effects Of 333 Songs
		Song brmcTheEffectsOf33301 = new Song(1, "The Effects Of 333");
		Song brmcTheEffectsOf33302 = new Song(2, "Still No Answer");
		Song brmcTheEffectsOf33303 = new Song(3, "I Know You’re In There");
		Song brmcTheEffectsOf33304 = new Song(4, "And With This Comes");
		Song brmcTheEffectsOf33305 = new Song(5, "A Sad State");
		Song brmcTheEffectsOf33306 = new Song(6, "A Twisted State");
		Song brmcTheEffectsOf33307 = new Song(7, "Sedated With Sterilized Tounges");
		Song brmcTheEffectsOf33308 = new Song(8, "We’re Not Welcome Alone");
		Song brmcTheEffectsOf33309 = new Song(9, "Or Needed");
		Song brmcTheEffectsOf33310 = new Song(10, "And When Was Better");
				
		// Add The Songs To ArrayList
		brmcTheEffectsOf333.add(brmcTheEffectsOf33301);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33302);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33303);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33304);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33305);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33306);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33307);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33308);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33309);
		brmcTheEffectsOf333.add(brmcTheEffectsOf33310);
		
		return brmcTheEffectsOf333;
	}
	
	// ###########################
	// BRMC Beat The Devils Tattoo
	// ###########################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumBeatTheDevilsTattoo()
	{
		// Album Cover Image File
		final String brmcBeatTheDevilsTattooCover = "images/albumCovers/BRMC/BRMC-BeatTheDevilsTattoo.jpg";
		
		// Create Album Object
		Album brmcBeatTheDevilsTattooAlbum = new Album("Black Rebel Motorcycle Club", "Beat The Devils Tattoo", 2010, 13, getBrmcBeatTheDevilsTattooTracks(), brmcBeatTheDevilsTattooCover);
		
		return brmcBeatTheDevilsTattooAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcBeatTheDevilsTattooTracks()
	{
		// Local Variables
		ArrayList<Song> brmcBeatTheDevilsTattoo = new ArrayList<Song>();
		
		// Create BRMC Beat The Devils Tattoo Songs
		Song brmcBeatTheDevilsTattoo01 = new Song(1, "Beat The Devil’s Tattoo");
		Song brmcBeatTheDevilsTattoo02 = new Song(2, "Conscience Killer");
		Song brmcBeatTheDevilsTattoo03 = new Song(3, "Bad Blood");
		Song brmcBeatTheDevilsTattoo04 = new Song(4, "War Machine");
		Song brmcBeatTheDevilsTattoo05 = new Song(5, "Sweet Feeling");
		Song brmcBeatTheDevilsTattoo06 = new Song(6, "Evol");
		Song brmcBeatTheDevilsTattoo07 = new Song(7, "Mama Taught Me Better");
		Song brmcBeatTheDevilsTattoo08 = new Song(8, "River Styx");
		Song brmcBeatTheDevilsTattoo09 = new Song(9, "The Toll");
		Song brmcBeatTheDevilsTattoo10 = new Song(10, "Aya");
		Song brmcBeatTheDevilsTattoo11 = new Song(11, "Shadow’s Keeper");
		Song brmcBeatTheDevilsTattoo12 = new Song(12, "Long Way Down");
		Song brmcBeatTheDevilsTattoo13 = new Song(13, "Half-State");
				
		// Add The Songs To ArrayList
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo01);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo02);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo03);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo04);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo05);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo06);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo07);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo08);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo09);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo10);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo11);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo12);
		brmcBeatTheDevilsTattoo.add(brmcBeatTheDevilsTattoo13);
		
		return brmcBeatTheDevilsTattoo;
	}
	
	// #########################
	// BRMC Specter At The Feast
	// #########################

	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumSpecterAtTheFeast()
	{
		// Album Cover Image File
		final String brmcSpecterAtTheFeastCover = "images/albumCovers/BRMC/BRMC-SpecterAtTheFeast.jpg";
		
		// Create Album Object
		Album brmcSpecterAtTheFeastAlbum = new Album("Black Rebel Motorcycle Club", "SpecterAtTheFeast", 2013, 12, getBrmcSpecterAtTheFeastTracks(), brmcSpecterAtTheFeastCover);
		
		return brmcSpecterAtTheFeastAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcSpecterAtTheFeastTracks()
	{
		// Local Variables
		ArrayList<Song> brmcBrmcSpecterAtTheFeast = new ArrayList<Song>();
		
		// Create BRMC Specter At The Feast Songs
		Song brmcSpecterAtTheFeast01 = new Song(1, "Fire Walker");
		Song brmcSpecterAtTheFeast02 = new Song(2, "Let The Day Begin");
		Song brmcSpecterAtTheFeast03 = new Song(3, "Returning");
		Song brmcSpecterAtTheFeast04 = new Song(4, "Lullaby");
		Song brmcSpecterAtTheFeast05 = new Song(5, "Hate The Taste");
		Song brmcSpecterAtTheFeast06 = new Song(6, "Rival");
		Song brmcSpecterAtTheFeast07 = new Song(7, "Teenage Disease");
		Song brmcSpecterAtTheFeast08 = new Song(8, "Some Kind Of Ghost");
		Song brmcSpecterAtTheFeast09 = new Song(9, "Sometimes The Light");
		Song brmcSpecterAtTheFeast10 = new Song(10, "Funny Games");
		Song brmcSpecterAtTheFeast11 = new Song(11, "Sell It");
		Song brmcSpecterAtTheFeast12 = new Song(12, "Lose Yourself");	
				
		// Add The Songs To ArrayList
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast01);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast02);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast03);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast04);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast05);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast06);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast07);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast08);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast09);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast10);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast11);
		brmcBrmcSpecterAtTheFeast.add(brmcSpecterAtTheFeast12);
		
		return brmcBrmcSpecterAtTheFeast;
	}
	
	// #########
	// BRMC Live
	// #########

	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumLive()
	{
		// Album Cover Image File
		final String brmcLiveCover = "images/albumCovers/BRMC/BRMC-Live.jpg";
		
		// Create Album Object
		Album brmcLiveAlbum = new Album("Black Rebel Motorcycle Club", "Live", 2009, 22, getBrmcLiveTracks(), brmcLiveCover);
		
		return brmcLiveAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcLiveTracks()
	{
		// Local Variables
		ArrayList<Song> brmcLive = new ArrayList<Song>();
		
		// Create BRMC Live Songs
		Song brmcLive01 = new Song(1, "Berlin");
		Song brmcLive02 = new Song(2, "Weapon Of Choice");
		Song brmcLive03 = new Song(3, "Rise Or Fall");
		Song brmcLive04 = new Song(4, "666 Conducer");
		Song brmcLive05 = new Song(5, "Ain’t No Easy Way");
		Song brmcLive06 = new Song(6, "Weight Of The World");
		Song brmcLive07 = new Song(7, "Stop");
		Song brmcLive08 = new Song(8, "All You Do Is Talk");
		Song brmcLive09 = new Song(9, "Red Eyes And Tears");
		Song brmcLive10 = new Song(10, "As Sure As The Sun");
		Song brmcLive11 = new Song(11, "American X");
		Song brmcLive12 = new Song(12, "Spread Your Love");
		Song brmcLive13 = new Song(13, "Love Burns");
		Song brmcLive14 = new Song(14, "Mercy");
		Song brmcLive15 = new Song(15, "Dirty Old Town");
		Song brmcLive16 = new Song(16, "Promise");
		Song brmcLive17 = new Song(17, "Six Barrel Shotgun");
		Song brmcLive18 = new Song(18, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)");
		Song brmcLive19 = new Song(19, "Fault Line");
		Song brmcLive20 = new Song(20, "Took Out A Loan");
		Song brmcLive21 = new Song(21, "The Show Is About To Begin");
		Song brmcLive22 = new Song(22, "Heart And Soul");
		
		// Add The Songs To ArrayList
		brmcLive.add(brmcLive01);
		brmcLive.add(brmcLive02);
		brmcLive.add(brmcLive03);
		brmcLive.add(brmcLive04);
		brmcLive.add(brmcLive05);
		brmcLive.add(brmcLive06);
		brmcLive.add(brmcLive07);
		brmcLive.add(brmcLive08);
		brmcLive.add(brmcLive09);
		brmcLive.add(brmcLive10);
		brmcLive.add(brmcLive11);
		brmcLive.add(brmcLive12);
		brmcLive.add(brmcLive13);
		brmcLive.add(brmcLive14);
		brmcLive.add(brmcLive15);
		brmcLive.add(brmcLive16);
		brmcLive.add(brmcLive17);
		brmcLive.add(brmcLive18);
		brmcLive.add(brmcLive19);
		brmcLive.add(brmcLive20);
		brmcLive.add(brmcLive21);
		brmcLive.add(brmcLive22);
		
		return brmcLive;
	}
	
	// ###################
	// BRMC Live In London
	// ###################

	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumLiveInLondon()
	{
		// Album Cover Image File
		final String brmcLiveInLondonCover = "images/albumCovers/BRMC/BRMC-LiveInLondon.jpg";
		
		// Create Album Object
		Album brmcLiveInLondonAlbum = new Album("Black Rebel Motorcycle Club", "Live", 2010, 20, getBrmcLiveInLondonTracks(), brmcLiveInLondonCover);
		
		return brmcLiveInLondonAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcLiveInLondonTracks()
	{
		// Local Variables
		ArrayList<Song> brmcLiveInLondon = new ArrayList<Song>();
		
		// Create BRMC Live In London Songs
		Song brmcLiveInLondon01 = new Song(1, "Intro");
		Song brmcLiveInLondon02 = new Song(2, "War Machine");
		Song brmcLiveInLondon03 = new Song(3, "Mama Taught Me Better");
		Song brmcLiveInLondon04 = new Song(4, "Red Eyes And Tears");
		Song brmcLiveInLondon05 = new Song(5, "Bad Blood");
		Song brmcLiveInLondon06 = new Song(6, "Beat The Devil’s Tattoo");
		Song brmcLiveInLondon07 = new Song(7, "Shade Of Blue");
		Song brmcLiveInLondon08 = new Song(8, "Ain’t No Easy Way");
		Song brmcLiveInLondon09 = new Song(9, "Aya");
		Song brmcLiveInLondon10 = new Song(10, "Berlin");
		Song brmcLiveInLondon11 = new Song(11, "Weapon Of Choice");
		Song brmcLiveInLondon12 = new Song(12, "Annabel Lee");
		Song brmcLiveInLondon13 = new Song(13, "Awake");
		Song brmcLiveInLondon14 = new Song(14, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)");
		Song brmcLiveInLondon15 = new Song(15, "Conscience Killer");
		Song brmcLiveInLondon16 = new Song(16, "Six Barrel Shotgun");
		Song brmcLiveInLondon17 = new Song(17, "Spread Your Love");
		Song brmcLiveInLondon18 = new Song(18, "Shuffle Your Feet");
		Song brmcLiveInLondon19 = new Song(19, "Shadow’s Keeper");
		Song brmcLiveInLondon20 = new Song(20, "Open Invitation");
		
		// Add The Songs To ArrayList
		brmcLiveInLondon.add(brmcLiveInLondon01);
		brmcLiveInLondon.add(brmcLiveInLondon02);
		brmcLiveInLondon.add(brmcLiveInLondon03);
		brmcLiveInLondon.add(brmcLiveInLondon04);
		brmcLiveInLondon.add(brmcLiveInLondon05);
		brmcLiveInLondon.add(brmcLiveInLondon06);
		brmcLiveInLondon.add(brmcLiveInLondon07);
		brmcLiveInLondon.add(brmcLiveInLondon08);
		brmcLiveInLondon.add(brmcLiveInLondon09);
		brmcLiveInLondon.add(brmcLiveInLondon10);
		brmcLiveInLondon.add(brmcLiveInLondon11);
		brmcLiveInLondon.add(brmcLiveInLondon12);
		brmcLiveInLondon.add(brmcLiveInLondon13);
		brmcLiveInLondon.add(brmcLiveInLondon14);
		brmcLiveInLondon.add(brmcLiveInLondon15);
		brmcLiveInLondon.add(brmcLiveInLondon16);
		brmcLiveInLondon.add(brmcLiveInLondon17);
		brmcLiveInLondon.add(brmcLiveInLondon18);
		brmcLiveInLondon.add(brmcLiveInLondon19);
		brmcLiveInLondon.add(brmcLiveInLondon20);
		
		return brmcLiveInLondon;
	}
	
	// ##################
	// BRMC Live In Paris
	// ##################

	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumLiveInParis()
	{
		// Album Cover Image File
		final String brmcLiveInParisCover = "images/albumCovers/BRMC/BRMC-LiveInParis.jpg";
		
		// Create Album Object
		Album brmcLiveInParisAlbum = new Album("Black Rebel Motorcycle Club", "Live In Paris", 2015, 24, getBrmcLiveInParisTracks(), brmcLiveInParisCover);
		
		return brmcLiveInParisAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcLiveInParisTracks()
	{
		// Local Variables
		ArrayList<Song> brmcLiveInParis = new ArrayList<Song>();
		
		// Create BRMC Live In Paris Songs
		Song brmcLiveInParis01 = new Song(1, "Fire Walker");
		Song brmcLiveInParis02 = new Song(2, "Let The Day Begin");
		Song brmcLiveInParis03 = new Song(3, "Returning");
		Song brmcLiveInParis04 = new Song(4, "Lullaby");
		Song brmcLiveInParis05 = new Song(5, "vHate The Taste");
		Song brmcLiveInParis06 = new Song(6, "Rival");
		Song brmcLiveInParis07 = new Song(7, "Teenage Disease");
		Song brmcLiveInParis08 = new Song(8, "Some Kind Of Ghost");
		Song brmcLiveInParis09 = new Song(9, "Sometimes The Light");
		Song brmcLiveInParis10 = new Song(10, "Funny Games");
		Song brmcLiveInParis11 = new Song(11, "Sell It");
		Song brmcLiveInParis12 = new Song(12, "Lose Yourself");
		Song brmcLiveInParis13 = new Song(13, "Beat The Devil’s Tattoo");
		Song brmcLiveInParis14 = new Song(14, "Ain’t No Easy Way");
		Song brmcLiveInParis15 = new Song(15, "Berlin");
		Song brmcLiveInParis16 = new Song(16, "Conscience Killer");
		Song brmcLiveInParis17 = new Song(17, "Streaming Gun");
		Song brmcLiveInParis18 = new Song(18, "Rifles");
		Song brmcLiveInParis19 = new Song(19, "Stop");
		Song brmcLiveInParis20 = new Song(20, "White Palms");
		Song brmcLiveInParis21 = new Song(21, "Spread Your Love");
		Song brmcLiveInParis22 = new Song(22, "Mercy");
		Song brmcLiveInParis23 = new Song(23, "Shuffle Your Feet");
		Song brmcLiveInParis24 = new Song(24, "Whatever Happened To My Rock ’n’ Roll (Punk Song)");

		
		// Add The Songs To ArrayList
		brmcLiveInParis.add(brmcLiveInParis01);
		brmcLiveInParis.add(brmcLiveInParis02);
		brmcLiveInParis.add(brmcLiveInParis03);
		brmcLiveInParis.add(brmcLiveInParis04);
		brmcLiveInParis.add(brmcLiveInParis05);
		brmcLiveInParis.add(brmcLiveInParis06);
		brmcLiveInParis.add(brmcLiveInParis07);
		brmcLiveInParis.add(brmcLiveInParis08);
		brmcLiveInParis.add(brmcLiveInParis09);
		brmcLiveInParis.add(brmcLiveInParis10);
		brmcLiveInParis.add(brmcLiveInParis11);
		brmcLiveInParis.add(brmcLiveInParis12);
		brmcLiveInParis.add(brmcLiveInParis13);
		brmcLiveInParis.add(brmcLiveInParis14);
		brmcLiveInParis.add(brmcLiveInParis15);
		brmcLiveInParis.add(brmcLiveInParis16);
		brmcLiveInParis.add(brmcLiveInParis17);
		brmcLiveInParis.add(brmcLiveInParis18);
		brmcLiveInParis.add(brmcLiveInParis19);
		brmcLiveInParis.add(brmcLiveInParis20);
		brmcLiveInParis.add(brmcLiveInParis21);
		brmcLiveInParis.add(brmcLiveInParis22);
		brmcLiveInParis.add(brmcLiveInParis23);
		brmcLiveInParis.add(brmcLiveInParis24);
		
		return brmcLiveInParis;
	}
}