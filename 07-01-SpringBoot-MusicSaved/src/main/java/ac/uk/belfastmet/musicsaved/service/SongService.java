/*
 * Class:           SongService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the SongService Interface
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Song;

public interface SongService 
{
	Song getSongByName(String songTitle);
	Song getSongById(Integer songId);
	
	Collection<Song> getAllAlbumTracks(Album album);
	
	void deleteSong(Integer bandId);
	Song saveSong(Song song);
}