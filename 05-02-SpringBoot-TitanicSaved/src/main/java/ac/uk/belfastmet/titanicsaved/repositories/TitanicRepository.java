/*
 * Class:           TitanicRepository.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titanic.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the TitanicRepository Class
 */

package ac.uk.belfastmet.titanicsaved.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.titanicsaved.domain.Passenger;

public interface TitanicRepository extends CrudRepository<Passenger, Integer>
{
	Iterable<Passenger> findAll();
}