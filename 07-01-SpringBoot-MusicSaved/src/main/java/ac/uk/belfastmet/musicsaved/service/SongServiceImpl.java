/*
 * Class:           SongServiceImpl.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the SongServiceImpl Class
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Song;
import ac.uk.belfastmet.musicsaved.repositories.BandRepository;
import ac.uk.belfastmet.musicsaved.repositories.SongRepository;

@Service
public class SongServiceImpl implements ISongService
{
	@Autowired
	BandRepository bandRepository;
	
	@Autowired
	SongRepository songRepository;
	
	// Default Constructor
	public SongServiceImpl() 
	{
		super();
	}
	
	// Parameterised Constructor
	public SongServiceImpl(BandRepository bandRepository, SongRepository songRepository)
	{
		super();
		this.bandRepository = bandRepository;
		this.songRepository = songRepository;
	}
	
	// ################
	// Get Song By Name
	// ################
	@Override
	public Song getSongByName(String songTitle)
	{
		Song song = songRepository.findOneByTrackTitle(songTitle);
		
		return song;
	}
	
	// ##############
	// Get Song By ID
	// ##############
	@Override
	public Song getSongById(Integer songId)
	{
		Song song = songRepository.findOneBySongId(songId);
		
		return song;
	}
	
	// #############
	// Get All Songs
	// #############
	@Override
	public Collection<Song> getAllAlbumTracks(Album album)
	{
		Collection<Song> songs = songRepository.findByAlbum(album);
		
		return songs;
	}
	
	// ###########
	// Delete Song
	// ###########
	@Override
	public void deleteSong(Integer songId)
	{
		songRepository.delete(songId);
	}
	
	// #########
	// Save Song
	// #########
	@Override
	public Song saveSong(Song song)
	{
		songRepository.save(song);
		
		return song;
	}
}