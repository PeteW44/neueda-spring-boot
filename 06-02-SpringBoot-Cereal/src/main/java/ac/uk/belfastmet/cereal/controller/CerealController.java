/*
 * Class:           CerealController.java
 * Project:         Breakfast Cereal Demo
 * Package:         ac.uk.belfastmet.cereal.controller
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         13/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the CerealController Class
 */

package ac.uk.belfastmet.cereal.controller;
//Import Packages
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

import ac.uk.belfastmet.cereal.domain.Cereal;
import ac.uk.belfastmet.cereal.repositories.CerealRepository;

@Controller
@RequestMapping("/cereals")
public class CerealController
{
	@Autowired
	CerealRepository cerealRepository;
	
	public CerealController(CerealRepository cerealRepository)
	{
		super();
		this.cerealRepository = cerealRepository;
	}
	
	@GetMapping("/")
	public String cereals(Model model)
	{
		model.addAttribute("cereals", cerealRepository.findAll());
		model.addAttribute("pageTitle", "Cereal's");
		return "cerealPage";
	}
	
	@GetMapping("/crud")
	public String cereals2(Model model)
	{
		model.addAttribute("cereals", cerealRepository.findAll());
		model.addAttribute("pageTitle", "Cereal's");
		return "cereal2Page";
	}
	
	//####################
	// Dynamic Cereal Page
	//####################
	
	@GetMapping("/crud/view/{cerealId}")
	public String cerealView(@PathVariable("cerealId") Integer cerealId, Model model)
	{
		Cereal cereal = this.cerealRepository.findOne(cerealId);
		model.addAttribute("cereal", cereal);
		
		return "cerealViewPage";
	}
	
	@GetMapping("/crud/edit/{cerealId}")
	public String cerealEdit(@PathVariable("cerealId") Integer cerealId, Model model)
	{
		model.addAttribute("pageTitle", "Edit Cereal");
		Cereal cereal = this.cerealRepository.findOne(cerealId);
		model.addAttribute("cereal", cereal);
		
		return "cerealEditPage";
	}
	
	@GetMapping("/crud/delete/{cerealId}")
	public String cerealDelete(@PathVariable("cerealId") Integer cerealId, RedirectAttributes redirectAtts)
	{
		cerealRepository.delete(cerealId);
		redirectAtts.addFlashAttribute("message", "Cereal was Deleted");
		
		return "redirect:/cereals/crud";
	}
	
	@GetMapping("/crud/add")
	public String cerealEdit(Model model)
	{
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		
		return "cerealEditPage";
	}
	
	@PostMapping("/crud/save")
	public String cerealSave(@Valid Cereal cereal, BindingResult bindingResult, Model model)
	{
		if(bindingResult.hasErrors())
		{
			return "cerealEditPage";
		}
		
		else
		{
			Cereal savedCereal = this.cerealRepository.save(cereal);
			
			return "redirect:/cereals/crud/view/" + savedCereal.getCerealId();
		}
	}
}