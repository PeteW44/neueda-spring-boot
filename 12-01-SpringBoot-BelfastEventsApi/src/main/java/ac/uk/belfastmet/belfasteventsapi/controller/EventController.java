/*
 * Class:           EventController.java
 * Project:         Belfast Events Demo
 * Package:         ac.uk.belfastmet.belfasteventsapi.domain
 * Version:         1.0
 * Created:         19/12/2017
 * Updated:         19/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the EventController Class
 */

package ac.uk.belfastmet.belfasteventsapi.controller;
//Import Packages
import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import ac.uk.belfastmet.belfasteventsapi.domain.BelfastEvents;
import ac.uk.belfastmet.belfasteventsapi.domain.Event;

@Controller
@RequestMapping("/events/")
public class EventController
{
	public EventController() 
	{
		super();
	}
	
	@GetMapping("/")
	public String allEvents(Model model)
	{
		model.addAttribute("pageTitle", "Belfast's Events");
		model.addAttribute("allEvents", getEventsArray());
		
		return "eventsPage";
	}
	
	@GetMapping("/{identifier}/")
	public String singleEvent(@PathVariable("identifier") String identifier, Model model)
	{
		ArrayList<Event> allEvents = getEventsArray();
		Event requestedEvent = new Event();
		
		for(Event event: allEvents)
		{
			if (event.getIdentifier().equals(identifier))
			{
				requestedEvent = event;
			}
		}
		
		model.addAttribute("pageTitle", "Selected Event");
		model.addAttribute("event", requestedEvent);
		
		return "eventPage";
	}
	
	public ArrayList<Event> getEventsArray()
	{
		String belfastEventsUrl = "http://neueda-flask.bndouglas.c9users.io/belfast-events/api/";
		RestTemplate restTemplate = new RestTemplate();
		BelfastEvents belfastEvents = restTemplate.getForObject(belfastEventsUrl, BelfastEvents.class);
		
		return belfastEvents.getAllEvents();
	}
}