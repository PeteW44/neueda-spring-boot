/*
 * Class:           DemoController.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.controller
 * Version:         1.0
 * Created:         28/10/2017
 * Updated:         28/10/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the DemoController Class
 */

package ac.uk.belfastmet.dwarfs.controller;
//Import Packages
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demodwarfs/")
public class DemoController 
{
	@GetMapping("/")
	public String disney(Model model)
	{
		
		return "Demo Hello World";
	}
	
	@GetMapping("/bingo/")
	public String bingo(Model model)
	{
		
		return "Demo There is a dog in the back yard";
	}
	
	@GetMapping("/princess/")
	public String princess(Model model)
	{
		
		return "Demo Meghan Markle";
	}
}