/*
 * Class:           AlbumService.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.musicsaved.service
 * Version:         1.0
 * Created:         12/01/2018
 * Updated:         12/01/2018 17.00
 * Author:          Peter Wightman
 * Description:     This is the AlbumService Interface
 */

package ac.uk.belfastmet.musicsaved.service;
// Import Packages
import java.util.Collection;
import ac.uk.belfastmet.musicsaved.domain.Album;
import ac.uk.belfastmet.musicsaved.domain.Band;
import ac.uk.belfastmet.musicsaved.domain.Genre;

public interface IAlbumService 
{
	Album getAlbumByName(String albumTitleLower);
	Album getAlbumById(Integer albumId);
	
	Collection<Album> getAllAlbums();
	Collection<Album> getAllBandAlbums(String bandNameLower);
	Collection<Album> getAllLiveAlbums();
	Collection<Album> getAllStudioAlbums();
	Collection<Album> getAllAlbumsByGenre(Genre genre);
	Collection<Album> getAllAlbumsByBand(Band band);
	
	void deleteAlbum(Integer albumId);
	Album saveAlbum(Album album);
}