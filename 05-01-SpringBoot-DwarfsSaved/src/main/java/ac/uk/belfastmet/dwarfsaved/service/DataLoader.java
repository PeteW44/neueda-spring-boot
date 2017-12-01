/*
 * Class:           DataLoader.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DataLoader Class
 */

package ac.uk.belfastmet.dwarfsaved.service;
// Import Packages
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.dwarfsaved.domain.Dwarf;
import ac.uk.belfastmet.dwarfsaved.repositories.DwarfRepository;

@Service
public class DataLoader 
{
	@Autowired
	private DwarfRepository dwarfRepository;
	
	public DataLoader(DwarfRepository dwarfRepository)
	{
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	//@PostConstruct
	public void loadData()
	{
		// The Seven Dwarfs Image Files
		final String happyImage = "images/TheSevenDwarfs/happy.jpg";
		final String sleepyImage = "images/TheSevenDwarfs/sleepy.jpg";
		final String dopeyImage = "images/TheSevenDwarfs/dopey.jpg";
		final String bashfulImage = "images/TheSevenDwarfs/bashful.jpg";
		final String sneezyImage = "images/TheSevenDwarfs/sneezy.jpg";
		final String docImage = "images/TheSevenDwarfs/doc.jpg";
		final String grumpyImage = "images/TheSevenDwarfs/grumpy.jpg";
		
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
		
		// Create The Seven Dwarfs (Disney)
		Dwarf happy = new Dwarf("Happy", "Disney", happyImage);
		Dwarf sleepy = new Dwarf("Sleepy", "Disney", sleepyImage);
		Dwarf dopey = new Dwarf("Dopey", "Disney", dopeyImage);
		Dwarf bashful = new Dwarf("Bashful", "Disney", bashfulImage);
		Dwarf sneezy = new Dwarf("Sneezy", "Disney", sneezyImage);
		Dwarf doc = new Dwarf("Doc", "Disney", docImage);
		Dwarf grumpy = new Dwarf("Grumpy", "Disney", grumpyImage);
		
		// Create The Company Of Thorin (Tolkien)
		Dwarf thorin = new Dwarf("Thorin", "Tolkien", thorinImage);
		Dwarf balin = new Dwarf("Balin", "Tolkien", balinImage);
		Dwarf dwalin = new Dwarf("Dwalin", "Tolkien", dwalinImage);
		Dwarf fili = new Dwarf("Fíli", "Tolkien", filiImage);
		Dwarf kili = new Dwarf("Kíli", "Tolkien", kiliImage);
		Dwarf dori = new Dwarf("Dori", "Tolkien", doriImage);
		Dwarf nori = new Dwarf("Nori", "Tolkien", noriImage);
		Dwarf ori = new Dwarf("Ori", "Tolkien", oriImage);
		Dwarf oin = new Dwarf("Óin", "Tolkien", oinImage);
		Dwarf gloin = new Dwarf("Glóin", "Tolkien", gloinImage);
		Dwarf bifur = new Dwarf("Bifur", "Tolkien", bifurImage);
		Dwarf bofur = new Dwarf("Bofur", "Tolkien", bofurImage);
		Dwarf bombur = new Dwarf("Bombur", "Tolkien", bombuImage);

		// Add The Seven Dwarfs To ArrayList
		dwarfRepository.save(happy);
		dwarfRepository.save(sleepy);
		dwarfRepository.save(dopey);
		dwarfRepository.save(bashful);
		dwarfRepository.save(sneezy);
		dwarfRepository.save(doc);
		dwarfRepository.save(grumpy);

		// Add The Company Of Thorin To ArrayList
		dwarfRepository.save(thorin);
		dwarfRepository.save(balin);
		dwarfRepository.save(dwalin);
		dwarfRepository.save(fili);
		dwarfRepository.save(kili);
		dwarfRepository.save(dori);
		dwarfRepository.save(nori);
		dwarfRepository.save(ori);
		dwarfRepository.save(oin);
		dwarfRepository.save(gloin);
		dwarfRepository.save(bifur);
		dwarfRepository.save(bofur);
		dwarfRepository.save(bombur);
	}
}