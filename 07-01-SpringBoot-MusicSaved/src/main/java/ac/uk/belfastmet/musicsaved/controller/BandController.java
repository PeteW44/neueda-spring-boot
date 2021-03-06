/*
 * Class:           BandController.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.controller
 * Version:         1.0
 * Created:         23/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the BandController Class
 */

package ac.uk.belfastmet.musicsaved.controller;
//Import Packages
import java.util.Collection;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.service.BandServiceImpl;
import ac.uk.belfastmet.musicsaved.service.GenreServiceImpl;

@Controller
@RequestMapping("/bands/")
public class BandController 
{
	@Autowired
	private BandServiceImpl bandService;
	
	@Autowired
	private GenreServiceImpl genreService;
	
	// Default Constructor
	public BandController()
	{
		super();
	}
	
	// Parameterised Constructor
	public BandController(BandServiceImpl bandService, GenreServiceImpl genreService)
	{
		super();
		this.bandService = bandService;
		this.genreService = genreService;
	}

	/*
	 * Genre C.R.U.D. Views
	 */
	
	//###############
	// Band CRUD List
	//###############
	@GetMapping("/crud/")
	public String bandCrud(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		
		model.addAttribute("pageTitle", "Band List");
		model.addAttribute("pageTitle1", "Artists and Bands");
		model.addAttribute("pageTitle2", "List");
		model.addAttribute("pageTitle3", "C.R.U.D");
		
		return "bandsListPage";
	}
	
	//############
	// Create Band
	//############
	@GetMapping("/crud/add/")
	public String addBandCrud(Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		model.addAttribute("band", new Band());
		
		model.addAttribute("pageTitle", "Add New Band");
		model.addAttribute("pageTitle1", "Artists and Bands");
		model.addAttribute("pageTitle2", "Add New");
		model.addAttribute("pageTitle3", "Band");
		
		return "bandEditPage";
	}
	
	//##########
	// Read Band
	//##########
	@GetMapping("/crud/view/{bandNameLower}/")
	public String viewAlbum(@PathVariable("bandNameLower") String bandNameLower, Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Band band = this.bandService.getBandByName(bandNameLower);
		model.addAttribute("band", band);
		
		model.addAttribute("pageTitle", "View Band");
		model.addAttribute("pageTitle1", "Artists and Bands");
		model.addAttribute("pageTitle2", band.getBandName());
		model.addAttribute("pageTitle3", "View Band");
		
		return "bandViewPage";
	}
	
	//############
	// Update Band
	//############
	@GetMapping("/crud/edit/{bandNameLower}/")
	public String editBandCrud(@PathVariable("bandNameLower") String bandNameLower, Model model)
	{
		Collection<Band> bands = this.bandService.getAllBands();
		model.addAttribute("bands", bands);
		Collection<Genre> genres = this.genreService.getAllGenres();
		model.addAttribute("genres", genres);
		Band band = this.bandService.getBandByName(bandNameLower);
		model.addAttribute("band", band);
		
		model.addAttribute("pageTitle", "Edit Band");
		model.addAttribute("pageTitle1", "Artists and Bands");
		model.addAttribute("pageTitle2", band.getBandName());
		model.addAttribute("pageTitle3", "Edit Band");
		
		return "bandEditPage";
	}
	
	//############
	// Delete Band
	//############
	@GetMapping("/crud/delete/{bandId}/")
	public String deleteBandCrud(@PathVariable("bandId") Integer bandId, RedirectAttributes redirectAtts)
	{
		Band band = this.bandService.getBandById(bandId);
		this.bandService.deleteBand(band.getBandId());
		redirectAtts.addFlashAttribute("message", "Band was Deleted");
		
		return "redirect:/bands/crud/";
	}
	
	//##########
	// Save Band
	//##########
	@PostMapping("/crud/save/")
	public String bandSave(@Valid Band band, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "bandEditPage";
		}
		
		else
		{
			Band savedBand = this.bandService.saveBand(band);
			
			return "redirect:/bands/crud/view/" + savedBand.getBandNameLower() + "/";
		}
	}
}