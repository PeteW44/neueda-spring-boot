/*
 * Class:           Dwarf.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         28/10/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Dwarf Class
 */

package ac.uk.belfastmet.dwarfs.domain;
// Import Packages
import java.io.File;

public class Dwarf extends MythicalCreature
{
	// Default Dwarf Constructor
	public Dwarf()
	{
		
	}
	
	// Parameterised Dwarf Constructor
	public Dwarf(String name, String author, File image)
	{
		super(name, author, image);
	}
}