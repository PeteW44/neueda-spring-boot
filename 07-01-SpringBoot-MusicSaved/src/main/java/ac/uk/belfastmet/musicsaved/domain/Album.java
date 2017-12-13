/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         13/12/2017 13.00
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
	private Integer releaseYear;
	private String albumArt;
	
	// Collection of Songs
	@OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Song> songs = new HashSet<Song>();
	
	// Default Album Constructor
	public Album()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Album(Integer albumId, Band band, String albumTitle, Integer releaseYear, String albumArt, Set<Song> songs)
	{
		super();
		this.setAlbumId(albumId);
		this.setBand(band);
		this.setAlbumTitle(albumTitle);
		this.setReleaseYear(releaseYear);
		this.setAlbumArt(albumArt);
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

	public Integer getReleaseYear() 
	{
		return releaseYear;
	}

	public void setReleaseYear(Integer releaseYear) 
	{
		this.releaseYear = releaseYear;
	}
	
	public String getAlbumArt() 
	{
		return albumArt;
	}

	public void setAlbumArt(String albumArt) 
	{
		this.albumArt = albumArt;
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