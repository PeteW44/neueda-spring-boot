/*
 * Class:           Song.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Song Class
 */

package ac.uk.belfastmet.domain;

public class Song 
{
	// Instance Variables
	private int trackNum;
	private String songTitle;
	private String albumTitle;
	
	// Default Song Constructor
	public Song()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public Song(int trackNum, String songTitle, String albumTitle)
	{
		this.setTrackNum(trackNum);
		this.setSongTitle(songTitle);
		this.setAlbumTitle(albumTitle);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public int getTrackNum() 
	{
		return trackNum;
	}

	public void setTrackNum(int trackNum) 
	{
		this.trackNum = trackNum;
	}

	public String getSongTitle() 
	{
		return songTitle;
	}

	public void setSongTitle(String songTitle)
	{
		this.songTitle = songTitle;
	}

	public String getAlbumTitle() 
	{
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) 
	{
		this.albumTitle = albumTitle;
	}
}