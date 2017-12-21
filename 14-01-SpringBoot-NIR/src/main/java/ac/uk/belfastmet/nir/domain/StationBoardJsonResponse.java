/*
 * Class:           StationBoardJsonResponse.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         21/12/2017
 * Updated:         21/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the StationBoardJsonResponse Class
 */

package ac.uk.belfastmet.nir.domain;
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class StationBoardJsonResponse 
{
	@JsonProperty("StationBoard")
	StationBoard stationboard;
	
	public StationBoardJsonResponse() 
	{
		super();
	}
}