/*
 * Class:           ArriveTime.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the ArriveTime Class
 */

package ac.uk.belfastmet.nir.domain;
// Import Packages
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ArriveTime 
{
	// Instance Variables
	@JsonProperty("@time")
	private Integer time;
	
	@JsonProperty("@Arrived")
	private String arrived;
	
	@JsonProperty("@Timestamp")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date timeStamp;

	// Default Constructor
	public ArriveTime() 
	{
		super();
	}

	// Parameterised Constructor
	public ArriveTime(Integer time, String arrived, Date timeStamp) 
	{
		super();
		this.setTime(time);
		this.setArrived(arrived);
		this.setTimeStamp(timeStamp);
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

	public String getArrived() 
	{
		return arrived;
	}

	public void setArrived(String arrived) 
	{
		this.arrived = arrived;
	}

	public Date getTimeStamp() 
	{
		return timeStamp;
	}

	public void setTimeStamp(Date timestamp) 
	{
		this.timeStamp = timestamp;
	}
}