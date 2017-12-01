/*
 * Class:           Dwarf.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Dwarf Class
 */

package ac.uk.belfastmet.dwarfsaved.domain;
// Import Packages
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dwarf
{
	// Instance Variables
	@Id
	@GeneratedValue
	private Integer dwarfId;
	private String name;
	private String author;
	private String image;
		
	// Default Dwarf Constructor
	public Dwarf()
	{
		
	}
	
	// Parameterised Dwarf Constructor
	public Dwarf(String name, String author, String image)
	{
		this.setName(name);
		this.setAuthor(author);
		this.setImage(image);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}
}