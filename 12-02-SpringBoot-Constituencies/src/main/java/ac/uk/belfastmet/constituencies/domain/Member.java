/*
 * Class:           Member.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         19/12/2017
 * Updated:         19/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Member Class
 */

package ac.uk.belfastmet.constituencies.domain;
// Import Packages
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class Member 
{
	// Instance Variables
	@JsonProperty("PersonId")
	private String personId;
	
	@JsonProperty("AffiliationId")
	private String affiliationId;
	
	@JsonProperty("MemberName")
	private String memberName;
	
	@JsonProperty("MemberLastName")
	private String memberLastName;
	
	@JsonProperty("MemberFirstName")
	private String memberFirstName;
	
	@JsonProperty("MemberFullDisplayName")
	private String memberFullDisplayName;
	
	@JsonProperty("MemberSortName")
	private String memberSortName;
	
	@JsonProperty("MemberTitle")
	private String memberTitle;
	
	@JsonProperty("PartyName")
	private String partyName;
	
	@JsonProperty("PartyOrganisationId")
	private String partyOrganisationId;
	
	@JsonProperty("ConstituencyName")
	private String constituencyName;
	
	@JsonProperty("ConstituencyId")
	private String constituencyId;
}