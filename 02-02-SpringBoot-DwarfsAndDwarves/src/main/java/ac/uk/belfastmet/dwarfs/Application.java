/*
 * Class:           Application.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         28/10/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Application Class
 */

package ac.uk.belfastmet.dwarfs;
import java.io.File;
import java.util.ArrayList;

//Import Packages
import javax.annotation.PostConstruct;
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
		final File happyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/happy.jpg");
		final File sleepyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/sleepy.jpg");
		final File dopeyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/dopey.jpg");
		final File bashfulImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/bashful.jpg");
		final File sneezyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/sneezy.jpg");
		final File docImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/doc.jpg");
		final File grumpyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheSevenDwarfs/grumpy.jpg");
		
		// The Company of Thorin
		final File thorinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/thorin.jpg");
		final File balinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/balin.jpg");
		final File dwalinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/dwalin.jpg");
		final File filiImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/fili.jpg");
		final File kiliImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/kili.jpg");
		final File doriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/dori.jpg");
		final File noriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/nori.jpg");
		final File oriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/ori.jpg");
		final File oinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/oin.jpg");
		final File gloinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/gloin.jpg");
		final File bifurImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/bifur.jpg");
		final File bofurImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/bofur.jpg");
		final File bombuImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-02-JSpringBoot-DwarfsAndDwarves/src/main/resources/static/Images/TheCompanyOfThorin/bombu.jpg");
		
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