/*
 * Class:           PassengerRestServiceImpl.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.service
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the PassengerRestServiceImpl Class
 */

package ac.uk.belfastmet.titaniccrud.service;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;
import ac.uk.belfastmet.titaniccrud.repositories.TitanicRepository;

@Service
public class PassengerRestServiceImpl implements PassengerRestService 
{
	@Autowired
	private TitanicRepository titanicRepository;

	public PassengerRestServiceImpl(TitanicRepository titanicRepository) 
	{
		super();
		this.titanicRepository = titanicRepository;
	}

	@Override
	public Iterable<Passenger> list() 
	{
		return this.titanicRepository.findAll();
	}

	@Override
	public Passenger create(Passenger passenger) 
	{
		return this.titanicRepository.save(passenger);
	}

	@Override
	public Passenger read(Integer passengerId) 
	{
		return this.titanicRepository.findOne(passengerId);
	}

	@Override
	public Passenger update(Integer passengerId, Passenger passenger) 
	{
		Passenger passengerToUpdate = this.titanicRepository.findOne(passengerId);
		return this.titanicRepository.save(passengerToUpdate);
	}

	@Override
	public void delete(Integer passengerId) 
	{
		this.titanicRepository.delete(passengerId);
	}
}