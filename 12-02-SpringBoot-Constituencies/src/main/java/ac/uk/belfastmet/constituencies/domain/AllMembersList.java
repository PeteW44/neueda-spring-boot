/*
 * Class:           AllMembersList.java
 * Project:         MLA Demo
 * Package:         ac.uk.belfastmet.constituencies.domain
 * Version:         1.0
 * Created:         20/12/2017
 * Updated:         20/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the AllMembersList Class
 */

package ac.uk.belfastmet.constituencies.domain;
// Import Packages
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import ac.uk.belfastmet.constituencies.domain.Member;
import lombok.Data;

@Data
public class AllMembersList 
{
	// Instance Variables
	@JsonProperty("Member")
	private ArrayList<Member> members;
}