/*
 * Class:           MemberController.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         20/12/2017
 * Updated:         20/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the MemberController Class
 */

package ac.uk.belfastmet.constituencies.controller;
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
import ac.uk.belfastmet.constituencies.domain.ConstituencyJsonResponse;
import ac.uk.belfastmet.constituencies.domain.Member;

@Controller
@RequestMapping("/constituencies/")
@EnableConfigurationProperties
@ConfigurationProperties(prefix="api")
public class MemberController
{
	public MemberController() 
	{
		super();
	}
	
	@GetMapping("/")
	public String allEvents(Model model)
	{
		model.addAttribute("pageTitle", "Norther Ireland Constituencies");
		
		return "conPage";
	}
	
	@GetMapping("/{constituency}/")
	public String constituencyString(@PathVariable("constituency") String constituency,  Model model) 
	{
		String constituencyName = "";
		RestTemplate restTemplate = new RestTemplate();
		ConstituencyJsonResponse jsonResponse = restTemplate.getForObject("http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers", ConstituencyJsonResponse.class);
		ArrayList<Member> members = jsonResponse.getAllMembersList().getMembers();
		ArrayList<Member> conMembers = new ArrayList<Member>();
		
		for(Member member: members)
		{
			String constituencyNameLower = member.getConstituencyName().replace(" ", "").toLowerCase();
			
			if(constituencyNameLower.equals(constituency))
			{
				conMembers.add(member);
				constituencyName = member.getConstituencyName();
			}
		}
		
		model.addAttribute("pageTitle", constituencyName);
		model.addAttribute("members", conMembers);
		return "memberPage";
	}
}