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
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class ServiceType 
{
	// Instance Variables
	@JsonProperty("@Type")
	private String serviceType;
	
	// Default Constructor
	public ServiceType() 
	{
		super();
	}

	// Parameterised Constructor
	public ServiceType(String serviceType) 
	{
		super();
		this.setServiceType(serviceType);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getServiceType() 
	{
		return serviceType;
	}

	public void setServiceType(String serviceType) 
	{
		this.serviceType = serviceType;
	}
}