/*
 * Class:           Application.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         29/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.dwarfs;
// Import Packages
import java.util.ArrayList;

//Import Packages
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ac.uk.belfastmet.dwarfs.domain.Dwarf;
import ac.uk.belfastmet.dwarfs.domain.Dwarve;
import ac.uk.belfastmet.dwarfs.domain.MythicalCreature;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
	
	//@PostConstruct
	public static void createDwarfs()
	{
		// Image Files
		
		// The Seven Dwarfs
		final String happyImage = "images/TheSevenDwarfs/happy.jpg";
		final String sleepyImage = "images/TheSevenDwarfs/sleepy.jpg";
		final String dopeyImage = "images/TheSevenDwarfs/dopey.jpg";
		final String bashfulImage = "images/TheSevenDwarfs/bashful.jpg";
		final String sneezyImage = "images/TheSevenDwarfs/sneezy.jpg";
		final String docImage = "images/TheSevenDwarfs/doc.jpg";
		final String grumpyImage = "images/TheSevenDwarfs/grumpy.jpg";
		
		// The Company of Thorin
		final String thorinImage = "images/TheCompanyOfThorin/thorin.jpg";
		final String balinImage = "images/TheCompanyOfThorin/balin.jpg";
		final String dwalinImage = "images/TheCompanyOfThorin/dwalin.jpg";
		final String filiImage = "images/TheCompanyOfThorin/fili.jpg";
		final String kiliImage = "images/TheCompanyOfThorin/kili.jpg";
		final String doriImage = "images/TheCompanyOfThorin/dori.jpg";
		final String noriImage = "images/TheCompanyOfThorin/nori.jpg";
		final String oriImage = "images/TheCompanyOfThorin/ori.jpg";
		final String oinImage = "images/TheCompanyOfThorin/oin.jpg";
		final String gloinImage = "images/TheCompanyOfThorin/gloin.jpg";
		final String bifurImage = "images/TheCompanyOfThorin/bifur.jpg";
		final String bofurImage = "images/TheCompanyOfThorin/bofur.jpg";
		final String bombuImage = "images/TheCompanyOfThorin/bombu.jpg";
		
		// Local Variables
		ArrayList<MythicalCreature> dwarfs = new ArrayList<MythicalCreature>();
		
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
		
		// Create The Company Of Thorin (Tolkien)
		Dwarve thorin = new Dwarve("Thorin", "Tolkien", thorinImage);
		Dwarve balin = new Dwarve("Balin", "Tolkien", balinImage);
		Dwarve dwalin = new Dwarve("Dwalin", "Tolkien", dwalinImage);
		Dwarve fili = new Dwarve("Fíli", "Tolkien", filiImage);
		Dwarve kili = new Dwarve("Kíli", "Tolkien", kiliImage);
		Dwarve dori = new Dwarve("Dori", "Tolkien", doriImage);
		Dwarve nori = new Dwarve("Nori", "Tolkien", noriImage);
		Dwarve ori = new Dwarve("Ori", "Tolkien", oriImage);
		Dwarve oin = new Dwarve("Óin", "Tolkien", oinImage);
		Dwarve gloin = new Dwarve("Glóin", "Tolkien", gloinImage);
		Dwarve bifur = new Dwarve("Bifur", "Tolkien", bifurImage);
		Dwarve bofur = new Dwarve("Bofur", "Tolkien", bofurImage);
		Dwarve bombur = new Dwarve("Bombur", "Tolkien", bombuImage);
		
		// Add The Company Of Thorin To ArrayList
		dwarfs.add(thorin);
		dwarfs.add(balin);
		dwarfs.add(dwalin);
		dwarfs.add(fili);
		dwarfs.add(kili);
		dwarfs.add(dori);
		dwarfs.add(nori);
		dwarfs.add(ori);
		dwarfs.add(oin);
		dwarfs.add(gloin);
		dwarfs.add(bifur);
		dwarfs.add(bofur);
		dwarfs.add(bombur);
		dwarfs.add(thorin);
		
		// Print The Seven Dwarfs
		System.out.println("The Seven Dwarfs");
		
		for(MythicalCreature dwarf : dwarfs)
		{
			if(dwarf.getAuthor() == "Disney")
			{
				System.out.println("Name: " + dwarf.getName());
				System.out.println("Image: " + dwarf.getImage());
			}
		}
		
		System.out.println();
		
		// Print The Company Of Thorin
		System.out.println("The Company of Thorin");
		
		for(MythicalCreature dwarve : dwarfs)
		{
			if(dwarve.getAuthor() == "Tolkien")
			{
				System.out.println("Name: " + dwarve.getName());
				System.out.println("Image: " + dwarve.getImage());
			}
		}
		
		System.out.println();
		
		// Print All Dwarfs and Dwarves
		System.out.println("All Dwarfs and Dwarves");
		
		for(MythicalCreature dwarf : dwarfs)
		{
			System.out.println("Name: " + dwarf.getName());
			System.out.println("Image: " + dwarf.getImage());
		}
	}
}