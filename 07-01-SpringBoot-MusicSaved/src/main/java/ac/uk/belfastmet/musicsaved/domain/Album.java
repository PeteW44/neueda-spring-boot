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
	@ManyToOne(fetch = FetchType.EAGER)
	private Integer bandId;
	
	// Instance Variables
	private String albumTitle;
	private Integer releaseYear;
	private String albumArt;
	
	// Collection of Songs
	@OneToMany(mappedBy = "albumID", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private ArrayList<Song> albumTracks;
	
	// Default Album Constructor
	public Album()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Album(Integer albumId, Integer bandId, String albumTitle, Integer releaseYear,  String albumArt, ArrayList<Song> albumTracks)
	{
		super();
		this.setAlbumId(albumId);
		this.setBandId(bandId);
		this.setAlbumTitle(albumTitle);
		this.setReleaseYear(releaseYear);
		this.setAlbumArt(albumArt);
		this.setAlbumTracks(albumTracks);
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
	
	public Integer getBandId() 
	{
		return bandId;
	}

	public void setBandId(Integer bandId) 
	{
		this.bandId = bandId;
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
	 * GET & SET Collection of Songs
	 */
	
	public ArrayList<Song> getAlbumTracks() 
	{
		return albumTracks;
	}

	public void setAlbumTracks(ArrayList<Song> albumTracks) 
	{
		this.albumTracks = albumTracks;
	}
}