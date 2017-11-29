/*
 * Class:           MythicalCreature.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         29/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the MythicalCreature Class
 */

package ac.uk.belfastmet.dwarfs.domain;

public abstract class MythicalCreature 
{
	// Instance Variables
	private String name;
	private String author;
	private String image;
	
	// Default Mythical Creature Constructor
	public MythicalCreature()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public MythicalCreature(String name, String author, String image)
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