/*
 * Class:           PassengerRestServiceImpl.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.service
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         16/12/2017 17.00
 * Author:          Peter Wightman
 * Description:     This is the PassengerRestServiceImpl Class
 */

package ac.uk.belfastmet.titaniccrud.service;
//Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ac.uk.belfastmet.titaniccrud.domain.Passenger;
import ac.uk.belfastmet.titaniccrud.repositories.TitanicRepository;

@Service
@Transactional
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
	public Passenger update(Integer passengerId, Passenger update)
	{
		Passenger passenger = this.titanicRepository.findOne(passengerId);
		passenger.setSurvived(update.getSurvived());
		passenger.setpClass(update.getpClass());
		passenger.setName(update.getName());
		passenger.setSex(update.getSex());
		passenger.setAge(update.getAge());
		passenger.setSibSp(update.getSibSp());
		passenger.setParch(update.getParch());
		passenger.setTicket(update.getTicket());
		passenger.setFare(update.getFare());
		passenger.setCabin(update.getCabin());
		passenger.setEmbarked(update.getEmbarked());

		return titanicRepository.save(passenger);
	}

	@Override
	public void delete(Integer passengerId) 
	{
		this.titanicRepository.delete(passengerId);
	}
	
	@Override
	public Page<Passenger> listAllByPage(Pageable pageable)
	{
		return titanicRepository.findAll(pageable);
	}
}