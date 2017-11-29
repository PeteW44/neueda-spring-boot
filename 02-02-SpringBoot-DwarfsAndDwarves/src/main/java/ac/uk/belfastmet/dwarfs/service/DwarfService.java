/*
 * Class:           DwarfService.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.service
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DwarfService Class
 */

package ac.uk.belfastmet.dwarfs.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.dwarfs.domain.Dwarf;

@Service
public class DwarfService
{
	private ArrayList<Dwarf> disneyDwarfs;
	
	public DwarfService() 
	{
		super();
	}

	public ArrayList<Dwarf> getDisneyDwarfs()
	{
		// The Seven Dwarfs Image Files
		final String happyImage = "images/TheSevenDwarfs/happy.jpg";
		final String sleepyImage = "images/TheSevenDwarfs/sleepy.jpg";
		final String dopeyImage = "images/TheSevenDwarfs/dopey.jpg";
		final String bashfulImage = "images/TheSevenDwarfs/bashful.jpg";
		final String sneezyImage = "images/TheSevenDwarfs/sneezy.jpg";
		final String docImage = "images/TheSevenDwarfs/doc.jpg";
		final String grumpyImage = "images/TheSevenDwarfs/grumpy.jpg";
		
		// Local Variables
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		// Create The Seven Dwarfs (Disney)
		Dwarf happy = new Dwarf("Happy", "Disney", happyImage);
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", sleepyImage);
		Dwarf dopey = new Dwarf("Dopey", "Disney", dopeyImage);
		Dwarf bashful = new Dwarf("Bashful", "Disney", bashfulImage);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", sneezyImage);
		Dwarf doc = new Dwarf("Doc", "Disney", docImage);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", grumpyImage);
		
		// Add The Seven Dwarfs To ArrayList
		dwarfs.add(happy);
		dwarfs.add(sleepy);
		dwarfs.add(dopey);
		dwarfs.add(bashful);
		dwarfs.add(sneezy);
		dwarfs.add(doc);
		dwarfs.add(grumpy);

		return dwarfs;
	}
}