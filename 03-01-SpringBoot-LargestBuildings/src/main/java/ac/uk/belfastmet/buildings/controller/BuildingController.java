/*
 * Class:           BuildingController.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         29/10/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the BuildingController Class
 */

package ac.uk.belfastmet.buildings.controller;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.buildings.service.BuildingService;

@Controller
@RequestMapping("/buildings/")
public class BuildingController 
{
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping("/")
	public String building(Model model)
	{
		this.buildingService = new BuildingService();
		model.addAttribute("buildings", this.buildingService.getBuildings());
		return "buildingPage";
	}
}