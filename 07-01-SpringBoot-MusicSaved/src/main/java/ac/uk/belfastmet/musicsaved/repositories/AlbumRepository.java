/*
 * Class:           AlbumRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         13/11/2017
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Collection;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;

public interface AlbumRepository extends CrudRepository<Album, Integer>
{
	Album findOneByAlbumTitleLower(String albumTitleLower);
	Album findOneByAlbumId(int albumId);
	
	Collection<Album> findAllByOrderByReleaseYear();
	Collection<Album> findByBandOrderByReleaseYear(Band band);
	Collection<Album> findByIsLiveOrderByReleaseYear(boolean isLive);
	Collection<Album> findAllByIsLiveIsNullOrderByReleaseYear();
	Collection<Album> findByGenreOrderByReleaseYear(Genre genre);
}