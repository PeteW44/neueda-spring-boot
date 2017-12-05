/*
 * Class:           PinkFloydAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         05/12/2017 22.00
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
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydThePiperAtTheGatesOfDawn()
	{
		// Album Cover Image File
		final String pinkFloydThePiperAtTheGatesOfDawnCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-ThePiperAtTheGatesOfDawn.jpg";
		
		// Create Album Object
		Album pinkFloydThePiperAtTheGatesOfDawnAlbum = new Album("Pink Floyd", "The Piper At The Gates Of Dawn", 1967, getPinkFloydThePiperAtTheGatesOfDawnTracks(), pinkFloydThePiperAtTheGatesOfDawnCover);
		
		return pinkFloydThePiperAtTheGatesOfDawnAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydThePiperAtTheGatesOfDawnTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydThePiperAtTheGatesOfDawnTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Piper At The Gates Of Dawn Songs
		Song pinkFloydThePiperAtTheGatesOfDawn01 = new Song(1, "Astronomy Domine", "4:12");
		Song pinkFloydThePiperAtTheGatesOfDawn02 = new Song(2, "Lucifer Sam", "3:07");
		Song pinkFloydThePiperAtTheGatesOfDawn03 = new Song(3, "Matilda Mother", "3:07");
		Song pinkFloydThePiperAtTheGatesOfDawn04 = new Song(4, "Flaming", "2:45");
		Song pinkFloydThePiperAtTheGatesOfDawn05 = new Song(5, "Pow R. Toc H.", "4:26");
		Song pinkFloydThePiperAtTheGatesOfDawn06 = new Song(6, "Take Up Thy Stethoscope And Walk", "3:06");
		Song pinkFloydThePiperAtTheGatesOfDawn07 = new Song(7, "Interstellar Overdrive", "9:41");
		Song pinkFloydThePiperAtTheGatesOfDawn08 = new Song(8, "The Gnome", "2:13");
		Song pinkFloydThePiperAtTheGatesOfDawn09 = new Song(9, "Chapter 24", "3:41");
		Song pinkFloydThePiperAtTheGatesOfDawn10 = new Song(10, "Scarecrow", "2:10");
		Song pinkFloydThePiperAtTheGatesOfDawn11 = new Song(11, "Bike", "3:22");
		
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
	private Album getPinkFloydASaucerfulOfSecrets()
	{
		// Album Cover Image File
		final String pinkFloydASaucerfulOfSecretsCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-ASaucerfulOfSecrets.jpg";
		
		// Create Album Object
		Album pinkFloydASaucerfulOfSecretsAlbum = new Album("Pink Floyd", "A Saucerful Of Secrets", 1968, getPinkFloydASaucerfulOfSecretsTracks(), pinkFloydASaucerfulOfSecretsCover);
		
		return pinkFloydASaucerfulOfSecretsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydASaucerfulOfSecretsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydASaucerfulOfSecretsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd A Saucerful Of Secrets Songs
		Song pinkFloydASaucerfulOfSecrets01 = new Song(1, "Let There Be More Light", "5:38");
		Song pinkFloydASaucerfulOfSecrets02 = new Song(2, "Remember A Day", "4:33");
		Song pinkFloydASaucerfulOfSecrets03 = new Song(3, "Set The Controls For The Heart Of The Sun", "5:27");
		Song pinkFloydASaucerfulOfSecrets04 = new Song(4, "Corporal Clegg", "4:12");
		Song pinkFloydASaucerfulOfSecrets05 = new Song(5, "A Saucerful Of Secrets", "11:59");
		Song pinkFloydASaucerfulOfSecrets06 = new Song(6, "See-Saw", "4:36");
		Song pinkFloydASaucerfulOfSecrets07 = new Song(7, "Jugband Blues", "3:00");
		
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
	private Album getPinkFloydMore()
	{
		// Album Cover Image File
		final String pinkFloydMoreCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-More.jpg";
		
		// Create Album Object
		Album pinkFloydMoreAlbum = new Album("Pink Floyd", "More", 1969, getPinkFloydMoreTracks(), pinkFloydMoreCover);
		
		return pinkFloydMoreAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydMoreTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydMoreTracks = new ArrayList<Song>();
		
		// Create Pink Floyd More Songs
		Song pinkFloydMore01 = new Song(1, "Cirrus Minor", "5:15");
		Song pinkFloydMore02 = new Song(2, "The Nile Song", "3:25");
		Song pinkFloydMore03 = new Song(3, "Crying Song", "3:34");
		Song pinkFloydMore04 = new Song(4, "Up The Khyber", "2:13");
		Song pinkFloydMore05 = new Song(5, "Green Is The Colour", "2:58");
		Song pinkFloydMore06 = new Song(6, "Cymbaline", "4:49");
		Song pinkFloydMore07 = new Song(7, "Party Sequence", "1:10");
		Song pinkFloydMore08 = new Song(8, "Main Theme", "5:31");
		Song pinkFloydMore09 = new Song(9, "Ibiza Bar", "3:16");
		Song pinkFloydMore10 = new Song(9, "More Blues", "2:12");
		Song pinkFloydMore11 = new Song(10, "Quicksilver", "7:10");
		Song pinkFloydMore12 = new Song(11, "A Spanish Piece", "1:05");
		Song pinkFloydMore13 = new Song(12, "Dramatic Theme", "2:16");
		
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
		pinkFloydMoreTracks.add(pinkFloydMore13);
		
		return pinkFloydMoreTracks;
	}
	
	// ####################
	// Pink Floyd Ummagumma
	// ####################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydUmmagumma()
	{
		// Album Cover Image File
		final String pinkFloydUmmagummaCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-Ummagumma.jpg";
		
		// Create Album Object
		Album pinkFloydUmmagummaAlbum = new Album("Pink Floyd", "Ummagumma", 1969, getPinkFloydUmmagummaTracks(), pinkFloydUmmagummaCover);
		
		return pinkFloydUmmagummaAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydUmmagummaTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydUmmagummaTracks = new ArrayList<Song>();
		
		// Create Pink Floyd UmmaGumma Songs
		Song pinkFloydUmmagumma01 = new Song(1, "Astronomy Domine (live)", "8:32");
		Song pinkFloydUmmagumma02 = new Song(2, "Careful With That Axe, Eugene (live)", "8:49");
		Song pinkFloydUmmagumma03 = new Song(3, "Set The Controls For The Heart Of The Sun (live)", "9:27");
		Song pinkFloydUmmagumma04 = new Song(4, "A Saucerful Of Secrets (live)", "12:51");
		Song pinkFloydUmmagumma05 = new Song(5, "Sysyphus Part 1", "1:09");
		Song pinkFloydUmmagumma06 = new Song(6, "Sysyphus Part 2", "3:30");
		Song pinkFloydUmmagumma07 = new Song(7, "Sysyphus Part 3", "1:49");
		Song pinkFloydUmmagumma08 = new Song(8, "Sysyphus Part 4", "6:59");
		Song pinkFloydUmmagumma09 = new Song(9, "Grantchester Meadows", "7:27");
		Song pinkFloydUmmagumma10 = new Song(10, "Several Species Of Small Furry Animals Gathered Together....", "4:58");
		Song pinkFloydUmmagumma11 = new Song(11, "The Narrow Way Part 1", "3:28");
		Song pinkFloydUmmagumma12 = new Song(12, "The Narrow Way Part 2", "2:53");
		Song pinkFloydUmmagumma13 = new Song(13, "The Narrow Way Part 3", "5:57");
		Song pinkFloydUmmagumma14 = new Song(14, "The Grand Viziers Garden Party Part 1 (Entrance)", "0:59");
		Song pinkFloydUmmagumma15 = new Song(15, "The Grand Viziers Garden Party Part 2 (Entertainment)", "7:06");
		Song pinkFloydUmmagumma16 = new Song(16, "The Grand Viziers Garden Party Part 3 (Exit", "0:42)");

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
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma12);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma13);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma14);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma15);
		pinkFloydUmmagummaTracks.add(pinkFloydUmmagumma16);
		
		return pinkFloydUmmagummaTracks;
	}
	
	// ############################
	// Pink Floyd Atom Heart Mother
	// ############################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydAtomHeartMother()
	{
		// Album Cover Image File
		final String pinkFloydAtomHeartMotherCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-AtomHeartMother.jpg";
		
		// Create Album Object
		Album pinkFloydAtomHeartMotherAlbum = new Album("Pink Floyd", "Atom Heart Mother", 1970, getPinkFloydAtomHeartMotherTracks(), pinkFloydAtomHeartMotherCover);
		
		return pinkFloydAtomHeartMotherAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydAtomHeartMotherTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAtomHeartMotherTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Atom Heart Mother Songs
		Song pinkFloydAtomHeartMother01 = new Song(1, "Atom Heart Mother", "23:42");
		Song pinkFloydAtomHeartMother02 = new Song(2, "If", "4:30");
		Song pinkFloydAtomHeartMother03 = new Song(3, "Summer 68", "5:29");
		Song pinkFloydAtomHeartMother04 = new Song(4, "Fat Old Sun", "5:23");
		Song pinkFloydAtomHeartMother05 = new Song(5, "Alans Psychedelic Breakfast", "13:01");

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
	private Album getPinkFloydMeddle()
	{
		// Album Cover Image File
		final String pinkFloydMeddleCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-Meddle.jpg";
		
		// Create Album Object
		Album pinkFloydMeddleAlbum = new Album("Pink Floyd", "Meddle", 1971, getPinkFloydMeddleTracks(), pinkFloydMeddleCover);
		
		return pinkFloydMeddleAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydMeddleTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydMeddleTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Meddle Songs
		Song pinkFloydMeddle01 = new Song(1, "One Of These Days", "5:50");
		Song pinkFloydMeddle02 = new Song(2, "A Pillow Of Winds", "5:10");
		Song pinkFloydMeddle03 = new Song(3, "Fearless", "6:03");
		Song pinkFloydMeddle04 = new Song(4, "San Tropez", "3:42");
		Song pinkFloydMeddle05 = new Song(5, "Seamus", "2:09");
		Song pinkFloydMeddle06 = new Song(6, "Echoes", "23:31");

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
	private Album getPinkFloydObscuredByClouds()
	{
		// Album Cover Image File
		final String pinkFloydObscuredByCloudsCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-ObscuredByClouds.jpg";
		
		// Create Album Object
		Album pinkFloydObscuredByCloudsAlbum = new Album("Pink Floyd", "Obscured By Clouds", 1972, getPinkFloydObscuredByCloudsTracks(), pinkFloydObscuredByCloudsCover);
		
		return pinkFloydObscuredByCloudsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydObscuredByCloudsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydObscuredByCloudsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Obscured By Clouds Songs
		Song pinkFloydObscuredByClouds01 = new Song(1, "Obscured By Clouds", "3:04");
		Song pinkFloydObscuredByClouds05 = new Song(2, "When Youre In", "2:27");
		Song pinkFloydObscuredByClouds03 = new Song(3, "Burning Bridges", "3:28");
		Song pinkFloydObscuredByClouds04 = new Song(4, "The Gold Its In The...", "3:06");
		Song pinkFloydObscuredByClouds02 = new Song(5, "Mudmen", "5:08");
		Song pinkFloydObscuredByClouds06 = new Song(6, "Wots... Uh The Deal", "4:19");
		Song pinkFloydObscuredByClouds07 = new Song(7, "Childhoods End", "4:34");
		Song pinkFloydObscuredByClouds08 = new Song(8, "Free Four", "4:15");
		Song pinkFloydObscuredByClouds09 = new Song(9, "Stay", "4:06");
		Song pinkFloydObscuredByClouds10 = new Song(10, "Absolutely Curtains", "5:51");
		
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
	private Album getPinkFloydTheDarkSideOfTheMoon()
	{
		// Album Cover Image File
		final String pinkFloydTheDarkSideOfTheMoonCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-TheDarkSideOfTheMoon.jpg";
		
		// Create Album Object
		Album pinkFloydTheDarkSideOfTheMoonAlbum = new Album("Pink Floyd", "The Dark Side Of The Moon", 1973, getPinkFloydTheDarkSideOfTheMoonTracks(), pinkFloydTheDarkSideOfTheMoonCover);
		
		return pinkFloydTheDarkSideOfTheMoonAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydTheDarkSideOfTheMoonTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheDarkSideOfTheMoonTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Dark Side Of The Moon Songs
		Song pinkFloydTheDarkSideOfTheMoon01 = new Song(1, "Speak To Me", "1:30");
		Song pinkFloydTheDarkSideOfTheMoon02 = new Song(2, "Breathe (In The Air)", "2:43");
		Song pinkFloydTheDarkSideOfTheMoon03 = new Song(3, "On The Run", "3:30");
		Song pinkFloydTheDarkSideOfTheMoon04 = new Song(4, "Time", "6:53");
		Song pinkFloydTheDarkSideOfTheMoon05 = new Song(5, "The Great Gig In The Sky", "4:15");
		Song pinkFloydTheDarkSideOfTheMoon06 = new Song(6, "Money", "6:30");
		Song pinkFloydTheDarkSideOfTheMoon07 = new Song(7, "Us And Them", "7:51");
		Song pinkFloydTheDarkSideOfTheMoon08 = new Song(8, "Any Colour You Like", "3:24");
		Song pinkFloydTheDarkSideOfTheMoon09 = new Song(9, "Brain Damage", "3:50");
		Song pinkFloydTheDarkSideOfTheMoon10 = new Song(10, "Eclipse", "1:45");
		
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
	private Album getPinkFloydWishYouWereHere()
	{
		// Album Cover Image File
		final String pinkFloydWishYouWereHereCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-WishYouWereHere.jpg";
		
		// Create Album Object
		Album pinkFloydWishYouWereHereAlbum = new Album("Pink Floyd", "Wish You Were Here", 1975, getPinkFloydWishYouWereHereTracks(), pinkFloydWishYouWereHereCover);
		
		return pinkFloydWishYouWereHereAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydWishYouWereHereTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydWishYouWereHereTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Wish You Were Here Songs
		Song pinkFloydWishYouWereHere01 = new Song(1, "Shine On You Crazy Diamond Parts 1-5", "13:40");
		Song pinkFloydWishYouWereHere02 = new Song(2, "Welcome To The Machine", "7:31");
		Song pinkFloydWishYouWereHere03 = new Song(3, "Have A Cigar", "5:08");
		Song pinkFloydWishYouWereHere04 = new Song(4, "Wish You Were Here", "5:34");
		Song pinkFloydWishYouWereHere05 = new Song(5, "Shine On You Crazy Diamond Parts 6-9", "12:31");

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
	private Album getPinkFloydAnimals()
	{
		// Album Cover Image File
		final String pinkFloydAnimalsCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-Animals.jpg";
		
		// Create Album Object
		Album pinkFloydAnimalsAlbum = new Album("Pink Floyd", "Animals", 1977, getPinkFloydAnimalsTracks(), pinkFloydAnimalsCover);
		
		return pinkFloydAnimalsAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydAnimalsTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAnimalsTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Animals Songs
		Song pinkFloydAnimals01 = new Song(1, "Pigs On The Wing, Part 1", "1:24");
		Song pinkFloydAnimals02 = new Song(2, "Dogs", "17:01");
		Song pinkFloydAnimals03 = new Song(3, "Pigs (Three Different Ones)", "11:20");
		Song pinkFloydAnimals04 = new Song(4, "Sheep", "10:22");
		Song pinkFloydAnimals05 = new Song(5, "Pigs On The Wing, Part 2", "1:24");
		
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
	private Album getPinkFloydTheWall()
	{
		// Album Cover Image File
		final String pinkFloydTheWallCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-TheWall.jpg";
		
		// Create Album Object
		Album pinkFloydTheWallAlbum = new Album("Pink Floyd", "The Wall", 1979, getPinkFloydTheWallTracks(), pinkFloydTheWallCover);
		
		return pinkFloydTheWallAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydTheWallTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheWallTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Wall Songs
		Song pinkFloydTheWall01 = new Song(1, "In The Flesh", "3:22");
		Song pinkFloydTheWall02 = new Song(2, "The Thin Ice", "2:25");
		Song pinkFloydTheWall03 = new Song(3, "Another Brick In The Wall, Part 1", "3:46");
		Song pinkFloydTheWall04 = new Song(4, "The Happiest Days Of Our Lives", "1:21");
		Song pinkFloydTheWall05 = new Song(5, "Another Brick In The Wall, Part 2", "4:00");
		Song pinkFloydTheWall06 = new Song(6, "Mother", "6:00");
		Song pinkFloydTheWall07 = new Song(7, "Goodbye Blue Sky", "2:53");
		Song pinkFloydTheWall08 = new Song(8, "Empty Spaces", "2:04");
		Song pinkFloydTheWall09 = new Song(9, "Young Lust", "3:29");
		Song pinkFloydTheWall10 = new Song(10, "One Of My Turns", "3:37");
		Song pinkFloydTheWall11 = new Song(11, "Dont Leave Me Now", "4:16");
		Song pinkFloydTheWall12 = new Song(12, "Another Brick In The Wall, Part 3", "1:43");
		Song pinkFloydTheWall13 = new Song(13, "Goodbye Cruel World", "0:45");
		Song pinkFloydTheWall14 = new Song(14, "Hey You", "4:44");
		Song pinkFloydTheWall15 = new Song(15, "Is There Anybody Out There?", "2:48");
		Song pinkFloydTheWall16 = new Song(16, "Nobody Home", "3:37");
		Song pinkFloydTheWall17 = new Song(17, "Vera", "1:22");
		Song pinkFloydTheWall18 = new Song(18, "Bring The Boys Back Home", "1:17");
		Song pinkFloydTheWall19 = new Song(19, "Comfortably Numb", "6:20");
		Song pinkFloydTheWall20 = new Song(20, "The Show Must Go On", "1:37");
		Song pinkFloydTheWall21 = new Song(21, "In The Flesh", "4:15");
		Song pinkFloydTheWall22 = new Song(22, "Run Like Hell", "4:23");
		Song pinkFloydTheWall23 = new Song(23, "Waiting For The Worms", "3:56");
		Song pinkFloydTheWall24 = new Song(24, "Stop", "0:33");
		Song pinkFloydTheWall25 = new Song(25, "The Trial", "5:18");
		Song pinkFloydTheWall26 = new Song(26, "Outside The Wall", "1:43");
		
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
	private Album getPinkFloydTheFinalCut()
	{
		// Album Cover Image File
		final String pinkFloydTheFinalCutCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-TheFinalCut.jpg";
		
		// Create Album Object
		Album pinkFloydTheFinalCutAlbum = new Album("Pink Floyd", "The Final Cut", 1982, getPinkFloydTheFinalCutTracks(), pinkFloydTheFinalCutCover);
		
		return pinkFloydTheFinalCutAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydTheFinalCutTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheFinalCutTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Final Cut Songs
		Song pinkFloydTheFinalCut01 = new Song(1, "The Post War Dream", "3:02");
		Song pinkFloydTheFinalCut02 = new Song(2, "Your Possible Pasts", "4:22");
		Song pinkFloydTheFinalCut03 = new Song(3, "When The Tigers Broke Free", "1:23");
		Song pinkFloydTheFinalCut04 = new Song(4, "The Heros Return", "2:56");
		Song pinkFloydTheFinalCut05 = new Song(5, "The Gunners Dream", "5:07");
		Song pinkFloydTheFinalCut06 = new Song(6, "Paranoid Eyes", "3:40");
		Song pinkFloydTheFinalCut07 = new Song(7, "Get Your Filthy Hands Off My Desert", "1:19");
		Song pinkFloydTheFinalCut08 = new Song(8, "The Fletcher Memorial Home", "4:11");
		Song pinkFloydTheFinalCut09 = new Song(9, "Southampton Dock", "2:13");
		Song pinkFloydTheFinalCut10 = new Song(10, "The Final Cut", "4:46");
		Song pinkFloydTheFinalCut11 = new Song(11, "Not Now John", "5:01");
		Song pinkFloydTheFinalCut12 = new Song(12, "Two Suns In The Sunset", "5:14");

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
	private Album getPinkFloydAMomentaryLapseOfReason()
	{
		// Album Cover Image File
		final String pinkFloydAMomentaryLapseOfReasonCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-AMomentaryLapseOfReason.jpg";
		
		// Create Album Object
		Album pinkFloydAMomentaryLapseOfReasonAlbum = new Album("Pink Floyd", "A Momentary Lapse Of Reason", 1987, getPinkFloydAMomentaryLapseOfReasonTracks(), pinkFloydAMomentaryLapseOfReasonCover);
		
		return pinkFloydAMomentaryLapseOfReasonAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydAMomentaryLapseOfReasonTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydAMomentaryLapseOfReasonTracks = new ArrayList<Song>();
		
		// Create Pink Floyd A Momentary Lapse Of Reason Songs
		Song pinkFloydAMomentaryLapseOfReason01 = new Song(1, "Signs Of Life", "4:24");
		Song pinkFloydAMomentaryLapseOfReason02 = new Song(2, "Learning To Fly", "4:53");
		Song pinkFloydAMomentaryLapseOfReason03 = new Song(3, "The Dogs Of War", "6:05");
		Song pinkFloydAMomentaryLapseOfReason04 = new Song(4, "One Slip", "5:10");
		Song pinkFloydAMomentaryLapseOfReason05 = new Song(5, "On The Turning Away", "5:42");
		Song pinkFloydAMomentaryLapseOfReason06 = new Song(6, "Yet Another Movie", "6:13");
		Song pinkFloydAMomentaryLapseOfReason07 = new Song(7, "Round And Around", "1:13");
		Song pinkFloydAMomentaryLapseOfReason08 = new Song(8, "A New Machine, Part 1", "1:46");
		Song pinkFloydAMomentaryLapseOfReason09 = new Song(9, "Terminal Frost", "6:17");
		Song pinkFloydAMomentaryLapseOfReason10 = new Song(10, "A New Machine, Part 2", "0:38");
		Song pinkFloydAMomentaryLapseOfReason11 = new Song(11, "Sorrow", "8:46");

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
	
	// ####################################
	// Pink Floyd Delicate Sound Of Thunder
	// ####################################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydDelicateSoundOfThunder()
	{
		// Album Cover Image File
		final String pinkFloydDelicateSoundOfThunderCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-DelicateSoundOfThunder.jpg";
		
		// Create Album Object
		Album pinkFloydDelicateSoundOfThunderAlbum = new Album("Pink Floyd", "Delicate Sound Of Thunder", 1988, getPinkFloydDelicateSoundOfThunderTracks(), pinkFloydDelicateSoundOfThunderCover);
		
		return pinkFloydDelicateSoundOfThunderAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydDelicateSoundOfThunderTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydDelicateSoundOfThunderTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Delicate Sound Of Thunder Songs
		Song pinkFloydDelicateSoundOfThunder01 = new Song(1, "Shine On You Crazy Diamond", "11:54");
		Song pinkFloydDelicateSoundOfThunder02 = new Song(2, "Learning To Fly", "5:27");
		Song pinkFloydDelicateSoundOfThunder03 = new Song(3, "Yet Another Movie", "6:21");
		Song pinkFloydDelicateSoundOfThunder04 = new Song(4, "Round And Around", "0:33");
		Song pinkFloydDelicateSoundOfThunder05 = new Song(5, "Sorrow", "9:28");
		Song pinkFloydDelicateSoundOfThunder06 = new Song(6, "The Dogs Of War", "7:19");
		Song pinkFloydDelicateSoundOfThunder07 = new Song(7, "On The Turning Away", "7:57");
		Song pinkFloydDelicateSoundOfThunder08 = new Song(8, "One Of These Days", "6:16");
		Song pinkFloydDelicateSoundOfThunder09 = new Song(9, "Time", "5:16");
		Song pinkFloydDelicateSoundOfThunder10 = new Song(10, "Wish You Were Here", "4:49");
		Song pinkFloydDelicateSoundOfThunder11 = new Song(11, "Money", "7:22");
		Song pinkFloydDelicateSoundOfThunder12 = new Song(12, "Money", "9:52");
		Song pinkFloydDelicateSoundOfThunder13 = new Song(13, "Another Brick In The Wall, Part 2", "5:29");
		Song pinkFloydDelicateSoundOfThunder14 = new Song(14, "Comfortably Numb", "8:56");
		Song pinkFloydDelicateSoundOfThunder15 = new Song(15, "Run Like Hell", "7:12");
		
		// Add The Songs To ArrayList
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder01);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder02);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder03);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder04);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder05);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder06);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder07);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder08);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder09);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder10);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder11);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder12);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder13);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder14);
		pinkFloydDelicateSoundOfThunderTracks.add(pinkFloydDelicateSoundOfThunder15);
			
		return pinkFloydDelicateSoundOfThunderTracks;
	}
	
	// ############################
	// Pink Floyd The Division Bell
	// ############################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydTheDivisionBell()
	{
		// Album Cover Image File
		final String pinkFloydTheDivisionBellCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-TheDivisionBell.jpg";
		
		// Create Album Object
		Album pinkFloydTheDivisionBellAlbum = new Album("Pink Floyd", "The Division Bell", 1994, getPinkFloydTheDivisionBellTracks(), pinkFloydTheDivisionBellCover);
		
		return pinkFloydTheDivisionBellAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydTheDivisionBellTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheDivisionBellTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Division Bell Songs
		Song pinkFloydTheDivisionBell01 = new Song(1, "Cluster One", "5:58");
		Song pinkFloydTheDivisionBell02 = new Song(2, "What Do You Want From Me", "4:21");
		Song pinkFloydTheDivisionBell03 = new Song(3, "Poles Apart", "7:04");
		Song pinkFloydTheDivisionBell04 = new Song(4, "Marooned", "5:28");
		Song pinkFloydTheDivisionBell05 = new Song(5, "A Great Day For Freedom", "4:18");
		Song pinkFloydTheDivisionBell06 = new Song(6, "Wearing The Inside Out", "6:48");
		Song pinkFloydTheDivisionBell07 = new Song(7, "Take It Back", "6:12");
		Song pinkFloydTheDivisionBell08 = new Song(8, "Coming Back To Life", "6:19");
		Song pinkFloydTheDivisionBell09 = new Song(9, "Keep Talking", "6:11");
		Song pinkFloydTheDivisionBell10 = new Song(10, "Lost For Words", "5:14");
		Song pinkFloydTheDivisionBell11 = new Song(11, "High Hopes", "7:58");
		
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
	
	// ################
	// Pink Floyd Pulse
	// ################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydPulse()
	{
		// Album Cover Image File
		final String pinkFloydPulseCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-Pulse.jpg";
		
		// Create Album Object
		Album pinkFloydPulseAlbum = new Album("Pink Floyd", "Pulse", 1995, getPinkFloydPulseTracks(), pinkFloydPulseCover);
		
		return pinkFloydPulseAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydPulseTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydPulseTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Pulse Songs
		Song pinkFloydPulse01 = new Song(1, "Shine On You Crazy Diamond", "13:35");
		Song pinkFloydPulse02 = new Song(2, "Astronomy Domine", "4:20");
		Song pinkFloydPulse03 = new Song(3, "What Do You Want From Me", "4:09");
		Song pinkFloydPulse04 = new Song(4, "Learning To Fly", "5:15");
		Song pinkFloydPulse05 = new Song(5, "Keep Talking", "6:52");
		Song pinkFloydPulse06 = new Song(6, "Coming Back To Life", "6:56");
		Song pinkFloydPulse07 = new Song(7, "Hey You", "4:39");
		Song pinkFloydPulse08 = new Song(8, "A Great Day For Freedom", "4:30");
		Song pinkFloydPulse09 = new Song(9, "Sorrow", "10:49");
		Song pinkFloydPulse10 = new Song(10, "High Hopes", "7:52");
		Song pinkFloydPulse11 = new Song(11, "Another Brick In The Wall, Part 2", "7:07");
		Song pinkFloydPulse12 = new Song(12, "Speak To Me", "2:30");
		Song pinkFloydPulse13 = new Song(13, "Breathe (In The Air)", "2:33");
		Song pinkFloydPulse14 = new Song(14, "On The Run", "3:47");
		Song pinkFloydPulse15 = new Song(15, "Time", "6:46");
		Song pinkFloydPulse16 = new Song(16, "The Great Gig In The Sky", "5:52");
		Song pinkFloydPulse17 = new Song(17, "Money", "8:54");
		Song pinkFloydPulse18 = new Song(18, "Us And Them", "6:57");
		Song pinkFloydPulse19 = new Song(19, "Any Colour You Like", "3:21");
		Song pinkFloydPulse20 = new Song(20, "Brain Damage", "3:45");
		Song pinkFloydPulse21 = new Song(21, "Eclipse", "2:37");
		Song pinkFloydPulse22 = new Song(22, "Wish You Were Here", "6:35");
		Song pinkFloydPulse23 = new Song(23, "Comfortably Numb", "9:29");
		Song pinkFloydPulse24 = new Song(24, "Run Like Hell", "8:36");
		
		// Add The Songs To ArrayList
		pinkFloydPulseTracks.add(pinkFloydPulse01);
		pinkFloydPulseTracks.add(pinkFloydPulse02);
		pinkFloydPulseTracks.add(pinkFloydPulse03);
		pinkFloydPulseTracks.add(pinkFloydPulse04);
		pinkFloydPulseTracks.add(pinkFloydPulse05);
		pinkFloydPulseTracks.add(pinkFloydPulse06);
		pinkFloydPulseTracks.add(pinkFloydPulse07);
		pinkFloydPulseTracks.add(pinkFloydPulse08);
		pinkFloydPulseTracks.add(pinkFloydPulse09);
		pinkFloydPulseTracks.add(pinkFloydPulse10);
		pinkFloydPulseTracks.add(pinkFloydPulse11);
		pinkFloydPulseTracks.add(pinkFloydPulse12);
		pinkFloydPulseTracks.add(pinkFloydPulse13);
		pinkFloydPulseTracks.add(pinkFloydPulse14);
		pinkFloydPulseTracks.add(pinkFloydPulse15);
		pinkFloydPulseTracks.add(pinkFloydPulse16);
		pinkFloydPulseTracks.add(pinkFloydPulse17);
		pinkFloydPulseTracks.add(pinkFloydPulse18);
		pinkFloydPulseTracks.add(pinkFloydPulse19);
		pinkFloydPulseTracks.add(pinkFloydPulse20);
		pinkFloydPulseTracks.add(pinkFloydPulse21);
		pinkFloydPulseTracks.add(pinkFloydPulse22);
		pinkFloydPulseTracks.add(pinkFloydPulse23);
		pinkFloydPulseTracks.add(pinkFloydPulse24);
			
		return pinkFloydPulseTracks;
	}
	
	// ###################################################
	// Pink Floyd Is There Anybody Out There The Wall Live
	// ###################################################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydIsThereAnybodyOutThereTheWallLive()
	{
		// Album Cover Image File
		final String pinkFloydIsThereAnybodyOutThereTheWallLiveCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-IsThereAnybodyOutThereTheWallLive.jpg";
		
		// Create Album Object
		Album pinkFloydIsThereAnybodyOutThereTheWallLiveAlbum = new Album("Pink Floyd", "There Anybody Out There The Wall Live", 2000, getPinkFloydIsThereAnybodyOutThereTheWallLiveTracks(), pinkFloydIsThereAnybodyOutThereTheWallLiveCover);
		
		return pinkFloydIsThereAnybodyOutThereTheWallLiveAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydIsThereAnybodyOutThereTheWallLiveTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydIsThereAnybodyOutThereTheWallLiveTracks = new ArrayList<Song>();
		
		// Create Pink Floyd Is There Anybody Out There The Wall Live Songs
		Song pinkFloydIsThereAnybodyOutThereTheWallLive01 = new Song(1, "Master Of Ceremonies", "1:14");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive02 = new Song(2, "In The Flesh?", "3:00");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive03 = new Song(3, "The Thin Ice", "2:50");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive04 = new Song(4, "Another Brick In The Wall (Part 1)", "4:13");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive05 = new Song(5, "The Happiest Days Of Our Lives", "4:13");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive06 = new Song(6, "Another Brick In The Wall (Part 2)", "6:19");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive07 = new Song(7, "Mother", "7:54");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive08 = new Song(8, "Goodbye Blue Sky", "3:15");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive09 = new Song(9, "Empty Spaces", "2:15");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive10 = new Song(10, "What Shall We Do Now?", "1:41");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive11 = new Song(11, "Young Lust", "5:17");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive12 = new Song(12, "One Of My Turns", "3:41");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive13 = new Song(13, "Don't Leave Me Now", "4:08");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive14 = new Song(14, "Another Brick In The Wall (Part 3)", "1:15");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive15 = new Song(15, "The Last Few Bricks", "3:26");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive16 = new Song(16, "Goodbye Cruel World", "1:41");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive17 = new Song(17, "Hey You", "4:55");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive18 = new Song(18, "Is There Anybody Out There?", "3:09");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive19 = new Song(19, "Nobody Home", "3:16");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive20 = new Song(20, "Vera", "1:20");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive21 = new Song(21, "Bring The Boys Back Home", "1:28");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive22 = new Song(22, "Comfortably Numb", "7:26");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive23 = new Song(23, "The Show Must Go On", "2:35");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive24 = new Song(24, "MC: Atmos", "0:38");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive25 = new Song(25, "In The Flesh", "4:22");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive26 = new Song(26, "Run Like Hell", "7:06");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive27 = new Song(27, "Waiting For The Worms", "4:14");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive28 = new Song(28, "Stop", "0:33");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive29 = new Song(29, "The Trial", "6:03");
		Song pinkFloydIsThereAnybodyOutThereTheWallLive30 = new Song(30, "Outside The Wall", "1:51");

		// Add The Songs To ArrayList
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive01);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive02);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive03);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive04);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive05);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive06);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive07);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive08);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive09);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive10);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive11);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive12);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive13);		
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive14);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive15);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive16);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive17);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive18);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive19);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive20);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive21);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive22);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive23);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive24);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive25);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive26);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive27);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive28);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive29);
		pinkFloydIsThereAnybodyOutThereTheWallLiveTracks.add(pinkFloydIsThereAnybodyOutThereTheWallLive30);
			
		return pinkFloydIsThereAnybodyOutThereTheWallLiveTracks;
	}
		
	// ############################
	// Pink Floyd The Endless River
	// ############################
	
	// #####
	// ALBUM
	// #####
	private Album getPinkFloydTheEndlessRiver()
	{
		// Album Cover Image File
		final String pinkFloydTheEndlessRiverCover = "images/albumCovers/PinkFloyd/HiRes/PinkFloyd-TheEndlessRiver.jpg";
		
		// Create Album Object
		Album pinkFloydTheEndlessRiverAlbum = new Album("Pink Floyd", "The Endless River", 2014, getPinkFloydTheEndlessRiverTracks(), pinkFloydTheEndlessRiverCover);
		
		return pinkFloydTheEndlessRiverAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	private ArrayList<Song> getPinkFloydTheEndlessRiverTracks()
	{
		// Local Variables
		ArrayList<Song> pinkFloydTheEndlessRiverTracks = new ArrayList<Song>();
		
		// Create Pink Floyd The Endless River Songs
		Song pinkFloydTheEndlessRiver01 = new Song(1, "Things Left Unsaid", "4:27");
		Song pinkFloydTheEndlessRiver02 = new Song(2, "Its What We Do", "6:17");
		Song pinkFloydTheEndlessRiver03 = new Song(3, "Ebb and Flow", "1:56");
		Song pinkFloydTheEndlessRiver04 = new Song(4, "Sum", "4:48");
		Song pinkFloydTheEndlessRiver05 = new Song(5, "Skins", "2:37");
		Song pinkFloydTheEndlessRiver06 = new Song(6, "Unsung", "1:07");
		Song pinkFloydTheEndlessRiver07 = new Song(7, "Anisina", "3:17");
		Song pinkFloydTheEndlessRiver08 = new Song(8, "The Lost Art of Conversation", "1:43");
		Song pinkFloydTheEndlessRiver09 = new Song(9, "On Noodle Street", "1:42");
		Song pinkFloydTheEndlessRiver10 = new Song(10, "Night Light", "1:42");
		Song pinkFloydTheEndlessRiver11 = new Song(11, "Allons-y (1)", "1:57");
		Song pinkFloydTheEndlessRiver12 = new Song(12, "Autumn 68", "1:35");
		Song pinkFloydTheEndlessRiver13 = new Song(13, "Allons-y (2)", "1:32");
		Song pinkFloydTheEndlessRiver14 = new Song(14, "Talkin Hawkin", "3:30");
		Song pinkFloydTheEndlessRiver15 = new Song(15, "Calling", "3:38");
		Song pinkFloydTheEndlessRiver16 = new Song(16, "Eyes to Pearls", "1:51");
		Song pinkFloydTheEndlessRiver17 = new Song(17, "Surfacing", "2:46");
		Song pinkFloydTheEndlessRiver18 = new Song(18, "Louder Than Words", "6:37");
		
		// Add The Songs To ArrayList");
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver01);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver02);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver03);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver04);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver05);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver06);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver07);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver08);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver09);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver10);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver11);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver12);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver13);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver14);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver15);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver16);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver17);
		pinkFloydTheEndlessRiverTracks.add(pinkFloydTheEndlessRiver18);
			
		return pinkFloydTheEndlessRiverTracks;
	}
}