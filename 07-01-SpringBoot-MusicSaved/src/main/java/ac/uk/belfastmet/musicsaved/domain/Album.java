/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         11/11/2017
 * Updated:         05/01/2018 22.00
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Album 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer albumId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bandId")
	private Band band;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="genreId")
	private Genre genre;
	
	// Instance Variables
	private String albumTitle;
	private String albumTitleLower;
	private Integer releaseYear;
	private String albumArtLarge;
	private String albumArtSmall;
	private Boolean isLive;
	
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
	public Album(Integer albumId, Band band, Genre genre, String albumTitle, String albumTitleLower, Integer releaseYear, String albumArtLarge, String albumArtSmall, Boolean isLive, Set<Song> songs)
	{
		super();
		this.setAlbumId(albumId);
		this.setBand(band);
		this.setGenre(genre);
		this.setAlbumTitle(albumTitle);
		this.setAlbumTitleLower(albumTitleLower);
		this.setReleaseYear(releaseYear);
		this.setAlbumArtLarge(albumArtLarge);
		this.setAlbumArtSmall(albumArtSmall);
		this.setIsLive(isLive);
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
	
	public Boolean getIsLive() 
	{
		return isLive;
	}

	public void setIsLive(Boolean isLive) 
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

	public Genre getGenre() 
	{
		return genre;
	}

	public void setGenre(Genre genre) 
	{
		this.genre = genre;
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