/*
 * Class:           PassengerRestController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.controller
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the PassengerRestController Class
 */

package ac.uk.belfastmet.titaniccrud.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;
import ac.uk.belfastmet.titaniccrud.service.PassengerRestService;

@RestController
@RequestMapping("/api/passenger/")
public class PassengerRestController 
{
	@Autowired
	PassengerRestService passengerRestService;
	
	public PassengerRestController(PassengerRestService passengerRestService) 
	{
		super();
		this.passengerRestService = passengerRestService;
	}

	@GetMapping("/")
	public Iterable<Passenger>list()
	{
		return passengerRestService.list();
	}
	
	@PostMapping("/")
	public Passenger create(@RequestBody Passenger passenger)
	{
		return passengerRestService.create(passenger);
	}
	
	@GetMapping("/{passengerId}/")
	public Passenger read(@PathVariable("passengerId") Integer passengerId)
	{
		return passengerRestService.read(passengerId);
	}
	
	@DeleteMapping("/{passengerId}/")
	public void delete(@PathVariable("passengerId") Integer passengerId)
	{
		passengerRestService.delete(passengerId);
	}
}