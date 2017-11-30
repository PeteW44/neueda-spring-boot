/*
 * Class:           SongService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the SongService Class
 */

package ac.uk.belfastmet.service;
// Import Packages
import java.util.ArrayList;
import ac.uk.belfastmet.domain.Song;

public class SongService 
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
	public SongService() 
	{
		super();
	}
	
	// ##########
	// BRMC Demos
	// ##########
	public ArrayList<Song> getBrmcDemos()
	{
		// Local Variables
		ArrayList<Song> brmcDemos = new ArrayList<Song>();
		
		// Create BRMC Demo Songs
		Song brmcDemos01 = new Song(1, "Love Burns", "Demos");
		Song brmcDemos02 = new Song(2, "Too Real", "Demos");
		Song brmcDemos03 = new Song(3, "Red Eyes And Tears", "Demos");
		Song brmcDemos04 = new Song(4, "Us Government", "Demos");
		Song brmcDemos05 = new Song(5, "Evol", "Demos");
		Song brmcDemos06 = new Song(6, "Suddenly", "Demos");
		Song brmcDemos07 = new Song(7, "Screaming Gun", "Demos");
		Song brmcDemos08 = new Song(8, "At My Door", "Demos");
		Song brmcDemos09 = new Song(9, "White Palms", "Demos");
		Song brmcDemos10 = new Song(10, "Rifles", "Demos");
		Song brmcDemos11 = new Song(11, "Down Here", "Demos");
		Song brmcDemos12 = new Song(12, "Fail-Safe", "Demos");
		Song brmcDemos13 = new Song(13, "Salvation", "Demos");
		
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
	public ArrayList<Song> getBrmcBlackRebelMotorcycleClub()
	{
		// Local Variables
		ArrayList<Song> brmcBlackRebelMotorcycleClub = new ArrayList<Song>();
		
		// Create BRMC Black Rebel Motorcycle Club Songs
		Song brmcBlackRebelMotorcycleClub01 = new Song(1, "Love Burns", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub02 = new Song(2, "Red Eyes And Tears", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub03 = new Song(3, "Whatever Happened To My Rock ‘N’ Roll (Punk Song)", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub04 = new Song(4, "Awake", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub05 = new Song(5, "White Palms", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub06 = new Song(6, "As Sure As The Sun", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub07 = new Song(7, "Rifles", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub08 = new Song(8, "Too Real", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub09 = new Song(9, "Spread Your Love", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub10 = new Song(10, "Head Up High", "Black Rebel Motorcycle Club");
		Song brmcBlackRebelMotorcycleClub11 = new Song(11, "Salvation", "Black Rebel Motorcycle Club");
		
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
	public ArrayList<Song> getBrmcTakeThemOnOnYourOwn()
	{
		// Local Variables
		ArrayList<Song> brmcTakeThemOnOnYourOwn = new ArrayList<Song>();
		
		// Create BRMC Take Them On, On Your Own Songs
		Song brmcTakeThemOnOnYourOwn01 = new Song(1, "Stop", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn02 = new Song(2, "Six Barrel Shotgun", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn03 = new Song(3, "We’re All In Love", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn04 = new Song(4, "In Like The Rose", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn05 = new Song(5, "Ha Ha High Babe", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn06 = new Song(6, "Generation", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn07 = new Song(7, "Shade Of Blue", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn08 = new Song(8, "Us Government", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn09 = new Song(9, "Suddenly", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn10 = new Song(10, "Rise Or Fall", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn11 = new Song(11, "Going Under", "Take Them On, On Your Own");
		Song brmcTakeThemOnOnYourOwn12 = new Song(12, "Heart + Soul", "Take Them On, On Your Own");
		
				
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
	public ArrayList<Song> getBrmcHowl()
	{
		// Local Variables
		ArrayList<Song> brmcHowl = new ArrayList<Song>();
		
		// Create BRMC Howl Songs
		Song brmcHowl01 = new Song(1, "Shuffle Your Feet", "Howl");
		Song brmcHowl02 = new Song(2, "Howl", "Howl");
		Song brmcHowl03 = new Song(3, "Devil’s Waitin’", "Howl");
		Song brmcHowl04 = new Song(4, "Ain’t No Easy Way", "Howl");
		Song brmcHowl05 = new Song(5, "Still Suspicion Holds You Tight", "Howl");
		Song brmcHowl06 = new Song(6, "Fault Line", "Howl");
		Song brmcHowl07 = new Song(7, "Promise", "Howl");
		Song brmcHowl08 = new Song(8, "Weight Of The World", "Howl");
		Song brmcHowl09 = new Song(9, "Restless Sinner", "Howl");
		Song brmcHowl10 = new Song(10, "Gospel Song", "Howl");
		Song brmcHowl11 = new Song(11, "Complicated Situation", "Howl");
		Song brmcHowl12 = new Song(12, "Sympathetic Noise", "Howl");
		Song brmcHowl13 = new Song(13, "The Line", "Howl");
		Song brmcHowl14 = new Song(14, "Open Invitation", "Howl");
				
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
	public ArrayList<Song> getBrmcBaby81()
	{
		// Local Variables
		ArrayList<Song> brmcBaby81 = new ArrayList<Song>();
		
		// Create BRMC Baby 81 Songs
		Song brmcBaby8101 = new Song(1, "Love Burns", "Baby 81");
		Song brmcBaby8102 = new Song(2, "Took Out A Loan", "Baby 81");
		Song brmcBaby8103 = new Song(3, "Berlin", "Baby 81");
		Song brmcBaby8104 = new Song(4, "Weapon Of Choice", "Baby 81");
		Song brmcBaby8105 = new Song(5, "Windows", "Baby 81");
		Song brmcBaby8106 = new Song(6, "Cold Wind", "Baby 81");
		Song brmcBaby8107 = new Song(7, "Not What You Wanted", "Baby 81");
		Song brmcBaby8108 = new Song(8, "666 Conducer", "Baby 81");
		Song brmcBaby8109 = new Song(9, "All You Do Is Talk", "Baby 81");
		Song brmcBaby8110 = new Song(10, "Lien On Your Dreams", "Baby 81");
		Song brmcBaby8111 = new Song(11, "Need Some Air", "Baby 81");
		Song brmcBaby8112 = new Song(12, "Killing The Light", "Baby 81");
		Song brmcBaby8113 = new Song(13, "American X ", "Baby 81");
		Song brmcBaby8114 = new Song(14, "Am I Only", "Baby 81");
		
				
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
	public ArrayList<Song> getBrmcTheEffectsOf333()
	{
		// Local Variables
		ArrayList<Song> brmcTheEffectsOf333 = new ArrayList<Song>();
		
		// Create BRMC The Effects Of 333 Songs
		Song brmcTheEffectsOf33301 = new Song(1, "The Effects Of 333", "The Effects Of 333");
		Song brmcTheEffectsOf33302 = new Song(2, "Still No Answer", "The Effects Of 333");
		Song brmcTheEffectsOf33303 = new Song(3, "I Know You’re In There", "The Effects Of 333");
		Song brmcTheEffectsOf33304 = new Song(4, "And With This Comes", "The Effects Of 333");
		Song brmcTheEffectsOf33305 = new Song(5, "A Sad State", "The Effects Of 333");
		Song brmcTheEffectsOf33306 = new Song(6, "A Twisted State", "The Effects Of 333");
		Song brmcTheEffectsOf33307 = new Song(7, "Sedated With Sterilized Tounges", "The Effects Of 333");
		Song brmcTheEffectsOf33308 = new Song(8, "We’re Not Welcome Alone", "The Effects Of 333");
		Song brmcTheEffectsOf33309 = new Song(9, "Or Needed", "The Effects Of 333");
		Song brmcTheEffectsOf33310 = new Song(10, "And When Was Better", "The Effects Of 333");
		
				
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
	public ArrayList<Song> getBrmcBeatTheDevilsTattoo()
	{
		// Local Variables
		ArrayList<Song> brmcBeatTheDevilsTattoo = new ArrayList<Song>();
		
		// Create BRMC Beat The Devils Tattoo Songs
		Song brmcBeatTheDevilsTattoo01 = new Song(1, "Beat The Devil’s Tattoo", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo02 = new Song(2, "Conscience Killer", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo03 = new Song(3, "Bad Blood", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo04 = new Song(4, "War Machine", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo05 = new Song(5, "Sweet Feeling", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo06 = new Song(6, "Evol", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo07 = new Song(7, "Mama Taught Me Better", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo08 = new Song(8, "River Styx", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo09 = new Song(9, "The Toll", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo10 = new Song(10, "Aya", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo11 = new Song(11, "Shadow’s Keeper", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo12 = new Song(12, "Long Way Down", "Beat The Devils Tattoo");
		Song brmcBeatTheDevilsTattoo13 = new Song(13, "Half-State", "Beat The Devils Tattoo");
		
				
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
	public ArrayList<Song> getBrmcSpecterAtTheFeast()
	{
		// Local Variables
		ArrayList<Song> brmcBrmcSpecterAtTheFeast = new ArrayList<Song>();
		
		// Create BRMC Specter At The Feast Songs
		Song brmcSpecterAtTheFeast01 = new Song(1, "Fire Walker", "Specter At The Feast");
		Song brmcSpecterAtTheFeast02 = new Song(2, "Let The Day Begin", "Specter At The Feast");
		Song brmcSpecterAtTheFeast03 = new Song(3, "Returning", "Specter At The Feast");
		Song brmcSpecterAtTheFeast04 = new Song(4, "Lullaby", "Specter At The Feast");
		Song brmcSpecterAtTheFeast05 = new Song(5, "Hate The Taste", "Specter At The Feast");
		Song brmcSpecterAtTheFeast06 = new Song(6, "Rival", "Specter At The Feast");
		Song brmcSpecterAtTheFeast07 = new Song(7, "Teenage Disease", "Specter At The Feast");
		Song brmcSpecterAtTheFeast08 = new Song(8, "Some Kind Of Ghost", "Specter At The Feast");
		Song brmcSpecterAtTheFeast09 = new Song(9, "Sometimes The Light", "Specter At The Feast");
		Song brmcSpecterAtTheFeast10 = new Song(10, "Funny Games", "Specter At The Feast");
		Song brmcSpecterAtTheFeast11 = new Song(11, "Sell It", "Specter At The Feast");
		Song brmcSpecterAtTheFeast12 = new Song(12, "Lose Yourself", "Specter At The Feast");	
				
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
	public ArrayList<Song> getBrmcLive()
	{
		// Local Variables
		ArrayList<Song> brmcLive = new ArrayList<Song>();
		
		// Create BRMC Live Songs
		Song brmcLive01 = new Song(1, "Berlin", "Live");
		Song brmcLive02 = new Song(2, "Weapon Of Choice", "Live");
		Song brmcLive03 = new Song(3, "Rise Or Fall", "Live");
		Song brmcLive04 = new Song(4, "666 Conducer", "Live");
		Song brmcLive05 = new Song(5, "Ain’t No Easy Way", "Live");
		Song brmcLive06 = new Song(6, "Weight Of The World", "Live");
		Song brmcLive07 = new Song(7, "Stop", "Live");
		Song brmcLive08 = new Song(8, "All You Do Is Talk", "Live");
		Song brmcLive09 = new Song(9, "Red Eyes And Tears", "Live");
		Song brmcLive10 = new Song(10, "As Sure As The Sun", "Live");
		Song brmcLive11 = new Song(11, "American X", "Live");
		Song brmcLive12 = new Song(12, "Spread Your Love", "Live");
		Song brmcLive13 = new Song(13, "Love Burns", "Live");
		Song brmcLive14 = new Song(14, "Mercy", "Live");
		Song brmcLive15 = new Song(15, "Dirty Old Town", "Live");
		Song brmcLive16 = new Song(16, "Promise", "Live");
		Song brmcLive17 = new Song(17, "Six Barrel Shotgun", "Live");
		Song brmcLive18 = new Song(18, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)", "Live");
		Song brmcLive19 = new Song(19, "Fault Line", "Live");
		Song brmcLive20 = new Song(20, "Took Out A Loan", "Live");
		Song brmcLive21 = new Song(21, "The Show Is About To ", "Live");
		Song brmcLive22 = new Song(22, "Heart And Soul", "Live");
		
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
	public ArrayList<Song> getBrmcLiveInLondon()
	{
		// Local Variables
		ArrayList<Song> brmcLiveInLondon = new ArrayList<Song>();
		
		// Create BRMC Live In London Songs
		Song brmcLiveInLondon01 = new Song(1, "Intro", "Live In London");
		Song brmcLiveInLondon02 = new Song(2, "War Machine", "Live In London");
		Song brmcLiveInLondon03 = new Song(3, "Mama Taught Me Better", "Live In London");
		Song brmcLiveInLondon04 = new Song(4, "Red Eyes And Tears", "Live In London");
		Song brmcLiveInLondon05 = new Song(5, "Bad Blood", "Live In London");
		Song brmcLiveInLondon06 = new Song(6, "Beat The Devil’s Tattoo", "Live In London");
		Song brmcLiveInLondon07 = new Song(7, "Shade Of Blue", "Live In London");
		Song brmcLiveInLondon08 = new Song(8, "Ain’t No Easy Way", "Live In London");
		Song brmcLiveInLondon09 = new Song(9, "Aya", "Live In London");
		Song brmcLiveInLondon10 = new Song(10, "Berlin", "Live In London");
		Song brmcLiveInLondon11 = new Song(11, "Weapon Of Choice", "Live In London");
		Song brmcLiveInLondon12 = new Song(12, "Annabel Lee", "Live In London");
		Song brmcLiveInLondon13 = new Song(13, "Awake", "Live In London");
		Song brmcLiveInLondon14 = new Song(14, "Whatever Happened To My Rock ‘n’ Roll (Punk Song)", "Live In London");
		Song brmcLiveInLondon15 = new Song(15, "Conscience Killer", "Live In London");
		Song brmcLiveInLondon16 = new Song(16, "Six Barrel Shotgun", "Live In London");
		Song brmcLiveInLondon17 = new Song(17, "Spread Your Love", "Live In London");
		Song brmcLiveInLondon18 = new Song(18, "Shuffle Your Feet", "Live In London");
		Song brmcLiveInLondon19 = new Song(19, "Shadow’s Keeper", "Live In London");
		Song brmcLiveInLondon20 = new Song(20, "Open Invitation", "Live In London");
		
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
	public ArrayList<Song> getBrmcLiveInParis()
	{
		// Local Variables
		ArrayList<Song> brmcLiveInParis = new ArrayList<Song>();
		
		// Create BRMC Live In Paris Songs
		Song brmcLiveInParis01 = new Song(1, "Fire Walker", "Live In Paris");
		Song brmcLiveInParis02 = new Song(2, "Let The Day Begin", "Live In Paris");
		Song brmcLiveInParis03 = new Song(3, "Returning", "Live In Paris");
		Song brmcLiveInParis04 = new Song(4, "Lullaby", "Live In Paris");
		Song brmcLiveInParis05 = new Song(5, "vHate The Taste", "Live In Paris");
		Song brmcLiveInParis06 = new Song(6, "Rival", "Live In Paris");
		Song brmcLiveInParis07 = new Song(7, "Teenage Disease", "Live In Paris");
		Song brmcLiveInParis08 = new Song(8, "Some Kind Of Ghost", "Live In Paris");
		Song brmcLiveInParis09 = new Song(9, "Sometimes The Light", "Live In Paris");
		Song brmcLiveInParis10 = new Song(10, "Funny Games", "Live In Paris");
		Song brmcLiveInParis11 = new Song(11, "Sell It", "Live In Paris");
		Song brmcLiveInParis12 = new Song(12, "Lose Yourself", "Live In Paris");
		Song brmcLiveInParis13 = new Song(13, "Beat The Devil’s Tattoo", "Live In Paris");
		Song brmcLiveInParis14 = new Song(14, "Ain’t No Easy Way", "Live In Paris");
		Song brmcLiveInParis15 = new Song(15, "Berlin", "Live In Paris");
		Song brmcLiveInParis16 = new Song(16, "Conscience Killer", "Live In Paris");
		Song brmcLiveInParis17 = new Song(17, "Streaming Gun", "Live In Paris");
		Song brmcLiveInParis18 = new Song(18, "Rifles", "Live In Paris");
		Song brmcLiveInParis19 = new Song(19, "Stop", "Live In Paris");
		Song brmcLiveInParis20 = new Song(20, "White Palms", "Live In Paris");
		Song brmcLiveInParis21 = new Song(21, "Spread Your Love", "Live In Paris");
		Song brmcLiveInParis22 = new Song(22, "Mercy", "Live In Paris");
		Song brmcLiveInParis23 = new Song(23, "Shuffle Your Feet", "Live In Paris");
		Song brmcLiveInParis24 = new Song(24, "Whatever Happened To My Rock ’n’ Roll (Punk Song)", "Live In Paris");

		
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