/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the Album Class
 */

package ac.uk.belfastmet.musicsaved.domain;
// Import Packages
import java.util.ArrayList;

public class Album 
{
	// Instance Variables
	private Integer albumId;
	private String artist;
	private String albumTitle;
	private Integer releaseYear;
	private ArrayList<Song> albumTracks;
	private String albumArt;
	
	// Default Album Constructor
	public Album()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Album(Integer albumId, String artist, String albumTitle, Integer releaseYear, ArrayList<Song> albumTracks, String albumArt)
	{
		super();
		this.setAlbumId(albumId);
		this.setArtist(artist);
		this.setAlbumTitle(albumTitle);
		this.setReleaseYear(releaseYear);
		this.setAlbumTracks(albumTracks);
		this.setAlbumArt(albumArt);
	}
	
	/*
	 * GET & SET Property Methods
	 */

	public Integer getAlbumId() 
	{
		return albumId;
	}

	public void setAlbumId(Integer albumId) 
	{
		this.albumId = albumId;
	}
	
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

	public Integer getReleaseYear() 
	{
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) 
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