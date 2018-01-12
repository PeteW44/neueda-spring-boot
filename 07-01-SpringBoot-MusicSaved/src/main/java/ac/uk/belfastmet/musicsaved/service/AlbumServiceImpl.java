/*
 * Class:           MusicServiceImpl.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the MusicServiceImpl Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;
import ac.uk.belfastmet.musicsaved.repositories.AlbumRepository;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;

@Service
public class AlbumServiceImpl implements AlbumService
{
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	AlbumRepository albumRepository;
	
	// Default Constructor
	public AlbumServiceImpl() 
	{
		super();
	}
	
	// Parameterised Constructor
	public AlbumServiceImpl(BandRepository bandRepository, AlbumRepository albumRepository) 
	{
		super();
		this.bandRepository = bandRepository;
		this.albumRepository = albumRepository;
	}
	
	// #################
	// Get Album By Name
	// #################
	@Override
	public Album getAlbumByName(String albumTitleLower)
	{
		Album album = albumRepository.findOneByAlbumTitleLower(albumTitleLower);
		
		return album;
	}
	
	// ###############
	// Get Album By ID
	// ###############
	@Override
	public Album getAlbumById(Integer albumId)
	{
		Album album = albumRepository.findOneByAlbumId(albumId);
		
		return album;
	}
	
	// ##############
	// Get All Albums
	// ##############
	@Override
	public Collection<Album> getAllAlbums()
	{
		Collection<Album> albums = albumRepository.findAllByOrderByReleaseYear();
		
		return albums;
	}
	
	// ###################
	// Get All Band Albums
	// ###################
	@Override
	public Collection<Album> getAllBandAlbums(String bandNameLower)
	{
		Band band = bandRepository.findOneByBandNameLower(bandNameLower);
		Collection<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// ###################
	// Get All Live Albums
	// ###################
	@Override
	public Collection<Album> getAllLiveAlbums()
	{
		Collection<Album> albums = albumRepository.findByIsLiveOrderByReleaseYear(true);
		
		return albums;
	}
	
	// #####################
	// Get All Studio Albums
	// #####################
	@Override
	public Collection<Album> getAllStudioAlbums()
	{
		Collection<Album> albums = albumRepository.findAllByIsLiveIsNullOrderByReleaseYear();
		
		return albums;
	}
	
	// #######################
	// Get All Albums By Genre
	// #######################
	@Override
	public Collection<Album> getAllAlbumsByGenre(Genre genre)
	{
		Collection<Album> albums = albumRepository.findByGenreOrderByReleaseYear(genre);
		
		return albums;
	}
	
	// ######################
	// Get All Albums By Band
	// ######################
	@Override
	public Collection<Album> getAllAlbumsByBand(Band band)
	{
		Collection<Album> albums = albumRepository.findByBandOrderByReleaseYear(band);
		
		return albums;
	}
	
	// ############
	// Delete Album
	// ############
	@Override
	public void deleteAlbum(Integer albumId)
	{
		albumRepository.delete(albumId);
	}
	
	// ##########
	// Save Album
	// ##########
	@Override
	public Album saveAlbum(Album album)
	{
		albumRepository.save(album);
		
		return album;
	}
}