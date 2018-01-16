/*
 * Class:           BandServiceImpl.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the BandServiceImpl Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;

@Service
public class BandServiceImpl implements IBandService
{
	@Autowired
	BandRepository bandRepository;
	
	// Default Constructor
	public BandServiceImpl() 
	{
		super();
	}
	
	// Parameterised Constructor
	public BandServiceImpl(BandRepository bandRepository)
	{
		super();
		this.bandRepository = bandRepository;
	}
	
	// ################
	// Get Band By Name
	// ################
	@Override
	public Band getBandByName(String bandNameLower)
	{
		Band band = bandRepository.findOneByBandNameLower(bandNameLower);
		
		return band;
	}
	
	// ##############
	// Get Band By ID
	// ##############
	@Override
	public Band getBandById(Integer bandId)
	{
		Band band = bandRepository.findOneByBandId(bandId);
		
		return band;
	}
	
	// #############
	// Get All Bands
	// #############
	@Override
	public Collection<Band> getAllBands()
	{
		Collection<Band> bands = bandRepository.findAllByOrderByBandName();
		
		return bands;
	}
	
	// ###########
	// Delete Band
	// ###########
	@Override
	public void deleteBand(Integer bandId)
	{
		bandRepository.delete(bandId);
	}
	
	// #########
	// Save Band
	// #########
	@Override
	public Band saveBand(Band band)
	{
		bandRepository.save(band);
		
		return band;
	}
}