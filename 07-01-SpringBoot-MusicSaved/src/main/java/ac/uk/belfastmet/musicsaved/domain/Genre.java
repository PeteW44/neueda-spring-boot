/*
 * Class:           Genre.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.domain
 * Version:         1.0
 * Created:         19/11/2017
 * Updated:         20/12/2017 23.00
 * Author:          Peter Wightman
 * Description:     This is the Genre Class
 */

package ac.uk.belfastmet.musicsaved.domain;
// Import Packages
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Genre 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer genreId;

	// Instance Variables
	private String genreName;
	private String genreNameLower;
	
	// Default Album Constructor
	public Genre()
	{
		super();
	}
	
	// Parameterised Album Constructor
	public Genre(Integer genreId, String genreName, String genreNameLower)
	{
		super();
		this.setGenreId(genreId);
		this.setGenreName(genreName);
		this.setGenreName(genreName);
	}
	
	/*
	 * GET & SET Property Methods
	 */

	public Integer getGenreId() 
	{
		return genreId;
	}

	public void setGenreId(Integer genreId) 
	{
		this.genreId = genreId;
	}
	
	public String getGenreName() 
	{
		return genreName;
	}

	public void setGenreName(String genreName)
	{
		this.genreName = genreName;
	}
	
	public String getGenreNameLower() 
	{
		return genreNameLower;
	}

	public void setGenreNameLower(String genreNameLower)
	{
		this.genreNameLower = genreNameLower;
	}
}