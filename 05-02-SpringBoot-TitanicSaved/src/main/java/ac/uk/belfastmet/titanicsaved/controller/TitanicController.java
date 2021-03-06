/*
 * Class:           TitanicController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titanicsaved.controller
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         11/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the TitanicController Class
 */

package ac.uk.belfastmet.titanicsaved.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.titanicsaved.repositories.TitanicRepository;

@Controller
@RequestMapping("/passengers/")
public class TitanicController 
{
	@Autowired
	TitanicRepository titanicRepository;
	
	public TitanicController(TitanicRepository titanicRepository)
	{
		super();
		this.titanicRepository = titanicRepository;
	}
	
	@GetMapping("/")
	public String passengers(Model model)
	{
		model.addAttribute("pageTitle", "All Passengers");
		model.addAttribute("passengers", titanicRepository.findAll());
		
		return "passengerPage";
	}
	
	@GetMapping("/firstclass/")
	public String firstClassPassengers(Model model)
	{
		model.addAttribute("pageTitle", "First Class Passengers");
		model.addAttribute("passengers", titanicRepository.findByPClass(1));
		
		return "passengerPage";
	}
	
	@GetMapping("/secondclass/")
	public String secondClassPassengers(Model model)
	{
		model.addAttribute("pageTitle", "Second Class Passengers");
		model.addAttribute("passengers", titanicRepository.findByPClass(2));
		
		return "passengerPage";
	}
	
	@GetMapping("/survivors/")
	public String survivorPassengers(Model model)
	{
		model.addAttribute("pageTitle", "Survivor Passengers");
		model.addAttribute("passengers", titanicRepository.findBySurvived(1));
		
		return "passengerPage";
	}
}