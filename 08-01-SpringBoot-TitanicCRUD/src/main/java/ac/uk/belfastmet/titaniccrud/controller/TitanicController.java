/*
 * Class:           TitanicController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.controller
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the TitanicController Class
 */

package ac.uk.belfastmet.titaniccrud.controller;
import javax.validation.Valid;

// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;
import ac.uk.belfastmet.titaniccrud.repositories.TitanicRepository;

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
	
	@GetMapping("/all/")
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
	
	@GetMapping("/passengersearch/")
	public String passengerSearch(Model model)
	{
		model.addAttribute("pageTitle", "All Passengers");
		model.addAttribute("passengers", titanicRepository.findAll());
		
		return "passengerSearchPage";
	}
	
	@PostMapping("/passengersearch/result/")
	public String searchPassengers(@RequestParam("searchField") String searchField, 
								   @RequestParam("searchString") String searchString, Model model)
	{
		if(searchField.equals("name"))
		{
			model.addAttribute("pageTitle", "Passengers By Name");
			model.addAttribute("passengers", titanicRepository.findByNameLike("%" + searchString + "%"));
		}
		
		else if(searchField.equals("embarked"))
		{
			model.addAttribute("pageTitle", "Embarked Passengers");
			model.addAttribute("passengers", titanicRepository.findByEmbarked(searchString));
		}
		
		else if(searchField.equals("passengerClass"))
		{
			Integer pClass = Integer.parseInt(searchString);
			model.addAttribute("pageTitle", "Passenger By Class");
			model.addAttribute("passengers", titanicRepository.findByPClass(pClass));
		}
		
		return "passengerSearchPage";
	}
	
	//#############
	// Titanic CRUD
	//#############
	
	@GetMapping("/crud/")
	public String passengerCrud(Model model)
	{
		model.addAttribute("passengers", titanicRepository.findAll());
		model.addAttribute("pageTitle", "Passengers");
		return "passengerCrudPage";
	}
	
	@GetMapping("/crud/view/{passengerId}")
	public String passengerView(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle", "View Passeneger");
		Passenger passenger = this.titanicRepository.findOne(passengerId);
		model.addAttribute("passenger", passenger);
		
		return "passengerViewPage";
	}
	
	@GetMapping("/crud/edit/{passengerId}")
	public String passengerEdit(@PathVariable("passengerId") Integer passengerId, Model model)
	{
		model.addAttribute("pageTitle", "Edit Passeneger");
		Passenger passenger = this.titanicRepository.findOne(passengerId);
		model.addAttribute("passenger", passenger);
		
		return "passengerEditPage";
	}
	
	@GetMapping("/crud/delete/{passengerId}")
	public String passengerDelete(@PathVariable("passengerId") Integer passengerId, RedirectAttributes redirectAtts)
	{
		titanicRepository.delete(passengerId);
		redirectAtts.addFlashAttribute("message", "Passenger was Deleted");
		
		return "redirect:/passengers/crud/";
	}
	
	@GetMapping("/crud/add/")
	public String passengerEdit(Model model)
	{
		model.addAttribute("pageTitle", "Add Passeneger");
		model.addAttribute("passenger", new Passenger());
		
		return "passengerEditPage";
	}
	
	@PostMapping("/crud/save/")
	public String passengerSave(@Valid Passenger passenger, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "passengerEditPage";
		}
		
		else
		{
			Passenger savedPassenger = this.titanicRepository.save(passenger);
			
			return "redirect:/passengers/crud/view/" + savedPassenger.getPassengerId();
		}
	}
}