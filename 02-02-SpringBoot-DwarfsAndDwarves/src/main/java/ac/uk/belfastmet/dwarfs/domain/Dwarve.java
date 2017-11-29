/*
 * Class:           Dwarve.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         29/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the Dwarve Class
 */

package ac.uk.belfastmet.dwarfs.domain;

public class Dwarve extends MythicalCreature
{
	// Default Dwarve Constructor
	public Dwarve()
	{
		
	}
	
	// Parameterised Dwarve Constructor
	public Dwarve(String name, String author, String image)
	{
		super(name, author, image);
	}
}