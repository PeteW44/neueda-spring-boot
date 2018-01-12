/*
 * Class:           GenreServiceImpl.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the GenreServiceImpl Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.repositories.GenreRepository;

@Service
public class GenreServiceImpl implements GenreService
{
	@Autowired
	GenreRepository genreRepository;
	
	// Default Constructor
	public GenreServiceImpl() 
	{
		super();
	}
	
	// Parameterised Constructor
	public GenreServiceImpl(GenreRepository genreRepository) 
	{
		super();
		this.genreRepository = genreRepository;
	}
	
	// #################
	// Get Genre By Name
	// #################
	public Genre getGenreByName(String genreNameLower)
	{
		Genre genre = genreRepository.findOneByGenreNameLower(genreNameLower);
		
		return genre;
	}
	
	// ###############
	// Get Genre By ID
	// ###############
	public Genre getGenreById(Integer genreId)
	{
		Genre genre = genreRepository.findOneByGenreId(genreId);
		
		return genre;
	}
	
	// ##############
	// Get All Genres
	// ##############
	public Collection<Genre> getAllGenres()
	{
		Collection<Genre> genres = genreRepository.findAllByOrderByGenreName();
		
		return genres;
	}
	
	// ############
	// Delete Genre
	// ############
	public void deleteGenre(Integer genreId)
	{
		genreRepository.delete(genreId);
	}
	
	// ##########
	// Save Genre
	// ##########
	public Genre saveGenre(Genre genre)
	{
		genreRepository.save(genre);
		
		return genre;
	}
}