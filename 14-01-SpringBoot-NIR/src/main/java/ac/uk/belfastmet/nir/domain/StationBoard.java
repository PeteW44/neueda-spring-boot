/*
 * Class:           StationBoard.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the StationBoard Class
 */

package ac.uk.belfastmet.nir.domain;
// Import Packages
import java.util.ArrayList;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StationBoard 
{
	// Instance Variables
	@JsonProperty("@name")
	private String name;
	
	@JsonProperty("@tiploc")
	private String tiploc;
	
	@JsonProperty("@crs")
	private String crs;
	
	@JsonProperty("@PlatformData")
	private String platformData;
	
	@JsonProperty("@Timestamp")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date timestamp;
	
	@JsonProperty("TridentId")
	private Integer tridentId;
	
	@JsonProperty("Service")
	private ArrayList<Service> services;
	
	// Default Constructor
	public StationBoard() 
	{
		super();
	}
	
	// Parameterised Constructor
	public StationBoard(String name, String tiploc, String crs, String platformData, 
						Date timestamp, Integer tridentId, ArrayList<Service> services) 
	{
		super();
		this.setName(name);
		this.setTiploc(tiploc);
		this.setCrs(crs);
		this.setPlatformData(platformData);
		this.setTimestamp(timestamp);
		this.setTridentId(tridentId);
		this.setServices(services);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getTiploc() 
	{
		return tiploc;
	}

	public void setTiploc(String tiploc) 
	{
		this.tiploc = tiploc;
	}

	public String getCrs() 
	{
		return crs;
	}

	public void setCrs(String crs) 
	{
		this.crs = crs;
	}

	public String getPlatformData() 
	{
		return platformData;
	}

	public void setPlatformData(String platformData) 
	{
		this.platformData = platformData;
	}

	public Date getTimestamp() 
	{
		return timestamp;
	}

	public void setTimestamp(Date timestamp) 
	{
		this.timestamp = timestamp;
	}

	public Integer getTridentId() 
	{
		return tridentId;
	}

	public void setTridentId(Integer tridentId) 
	{
		this.tridentId = tridentId;
	}

	public ArrayList<Service> getServices() 
	{
		return services;
	}

	public void setServices(ArrayList<Service> services) 
	{
		this.services = services;
	}
}