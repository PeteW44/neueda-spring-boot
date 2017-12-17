/*
 * Class:           PassengerRestController.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.controller
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         16/12/2017 17.00
 * Author:          Peter Wightman
 * Description:     This is the PassengerRestController Class
 */

package ac.uk.belfastmet.titaniccrud.controller;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@PutMapping("/{passengerId}")
	public Passenger update(@PathVariable("passengerId") Integer passengerId, @RequestBody Passenger passenger )
	{
		return passengerRestService.update(passengerId, passenger);
	}
	
	@DeleteMapping("/{passengerId}/")
	public void delete(@PathVariable("passengerId") Integer passengerId)
	{
		passengerRestService.delete(passengerId);
	}
	
	@RequestMapping(value="/page",method=RequestMethod.GET)
	Page<Passenger> list(Pageable pageable)
	{
		Page<Passenger> passengers = passengerRestService.listAllByPage(pageable);
		return passengers;
	} 
}