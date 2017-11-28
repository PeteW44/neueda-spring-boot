/*
 * Class:           DwarfsAndDwarves.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         dwarfsanddwarves
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         28/10/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the DwarfsAndDwarves Class
 */

package dwarfsanddwarves;
// Import Packages
import java.util.ArrayList;
import java.io.File;

public class DwarfsAndDwarves 
{
	// Image Files
	
	// The Seven Dwarfs
	private static File happyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/happy.jpg");
	private static File sleepyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/sleepy.jpg");
	private static File dopeyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/dopey.jpg");
	private static File bashfulImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/bashful.jpg");
	private static File sneezyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/sneezy.jpg");
	private static File docImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/doc.jpg");
	private static File grumpyImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheSevenDwarfs/grumpy.jpg");
	
	// The Company of Thorin
	private static File thorinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/thorin.jpg");
	private static File balinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/balin.jpg");
	private static File dwalinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/dwalin.jpg");
	private static File filiImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/fili.jpg");
	private static File kiliImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/kili.jpg");
	private static File doriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/dori.jpg");
	private static File noriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/nori.jpg");
	private static File oriImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/ori.jpg");
	private static File oinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/oin.jpg");
	private static File gloinImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/gloin.jpg");
	private static File bifurImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/bifur.jpg");
	private static File bofurImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/bofur.jpg");
	private static File bombuImage = new File("H:/Neueda Tech Academy/Neueda Spring Boot/02-01-Java-DwarfsAndDwarves/Images/TheCompanyOfThorin/bombu.jpg");
	
	public static void main(String[] args) 
	{
		//dwarfsAndDwarves();
		
		classDwarfsAndDwarves();
	}
	
	public static void classDwarfsAndDwarves()
	{
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
	
	public static void dwarfsAndDwarves()
	{
		ArrayList<String> dwarfs = new ArrayList<String>();
		ArrayList<String> dwarves = new ArrayList<String>();

		dwarfs.add("Happy");
		dwarfs.add("Sleepy");
		dwarfs.add("Dopey");
		dwarfs.add("Bashful");
		dwarfs.add("Sneezy");
		dwarfs.add("Doc");
		dwarfs.add("Grumpy");
		
		dwarves.add("Thorin");
		dwarves.add("Balin");
		dwarves.add("Dwalin");
		dwarves.add("Fíli");
		dwarves.add("Kíli");
		dwarves.add("Dori");
		dwarves.add("Nori");
		dwarves.add("Ori");
		dwarves.add("Ói");
		dwarves.add("Glóin");
		dwarves.add("Bifur");
		dwarves.add("Bofur");
		dwarves.add("Bombur");
		
		System.out.println("The Seven Dwarfs");
		
		for(String dwarf : dwarfs)
		{
			System.out.println(dwarf);
		}
		
		System.out.println();
		System.out.println("The Company of Thorin");
		
		for(String dwarf : dwarves)
		{
			System.out.println(dwarf);
		}
	}
}