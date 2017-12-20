/*
 * Class:           GenreRepository.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         20/11/2017
 * Updated:         20/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the GenreRepository Class
 */

package ac.uk.belfastmet.musicsaved.repositories;
// Import Packages
import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import ac.uk.belfastmet.musicsaved.domain.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer>
{
	Set<Genre> findAllByOrderByGenreName();
	Genre findByGenreNameLower(String genreNameLower);
}