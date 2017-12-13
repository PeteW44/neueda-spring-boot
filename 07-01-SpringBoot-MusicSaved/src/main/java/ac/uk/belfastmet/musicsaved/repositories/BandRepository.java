/*
 * Class:           BandRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         13/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the BandRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Band;

public interface BandRepository extends CrudRepository<Band, Integer>
{
	Iterable<Band> findAll();
	Band findByBandName(String bandName);
}