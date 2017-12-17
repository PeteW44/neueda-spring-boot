/*
 * Class:           Song.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         17/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the Song Class
 */

package ac.uk.belfastmet.musicsaved.domain;
// Import Packages
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Song 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer songId;
	
	@NotEmpty
	@ManyToOne(fetch = FetchType.LAZY)
	private Album album;
	
	// Instance Variables
	private Integer trackNum;

	private String trackTitle;
	private String trackLength;
	
	// Default Song Constructor
	public Song()
	{
		super();
	}
	
	// Parameterised Song Constructor
	public Song(Integer songId, Album album, Integer trackNum, String trackTitle, String trackLength)
	{
		super();
		this.setSongId(songId);
		this.setAlbum(album);
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
	
	/*
	 * GET & SET Album
	 */
	
	public Album getAlbum() 
	{
		return album;
	}

	public void setAlbum(Album album) 
	{
		this.album = album;
	}
}