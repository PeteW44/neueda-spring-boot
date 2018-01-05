/*
 * Class:           BandRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         05/01/2018 22.00
 * Author:          Peter Wightman
 * Description:     This is the BandRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Band;

public interface BandRepository extends CrudRepository<Band, Integer>
{
	Set<Band> findAllByOrderByBandName();
	Band findByBandNameLower(String bandNameLower);
	Band findOne(int bandId);
}