/*
 * Class:           Album.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         12/11/2017
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
import javax.persistence.OneToMany;

@Entity
public class Band 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer bandId;
	
	// Instance Variables
	private String bandName;
	private String website;
	private String origin;
	
	// Collection of Albums
	@OneToMany(mappedBy = "band", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Album> albums = new HashSet<Album>();
	
	// Default Album Constructor
	public Band()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Band(Integer bandId, String bandName, String website, String origin, Set<Album> albums)
	{
		super();
		this.setBandId(bandId);
		this.setBandName(bandName);
		this.setWebsite(website);
		this.setOrigin(origin);
		this.setAlbums(albums);
	}
	
	/*
	 * GET & SET Property Methods
	 */

	public Integer getBandId() 
	{
		return bandId;
	}

	public void setBandId(Integer bandId) 
	{
		this.bandId = bandId;
	}
	
	public String getBandName() 
	{
		return bandName;
	}

	public void setBandName(String bandName)
	{
		this.bandName = bandName;
	}

	public String getWebsitee() 
	{
		return website;
	}

	public void setWebsite(String website) 
	{
		this.website = website;
	}
	
	public String getOrigin() 
	{
		return origin;
	}

	public void setOrigin(String origin) 
	{
		this.origin = origin;
	}
	
	/*
	 * GET & SET Collection of Albums
	 */
	
	public Set<Album> getAlbums() 
	{
		return albums;
	}

	public void setAlbums(Set<Album> albums) 
	{
		this.albums = albums;
	}
}