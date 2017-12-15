/*
 * Class:           Location.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weather.domain
 * Version:         1.0
 * Created:         15/12/2017
 * Updated:         15/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Location Class
 */

package ac.uk.belfastmet.weather.domain;
// Import Packages
import javax.persistence.Entity;

@Entity
public class Wind
{
	// Instance Variables
	private float speed;
	private String direction;
	
	// Default Passenger Constructor
	public Wind()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Wind(float speed, String direction)
	{
		super();
		this.setSpeed(speed);
		this.setDirection(direction);
	}

	/* 
	 * GET & SET Property Methods
	 */
	
	public float getSpeed() 
	{
		return speed;
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}

	public String getDirection() 
	{
		return direction;
	}

	public void setDirection(String direction) 
	{
		this.direction = direction;
	}
}
