/*
 * Class:           DwarfRepository.java
 * Project:         Dwarfs And Dwarves Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the DwarfRepository Class
 */

package ac.uk.belfastmet.dwarfsaved.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.dwarfsaved.domain.Dwarf;

public interface DwarfRepository extends CrudRepository<Dwarf, Integer>
{
	Iterable<Dwarf> findByAuthor(String author);
	
	// Query A
	Iterable<Dwarf> findByDwarfIdBefore(int dwarfId);
	
	// Query B
	Iterable<Dwarf> findByName(String name);
	
	// Query C
	Dwarf findByDwarfId(int dwarfId);
	
	// Query D
	Iterable<Dwarf> findByOrderByNameAsc();
	
	// Query E
	Iterable<Dwarf> findByAuthorOrName(String author, String name);
}