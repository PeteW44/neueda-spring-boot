/*
 * Class:           AlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         17/11/2017
 * Updated:         20/12/2017 22.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumService Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.repositories.GenreRepository;

@Service
public class AlbumService 
{
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public AlbumService() 
	{
		super();
	}
	
	public AlbumService(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository) 
	{
		super();
		this.bandRepository = bandRepository;
		this.genreRepository = genreRepository;
		this.albumRepository = albumRepository;
	}
	
//	// ###################
//	// Get All BRMC Albums
//	// ###################
//	public Set<Album> getAllBrmcAlbums()
//	{
//		Band band = bandRepository.findByBandNameLower("brmc");
//		Set<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
//		
//		return albums;
//	}
//	
//	// #########################
//	// Get All Pink Floyd Albums
//	// #########################
//	public Set<Album> getAllPinkFloydAlbums()
//	{
//		Band band = bandRepository.findByBandNameLower("pinkfloyd");
//		Set<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
//		
//		return albums;
//	}
//	
//	// #########################
//	// Get All Spacemen 3 Albums
//	// #########################
//	public Set<Album> getAllSpacemen3Albums()
//	{
//		Band band = bandRepository.findByBandNameLower("spacemen3");
//		Set<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
//		
//		return albums;
//	}
	
	// ###################
	// Get All Band Albums
	// ###################
	public Set<Album> getAllBandAlbums(String bandNameLower)
	{
		Band band = bandRepository.findByBandNameLower(bandNameLower);
		Set<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// ###################
	// Get All Live Albums
	// ###################
	public Set<Album> getAllLiveAlbums()
	{
		Set<Album> albums = albumRepository.findByIsLiveOrderByReleaseYear(true);
		
		return albums;
	}
	
	// #####################
	// Get All Studio Albums
	// #####################
	public Set<Album> getAllStudioAlbums()
	{
		Set<Album> albums = albumRepository.findByIsLiveOrderByReleaseYear(false);
		
		return albums;
	}
	
	// #######################
	// Get All Albums By Genre
	// #######################
	public Set<Album> getAllAlbumsByGenre(Genre genre)
	{
		Set<Album> albums = albumRepository.findByGenreOrderByReleaseYear(genre);
		
		return albums;
	}
	
	// ######################
	// Get All Albums By Band
	// ######################
	public Set<Album> getAllAlbumsByBand(Band band)
	{
		Set<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// ########
	// Get Band
	// ########
	public Band getBand(String bandNameLower)
	{
		Band band = bandRepository.findByBandNameLower(bandNameLower);
		
		return band;
	}
	
	// #########
	// Get Genre
	// #########
	public Genre getGenre(String genreNameLower)
	{
		Genre genre = genreRepository.findByGenreNameLower(genreNameLower);
		
		return genre;
	}
	
	// #############
	// Get All Bands
	// #############
	public Set<Band> getAllBands()
	{
		Set<Band> bands = bandRepository.findAllByOrderByBandName();
		
		return bands;
	}
	
	// ##############
	// Get All Genres
	// ##############
	public Set<Genre> getAllGenres()
	{
		Set<Genre> genres = genreRepository.findAllByOrderByGenreName();
		
		return genres;
	}
		
	// ################
	// Get Single Album
	// ################
	public Album getAlbum(String albumTitleLower)
	{
		Album album = albumRepository.findByAlbumTitleLower(albumTitleLower);
		
		return album;
	}
}