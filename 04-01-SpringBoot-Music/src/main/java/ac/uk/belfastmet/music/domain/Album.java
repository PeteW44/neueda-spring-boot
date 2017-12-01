/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.domain
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         01/12/2017 23.30
 * Author:          Peter Wightman
 * Description:     This is the Album Class
 */

package ac.uk.belfastmet.music.domain;
// Import Packages
import java.util.ArrayList;

public class Album 
{
	// Instance Variables
	private String artist;
	private String albumTitle;
	private int releaseYear;
	private ArrayList<Song> albumTracks;
	private String albumArt;
	
	// Default Song Constructor
	public Album()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public Album(String artist, String albumTitle, int releaseYear, ArrayList<Song> albumTracks, String albumArt)
	{
		this.setArtist(artist);
		this.setAlbumTitle(albumTitle);
		this.setReleaseYear(releaseYear);
		this.setAlbumTracks(albumTracks);
		this.setAlbumArt(albumArt);
	}
	
	/*
	 * GET & SET Property Methods
	 */

	public String getArtist() 
	{
		return artist;
	}

	public void setArtist(String artist)
	{
		this.artist = artist;
	}

	public String getAlbumTitle() 
	{
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) 
	{
		this.albumTitle = albumTitle;
	}

	public int getReleaseYear() 
	{
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) 
	{
		this.releaseYear = releaseYear;
	}
	
	public ArrayList<Song> getAlbumTracks() 
	{
		return albumTracks;
	}

	public void setAlbumTracks(ArrayList<Song> albumTracks) 
	{
		this.albumTracks = albumTracks;
	}
	
	public String getAlbumArt() 
	{
		return albumArt;
	}

	public void setAlbumArt(String albumArt) 
	{
		this.albumArt = albumArt;
	}
}