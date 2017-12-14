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
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ac.uk.belfastmet.titaniccrud.repositories.TitanicRepository;

@Controller
@RequestMapping("/passengers")
public class TitanicController 
{
	@Autowired
	TitanicRepository titanicRepository;
	
	public TitanicController(TitanicRepository titanicRepository)
	{
		super();
		this.titanicRepository = titanicRepository;
	}
	
	@GetMapping("/all")
	public String passengers(Model model)
	{
		model.addAttribute("pageTitle", "All Passengers");
		model.addAttribute("passengers", titanicRepository.findAll());
		
		return "passengerPage";
	}
	
	@GetMapping("/firstclass")
	public String firstClassPassengers(Model model)
	{
		model.addAttribute("pageTitle", "First Class Passengers");
		model.addAttribute("passengers", titanicRepository.findByPClass(1));
		
		return "passengerPage";
	}
	
	@GetMapping("/secondclass")
	public String secondClassPassengers(Model model)
	{
		model.addAttribute("pageTitle", "Second Class Passengers");
		model.addAttribute("passengers", titanicRepository.findByPClass(2));
		
		return "passengerPage";
	}
	
	@GetMapping("/survivors")
	public String survivorPassengers(Model model)
	{
		model.addAttribute("pageTitle", "Survivor Passengers");
		model.addAttribute("passengers", titanicRepository.findBySurvived(1));
		
		return "passengerPage";
	}
	
	@GetMapping("/passengersearch")
	public String passengerSearch(Model model)
	{
		model.addAttribute("pageTitle", "All Passengers");
		model.addAttribute("passengers", titanicRepository.findAll());
		
		return "passengerSearchPage";
	}
	
	@PostMapping("/passengersearch/result")
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
}