/*
 * Class:           TitanicController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titanic.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
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
	public String disney(Model model)
	{
		model.addAttribute("pageTitle", "Titanic Passengers");
		model.addAttribute("passengers", titanicRepository.findAll());
		
		return "passengerPage";
	}
}