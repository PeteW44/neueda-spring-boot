/*
 * Class:           AlbumRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         17/12/2017 18.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;

public interface AlbumRepository extends CrudRepository<Album, Integer>
{
	Iterable<Album> findAll();
	Album findByAlbumTitleLower(String albumTitleLower);
	Album findOne(int albumId);
	Set<Album> findByBandOrderByReleaseYear(Band band);
}