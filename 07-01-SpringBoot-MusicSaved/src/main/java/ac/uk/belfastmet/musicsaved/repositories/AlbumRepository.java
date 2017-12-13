/*
 * Class:           AlbumRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         13/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Album;

public interface AlbumRepository extends CrudRepository<Album, Integer>
{
	Iterable<Album> findAll();
	Album findByAlbumTitle(String albumTitle);
	Album findOne(int albumId);
}