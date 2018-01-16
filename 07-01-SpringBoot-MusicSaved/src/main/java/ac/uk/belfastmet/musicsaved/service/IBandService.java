/*
 * Class:           BandService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the BandService Interface
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import ac.uk.belfastmet.musicsaved.domain.Band;

public interface IBandService 
{
	Band getBandByName(String bandNameLower);
	Band getBandById(Integer bandId);
	
	Collection<Band> getAllBands();
	
	void deleteBand(Integer bandId);
	Band saveBand(Band band);
}