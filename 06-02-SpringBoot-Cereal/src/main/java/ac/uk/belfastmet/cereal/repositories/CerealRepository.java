/*
 * Class:           CerealRepository.java
 * Project:         Breakfast Cereal Demo
 * Package:         ac.uk.belfastmet.cereal.repositories
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         12/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the CerealRepository Class
 */

package ac.uk.belfastmet.cereal.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.cereal.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer>
{
	Iterable<Cereal> findAll();
	Cereal findOne(int cerealId);
}