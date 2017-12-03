/*
 * Class:           BrmcAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         02/12/2017 18.30
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
	// Default Constructor
	public BrmcAlbumService() 
	{
		super();
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
		final String brmcDemosCover = "images/albumCovers/BRMC/HiRes/BRMC-Demos.jpg";
		
		// Get Album Tracks
		ArrayList<Song> brmcDemosAlbumTracks = new ArrayList<Song>();
		brmcDemosAlbumTracks = getBrmcDemosTracks();
		
		// Create Album Object
		Album brmcDemosAlbum = new Album("Black Rebel Motorcycle Club", "Demos", 1999, brmcDemosAlbumTracks, brmcDemosCover);
		
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
		Song brmcDemos01 = new Song(1, "Love Burns", "3:40");
		Song brmcDemos02 = new Song(2, "Too Real", "4:56");
		Song brmcDemos03 = new Song(3, "Red Eyes And Tears", "4:03");
		Song brmcDemos04 = new Song(4, "Us Government", "3:58");
		Song brmcDemos05 = new Song(5, "Evol", "5:54");
		Song brmcDemos06 = new Song(6, "Suddenly", "5:12");
		Song brmcDemos07 = new Song(7, "Screaming Gun", "4:45");
		Song brmcDemos08 = new Song(8, "At My Door", "3:35");
		Song brmcDemos09 = new Song(9, "White Palms", "4:55");
		Song brmcDemos10 = new Song(10, "Rifles", "5:30");
		Song brmcDemos11 = new Song(11, "Down Here", "3:16");
		Song brmcDemos12 = new Song(12, "Fail-Safe", "4:19");
		Song brmcDemos13 = new Song(13, "Salvation", "13:48");
		
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
		final String brmcBlackRebelMotorcycleClubCover = "images/albumCovers/BRMC/HiRes/BRMC-BlackRebelMotorcycleClub.jpg";
		
		// Create Album Object
		Album brmcDemosAlbum = new Album("Black Rebel Motorcycle Club", "BRMC", 2001, getBrmcBlackRebelMotorcycleClubTracks(), brmcBlackRebelMotorcycleClubCover);
		
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
		Song brmcBlackRebelMotorcycleClub01 = new Song(1, "Love Burns", "4:05");
		Song brmcBlackRebelMotorcycleClub02 = new Song(2, "Red Eyes And Tears", "4:00");
		Song brmcBlackRebelMotorcycleClub03 = new Song(3, "Whatever Happened To My Rock ‘N’ Roll (Punk Song)", "4:38");
		Song brmcBlackRebelMotorcycleClub04 = new Song(4, "Awake", "6:12");
		Song brmcBlackRebelMotorcycleClub05 = new Song(5, "White Palms", "4:55");
		Song brmcBlackRebelMotorcycleClub06 = new Song(6, "As Sure As The Sun", "5:52");
		Song brmcBlackRebelMotorcycleClub07 = new Song(7, "Rifles", "7:04");
		Song brmcBlackRebelMotorcycleClub08 = new Song(8, "Too Real", "4:55");
		Song brmcBlackRebelMotorcycleClub09 = new Song(9, "Spread Your Love", "3:45");
		Song brmcBlackRebelMotorcycleClub10 = new Song(10, "Head Up High", "5:35");
		Song brmcBlackRebelMotorcycleClub11 = new Song(11, "Salvation", "6:06");
		
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
		final String brmcTakeThemOnOnYourOwnCover = "images/albumCovers/BRMC/HiRes/BRMC-TakeThemOnOnYourOwn.jpg";
		
		// Create Album Object
		Album brmcTakeThemOnOnYourOwnAlbum = new Album("Black Rebel Motorcycle Club", "Take Them On, On Your Own", 2003, getBrmcBlackRebelMotorcycleClubTracks(), brmcTakeThemOnOnYourOwnCover);
		
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
		Song brmcTakeThemOnOnYourOwn01 = new Song(1, "Stop", "4:37");
		Song brmcTakeThemOnOnYourOwn02 = new Song(2, "Six Barrel Shotgun", "3:05");
		Song brmcTakeThemOnOnYourOwn03 = new Song(3, "We’re All In Love", "3:38");
		Song brmcTakeThemOnOnYourOwn04 = new Song(4, "In Like The Rose", "5:22");
		Song brmcTakeThemOnOnYourOwn05 = new Song(5, "Ha Ha High Babe", "4:13");
		Song brmcTakeThemOnOnYourOwn06 = new Song(6, "Generation", "5:01");
		Song brmcTakeThemOnOnYourOwn07 = new Song(7, "Shade Of Blue", "4:22");
		Song brmcTakeThemOnOnYourOwn08 = new Song(8, "Us Government", "5:31");
		Song brmcTakeThemOnOnYourOwn09 = new Song(9, "Suddenly", "3:52");
		Song brmcTakeThemOnOnYourOwn10 = new Song(10, "Rise Or Fall", "4:56");
		Song brmcTakeThemOnOnYourOwn11 = new Song(11, "Going Under", "3:56");
		Song brmcTakeThemOnOnYourOwn12 = new Song(12, "Heart + Soul", "7:15");
			
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
		final String brmcHowlCover = "images/albumCovers/BRMC/HiRes/BRMC-Howl.jpg";
		
		// Create Album Object
		Album brmcHowlAlbum = new Album("Black Rebel Motorcycle Club", "Howl", 2005, getBrmcHowlTracks(), brmcHowlCover);
		
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
		Song brmcHowl01 = new Song(1, "Shuffle Your Feet", "2:54");
		Song brmcHowl02 = new Song(2, "Howl", "4:21");
		Song brmcHowl03 = new Song(3, "Devil’s Waitin’", " 3:50 ");
		Song brmcHowl04 = new Song(4, "Ain’t No Easy Way", "2:36");
		Song brmcHowl05 = new Song(5, "Still Suspicion Holds You Tight", "4:24");
		Song brmcHowl06 = new Song(6, "Fault Line", "2:57");
		Song brmcHowl07 = new Song(7, "Promise", "4:46");
		Song brmcHowl08 = new Song(8, "Weight Of The World", "3:41");
		Song brmcHowl09 = new Song(9, "Restless Sinner", "3:12");
		Song brmcHowl10 = new Song(10, "Gospel Song", "4:31");
		Song brmcHowl11 = new Song(11, "Complicated Situation", "2:36");
		Song brmcHowl12 = new Song(12, "Sympathetic Noise", "4:17");
		Song brmcHowl13 = new Song(13, "The Line", "4:55");
		Song brmcHowl14 = new Song(14, "Open Invitation", "3:04");
				
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
		final String brmcBaby81Cover = "images/albumCovers/BRMC/HiRes/BRMC-Baby81.jpg";
		
		// Create Album Object
		Album brmcBaby81Album = new Album("Black Rebel Motorcycle Club", "Baby 81", 2007, getBrmcBaby81Tracks(), brmcBaby81Cover);
		
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
		Song brmcBaby8101 = new Song(1, "Took Out A Loan", "4:16");
		Song brmcBaby8102 = new Song(2, "Berlin", "3:11");
		Song brmcBaby8103 = new Song(3, "Weapon Of Choice", "2:50");
		Song brmcBaby8104 = new Song(4, "Windows", "6:06");
		Song brmcBaby8105 = new Song(5, "Cold Wind", "4:18");
		Song brmcBaby8106 = new Song(6, "Not What You Wanted", "3:43");
		Song brmcBaby8107 = new Song(7, "666 Conducer", "4:01");
		Song brmcBaby8108 = new Song(8, "All You Do Is Talk", "5:42");
		Song brmcBaby8109 = new Song(9, "Lien On Your Dreams", "4:36");
		Song brmcBaby8110 = new Song(10, "Need Some Air", "4:04");
		Song brmcBaby8111 = new Song(11, "Killing The Light", "3:55");
		Song brmcBaby8112 = new Song(12, "American X", "9:11");
		Song brmcBaby8113 = new Song(13, "Am I Only", "4:26");
		
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
		final String brmcTheEffectsOf333Cover = "images/albumCovers/BRMC/HiRes/BRMC-TheEffectsOf333.jpg";
		
		// Create Album Object
		Album brmcTheEffectsOf333Album = new Album("Black Rebel Motorcycle Club", "The Effects Of 333", 2009, getBrmcTheEffectsOf333Tracks(), brmcTheEffectsOf333Cover);
		
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
		Song brmcTheEffectsOf33301 = new Song(1, "The Effects Of 333", "3:33");
		Song brmcTheEffectsOf33302 = new Song(2, "Still No Answer", "5:11");
		Song brmcTheEffectsOf33303 = new Song(3, "I Know You’re In There", "5:41");
		Song brmcTheEffectsOf33304 = new Song(4, "And With This Comes", "5:55 ");
		Song brmcTheEffectsOf33305 = new Song(5, "A Sad State", "5:01 ");
		Song brmcTheEffectsOf33306 = new Song(6, "A Twisted State", "4:07");
		Song brmcTheEffectsOf33307 = new Song(7, "Sedated With Sterilized Tounges", "6:37");
		Song brmcTheEffectsOf33308 = new Song(8, "We’re Not Welcome Alone", "7:19 ");
		Song brmcTheEffectsOf33309 = new Song(9, "Or Needed", "4:38");
		Song brmcTheEffectsOf33310 = new Song(10, "And When Was Better", "7:00");
				
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
		final String brmcBeatTheDevilsTattooCover = "images/albumCovers/BRMC/HiRes/BRMC-BeatTheDevilsTattoo.jpg";
		
		// Create Album Object
		Album brmcBeatTheDevilsTattooAlbum = new Album("Black Rebel Motorcycle Club", "Beat The Devils Tattoo", 2010, getBrmcBeatTheDevilsTattooTracks(), brmcBeatTheDevilsTattooCover);
		
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
		Song brmcBeatTheDevilsTattoo01 = new Song(1, "Beat The Devil’s Tattoo", "3:48");
		Song brmcBeatTheDevilsTattoo02 = new Song(2, "Conscience Killer", "3:47");
		Song brmcBeatTheDevilsTattoo03 = new Song(3, "Bad Blood", "5:11");
		Song brmcBeatTheDevilsTattoo04 = new Song(4, "War Machine", "3:59");
		Song brmcBeatTheDevilsTattoo05 = new Song(5, "Sweet Feeling", "3:27");
		Song brmcBeatTheDevilsTattoo06 = new Song(6, "Evol", "5:54");
		Song brmcBeatTheDevilsTattoo07 = new Song(7, "Mama Taught Me Better", "4:46");
		Song brmcBeatTheDevilsTattoo08 = new Song(8, "River Styx", "3:56");
		Song brmcBeatTheDevilsTattoo09 = new Song(9, "The Toll", "3:39");
		Song brmcBeatTheDevilsTattoo10 = new Song(10, "Aya", "5:39");
		Song brmcBeatTheDevilsTattoo11 = new Song(11, "Shadow’s Keeper", "6:12");
		Song brmcBeatTheDevilsTattoo12 = new Song(12, "Long Way Down", "4:35");
		Song brmcBeatTheDevilsTattoo13 = new Song(13, "Half-State", "10:20 ");
				
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
		final String brmcSpecterAtTheFeastCover = "images/albumCovers/BRMC/HiRes/BRMC-SpecterAtTheFeast.jpg";
		
		// Create Album Object
		Album brmcSpecterAtTheFeastAlbum = new Album("Black Rebel Motorcycle Club", "Specter At The Feast", 2013, getBrmcSpecterAtTheFeastTracks(), brmcSpecterAtTheFeastCover);
		
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
		Song brmcSpecterAtTheFeast01 = new Song(1, "Fire Walker", "6:23");
		Song brmcSpecterAtTheFeast02 = new Song(2, "Let The Day Begin", " 	4:06");
		Song brmcSpecterAtTheFeast03 = new Song(3, "Returning", "5:34");
		Song brmcSpecterAtTheFeast04 = new Song(4, "Lullaby", "4:36");
		Song brmcSpecterAtTheFeast05 = new Song(5, "Hate The Taste", "3:50");
		Song brmcSpecterAtTheFeast06 = new Song(6, "Rival", "3:37");
		Song brmcSpecterAtTheFeast07 = new Song(7, "Teenage Disease", "3:22");
		Song brmcSpecterAtTheFeast08 = new Song(8, "Some Kind Of Ghost", "3:51");
		Song brmcSpecterAtTheFeast09 = new Song(9, "Sometimes The Light", "3:20");
		Song brmcSpecterAtTheFeast10 = new Song(10, "Funny Games", "4:38");
		Song brmcSpecterAtTheFeast11 = new Song(11, "Sell It", "6:46");
		Song brmcSpecterAtTheFeast12 = new Song(12, "Lose Yourself", "8:39");	
				
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
	
	// ####################
	// BRMC Wrong Creatures
	// ####################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumWrongCreatures()
	{
		// Album Cover Image File
		final String brmcWrongCreaturesCover = "images/albumCovers/BRMC/HiRes/BRMC-WrongCreatures.jpg";
		
		// Create Album Object
		Album brmcWrongCreaturesAlbum = new Album("Black Rebel Motorcycle Club", "Wrong Creatures", 2018, getBrmcWrongCreaturesTracks(), brmcWrongCreaturesCover);
		
		return brmcWrongCreaturesAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcWrongCreaturesTracks()
	{
		// Local Variables
		ArrayList<Song> brmcWrongCreatures = new ArrayList<Song>();
		
		// Create BRMC Wrong Creatures Songs
		Song brmcWrongCreatures01 = new Song(1, "DFF", "N/A");
		Song brmcWrongCreatures02 = new Song(2, "Spook", "N/A");
		Song brmcWrongCreatures03 = new Song(3, "King Of Bones", "3:56");
		Song brmcWrongCreatures04 = new Song(4, "Haunt", "5:50");
		Song brmcWrongCreatures05 = new Song(5, "Echo", "N/A");
		Song brmcWrongCreatures06 = new Song(6, "Ninth Configuration", "N/A");
		Song brmcWrongCreatures07 = new Song(7, "Question Of Faith", "5:19");
		Song brmcWrongCreatures08 = new Song(8, "Calling Them All Away", "N/A");
		Song brmcWrongCreatures09 = new Song(9, "Little Thing Gone Wild", "3:19");
		Song brmcWrongCreatures10 = new Song(10, "Circus Bazooko", "N/A");
		Song brmcWrongCreatures11 = new Song(11, "Carried From The Start", "N/A");
		Song brmcWrongCreatures12 = new Song(12, "All Rise", "N/A");
		
		// Add The Songs To ArrayList
		brmcWrongCreatures.add(brmcWrongCreatures01);
		brmcWrongCreatures.add(brmcWrongCreatures02);
		brmcWrongCreatures.add(brmcWrongCreatures03);
		brmcWrongCreatures.add(brmcWrongCreatures04);
		brmcWrongCreatures.add(brmcWrongCreatures05);
		brmcWrongCreatures.add(brmcWrongCreatures06);
		brmcWrongCreatures.add(brmcWrongCreatures07);
		brmcWrongCreatures.add(brmcWrongCreatures08);
		brmcWrongCreatures.add(brmcWrongCreatures09);
		brmcWrongCreatures.add(brmcWrongCreatures10);
		brmcWrongCreatures.add(brmcWrongCreatures11);
		brmcWrongCreatures.add(brmcWrongCreatures12);
		
		return brmcWrongCreatures;
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
		final String brmcLiveCover = "images/albumCovers/BRMC/HiRes/BRMC-Live.jpg";
		
		// Create Album Object
		Album brmcLiveAlbum = new Album("Black Rebel Motorcycle Club", "Live", 2009, getBrmcLiveTracks(), brmcLiveCover);
		
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
		Song brmcLive01 = new Song(1, "Intro", "2:31");
		Song brmcLive02 = new Song(2, "Berlin", "3:40");
		Song brmcLive03 = new Song(3, "Weapon Of Choice", "2:52");
		Song brmcLive04 = new Song(4, "Rise Or Fall", "3:55");
		Song brmcLive05 = new Song(5, "666 Conducer", "6:08");
		Song brmcLive06 = new Song(6, "Ain’t No Easy Way", "3:59");
		Song brmcLive07 = new Song(7, "Weight Of The World", "4:16");
		Song brmcLive08 = new Song(8, "Stop", "4:53");
		Song brmcLive09 = new Song(9, "All You Do Is Talk", "5:38");
		Song brmcLive10 = new Song(10, "Red Eyes And Tears", "4:13");
		Song brmcLive11 = new Song(11, "As Sure As The Sun", "6:18");
		Song brmcLive12 = new Song(12, "American X", "9:37");
		Song brmcLive13 = new Song(13, "Spread Your Love", "4:05");
		Song brmcLive14 = new Song(14, "Love Burns", "3:25");
		Song brmcLive15 = new Song(15, "Mercy", "5:51");
		Song brmcLive16 = new Song(16, "Dirty Old Town", "3:09");
		Song brmcLive17 = new Song(17, "Promise", "7:13");
		Song brmcLive18 = new Song(18, "Six Barrel Shotgun", "6:18");
		Song brmcLive19 = new Song(19, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)", "5:00");
		Song brmcLive20 = new Song(20, "Fault Line", "3:50");
		Song brmcLive21 = new Song(21, "Took Out A Loan", "6:33");
		Song brmcLive22 = new Song(22, "The Show Is About To Begin", "7:29");
		Song brmcLive23 = new Song(23, "Heart And Soul", "10:43");
		Song brmcLive24 = new Song(23, "I Am Only", "4:35");
		
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
		brmcLive.add(brmcLive23);
		brmcLive.add(brmcLive24);
		
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
		final String brmcLiveInLondonCover = "images/albumCovers/BRMC/HiRes/BRMC-LiveInLondon.jpg";
		
		// Create Album Object
		Album brmcLiveInLondonAlbum = new Album("Black Rebel Motorcycle Club", "Live", 2010, getBrmcLiveInLondonTracks(), brmcLiveInLondonCover);
		
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
		Song brmcLiveInLondon01 = new Song(1, "Intro", "1:06");
		Song brmcLiveInLondon02 = new Song(2, "War Machine", "4:01");
		Song brmcLiveInLondon03 = new Song(3, "Mama Taught Me Better", "4:26");
		Song brmcLiveInLondon04 = new Song(4, "Red Eyes And Tears", "7:08");
		Song brmcLiveInLondon05 = new Song(5, "Bad Blood", "5:41");
		Song brmcLiveInLondon06 = new Song(6, "Beat The Devil’s Tattoo", "5:07");
		Song brmcLiveInLondon07 = new Song(7, "Shade Of Blue", "4:36");
		Song brmcLiveInLondon08 = new Song(8, "Ain’t No Easy Way", "4:05");
		Song brmcLiveInLondon09 = new Song(9, "Aya", "5:29");
		Song brmcLiveInLondon10 = new Song(10, "Berlin", "3:38");
		Song brmcLiveInLondon11 = new Song(11, "Weapon Of Choice", "3:52");
		Song brmcLiveInLondon12 = new Song(12, "Annabel Lee", "4:21");
		Song brmcLiveInLondon13 = new Song(13, "Awake", "7:02");
		Song brmcLiveInLondon14 = new Song(14, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)", "6:31");
		Song brmcLiveInLondon15 = new Song(15, "Conscience Killer", "3:45");
		Song brmcLiveInLondon16 = new Song(16, "Six Barrel Shotgun", "5:58");
		Song brmcLiveInLondon17 = new Song(17, "Spread Your Love", "4:31");
		Song brmcLiveInLondon18 = new Song(18, "Shuffle Your Feet", "3:42");
		Song brmcLiveInLondon19 = new Song(19, "Shadow’s Keeper", "8:08");
		Song brmcLiveInLondon20 = new Song(20, "Open Invitation", "10:02");
		
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
		final String brmcLiveInParisCover = "images/albumCovers/BRMC/HiRes/BRMC-LiveInParis.jpg";
		
		// Create Album Object
		Album brmcLiveInParisAlbum = new Album("Black Rebel Motorcycle Club", "Live In Paris", 2015, getBrmcLiveInParisTracks(), brmcLiveInParisCover);
		
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
		Song brmcLiveInParis01 = new Song(1, "Fire Walker", "6:36");
		Song brmcLiveInParis02 = new Song(2, "Let The Day Begin", "4:56");
		Song brmcLiveInParis03 = new Song(3, "Returning", "6:07");
		Song brmcLiveInParis04 = new Song(4, "Lullaby", "6:19");
		Song brmcLiveInParis05 = new Song(5, "vHate The Taste", "4:18");
		Song brmcLiveInParis06 = new Song(6, "Rival", "4:07");
		Song brmcLiveInParis07 = new Song(7, "Teenage Disease", "4:27");
		Song brmcLiveInParis08 = new Song(8, "Some Kind Of Ghost", "4:47");
		Song brmcLiveInParis09 = new Song(9, "Sometimes The Light", "3:17");
		Song brmcLiveInParis10 = new Song(10, "Funny Games", "5:28");
		Song brmcLiveInParis11 = new Song(11, "Sell It", "3:20");
		Song brmcLiveInParis12 = new Song(12, "Lose Yourself", "8:11");
		Song brmcLiveInParis13 = new Song(13, "Beat The Devil’s Tattoo", "5:48");
		Song brmcLiveInParis14 = new Song(14, "Ain’t No Easy Way", "3:20");
		Song brmcLiveInParis15 = new Song(15, "Berlin", "3:22");
		Song brmcLiveInParis16 = new Song(16, "Conscience Killer", "4:29");
		Song brmcLiveInParis17 = new Song(17, "Streaming Gun", "5:25");
		Song brmcLiveInParis18 = new Song(18, "Rifles", "5:11");
		Song brmcLiveInParis19 = new Song(19, "Stop", "4:59");
		Song brmcLiveInParis20 = new Song(20, "White Palms", "6:35");
		Song brmcLiveInParis21 = new Song(21, "Spread Your Love", "7:59");
		Song brmcLiveInParis22 = new Song(22, "Mercy", "6:22");
		Song brmcLiveInParis23 = new Song(23, "Shuffle Your Feet", "2:44");
		Song brmcLiveInParis24 = new Song(24, "Whatever Happened To My Rock ’n’ Roll (Punk Song)", "6:39");

		
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
	
	// ##################
	// BRMC Screaming Gun
	// ##################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumScreamingGun()
	{
		// Album Cover Image File
		final String brmcScreamingGunCover = "images/albumCovers/BRMC/HiRes/BRMC-ScreamingGun.jpg";
		
		// Create Album Object
		Album brmcScreamingGunAlbum = new Album("Black Rebel Motorcycle Club", "Screaming Gun", 2001, getBrmcScreamingGunTracks(), brmcScreamingGunCover);
		
		return brmcScreamingGunAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcScreamingGunTracks()
	{
		// Local Variables
		ArrayList<Song> brmcScreamingGun = new ArrayList<Song>();
		
		// Create BRMC Howl Sessions Songs
		Song brmcScreamingGun01 = new Song(1, "Failsafe", "3:45");
		Song brmcScreamingGun02 = new Song(2, "Down Here", "3:13");
		Song brmcScreamingGun03 = new Song(3, "At My Door", "3:33");
		Song brmcScreamingGun04 = new Song(4, "Screaming Gun", "4:44");
		Song brmcScreamingGun05 = new Song(5, "T.V. Loop (Deep Down)", "5:10");
				
		// Add The Songs To ArrayList
		brmcScreamingGun.add(brmcScreamingGun01);
		brmcScreamingGun.add(brmcScreamingGun02);
		brmcScreamingGun.add(brmcScreamingGun03);
		brmcScreamingGun.add(brmcScreamingGun04);
		brmcScreamingGun.add(brmcScreamingGun05);

		return brmcScreamingGun;
	}
	
	// ##################
	// BRMC ForMurder
	// ##################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumForMurder()
	{
		// Album Cover Image File
		final String brmcForMurderCover = "images/albumCovers/BRMC/HiRes/BRMC-ForMurder.jpg";
		
		// Create Album Object
		Album brmcForMurderAlbum = new Album("Black Rebel Motorcycle Club", "For Murder", 2004, getBrmcForMurderTracks(), brmcForMurderCover);
		
		return brmcForMurderAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcForMurderTracks()
	{
		// Local Variables
		ArrayList<Song> brmcForMurder = new ArrayList<Song>();
		
		// Create BRMC Howl Sessions Songs
		Song brmcForMurder01 = new Song(1, "Take Them On, On Your Own", "5:29");
		Song brmcForMurder02 = new Song(2, "I Told You", "4:16");
		Song brmcForMurder03 = new Song(3, "Going Under", "3:19");
		Song brmcForMurder04 = new Song(4, "Ha Ha High Babe", "4:19");
		Song brmcForMurder05 = new Song(5, "Tonight's With You", "3:35");
		Song brmcForMurder06 = new Song(5, "For Murder", "3:59");
		Song brmcForMurder07 = new Song(5, "Waiting Here", "3:53");
		Song brmcForMurder08 = new Song(5, "The Weight Is More", "3:24");
		Song brmcForMurder09 = new Song(5, "In Like the Rose", "5:28");
		Song brmcForMurder10 = new Song(5, "Abstract Dragon", "13:40");
		Song brmcForMurder11 = new Song(5, "And I'm Aching", "3:56");
		Song brmcForMurder12 = new Song(5, "Pretend ", "3:06");
				
		// Add The Songs To ArrayList
		brmcForMurder.add(brmcForMurder01);
		brmcForMurder.add(brmcForMurder02);
		brmcForMurder.add(brmcForMurder03);
		brmcForMurder.add(brmcForMurder04);
		brmcForMurder.add(brmcForMurder05);
		brmcForMurder.add(brmcForMurder06);
		brmcForMurder.add(brmcForMurder07);
		brmcForMurder.add(brmcForMurder08);
		brmcForMurder.add(brmcForMurder09);
		brmcForMurder.add(brmcForMurder10);
		brmcForMurder.add(brmcForMurder11);
		brmcForMurder.add(brmcForMurder12);

		return brmcForMurder;
	}
	
	// ##################
	// BRMC Howl Sessions
	// ##################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumHowlSessions()
	{
		// Album Cover Image File
		final String brmcHowlSessionsCover = "images/albumCovers/BRMC/HiRes/BRMC-HowlSessions.jpg";
		
		// Create Album Object
		Album brmcHowlSessionsAlbum = new Album("Black Rebel Motorcycle Club", "Howl Sessions", 2005, getBrmcHowlSessionsTracks(), brmcHowlSessionsCover);
		
		return brmcHowlSessionsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcHowlSessionsTracks()
	{
		// Local Variables
		ArrayList<Song> brmcHowlSessions = new ArrayList<Song>();
		
		// Create BRMC Howl Sessions Songs
		Song brmcHowlSessions01 = new Song(1, "Grind My Bones", "3:44");
		Song brmcHowlSessions02 = new Song(2, "Mercy", "4:34");
		Song brmcHowlSessions03 = new Song(3, "Wishing Well", "2:13");
		Song brmcHowlSessions04 = new Song(4, "Steal A Ride", "2:39");
		Song brmcHowlSessions05 = new Song(5, "Feel It Now", "3:04");
		Song brmcHowlSessions06 = new Song(6, "Pretend", "3:03");
				
		// Add The Songs To ArrayList
		brmcHowlSessions.add(brmcHowlSessions01);
		brmcHowlSessions.add(brmcHowlSessions02);
		brmcHowlSessions.add(brmcHowlSessions03);
		brmcHowlSessions.add(brmcHowlSessions04);
		brmcHowlSessions.add(brmcHowlSessions05);
		brmcHowlSessions.add(brmcHowlSessions06);

		return brmcHowlSessions;
	}
	
	// ################################
	// BRMC American X Baby 81 Sessions
	// ################################
	
	// #####
	// ALBUM
	// #####
	public Album getBrmcAlbumAmericanXBaby81Sessions()
	{
		// Album Cover Image File
		final String brmcAmericanXBaby81SessionsCover = "images/albumCovers/BRMC/HiRes/BRMC-AmericanXBaby81Sessions.jpg";
		
		// Create Album Object
		Album brmcAmericanXBaby81SessionsAlbum = new Album("Black Rebel Motorcycle Club", "American X Baby 81 Sessions", 2007, getBrmcAlbumAmericanXBaby81SessionsTracks(), brmcAmericanXBaby81SessionsCover);
		
		return brmcAmericanXBaby81SessionsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getBrmcAlbumAmericanXBaby81SessionsTracks()
	{
		// Local Variables
		ArrayList<Song> brmcAmericanXBaby81Sessions = new ArrayList<Song>();
		
		// Create BRMC American X Baby 81 Sessions Songs
		Song brmcAmericanXBaby81Sessions01 = new Song(1, "The Likes Of You", "5:11");
		Song brmcAmericanXBaby81Sessions02 = new Song(2, "Vision", "5:01");
		Song brmcAmericanXBaby81Sessions03 = new Song(3, "The Show's About To Begin", "5:02");
		Song brmcAmericanXBaby81Sessions04 = new Song(4, "MK Ultra", "4:25");
		Song brmcAmericanXBaby81Sessions05 = new Song(5, "Whenever You're Ready", "3:12");
		Song brmcAmericanXBaby81Sessions06 = new Song(6, "20 Hours", "5:04");
		Song brmcAmericanXBaby81Sessions07 = new Song(7, "Last Chance For Love", "4:01");
		
		// Add The Songs To ArrayList
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions01);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions02);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions03);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions04);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions05);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions06);
		brmcAmericanXBaby81Sessions.add(brmcAmericanXBaby81Sessions07);
		
		return brmcAmericanXBaby81Sessions;
	}
}