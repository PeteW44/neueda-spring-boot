/*
 * Class:           AstronomicalBody.java
 * Project:         Asteroids And Spaceships Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.00
 * Author:          Peter Wightman
 * Description:     This is the AstronomicalBody Class
 */

package asteroidsandspaceships;

public abstract class AstronomicalBody
{
	// Instance Variables
	private double positionX;
	private double positionY;
	private double positionZ;
	private int direction;
	private int speed;
	
	// Default Constructor
	public AstronomicalBody() 
	{
		super();
	}
	
	// Parameterised Constructor
	public AstronomicalBody(double positionX, double positionY, double positionZ, int direction, int speed) 
	{
		super();
		this.positionX = positionX;
		this.positionY = positionY;
		this.positionZ = positionZ;
		this.direction = direction;
		this.speed = speed;
	}

	/*
	 * GET & SET Property Methods
	 */

	public double getPositionX() 
	{
		return positionX;
	}

	public void setPositionX(double positionX) 
	{
		this.positionX = positionX;
	}

	public double getPositionY() 
	{
		return positionY;
	}

	public void setPositionY(double psoitionY) 
	{
		this.positionY = psoitionY;
	}

	public double getPosition() 
	{
		return positionZ;
	}

	public void setPositionZ(double positionZ) 
	{
		this.positionZ = positionZ;
	}
	
	public int getDirection() 
	{
		return direction;
	}

	public void setDirection(int direction) 
	{
		this.direction = direction;
	}

	public int getSpeed() 
	{
		return speed;
	}

	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
}