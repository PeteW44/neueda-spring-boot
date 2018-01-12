/*
 * Class:           SongRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the SongRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Song;

public interface SongRepository extends CrudRepository<Song, Integer>
{
	Song findByTrackTitle(String trackTitle);
	
	Collection<Song> findAll();
}