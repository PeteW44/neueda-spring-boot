/*
 * Class:           GenreService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the GenreService Interface
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import ac.uk.belfastmet.musicsaved.domain.Genre;

public interface IGenreService 
{
	Genre getGenreByName(String genreNameLower);
	Genre getGenreById(Integer genreId);
	
	Collection<Genre> getAllGenres();
	
	void deleteGenre(Integer genreId);
	Genre saveGenre(Genre genre);
}