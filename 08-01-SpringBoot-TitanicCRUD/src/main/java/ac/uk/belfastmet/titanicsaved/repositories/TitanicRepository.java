/*
 * Class:           TitanicRepository.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titanicsaved.repository
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         11/12/2017 16.00
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
	
	Iterable<Passenger> findByPClass(Integer p_class);
	
	Iterable<Passenger> findBySurvived(Integer survived);
}