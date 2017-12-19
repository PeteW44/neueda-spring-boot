/*
 * Class:           Event.java
 * Project:         Belfast Events Demo
 * Package:         ac.uk.belfastmet.belfasteventsapi.domain
 * Version:         1.0
 * Created:         19/12/2017
 * Updated:         19/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the Event Class
 */

package ac.uk.belfastmet.belfasteventsapi.domain;
// Import Packages
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

public class Event 
{
	// Instance Variables
	private String identifier;
	private String url;
	private String title;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date startDate;
	
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date endDate;
	
	private String time;
	private String venue;
	private String venueUrl;
	private String image;
	private String audience;
	private String theme;
	private String cost;
	private String content;
	
	// Default Constructor
	public Event()
	{
		super();
	}
	
	// Parameterised Constructor
	public Event(String identifier, String url, String title, Date startDate, Date endDate,
				 String time, String venue, String venueUrl, String image, String audience, 
				 String theme, String cost, String content)
	{
		super();
		this.setIdentifier(identifier);
		this.setUrl(venueUrl);
		this.setTitle(title);
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setTime(time);
		this.setVenue(venueUrl);
		this.setVenueUrl(venueUrl);
		this.setImage(image);
		this.setAudience(audience);
		this.setTheme(theme);
		this.setCost(cost);
		this.setContent(content);
	}
	
	/* 
	 * GET & SET Property Methods
	 */
	
	public String getIdentifier() 
	{
		return identifier;
	}

	public void setIdentifier(String identifier) 
	{
		this.identifier = identifier;
	}

	public String getUrl() 
	{
		return url;
	}

	public void setUrl(String url) 
	{
		this.url = url;
	}

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public Date getStartDate() 
	{
		return startDate;
	}

	public void setStartDate(Date startDate) 
	{
		this.startDate = startDate;
	}

	public Date getEndDate() 
	{
		return endDate;
	}

	public void setEndDate(Date endDate) 
	{
		this.endDate = endDate;
	}

	public String getTime() 
	{
		return time;
	}

	public void setTime(String time) 
	{
		this.time = time;
	}

	public String getVenue() 
	{
		return venue;
	}

	public void setVenue(String venue) 
	{
		this.venue = venue;
	}

	public String getVenueUrl() 
	{
		return venueUrl;
	}

	public void setVenueUrl(String venueUrl) 
	{
		this.venueUrl = venueUrl;
	}

	public String getImage() 
	{
		return image;
	}

	public void setImage(String image) 
	{
		this.image = image;
	}

	public String getAudience() 
	{
		return audience;
	}

	public void setAudience(String audience) 
	{
		this.audience = audience;
	}

	public String getTheme() 
	{
		return theme;
	}

	public void setTheme(String theme) 
	{
		this.theme = theme;
	}

	public String getCost() 
	{
		return cost;
	}

	public void setCost(String cost) 
	{
		this.cost = cost;
	}

	public String getContent() 
	{
		return content;
	}

	public void setContent(String content) 
	{
		this.content = content;
	}

	/* 
	 * Over Ride To String Method
	 */
	
	@Override
	public String toString() 
	{
		return "Event [identifier=" + identifier + 
			   ", url=" + url + 
			   ", title=" + title + 
			   ", startDate=" + startDate + 
			   ", endDate=" + endDate + 
			   ", time=" + time + 
			   ", venue=" + venue + 
			   ", venueUrl=" + venueUrl + 
			   ", image=" + image + 
			   ", audience=" + audience + 
			   ", theme=" + theme + 
			   ", cost=" + cost + 
			   ", content=" + content + "]";
	}
}
