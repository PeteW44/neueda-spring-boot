/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Album Class
 */

package ac.uk.belfastmet.domain;
// Import Packages
import java.util.Date;

public class Album 
{
	// Instance Variables
	private String artist;
	private String albumTitle;
	private int releaseYear;
	private int numTracks;
	private String albumArt;
	
	// Default Song Constructor
	public Album()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public Album(String artist, String albumTitle, int releaseYear, int numTracks, String albumArt)
	{
		this.setArtist(artist);
		this.setAlbumTitle(albumTitle);
		this.setReleaseYear(releaseYear);
		this.setAlbumArt(albumArt);
		this.setNumTracks(numTracks);
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
	
	public int getNumTracks() 
	{
		return numTracks;
	}

	public void setNumTracks(int numTracks) 
	{
		this.numTracks = numTracks;
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