/*
 * Class:           PinkFloydAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the PinkFloydAlbumService Class
 */

package ac.uk.belfastmet.music.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.music.domain.Album;
import ac.uk.belfastmet.music.domain.Song;

@Service
public class PinkFloydAlbumService 
{
	// Instance Variables
	private ArrayList<Song> pinkFloydThePiperAtTheGatesOfDawn;
	private ArrayList<Song> pinkFloydASaucerfulOfSecrets;
	private ArrayList<Song> pinkFloydUmmagumma;
	private ArrayList<Song> pinkFloydAtomHeartMother;
	private ArrayList<Song> pinkFloydMeddle;
	private ArrayList<Song> pinkFloydObscuredByClouds;
	private ArrayList<Song> pinkFloydTheDarkSideOfTheMoon;
	private ArrayList<Song> pinkFloydWishYouWereHere;
	private ArrayList<Song> pinkFloydAnimals;
	private ArrayList<Song> pinkFloydTheWall;
	private ArrayList<Song> pinkFloydTheFinalCut;
	private ArrayList<Song> pinkFloydAMomentaryLapseOfReason;
	private ArrayList<Song> pinkFloydTheDivisionBell;
	private ArrayList<Song> pinkFloydTheEndlessRiver;
//	private ArrayList<Song> pinkFloydDelicateSoundOfThunder;
//	private ArrayList<Song> pinkFloydPulse;
//	private ArrayList<Song> pinkFloydIsThereAnybodyOutThereTheWallLive;
	
	// Default Constructor
	public PinkFloydAlbumService() 
	{
		super();
	}
	
	// Get All Pink Floyd Albums
	public ArrayList<Album> getPinkFloydAlbums()
	{
		// Local Variables
		ArrayList<Album> pinkFloydAlbums = new ArrayList<Album>();
		
		// Add Pink Floyd Albums
		pinkFloydAlbums.add(getPinkFloydThePiperAtTheGatesOfDawn());
		pinkFloydAlbums.add(getPinkFloydASaucerfulOfSecrets());
		pinkFloydAlbums.add(getPinkFloydMore());
		pinkFloydAlbums.add(getPinkFloydUmmagumma());
		pinkFloydAlbums.add(getPinkFloydAtomHeartMother());
		pinkFloydAlbums.add(getPinkFloydMeddle());
		pinkFloydAlbums.add(getPinkFloydObscuredByClouds());
		pinkFloydAlbums.add(getPinkFloydTheDarkSideOfTheMoon());
		pinkFloydAlbums.add(getPinkFloydWishYouWereHere());
		pinkFloydAlbums.add(getPinkFloydAnimals());
		pinkFloydAlbums.add(getPinkFloydTheWall());
		pinkFloydAlbums.add(getPinkFloydTheFinalCut());
		pinkFloydAlbums.add(getPinkFloydAMomentaryLapseOfReason());
		pinkFloydAlbums.add(getPinkFloydTheDivisionBell());
//		pinkFloydAlbums.add(getPinkFloydTheEndlessRiver());
//		pinkFloydAlbums.add(getPinkFloydDelicateSoundOfThunder());
//		pinkFloydAlbums.add(getPinkFloydPulse());
//		pinkFloydAlbums.add(getPinkFloydIsThereAnybodyOutThereTheWallLive());
		
		return pinkFloydAlbums;
	}
	
