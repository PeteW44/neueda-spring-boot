/*
 * Class:           BandRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the BandRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Band;

public interface BandRepository extends CrudRepository<Band, Integer>
{
	Band findOneByBandNameLower(String bandNameLower);
	Band findOneByBandId(int bandId);
	
	Collection<Band> findAllByOrderByBandName();
}