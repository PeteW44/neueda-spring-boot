/*
 * Class:           BelfastEvents.java
 * Project:         Belfast Events Demo
 * Package:         ac.uk.belfastmet.belfasteventsapi.domain
 * Version:         1.0
 * Created:         19/12/2017
 * Updated:         19/12/2017 11.00
 * Author:          Peter Wightman
 * Description:     This is the BelfastEvents Class
 */

package ac.uk.belfastmet.belfasteventsapi.domain;
// Import Packages
import java.util.ArrayList;

public class BelfastEvents 
{
	// Instance Variables
	private ArrayList<Event> allEvents;

	// Default Constructor
	public BelfastEvents()
	{
		super();
	}
	
	// Parameterised Constructor
	public BelfastEvents(ArrayList<Event> allEvents)
	{
		super();
		this.setAllEvents(allEvents);
	}
	
	/* 
	 * GET & SET Property Methods
	 */
	
	public ArrayList<Event> getAllEvents() 
	{
		return allEvents;
	}

	public void setAllEvents(ArrayList<Event> allEvents) 
	{
		this.allEvents = allEvents;
	}
}
