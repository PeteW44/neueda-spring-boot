/*
 * Class:           ServiceType.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the ServiceType Class
 */

package ac.uk.belfastmet.nir.domain;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class DepartTime 
{
	// Instance Variables
	@JsonProperty("@time")
	private Integer time;
	
	@JsonProperty("@Timestamp")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date timeStamp;
	
	@JsonProperty("@sorttimestamp")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date sortTimeStamp;
	
	// Default Constructor
	public DepartTime() 
	{
		super();
	}
	
	// Parameterised Constructor
	public DepartTime(Integer time, Date timeStamp, Date sortTimeStamp) 
	{
		super();
		this.setTime(time);
		this.setTimeStamp(sortTimeStamp);
		this.setSortTimeStamp(sortTimeStamp);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public Integer getTime() 
	{
		return time;
	}

	public void setTime(Integer time) 
	{
		this.time = time;
	}

	public Date getTimeStamp() 
	{
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) 
	{
		this.timeStamp = timeStamp;
	}

	public Date getSortTimeStamp() 
	{
		return sortTimeStamp;
	}

	public void setSortTimeStamp(Date sortTimeStamp) 
	{
		this.sortTimeStamp = sortTimeStamp;
	}
}