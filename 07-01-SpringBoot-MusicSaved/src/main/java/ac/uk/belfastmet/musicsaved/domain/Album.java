/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         18/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the Album Class
 */

package ac.uk.belfastmet.musicsaved.domain;
// Import Packages
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Album 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer albumId;
	
	@NotEmpty
	@ManyToOne(fetch = FetchType.LAZY)
	private Band band;
	
	// Instance Variables
	private String albumTitle;
	private String albumTitleLower;
	private Integer releaseYear;
	private String albumArtLarge;
	private String albumArtSmall;
	private boolean isLive;
	
	// Collection of Songs
	@OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@OrderBy("trackNum")
	private Set<Song> songs = new HashSet<Song>();
	
	// Default Album Constructor
	public Album()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Album(Integer albumId, Band band, String albumTitle, String albumTitleLower, Integer releaseYear, String albumArtLarge, String albumArtSmall, boolean isLive, Set<Song> songs)
	{
		super();
		this.setAlbumId(albumId);
		this.setBand(band);
		this.setAlbumTitle(albumTitle);
		this.setAlbumTitleLower(albumTitleLower);
		this.setReleaseYear(releaseYear);
		this.setAlbumArtLarge(albumArtLarge);
		this.setAlbumArtSmall(albumArtSmall);
		this.setLive(isLive);
		this.setSongs(songs);
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

	public String getAlbumTitle() 
	{
		return albumTitle;
	}

	public void setAlbumTitle(String albumTitle) 
	{
		this.albumTitle = albumTitle;
	}

	public String getAlbumTitleLower() 
	{
		return albumTitleLower;
	}

	public void setAlbumTitleLower(String albumTitleLower) 
	{
		this.albumTitleLower = albumTitleLower;
	}
	
	public Integer getReleaseYear() 
	{
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) 
	{
		this.releaseYear = releaseYear;
	}
	
	public String getAlbumArtLarge() 
	{
		return albumArtLarge;
	}

	public void setAlbumArtLarge(String albumArtLarge) 
	{
		this.albumArtLarge = albumArtLarge;
	}
	
	public String getAlbumArtSmall() 
	{
		return albumArtSmall;
	}

	public void setAlbumArtSmall(String albumArtSmall) 
	{
		this.albumArtSmall = albumArtSmall;
	}
	
	public boolean isLive() 
	{
		return isLive;
	}

	public void setLive(boolean isLive) 
	{
		this.isLive = isLive;
	}
	
	/*
	 * GET & SET Band and Collection of Songs
	 */
	
	public Band getBand() 
	{
		return band;
	}

	public void setBand(Band band) 
	{
		this.band = band;
	}

	public Set<Song> getSongs() 
	{
		return songs;
	}

	public void setSongs(Set<Song> songs) 
	{
		this.songs = songs;
	}
}