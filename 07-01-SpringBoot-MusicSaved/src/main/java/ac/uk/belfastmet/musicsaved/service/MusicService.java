/*
 * Class:           MusicService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         17/11/2017
 * Updated:         09/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the MusicService Class
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
public class MusicService 
{
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	@Autowired
	GenreRepository genreRepository;
	
	public MusicService() 
	{
		super();
	}
	
	public MusicService(BandRepository bandRepository, GenreRepository genreRepository, AlbumRepository albumRepository) 
	{
		super();
		this.bandRepository = bandRepository;
		this.genreRepository = genreRepository;
		this.albumRepository = albumRepository;
	}
	
	// ################
	// Get Band By Name
	// ################
	public Band getBand(String bandNameLower)
	{
		Band band = bandRepository.findByBandNameLower(bandNameLower);
		
		return band;
	}
	
	// ##############
	// Get Band By ID
	// ##############
	public Band getBand(Integer bandId)
	{
		Band band = bandRepository.findOne(bandId);
		
		return band;
	}
		
	// #################
	// Get Genre By Name
	// #################
	public Genre getGenre(String genreNameLower)
	{
		Genre genre = genreRepository.findByGenreNameLower(genreNameLower);
		
		return genre;
	}
	
	// ###############
	// Get Genre By ID
	// ###############
	public Genre getGenre(Integer genreId)
	{
		Genre genre = genreRepository.findOne(genreId);
		
		return genre;
	}
	
	// #################
	// Get Album By Name
	// #################
	public Album getAlbum(String albumTitleLower)
	{
		Album album = albumRepository.findByAlbumTitleLower(albumTitleLower);
		
		return album;
	}
	
	// ###############
	// Get Album By ID
	// ###############
	public Album getAlbum(Integer albumId)
	{
		Album album = albumRepository.findOne(albumId);
		
		return album;
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
	
	// ##############
	// Get All Albums
	// ##############
	public Set<Album> getAllAlbums()
	{
		Set<Album> albums = albumRepository.findAllByOrderByReleaseYear();
		
		return albums;
	}
	
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
		Set<Album> albums = albumRepository.findAllByIsLiveIsNullOrderByReleaseYear();
		
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
	
	// ###########
	// Delete Band
	// ###########
	public void deleteBand(Integer bandId) 
	{
		bandRepository.delete(bandId);
	}
	
	// ############
	// Delete Genre
	// ############
	public void deleteGenre(Integer genreId) 
	{
		genreRepository.delete(genreId);
	}
	
	// ############
	// Delete Album
	// ############
	public void deleteAlbum(Integer albumId) 
	{
		albumRepository.delete(albumId);
	}
	
	// #########
	// Save Band
	// #########
	public Band saveBand(Band band) 
	{
		bandRepository.save(band);
		
		return band;
	}

	// ##########
	// Save Genre
	// ##########
	public Genre saveGenre(Genre genre) 
	{
		genreRepository.save(genre);
		
		return genre;
	}
	
	// ##########
	// Save Album
	// ##########
	public Album saveAlbum(Album album) 
	{
		albumRepository.save(album);
		
		return album;
	}
}