/*
 * Class:           BeneficiaryRepository.java
 * Project:         RHI Demo
 * Package:         ac.uk.belfastmet.rhibeneficiaries.repositories
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the BeneficiaryRepository Class
 */

package ac.uk.belfastmet.rhibeneficiaries.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.rhibeneficiaries.domain.Beneficiary;

public interface BeneficiaryRepository extends CrudRepository<Beneficiary, Integer>
{
	
}