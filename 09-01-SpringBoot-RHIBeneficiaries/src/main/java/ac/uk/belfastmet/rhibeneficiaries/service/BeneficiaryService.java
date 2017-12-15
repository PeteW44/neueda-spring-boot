/*
 * Class:           BeneficiaryService.java
 * Project:         RHI Demo
 * Package:         ac.uk.belfastmet.rhibeneficiaries.service
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the BeneficiaryService Class
 */


package ac.uk.belfastmet.rhibeneficiaries.service;
// Import Packages
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import ac.uk.belfastmet.rhibeneficiaries.domain.Beneficiary;
import ac.uk.belfastmet.rhibeneficiaries.repositories.BeneficiaryRepository;

@Service
public class BeneficiaryService 
{
	@Autowired
	BeneficiaryRepository beneficiaryRepository;
	
	// Default Constructor
	public BeneficiaryService(BeneficiaryRepository beneficiaryRepository) 
	{
		super();
		this.beneficiaryRepository = beneficiaryRepository;
	}
	
	public Iterable<Beneficiary> getAllBeneficiaries()
	{
		Iterable<Beneficiary> beneficiaries = beneficiaryRepository.findAll();
		
		//for(Beneficiary beneficiary : beneficiaries)
		//{
			//LocalDate applicationDate = (LocalDate) beneficiary.getApplicationDate();
			
//			DateFormat ukDateformat = new SimpleDateFormat("dd/mm/yyyy");
//			applicationDate = ukDateformat.parse(applicationDate);
		//}
		
		return beneficiaries;
	}
}