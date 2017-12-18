/*
 * Class:           Wind.java
 * Project:         Weather Demo
 * Package:         ac.uk.belfastmet.weatherapisimple.domain
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Wind Class
 */

package ac.uk.belfastmet.weatherapisimple.domain;

public class Wind
{
	// Instance Variables
	private Float speed;
	private String direction;
	
	// Default Passenger Constructor
	public Wind()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Wind(Float speed, String direction)
	{
		super();
		this.setSpeed(speed);
		this.setDirection(direction);
	}

	/* 
	 * GET & SET Property Methods
	 */
	
	public Float getSpeed() 
	{
		return speed;
	}

	public void setSpeed(Float speed) 
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

	/* 
	 * Over Ride To String Method
	 */
	
	@Override
	public String toString() 
	{
		return "Wind [speed=" + speed + 
			   ", direction=" + direction + "]";
	}
}
