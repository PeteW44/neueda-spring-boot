/*
 * Class:           Station.java
 * Project:         NIR Demo
 * Package:         ac.uk.belfastmet.nir.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Station Class
 */

package ac.uk.belfastmet.nir.domain;
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Station 
{
	// Instance Variables
	private String code;
	private String name;
	
	// Default Constructor
	public Station() 
	{
		super();
	}
	
	// Parameterised Constructor
	public Station(String code, String name) 
	{
		super();
		this.setCode(code);
		this.setName(name);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public String getCode() 
	{
		return code;
	}
	
	public void setCode(String code) 
	{
		this.code = code;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}