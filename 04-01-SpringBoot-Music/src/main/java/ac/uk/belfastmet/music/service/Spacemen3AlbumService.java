/*
 * Class:           BrmcAlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.Service
 * Version:         1.0
 * Created:         01/12/2017
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
public class Spacemen3AlbumService 
{
	// Default Constructor
	public Spacemen3AlbumService() 
	{
		super();
	}
	
	// #############################
	// Spacemen 3 Sound Of Confusion
	// #############################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumSoundOfConfusion()
	{
		// Album Cover Image File
		final String spacemen3SoundOfConfusionCover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-SoundOfConfusion.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3SoundOfConfusionAlbumTracks = new ArrayList<Song>();
		spacemen3SoundOfConfusionAlbumTracks = getSpacemen3SoundOfConfusionTracks();
		
		// Create Album Object
		Album spacemen3SoundOfConfusionAlbum = new Album("Spacemen 3", "Demos", 1986, spacemen3SoundOfConfusionAlbumTracks, spacemen3SoundOfConfusionCover);
		
		return spacemen3SoundOfConfusionAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3SoundOfConfusionTracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3SoundOfConfusion = new ArrayList<Song>();
		
		// Create Spacemen 3 Sound Of Confusion Songs
		Song spacemen3SoundOfConfusion01 = new Song(1, "Losing Touch With My Mind", "5:30");
		Song spacemen3SoundOfConfusion02 = new Song(2, "Hey Man", "4:47");
		Song spacemen3SoundOfConfusion03 = new Song(3, "Rollercoaster", "7:40");
		Song spacemen3SoundOfConfusion04 = new Song(4, "Mary Anne", "4:05");
		Song spacemen3SoundOfConfusion05 = new Song(5, "Little Doll", "5:24");
		Song spacemen3SoundOfConfusion06 = new Song(6, "2.35", "3:10");
		Song spacemen3SoundOfConfusion07 = new Song(7, "O.D. Catastrophe", "8:57");

		// Add The Songs To ArrayList
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion01);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion02);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion03);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion04);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion05);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion06);
		spacemen3SoundOfConfusion.add(spacemen3SoundOfConfusion07);
		
		return spacemen3SoundOfConfusion;
	}
	
	// ###################################
	// Spacemen 3 The Perfect Prescription
	// ###################################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumThePerfectPrescription()
	{
		// Album Cover Image File
		final String spacemen3ThePerfectPrescriptionCover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-ThePerfectPrescription.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3ThePerfectPrescriptionAlbumTracks = new ArrayList<Song>();
		spacemen3ThePerfectPrescriptionAlbumTracks = getSpacemen3ThePerfectPrescriptionTracks();
		
		// Create Album Object
		Album spacemen3ThePerfectPrescriptionAlbum = new Album("Spacemen 3", "The Perfect Prescription", 1987, spacemen3ThePerfectPrescriptionAlbumTracks, spacemen3ThePerfectPrescriptionCover);
		
		return spacemen3ThePerfectPrescriptionAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3ThePerfectPrescriptionTracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3ThePerfectPrescription = new ArrayList<Song>();
		
		// Create Spacemen 3 The Perfect Prescription Songs
		Song spacemen3ThePerfectPrescription01 = new Song(1, "Take Me To The Other Side", "4:28");
		Song spacemen3ThePerfectPrescription02 = new Song(2, "Walkin' With Jesus", "3:43");
		Song spacemen3ThePerfectPrescription03 = new Song(3, "Ode To Street Hassle", "4:01");
		Song spacemen3ThePerfectPrescription04 = new Song(4, "Ecstasy Symphony", "1:54");
		Song spacemen3ThePerfectPrescription05 = new Song(5, "Transparent Radiation (Flashback)", "9:03");
		Song spacemen3ThePerfectPrescription06 = new Song(6, "Feel So Good", "5:16");
		Song spacemen3ThePerfectPrescription07 = new Song(7, "Things'll Never Be The Same", "6:05");
		Song spacemen3ThePerfectPrescription08 = new Song(8, "Come Down Easy", "6:46");
		Song spacemen3ThePerfectPrescription09 = new Song(9, "Call The Doctor", "3:52");
		
		// Add The Songs To ArrayList
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription01);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription02);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription03);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription04);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription05);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription06);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription07);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription08);
		spacemen3ThePerfectPrescription.add(spacemen3ThePerfectPrescription09);

		return spacemen3ThePerfectPrescription;
	}
	
	// ############################
	// Spacemen 3 Playing With Fire
	// ############################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumPlayingWithFire()
	{
		// Album Cover Image File
		final String spacemen3PlayingWithFireCover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-PlayingWithFire.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3PlayingWithFireAlbumTracks = new ArrayList<Song>();
		spacemen3PlayingWithFireAlbumTracks = getSpacemen3PlayingWithFireTracks();
		
		// Create Album Object
		Album spacemen3PlayingWithFireAlbum = new Album("Spacemen 3", "Playing With Fire", 1988, spacemen3PlayingWithFireAlbumTracks, spacemen3PlayingWithFireCover);
		
		return spacemen3PlayingWithFireAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3PlayingWithFireTracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3PlayingWithFire = new ArrayList<Song>();
		
		// Create Spacemen 3 Playing With Fire Songs
		Song spacemen3PlayingWithFire01 = new Song(1, "Honey", "3:01");
		Song spacemen3PlayingWithFire02 = new Song(2, "Come Down Softly To My Soul", "3:46");
		Song spacemen3PlayingWithFire03 = new Song(3, "How Does It Feel?", "7:58");
		Song spacemen3PlayingWithFire04 = new Song(4, "I Believe It", "3:19");
		Song spacemen3PlayingWithFire05 = new Song(5, "Revolution", "5:57");
		Song spacemen3PlayingWithFire06 = new Song(6, "Let Me Down Gently", "4:29");
		Song spacemen3PlayingWithFire07 = new Song(7, "So Hot (Wash Away All Of My Tears)", "2:38");
		Song spacemen3PlayingWithFire08 = new Song(8, "Suicide", "11:03");
		Song spacemen3PlayingWithFire09 = new Song(9, "Lord Can You Hear Me?", "4:33");
		Song spacemen3PlayingWithFire10 = new Song(10, "Suicide (Live)", "12:26");
		Song spacemen3PlayingWithFire11 = new Song(11, "Repeater (How Does It Feel?)", "5:28");
		
		// Add The Songs To ArrayList
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire01);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire02);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire03);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire04);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire05);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire06);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire07);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire08);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire09);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire10);
		spacemen3PlayingWithFire.add(spacemen3PlayingWithFire11);
		
		return spacemen3PlayingWithFire;
	}
	
	// ##############################
	// Spacemen 3 Live In Europe 1989
	// ##############################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumLiveInEurope1989()
	{
		// Album Cover Image File
		final String spacemen3LiveInEurope1989Cover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-LiveInEurope1989.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3LiveInEurope1989AlbumTracks = new ArrayList<Song>();
		spacemen3LiveInEurope1989AlbumTracks = getSpacemen3LiveInEurope1989Tracks();
		
		// Create Album Object
		Album spacemen3LiveInEurope1989Album = new Album("Spacemen 3", "LiveInEurope1989", 1989, spacemen3LiveInEurope1989AlbumTracks, spacemen3LiveInEurope1989Cover);
		
		return spacemen3LiveInEurope1989Album;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3LiveInEurope1989Tracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3LiveInEurope1989 = new ArrayList<Song>();
		
		// Create Spacemen 3 Live In Europe 1989 Songs
		Song spacemen3LiveInEurope198901 = new Song(1, "Rollercoaster", "5:45");
		Song spacemen3LiveInEurope198902 = new Song(2, "Mary Anne", "4:05");
		Song spacemen3LiveInEurope198903 = new Song(3, "Bo Diddley Jam", "2:37");
		Song spacemen3LiveInEurope198904 = new Song(4, "2:35", "3:33");
		Song spacemen3LiveInEurope198905 = new Song(5, "Walkin' With Jesus", "4:33");
		Song spacemen3LiveInEurope198906 = new Song(6, "I Believe It", "4:09");
		Song spacemen3LiveInEurope198907 = new Song(7, "Lord Can You Hear Me?", "3:22");
		Song spacemen3LiveInEurope198908 = new Song(8, "Things'll Never Be The Same", "5:35");
		Song spacemen3LiveInEurope198909 = new Song(9, "Starship", "3:50");
		Song spacemen3LiveInEurope198910 = new Song(10, "Revolution", "6:36");
		Song spacemen3LiveInEurope198911 = new Song(11, "Suicide", "15:52");
		Song spacemen3LiveInEurope198912 = new Song(12, "Take Me To The Other Side", "5:00");
		Song spacemen3LiveInEurope198913 = new Song(13, "Suicide (Version 2)", "16:00");

		
		// Add The Songs To ArrayList
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198901);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198902);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198903);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198904);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198905);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198906);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198907);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198908);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198909);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198910);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198911);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198912);
		spacemen3LiveInEurope1989.add(spacemen3LiveInEurope198913);
		
		return spacemen3LiveInEurope1989;
	}

	// ####################
	// Spacemen 3 Recurring
	// ####################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumRecurring()
	{
		// Album Cover Image File
		final String spacemen3RecurringCover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-Recurring.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3RecurringAlbumTracks = new ArrayList<Song>();
		spacemen3RecurringAlbumTracks = getSpacemen3RecurringTracks();
		
		// Create Album Object
		Album spacemen3RecurringAlbum = new Album("Spacemen 3", "Recurring", 1990, spacemen3RecurringAlbumTracks, spacemen3RecurringCover);
		
		return spacemen3RecurringAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3RecurringTracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3Recurring = new ArrayList<Song>();
		
		// Create Spacemen 3 Recurring Songs
		Song spacemen3Recurring01 = new Song(1, "Big City (Everybody I Know Can Be Found Here)", "10:51");
		Song spacemen3Recurring02 = new Song(2, "Just To See You Smile (Orchestral Mix)", "3:19");
		Song spacemen3Recurring03 = new Song(3, "I Love You", "5:32");
		Song spacemen3Recurring04 = new Song(4, "Set Me Free / Ive Got The Key", "5:11");
		Song spacemen3Recurring05 = new Song(5, "Set Me Free (Reprise)", "1:50");
		Song spacemen3Recurring06 = new Song(6, "Why Couldnt I See", "6:37");
		Song spacemen3Recurring07 = new Song(7, "Just To See You Smile (Instrumental)", "3:19");
		Song spacemen3Recurring08 = new Song(8, "When Tomorrow Hits", "4:26");
		Song spacemen3Recurring09 = new Song(9, "Feel So Sad (Reprise)", "2:46");
		Song spacemen3Recurring10 = new Song(10, "Hypnotized", "5:57");
		Song spacemen3Recurring11 = new Song(11, "Sometimes", "6:36");
		Song spacemen3Recurring12 = new Song(12, "Feelin Just Fine (Head Full Of Shit)", "4:33");
		Song spacemen3Recurring13 = new Song(13, "Billy Whizz / Blue1", "7:33");
		Song spacemen3Recurring14 = new Song(14, "Drive / Feel So Sad", "5:34");
		Song spacemen3Recurring15 = new Song(15, "Feelin Just Fine (Alternative Mix)", "4:30");
		
		// Add The Songs To ArrayList
		spacemen3Recurring.add(spacemen3Recurring01);
		spacemen3Recurring.add(spacemen3Recurring02);
		spacemen3Recurring.add(spacemen3Recurring03);
		spacemen3Recurring.add(spacemen3Recurring04);
		spacemen3Recurring.add(spacemen3Recurring05);
		spacemen3Recurring.add(spacemen3Recurring06);
		spacemen3Recurring.add(spacemen3Recurring07);
		spacemen3Recurring.add(spacemen3Recurring08);
		spacemen3Recurring.add(spacemen3Recurring09);
		spacemen3Recurring.add(spacemen3Recurring10);
		spacemen3Recurring.add(spacemen3Recurring11);
		spacemen3Recurring.add(spacemen3Recurring12);
		spacemen3Recurring.add(spacemen3Recurring13);
		spacemen3Recurring.add(spacemen3Recurring14);
		spacemen3Recurring.add(spacemen3Recurring15);
		
		return spacemen3Recurring;
	}
	
	// ######################
	// Spacemen 3 Dreamweapon
	// ######################
	
	// #####
	// ALBUM
	// #####
	public Album getSpacemen3AlbumDreamweapon()
	{
		// Album Cover Image File
		final String spacemen3DreamweaponCover = "images/albumCovers/Spacemen3/HiRes/Spacemen3-Dreamweapon.jpg";
		
		// Get Album Tracks
		ArrayList<Song> spacemen3DreamweaponAlbumTracks = new ArrayList<Song>();
		spacemen3DreamweaponAlbumTracks = getSpacemen3DreamweaponTracks();
		
		// Create Album Object
		Album spacemen3DreamweaponAlbum = new Album("Spacemen 3", "Dreamweapon", 1995, spacemen3DreamweaponAlbumTracks, spacemen3DreamweaponCover);
		
		return spacemen3DreamweaponAlbum;
	}
	
	// ######
	// TRACKS
	// ######
	public ArrayList<Song> getSpacemen3DreamweaponTracks()
	{
		// Local Variables
		ArrayList<Song> spacemen3Dreamweapon = new ArrayList<Song>();
		
		// Create Spacemen 3 Dreamweapon Songs
		Song spacemen3Dreamweapon01 = new Song(1, "An Evening Of Contemporary Sitar Music", "44:20");
		Song spacemen3Dreamweapon02 = new Song(2, "Ecstasy Live Intro Theme", "8:15");
		Song spacemen3Dreamweapon03 = new Song(3, "Ecstasy In Slow Motion", "9:26");
		Song spacemen3Dreamweapon04 = new Song(4, "Spacemen Jam", "15:42");

		// Add The Songs To ArrayList
		spacemen3Dreamweapon.add(spacemen3Dreamweapon01);
		spacemen3Dreamweapon.add(spacemen3Dreamweapon02);
		spacemen3Dreamweapon.add(spacemen3Dreamweapon03);
		spacemen3Dreamweapon.add(spacemen3Dreamweapon04);
		
		return spacemen3Dreamweapon;
	}
}