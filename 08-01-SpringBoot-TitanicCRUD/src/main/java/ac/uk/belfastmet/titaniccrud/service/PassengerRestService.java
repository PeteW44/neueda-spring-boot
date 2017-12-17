/*
 * Class:           PassengerRestService.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.service
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         16/12/2017 17.00
 * Author:          Peter Wightman
 * Description:     This is the PassengerRestService Class
 */

package ac.uk.belfastmet.titaniccrud.service;
// Import Packages
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;

public interface PassengerRestService
{
	Iterable<Passenger> list();
	
	Passenger create(Passenger passenger);
	
	Passenger read(Integer passengerId);
	
	Passenger update(Integer passengerId, Passenger passenger);
	
	void delete(Integer passengerId);
	
	Page<Passenger> listAllByPage(Pageable pageable);
}