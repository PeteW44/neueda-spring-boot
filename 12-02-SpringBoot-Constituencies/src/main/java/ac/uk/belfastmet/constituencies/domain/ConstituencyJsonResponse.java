/*
 * Class:           Member.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         20/12/2017
 * Updated:         20/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Member Class
 */

package ac.uk.belfastmet.constituencies.domain;
// Import Packages
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ConstituencyJsonResponse 
{
	@JsonProperty("AllMembersList")
	AllMembersList allMembersList;
	
	public ConstituencyJsonResponse() 
	{
		super();
	}
}