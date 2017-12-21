/*
 * Class:           NirController.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.controller
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the NirController Class
 */

package ac.uk.belfastmet.nir.controller;
//Import Packages
import java.util.ArrayList;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import ac.uk.belfastmet.nir.domain.StationBoardJsonResponse;

@Controller
@RequestMapping("/nir/")
@EnableConfigurationProperties
@ConfigurationProperties(prefix="api")
public class NirController
{
	public NirController() 
	{
		super();
	}
	
	@GetMapping("/")
	public String allEvents(Model model)
	{
		model.addAttribute("pageTitle", "Norther Ireland Railways");
		
		return "stationBoardPage";
	}
	
	@GetMapping("/{stationBoard}/")
	public String constituencyString(@PathVariable("stationBoard") String stationBoard,  Model model) 
	{
		RestTemplate restTemplate = new RestTemplate();
		StationBoardJsonResponse jsonResponse = restTemplate.getForObject("// https://neueda-flask-bndouglas.c9users.io/translink/api/station/3042A0", StationBoardJsonResponse.class);
//		ArrayList<StationBoard> stationBoards = jsonResponse.getAllMembersList().getMembers();
//		ArrayList<StationBoard> conMembers = new ArrayList<StationBoard>();
		
		model.addAttribute("pageTitle", "");
		//model.addAttribute("stationBoards", stationBoards);
		
		return "stationBoardPage";
	}
}