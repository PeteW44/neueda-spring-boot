/*
 * Class:           DwarveService.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.service
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DwarveService Class
 */

package ac.uk.belfastmet.dwarfs.service;
// Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.dwarfs.domain.Dwarve;

@Service
public class DwarveService
{
	private ArrayList<Dwarve> tolkienDwarves;
	
	public DwarveService()
	{
		super();
	}

	public ArrayList<Dwarve> getTolkienDwarves()
	{
		// The Company of Thorin Image Files
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
		ArrayList<Dwarve> dwarves = new ArrayList<Dwarve>();
		
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
		dwarves.add(thorin);
		dwarves.add(balin);
		dwarves.add(dwalin);
		dwarves.add(fili);
		dwarves.add(kili);
		dwarves.add(dori);
		dwarves.add(nori);
		dwarves.add(ori);
		dwarves.add(oin);
		dwarves.add(gloin);
		dwarves.add(bifur);
		dwarves.add(bofur);
		dwarves.add(bombur);
		dwarves.add(thorin);
		
		return dwarves;
	}
}