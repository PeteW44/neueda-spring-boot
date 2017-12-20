/*
 * Class:           HomeController.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         20/12/2017
 * Updated:         20/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the HomeController Class
 */

package ac.uk.belfastmet.constituencies.controller;
// Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController
{
	@GetMapping("/")
	public String home(Model model)
	{
		return "indexPage";
	}
}