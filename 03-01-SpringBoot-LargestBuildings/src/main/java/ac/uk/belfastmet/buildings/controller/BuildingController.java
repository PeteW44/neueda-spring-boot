/*
 * Class:           BuildingController.java
 * Project:         Largest Buildings Demo
 * Package:         ac.uk.belfastmet.buildings.domain
 * Version:         1.0
 * Created:         29/10/2017
 * Updated:         30/10/2017 13.00
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
	
	@GetMapping("/floorarea/")
	public String buildingArea(Model model)
	{
		this.buildingService = new BuildingService();
		model.addAttribute("areaBuildings", this.buildingService.getByFloorArea());
		model.addAttribute("pageTitle", "Floor Areas");
		return "floorAreaPage";
	}
	
	@GetMapping("/footprint/")
	public String buildingVolume(Model model)
	{
		this.buildingService = new BuildingService();
		model.addAttribute("footBuildings", this.buildingService.getByFootprint());
		model.addAttribute("pageTitle", "Footprint");
		return "footprintPage";
	}
	
	@GetMapping("/volume/")
	public String building(Model model)
	{
		this.buildingService = new BuildingService();
		model.addAttribute("volumeBuildings", this.buildingService.getByVolume());
		model.addAttribute("pageTitle", "Volume");
		return "volumePage";
	}
}