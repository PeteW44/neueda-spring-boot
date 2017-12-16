/*
 * Class:           TitanicRepository.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.repository
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the TitanicRepository Class
 */

package ac.uk.belfastmet.titaniccrud.repositories;
// Import Packages
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;

public interface TitanicRepository extends PagingAndSortingRepository<Passenger, Integer>
{
	Iterable<Passenger> findAll();

	Page<Passenger> findAll(Pageable pageable);
	
	Iterable<Passenger> findByPClass(Integer p_class);
	
	Iterable<Passenger> findBySurvived(Integer survived);
	
	Iterable<Passenger> findByEmbarked(String searchField);
	
	Iterable<Passenger> findByName(String searchField);

	Iterable<Passenger> findByNameLike(String string);
}