	// #########################################
	// Pink Floyd The Piper At The Gates Of Dawn
	// #########################################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydThePiperAtTheGatesOfDawn()
	{
		// Album Cover Image File
		final String pinkFloydThePiperAtTheGatesOfDawnCover = "images/albumCovers/PinkFloyd/PinkFloyd-ThePiperAtTheGatesOfDawn.jpg";
		
		// Create Album Object
		Album pinkFloydThePiperAtTheGatesOfDawnAlbum = new Album("Pink Floyd", "The Piper At The Gates Of Dawn", 1967, 11, getPinkFloydThePiperAtTheGatesOfDawnTracks(), pinkFloydThePiperAtTheGatesOfDawnCover);
		
		return pinkFloydThePiperAtTheGatesOfDawnAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydThePiperAtTheGatesOfDawnTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydThePiperAtTheGatesOfDawnTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Piper At The Gates Of Dawn Songs
		Song pinkFloydThePiperAtTheGatesOfDawn01 = new Song(1, "Astronomy Domine");
		Song pinkFloydThePiperAtTheGatesOfDawn02 = new Song(2, "Lucifer Sam");
		Song pinkFloydThePiperAtTheGatesOfDawn03 = new Song(3, "Matilda Mother");
		Song pinkFloydThePiperAtTheGatesOfDawn04 = new Song(4, "Flaming");
		Song pinkFloydThePiperAtTheGatesOfDawn05 = new Song(5, "Pow R. Toc H.");
		Song pinkFloydThePiperAtTheGatesOfDawn06 = new Song(6, "Take Up Thy Stethoscope And Walk");
		Song pinkFloydThePiperAtTheGatesOfDawn07 = new Song(7, "Interstellar Overdrive");
		Song pinkFloydThePiperAtTheGatesOfDawn08 = new Song(8, "The Gnome");
		Song pinkFloydThePiperAtTheGatesOfDawn09 = new Song(9, "Chapter 24");
		Song pinkFloydThePiperAtTheGatesOfDawn10 = new Song(10, "Scarecrow");
		Song pinkFloydThePiperAtTheGatesOfDawn11 = new Song(11, "Bike");
		
		// Add The Songs To ArrayList
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn01);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn02);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn03);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn04);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn05);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn06);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn07);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn08);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn09);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn10);
		pinkFloydThePiperAtTheGatesOfDawnTracks.add(pinkFloydThePiperAtTheGatesOfDawn11);
		
		return pinkFloydThePiperAtTheGatesOfDawnTracks;
	}
	
	// #################################
	// Pink Floyd A Saucerful Of Secrets
	// #################################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydASaucerfulOfSecrets()
	{
		// Album Cover Image File
		final String pinkFloydASaucerfulOfSecretsCover = "images/albumCovers/PinkFloyd/PinkFloyd-ASaucerfulOfSecrets.jpg";
		
		// Create Album Object
		Album pinkFloydASaucerfulOfSecretsAlbum = new Album("Pink Floyd", "A Saucerful Of Secrets", 1968, 7, getPinkFloydASaucerfulOfSecretsTracks(), pinkFloydASaucerfulOfSecretsCover);
		
		return pinkFloydASaucerfulOfSecretsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydASaucerfulOfSecretsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydASaucerfulOfSecretsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd A Saucerful Of Secrets Songs
		Song pinkFloydASaucerfulOfSecrets01 = new Song(1, "Let There Be More Light");
		Song pinkFloydASaucerfulOfSecrets02 = new Song(2, "Remember A Day");
		Song pinkFloydASaucerfulOfSecrets03 = new Song(3, "Set The Controls For The Heart Of The Sun");
		Song pinkFloydASaucerfulOfSecrets04 = new Song(4, "Corporal Clegg");
		Song pinkFloydASaucerfulOfSecrets05 = new Song(5, "A Saucerful Of Secrets");
		Song pinkFloydASaucerfulOfSecrets06 = new Song(6, "See-Saw");
		Song pinkFloydASaucerfulOfSecrets07 = new Song(7, "Jugband Blues");
		
		// Add The Songs To ArrayList
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets01);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets02);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets03);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets04);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets05);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets06);
		pinkFloydASaucerfulOfSecretsTracks.add(pinkFloydASaucerfulOfSecrets07);
		
		return pinkFloydASaucerfulOfSecretsTracks;
	}
	
	// ###############
	// Pink Floyd More
	// ###############
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydMore()
	{
		// Album Cover Image File
		final String pinkFloydMoreCover = "images/albumCovers/PinkFloyd/PinkFloyd-More.jpg";
		
		// Create Album Object
		Album pinkFloydMoreAlbum = new Album("Pink Floyd", "More", 1969, 12, getPinkFloydMoreTracks(), pinkFloydMoreCover);
		
		return pinkFloydMoreAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydMoreTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydMoreTracks = new ArrayList<Song>();
		
		// Create Pink Floyd More Songs
		Song pinkFloydMore01 = new Song(1, "Cirrus Minor");
		Song pinkFloydMore02 = new Song(2, "The Nile Song");
		Song pinkFloydMore03 = new Song(3, "Crying Song");
		Song pinkFloydMore04 = new Song(4, "Up The Khyber");
		Song pinkFloydMore05 = new Song(5, "Green Is The Colour");
		Song pinkFloydMore06 = new Song(6, "Cymbaline");
		Song pinkFloydMore07 = new Song(7, "Party Sequence");
		Song pinkFloydMore08 = new Song(8, "Main Theme");
		Song pinkFloydMore09 = new Song(9, "Ibiza Bar");
		Song pinkFloydMore10 = new Song(10, "Quicksilver");
		Song pinkFloydMore11 = new Song(11, "A Spanish Piece");
		Song pinkFloydMore12 = new Song(12, "Dramatic Theme");
		
		// Add The Songs To ArrayList
		pinkFloydMoreTracks.add(pinkFloydMore01);
		pinkFloydMoreTracks.add(pinkFloydMore02);
		pinkFloydMoreTracks.add(pinkFloydMore03);
		pinkFloydMoreTracks.add(pinkFloydMore04);
		pinkFloydMoreTracks.add(pinkFloydMore05);
		pinkFloydMoreTracks.add(pinkFloydMore06);
		pinkFloydMoreTracks.add(pinkFloydMore07);
		pinkFloydMoreTracks.add(pinkFloydMore08);
		pinkFloydMoreTracks.add(pinkFloydMore09);
		pinkFloydMoreTracks.add(pinkFloydMore10);
		pinkFloydMoreTracks.add(pinkFloydMore11);
		pinkFloydMoreTracks.add(pinkFloydMore12);
		
		return pinkFloydMoreTracks;
	}
	
	// ####################
	// Pink Floyd Ummagumma
	// ####################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydUmmagumma()
	{
		// Album Cover Image File
		final String pinkFloydUmmagummaCover = "images/albumCovers/PinkFloyd/PinkFloyd-Ummagumma.jpg";
		
		// Create Album Object
		Album pinkFloydUmmagummaAlbum = new Album("Pink Floyd", "Ummagumma", 1969, 11, getPinkFloydUmmagummaTracks(), pinkFloydUmmagummaCover);
		
		return pinkFloydUmmagummaAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydUmmagummaTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydUmmagummaTracks = new ArrayList<Song>();
		
		// Create Pink Floyd UmmaGumma Songs
		Song pinkFloydUmmagumma01 = new Song(1, "Astronomy Domine (live)");
		Song pinkFloydUmmagumma02 = new Song(2, "Careful With That Axe, Eugene (live)");
		Song pinkFloydUmmagumma03 = new Song(3, "Set The Controls For The Heart Of The Sun (live)");
		Song pinkFloydUmmagumma04 = new Song(4, "A Saucerful Of Secrets (live)");
		Song pinkFloydUmmagumma05 = new Song(5, "Sysyphus, Parts 1-4");
		Song pinkFloydUmmagumma06 = new Song(6, "Grantchester Meadows");
		Song pinkFloydUmmagumma07 = new Song(7, "Several Species Of Small Furry Animals Gathered Together In A Cave And Grooving With A Pict");
		Song pinkFloydUmmagumma08 = new Song(8, "The Narrow Way, Parts 1-3");
		Song pinkFloydUmmagumma09 = new Song(9, "The Grand Viziers Garden Party Part 1 – Entrance");
		Song pinkFloydUmmagumma10 = new Song(10, "The Grand Viziers Garden Party Part 2 – Entertainment");
		Song pinkFloydUmmagumma11 = new Song(11, "The Grand Viziers Garden Party Part 3 – Exit");

		// Add The Songs To ArrayList
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma01);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma02);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma03);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma04);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma05);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma06);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma07);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma08);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma09);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma10);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma11);
		
		return pinkFloydUmmagummaTracks;
	}
	
	// ############################
	// Pink Floyd Atom Heart Mother
	// ############################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydAtomHeartMother()
	{
		// Album Cover Image File
		final String pinkFloydAtomHeartMotherCover = "images/albumCovers/PinkFloyd/PinkFloyd-AtomHeartMother.jpg";
		
		// Create Album Object
		Album pinkFloydAtomHeartMotherAlbum = new Album("Pink Floyd", "Atom Heart Mother", 1970, 5, getPinkFloydAtomHeartMotherTracks(), pinkFloydAtomHeartMotherCover);
		
		return pinkFloydAtomHeartMotherAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydAtomHeartMotherTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAtomHeartMotherTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Atom Heart Mother Songs
		Song pinkFloydAtomHeartMother01 = new Song(1, "Atom Heart Mother, a) Fathers Shout, b) Breast Milky, c) Mother Fore, d) Funky Dung, e) Mind Your Throats Please, f) Remergence");
		Song pinkFloydAtomHeartMother02 = new Song(2, "If");
		Song pinkFloydAtomHeartMother03 = new Song(3, "Summer 68");
		Song pinkFloydAtomHeartMother04 = new Song(4, "Fat Old Sun");
		Song pinkFloydAtomHeartMother05 = new Song(5, "Alans Psychedelic Breakfast, a) Rise And Shine, b) Sunny Side Up, c) Morning Glory");

		// Add The Songs To ArrayList
		pinkFloydAtomHeartMotherTracks.add(pinkFloydAtomHeartMother01);
		pinkFloydAtomHeartMotherTracks.add(pinkFloydAtomHeartMother02);
		pinkFloydAtomHeartMotherTracks.add(pinkFloydAtomHeartMother03);
		pinkFloydAtomHeartMotherTracks.add(pinkFloydAtomHeartMother04);
		pinkFloydAtomHeartMotherTracks.add(pinkFloydAtomHeartMother05);
		
		return pinkFloydAtomHeartMotherTracks;
	}
	
	// #################
	// Pink Floyd Meddle
	// #################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydMeddle()
	{
		// Album Cover Image File
		final String pinkFloydMeddleCover = "images/albumCovers/PinkFloyd/PinkFloyd-Meddle.jpg";
		
		// Create Album Object
		Album pinkFloydMeddleAlbum = new Album("Pink Floyd", "Meddle", 1971, 6, getPinkFloydMeddleTracks(), pinkFloydMeddleCover);
		
		return pinkFloydMeddleAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydMeddleTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydMeddleTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Meddle Songs
		Song pinkFloydMeddle01 = new Song(1, "One Of These Days");
		Song pinkFloydMeddle02 = new Song(2, "A Pillow Of Winds");
		Song pinkFloydMeddle03 = new Song(3, "Fearless");
		Song pinkFloydMeddle04 = new Song(4, "San Tropez");
		Song pinkFloydMeddle05 = new Song(5, "Seamus");
		Song pinkFloydMeddle06 = new Song(6, "Echoes");

		// Add The Songs To ArrayList
		pinkFloydMeddleTracks.add(pinkFloydMeddle01);
		pinkFloydMeddleTracks.add(pinkFloydMeddle02);
		pinkFloydMeddleTracks.add(pinkFloydMeddle03);
		pinkFloydMeddleTracks.add(pinkFloydMeddle04);
		pinkFloydMeddleTracks.add(pinkFloydMeddle05);
		pinkFloydMeddleTracks.add(pinkFloydMeddle06);
		
		return pinkFloydMeddleTracks;
	}
	
	// #############################
	// Pink Floyd Obscured By Clouds
	// #############################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydObscuredByClouds()
	{
		// Album Cover Image File
		final String pinkFloydObscuredByCloudsCover = "images/albumCovers/PinkFloyd/PinkFloyd-ObscuredByClouds.jpg";
		
		// Create Album Object
		Album pinkFloydObscuredByCloudsAlbum = new Album("Pink Floyd", "Obscured By Clouds", 1972, 10, getPinkFloydObscuredByCloudsTracks(), pinkFloydObscuredByCloudsCover);
		
		return pinkFloydObscuredByCloudsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydObscuredByCloudsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydObscuredByCloudsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Obscured By Clouds Songs
		Song pinkFloydObscuredByClouds01 = new Song(1, "Obscured By Clouds");
		Song pinkFloydObscuredByClouds05 = new Song(2, "When Youre In");
		Song pinkFloydObscuredByClouds03 = new Song(3, "Burning Bridges");
		Song pinkFloydObscuredByClouds04 = new Song(4, "The Gold Its In The...");
		Song pinkFloydObscuredByClouds02 = new Song(5, "Mudmen");
		Song pinkFloydObscuredByClouds06 = new Song(6, "Wots... Uh The Deal");
		Song pinkFloydObscuredByClouds07 = new Song(7, "Childhoods End");
		Song pinkFloydObscuredByClouds08 = new Song(8, "Free Four");
		Song pinkFloydObscuredByClouds09 = new Song(9, "Stay");
		Song pinkFloydObscuredByClouds10 = new Song(10, "Absolutely Curtains");
		
		// Add The Songs To ArrayList
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds01);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds02);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds03);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds04);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds05);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds06);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds07);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds08);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds09);
		pinkFloydObscuredByCloudsTracks.add(pinkFloydObscuredByClouds10);

		return pinkFloydObscuredByCloudsTracks;
	}
	
	// ####################################
	// Pink Floyd The Dark Side Of The Moon
	// ####################################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydTheDarkSideOfTheMoon()
	{
		// Album Cover Image File
		final String pinkFloydTheDarkSideOfTheMoonCover = "images/albumCovers/PinkFloyd/PinkFloyd-TheDarkSideOfTheMoon.jpg";
		
		// Create Album Object
		Album pinkFloydTheDarkSideOfTheMoonAlbum = new Album("Pink Floyd", "The Dark Side Of The Moon", 1973, 10, getPinkFloydTheDarkSideOfTheMoonTracks(), pinkFloydTheDarkSideOfTheMoonCover);
		
		return pinkFloydTheDarkSideOfTheMoonAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydTheDarkSideOfTheMoonTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheDarkSideOfTheMoonTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Dark Side Of The Moon Songs
		Song pinkFloydTheDarkSideOfTheMoon01 = new Song(1, "Speak To Me");
		Song pinkFloydTheDarkSideOfTheMoon02 = new Song(2, "Breathe (In The Air)");
		Song pinkFloydTheDarkSideOfTheMoon03 = new Song(3, "On The Run");
		Song pinkFloydTheDarkSideOfTheMoon04 = new Song(4, "Time");
		Song pinkFloydTheDarkSideOfTheMoon05 = new Song(5, "The Great Gig In The Sky");
		Song pinkFloydTheDarkSideOfTheMoon06 = new Song(6, "Money");
		Song pinkFloydTheDarkSideOfTheMoon07 = new Song(7, "Us And Them");
		Song pinkFloydTheDarkSideOfTheMoon08 = new Song(8, "Any Colour You Like");
		Song pinkFloydTheDarkSideOfTheMoon09 = new Song(9, "Brain Damage");
		Song pinkFloydTheDarkSideOfTheMoon10 = new Song(10, "Eclipse");
		
		// Add The Songs To ArrayList
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon01);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon02);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon03);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon04);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon05);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon06);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon07);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon08);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon09);
		pinkFloydTheDarkSideOfTheMoonTracks.add(pinkFloydTheDarkSideOfTheMoon10);

		return pinkFloydTheDarkSideOfTheMoonTracks;
	}
	
	// #############################
	// Pink Floyd Wish You Were Here
	// #############################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydWishYouWereHere()
	{
		// Album Cover Image File
		final String pinkFloydWishYouWereHereCover = "images/albumCovers/PinkFloyd/PinkFloyd-WishYouWereHere.jpg";
		
		// Create Album Object
		Album pinkFloydWishYouWereHereAlbum = new Album("Pink Floyd", "Wish You Were Here", 1975, 5, getPinkFloydWishYouWereHereTracks(), pinkFloydWishYouWereHereCover);
		
		return pinkFloydWishYouWereHereAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydWishYouWereHereTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydWishYouWereHereTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Wish You Were Here Songs
		Song pinkFloydWishYouWereHere01 = new Song(1, "Shine On You Crazy Diamond Parts 1-5");
		Song pinkFloydWishYouWereHere02 = new Song(2, "Welcome To The Machine");
		Song pinkFloydWishYouWereHere03 = new Song(3, "Have A Cigar");
		Song pinkFloydWishYouWereHere04 = new Song(4, "Wish You Were Here");
		Song pinkFloydWishYouWereHere05 = new Song(5, "Shine On You Crazy Diamond Parts 6-9");

		// Add The Songs To ArrayList
		pinkFloydWishYouWereHereTracks.add(pinkFloydWishYouWereHere01);
		pinkFloydWishYouWereHereTracks.add(pinkFloydWishYouWereHere02);
		pinkFloydWishYouWereHereTracks.add(pinkFloydWishYouWereHere03);
		pinkFloydWishYouWereHereTracks.add(pinkFloydWishYouWereHere04);
		pinkFloydWishYouWereHereTracks.add(pinkFloydWishYouWereHere05);
		
		return pinkFloydWishYouWereHereTracks;
	}
	
	// ##################
	// Pink Floyd Animals
	// ##################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydAnimals()
	{
		// Album Cover Image File
		final String pinkFloydAnimalsCover = "images/albumCovers/PinkFloyd/PinkFloyd-Animals.jpg";
		
		// Create Album Object
		Album pinkFloydAnimalsAlbum = new Album("Pink Floyd", "Animals", 1977, 5, getPinkFloydAnimalsTracks(), pinkFloydAnimalsCover);
		
		return pinkFloydAnimalsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydAnimalsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAnimalsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Animals Songs
		Song pinkFloydAnimals01 = new Song(1, "Pigs On The Wing, Part 1");
		Song pinkFloydAnimals02 = new Song(2, "Dogs");
		Song pinkFloydAnimals03 = new Song(3, "Pigs (Three Different Ones)");
		Song pinkFloydAnimals04 = new Song(4, "Sheep");
		Song pinkFloydAnimals05 = new Song(5, "Pigs On The Wing, Part 2");
		
		// Add The Songs To ArrayList
		pinkFloydAnimalsTracks.add(pinkFloydAnimals01);
		pinkFloydAnimalsTracks.add(pinkFloydAnimals02);
		pinkFloydAnimalsTracks.add(pinkFloydAnimals03);
		pinkFloydAnimalsTracks.add(pinkFloydAnimals04);
		pinkFloydAnimalsTracks.add(pinkFloydAnimals05);
		
		return pinkFloydAnimalsTracks;
	}
	
	// ###################
	// Pink Floyd The Wall
	// ###################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydTheWall()
	{
		// Album Cover Image File
		final String pinkFloydTheWallCover = "images/albumCovers/PinkFloyd/PinkFloyd-TheWall.jpg";
		
		// Create Album Object
		Album pinkFloydTheWallAlbum = new Album("Pink Floyd", "The Wall", 1979, 26, getPinkFloydTheWallTracks(), pinkFloydTheWallCover);
		
		return pinkFloydTheWallAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydTheWallTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheWallTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Wall Songs
		Song pinkFloydTheWall01 = new Song(1, "In The Flesh");
		Song pinkFloydTheWall02 = new Song(2, "The Thin Ice");
		Song pinkFloydTheWall03 = new Song(3, "Another Brick In The Wall, Part 1");
		Song pinkFloydTheWall04 = new Song(4, "The Happiest Days Of Our Lives");
		Song pinkFloydTheWall05 = new Song(5, "Another Brick In The Wall, Part 2");
		Song pinkFloydTheWall06 = new Song(6, "Mother");
		Song pinkFloydTheWall07 = new Song(7, "Goodbye Blue Sky");
		Song pinkFloydTheWall08 = new Song(8, "Empty Spaces");
		Song pinkFloydTheWall09 = new Song(9, "Young Lust");
		Song pinkFloydTheWall10 = new Song(10, "One Of My Turns");
		Song pinkFloydTheWall11 = new Song(11, "Dont Leave Me Now");
		Song pinkFloydTheWall12 = new Song(12, "Another Brick In The Wall, Part 3");
		Song pinkFloydTheWall13 = new Song(13, "Goodbye Cruel World");
		Song pinkFloydTheWall14 = new Song(14, "Hey You");
		Song pinkFloydTheWall15 = new Song(15, "Is There Anybody Out There?");
		Song pinkFloydTheWall16 = new Song(16, "Nobody Home");
		Song pinkFloydTheWall17 = new Song(17, "Vera");
		Song pinkFloydTheWall18 = new Song(18, "Bring The Boys Back Home");
		Song pinkFloydTheWall19 = new Song(19, "Comfortably Numb");
		Song pinkFloydTheWall20 = new Song(20, "The Show Must Go On");
		Song pinkFloydTheWall21 = new Song(21, "In The Flesh");
		Song pinkFloydTheWall22 = new Song(22, "Run Like Hell");
		Song pinkFloydTheWall23 = new Song(23, "Waiting For The Worms");
		Song pinkFloydTheWall24 = new Song(24, "Stop");
		Song pinkFloydTheWall25 = new Song(25, "The Trial");
		Song pinkFloydTheWall26 = new Song(26, "Outside The Wall");
		
		// Add The Songs To ArrayList
		pinkFloydTheWallTracks.add(pinkFloydTheWall01);
		pinkFloydTheWallTracks.add(pinkFloydTheWall02);
		pinkFloydTheWallTracks.add(pinkFloydTheWall03);
		pinkFloydTheWallTracks.add(pinkFloydTheWall04);
		pinkFloydTheWallTracks.add(pinkFloydTheWall05);
		pinkFloydTheWallTracks.add(pinkFloydTheWall06);
		pinkFloydTheWallTracks.add(pinkFloydTheWall07);
		pinkFloydTheWallTracks.add(pinkFloydTheWall08);
		pinkFloydTheWallTracks.add(pinkFloydTheWall09);
		pinkFloydTheWallTracks.add(pinkFloydTheWall10);
		pinkFloydTheWallTracks.add(pinkFloydTheWall11);
		pinkFloydTheWallTracks.add(pinkFloydTheWall12);
		pinkFloydTheWallTracks.add(pinkFloydTheWall13);
		pinkFloydTheWallTracks.add(pinkFloydTheWall14);
		pinkFloydTheWallTracks.add(pinkFloydTheWall15);
		pinkFloydTheWallTracks.add(pinkFloydTheWall16);
		pinkFloydTheWallTracks.add(pinkFloydTheWall17);
		pinkFloydTheWallTracks.add(pinkFloydTheWall18);
		pinkFloydTheWallTracks.add(pinkFloydTheWall19);
		pinkFloydTheWallTracks.add(pinkFloydTheWall20);
		pinkFloydTheWallTracks.add(pinkFloydTheWall21);
		pinkFloydTheWallTracks.add(pinkFloydTheWall22);
		pinkFloydTheWallTracks.add(pinkFloydTheWall23);
		pinkFloydTheWallTracks.add(pinkFloydTheWall24);
		pinkFloydTheWallTracks.add(pinkFloydTheWall25);
		pinkFloydTheWallTracks.add(pinkFloydTheWall26);
		
		return pinkFloydTheWallTracks;
	}
	
	// ########################
	// Pink Floyd The Final Cut
	// ########################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydTheFinalCut()
	{
		// Album Cover Image File
		final String pinkFloydTheFinalCutCover = "images/albumCovers/PinkFloyd/PinkFloyd-ObscuredByClouds.jpg";
		
		// Create Album Object
		Album pinkFloydTheFinalCutAlbum = new Album("Pink Floyd", "The Final Cut", 1982, 12, getPinkFloydTheFinalCutTracks(), pinkFloydTheFinalCutCover);
		
		return pinkFloydTheFinalCutAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydTheFinalCutTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheFinalCutTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Final Cut Songs
		Song pinkFloydTheFinalCut01 = new Song(1, "The Post War Dream");
		Song pinkFloydTheFinalCut02 = new Song(2, "Your Possible Pasts");
		Song pinkFloydTheFinalCut03 = new Song(3, "When The Tigers Broke Free");
		Song pinkFloydTheFinalCut04 = new Song(4, "The Heros Return");
		Song pinkFloydTheFinalCut05 = new Song(5, "The Gunners Dream");
		Song pinkFloydTheFinalCut06 = new Song(6, "Paranoid Eyes");
		Song pinkFloydTheFinalCut07 = new Song(7, "Get Your Filthy Hands Off My Desert");
		Song pinkFloydTheFinalCut08 = new Song(8, "The Fletcher Memorial Home");
		Song pinkFloydTheFinalCut09 = new Song(9, "Southampton Dock");
		Song pinkFloydTheFinalCut10 = new Song(10, "The Final Cut");
		Song pinkFloydTheFinalCut11 = new Song(11, "Not Now John");
		Song pinkFloydTheFinalCut12 = new Song(12, "Two Suns In The Sunset");

		// Add The Songs To ArrayList
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut01);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut02);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut03);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut04);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut05);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut06);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut07);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut08);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut09);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut10);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut11);
		pinkFloydTheFinalCutTracks.add(pinkFloydTheFinalCut12);
		
		return pinkFloydTheFinalCutTracks;
	}
	
	// ######################################
	// Pink Floyd A Momentary Lapse Of Reason
	// ######################################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydAMomentaryLapseOfReason()
	{
		// Album Cover Image File
		final String pinkFloydAMomentaryLapseOfReasonCover = "images/albumCovers/PinkFloyd/PinkFloyd-AMomentaryLapseOfReason.jpg";
		
		// Create Album Object
		Album pinkFloydAMomentaryLapseOfReasonAlbum = new Album("Pink Floyd", "A Momentary Lapse Of Reason", 1987, 11, getPinkFloydAMomentaryLapseOfReasonTracks(), pinkFloydAMomentaryLapseOfReasonCover);
		
		return pinkFloydAMomentaryLapseOfReasonAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydAMomentaryLapseOfReasonTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAMomentaryLapseOfReasonTracks = new ArrayList<Song>();
		
		// Create Pink Floyd A Momentary Lapse Of Reason Songs
		Song pinkFloydAMomentaryLapseOfReason01 = new Song(1, "Signs Of Life");
		Song pinkFloydAMomentaryLapseOfReason02 = new Song(2, "Learning To Fly");
		Song pinkFloydAMomentaryLapseOfReason03 = new Song(3, "The Dogs Of War");
		Song pinkFloydAMomentaryLapseOfReason04 = new Song(4, "One Slip");
		Song pinkFloydAMomentaryLapseOfReason05 = new Song(5, "On The Turning Away");
		Song pinkFloydAMomentaryLapseOfReason06 = new Song(6, "Yet Another Movie");
		Song pinkFloydAMomentaryLapseOfReason07 = new Song(7, "Round And Around");
		Song pinkFloydAMomentaryLapseOfReason08 = new Song(8, "A New Machine, Part 1");
		Song pinkFloydAMomentaryLapseOfReason09 = new Song(9, "Terminal Frost");
		Song pinkFloydAMomentaryLapseOfReason10 = new Song(10, "A New Machine, Part 2");
		Song pinkFloydAMomentaryLapseOfReason11 = new Song(11, "Sorrow");

		// Add The Songs To ArrayList
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason01);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason02);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason03);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason04);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason05);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason06);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason07);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason08);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason09);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason10);
		pinkFloydAMomentaryLapseOfReasonTracks.add(pinkFloydAMomentaryLapseOfReason11);
			
		return pinkFloydAMomentaryLapseOfReasonTracks;
	}
	
	// ############################
	// Pink Floyd The Division Bell
	// ############################
	
	// #####
	// ALBUM
	// #####
	public Album getPinkFloydTheDivisionBell()
	{
		// Album Cover Image File
		final String pinkFloydTheDivisionBellCover = "images/albumCovers/PinkFloyd/PinkFloyd-TheDivisionBell.jpg";
		
		// Create Album Object
		Album pinkFloydTheDivisionBellAlbum = new Album("Pink Floyd", "The Division Bell", 1994, 11, getPinkFloydTheDivisionBellTracks(), pinkFloydTheDivisionBellCover);
		
		return pinkFloydTheDivisionBellAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getPinkFloydTheDivisionBellTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheDivisionBellTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Division Bell Songs
		Song pinkFloydTheDivisionBell01 = new Song(1, "Cluster One");
		Song pinkFloydTheDivisionBell02 = new Song(2, "What Do You Want From Me");
		Song pinkFloydTheDivisionBell03 = new Song(3, "Poles Apart");
		Song pinkFloydTheDivisionBell04 = new Song(4, "Marooned");
		Song pinkFloydTheDivisionBell05 = new Song(5, "A Great Day For Freedom");
		Song pinkFloydTheDivisionBell06 = new Song(6, "Wearing The Inside Out");
		Song pinkFloydTheDivisionBell07 = new Song(7, "Take It Back");
		Song pinkFloydTheDivisionBell08 = new Song(8, "Coming Back To Life");
		Song pinkFloydTheDivisionBell09 = new Song(9, "Keep Talking");
		Song pinkFloydTheDivisionBell10 = new Song(10, "Lost For Words");
		Song pinkFloydTheDivisionBell11 = new Song(11, "High Hopes");
		
		// Add The Songs To ArrayList
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell01);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell02);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell03);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell04);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell05);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell06);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell07);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell08);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell09);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell10);
		pinkFloydTheDivisionBellTracks.add(pinkFloydTheDivisionBell11);
			
		return pinkFloydTheDivisionBellTracks;
	}
	
	
	
	
//		Things Left Unsaid
//		Its What We Do
//		Ebb and Flow
//		Sum
//		Skins
//		Unsung
//		Anisina
//		The Lost Art of Conversation
//		On Noodle Street
//		Night Light
//		Allons-y (1)
//		Autumn 68
//		Allons-y (2)
//		Talkin Hawkin
//		Calling
//		Eyes to Pearls
//		Surfacing
//		Louder Than Words
}