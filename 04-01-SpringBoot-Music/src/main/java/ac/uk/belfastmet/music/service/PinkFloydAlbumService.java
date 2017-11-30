/*
 * Class:           PinkFloydAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
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
	private ArrayList<Song> pinkFloydDelicateSoundOfThunder;
	private ArrayList<Song> pinkFloydPulse;
	private ArrayList<Song> pinkFloydIsThereAnybodyOutThereTheWallLive;

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
		
		// Add BRMC Albums
		pinkFloydAlbums.add(getPinkFloydThePiperAtTheGatesOfDawn());
//		pinkFloydAlbums.add(getPinkFloydASaucerfulOfSecrets());
//		pinkFloydAlbums.add(getPinkFloydUmmagumma());
//		pinkFloydAlbums.add(getPinkFloydAtomHeartMother());
//		pinkFloydAlbums.add(getPinkFloydMeddle());
//		pinkFloydAlbums.add(getPinkFloydObscuredByClouds());
//		pinkFloydAlbums.add(getPinkFloydTheDarkSideOfTheMoon());
//		pinkFloydAlbums.add(getPinkFloydWishYouWereHere());
//		pinkFloydAlbums.add(getPinkFloydAnimals());
//		pinkFloydAlbums.add(getPinkFloydTheWall());
//		pinkFloydAlbums.add(getPinkFloydTheFinalCut());
//		pinkFloydAlbums.add(getPinkFloydAMomentaryLapseOfReason());
//		pinkFloydAlbums.add(getPinkFloydTheDivisionBell());
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
		final String pinkFloydThePiperAtTheGatesOfDawnCover = "images/albumCovers/PinkFloydPinkFloyd-ThePiperAtTheGatesOfDawn.jpg";
		
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
		
		// Create BRMC Demo Songs
		Song pinkFloydThePiperAtTheGatesOfDawn01 = new Song(1, "Astronomy Dominé");
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
}