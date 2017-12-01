/*
 * Class:           Song.java
 * Project:         Music Demo
 * Package:         ac.uk.belfastmet.domain
 * Version:         1.0
 * Created:         31/11/2017
 * Updated:         01/12/2017 23.30
 * Author:          Peter Wightman
 * Description:     This is the Song Class
 */

package ac.uk.belfastmet.music.domain;

public class Song 
{
	// Instance Variables
	private int trackNum;
	private String trackTitle;
	
	// Default Song Constructor
	public Song()
	{
	}
	
	// Parameterised Mythical Creature Constructor
	public Song(int trackNum, String trackTitle)
	{
		this.setTrackNum(trackNum);
		this.setTrackTitle(trackTitle);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public int getTrackNum() 
	{
		return trackNum;
	}

	public void setTrackNum(int trackNum) 
	{
		this.trackNum = trackNum;
	}

	public String getTrackTitle() 
	{
		return trackTitle;
	}

	public void setTrackTitle(String trackTitle)
	{
		this.trackTitle = trackTitle;
	}
}