/*
 * Class:           RhibController.java
 * Project:         RHI Demo
 * Package:         ac.uk.belfastmet.rhibeneficiaries.controller
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the RhibController Class
 */

package ac.uk.belfastmet.rhibeneficiaries.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
//Import Packages
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ac.uk.belfastmet.rhibeneficiaries.repositories.BeneficiaryRepository;

@Controller
@RequestMapping("/rhib/")
public class RhibController 
{
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	public RhibController(BeneficiaryRepository beneficiaryRepository)
	{
		super();
		this.beneficiaryRepository = beneficiaryRepository;
	}
	
	@GetMapping("/")
	public String passengers(Model model)
	{
		model.addAttribute("pageTitle", "All Beneficiaries");
		model.addAttribute("beneficiaries", beneficiaryRepository.findAll());
		
		return "rhibPage";
	}
}