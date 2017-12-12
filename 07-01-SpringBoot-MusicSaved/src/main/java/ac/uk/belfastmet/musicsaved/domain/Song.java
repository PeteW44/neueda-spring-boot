/*
 * Class:           Song.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         12/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the Song Class
 */

package ac.uk.belfastmet.musicsaved.domain;

public class Song 
{
	// Instance Variables
	private Integer songId;
	private Integer albumId;
	private Integer trackNum;
	private String trackTitle;
	private String trackLength;
	
	// Default Song Constructor
	public Song()
	{
		super();
	}
	
	// Parameterised Song Constructor
	public Song(Integer songId, Integer albumId, Integer trackNum, String trackTitle, String trackLength)
	{
		super();
		this.setSongId(songId);
		this.setAlbumId(albumId);
		this.setTrackNum(trackNum);
		this.setTrackTitle(trackTitle);
		this.setTrackLength(trackLength);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public Integer getSongId() 
	{
		return songId;
	}

	public void setSongId(Integer songId) 
	{
		this.songId = songId;
	}

	public Integer getAlbumId() 
	{
		return albumId;
	}

	public void setAlbumId(Integer albumId) 
	{
		this.albumId = albumId;
	}
	
	public Integer getTrackNum() 
	{
		return trackNum;
	}

	public void setTrackNum(Integer trackNum) 
	{
		this.trackNum = trackNum;
	}

	public String getTrackTitle() 
	{
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle)
	{
		this.trackTitle = trackTitle;
	}

	public String getTrackLength() 
	{
		return trackLength;
	}

	public void setTrackLength(String trackLength) 
	{
		this.trackLength = trackLength;
	}
}