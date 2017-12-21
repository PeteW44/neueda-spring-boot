/*
 * Class:           Service.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Service Class
 */

package ac.uk.belfastmet.nir.domain;
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Service 
{
	// Instance Variables
	@JsonProperty("@Headcode")
	private String headCode;
	
	@JsonProperty("@Uid")
	private Integer uId;

	@JsonProperty("@RetailID")
	private Integer retailId;
	
	@JsonProperty("@TigerID")
	private Integer tigerId;
	
	@JsonProperty("ServiceType")
	private ServiceType serviceType;
	
	@JsonProperty("ArriveTime")
	private ArriveTime arriveTime;
	
	@JsonProperty("DepartTime")
	private DepartTime departTime;
	
	// Default Constructor
	public Service() 
	{
		super();
	}

	// Parameterised Constructor
	public Service(String headCode, Integer uId, Integer retailId, Integer tigerId) 
	{
		super();
		this.setHeadCode(headCode);
		this.setuId(uId);
		this.setRetailId(retailId);
		this.setTigerId(tigerId);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getHeadCode() 
	{
		return headCode;
	}

	public void setHeadCode(String headCode) 
	{
		this.headCode = headCode;
	}

	public Integer getuId() 
	{
		return uId;
	}

	public void setuId(Integer uId) 
	{
		this.uId = uId;
	}

	public Integer getRetailId() 
	{
		return retailId;
	}

	public void setRetailId(Integer retailId) 
	{
		this.retailId = retailId;
	}

	public Integer getTigerId() 
	{
		return tigerId;
	}

	public void setTigerId(Integer tigerId) 
	{
		this.tigerId = tigerId;
	}
}