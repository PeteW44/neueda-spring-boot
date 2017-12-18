/*
 * Class:           Asteroid.java
 * Project:         Asteroids And Spaceships Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.00
 * Author:          Peter Wightman
 * Description:     This is the Asteroid Class
 */

package asteroidsandspaceships;

public class Asteroid extends AstronomicalBody 
{
	// Instance Variables
	private int cohesion;
	
	// Default Constructor
	public Asteroid() 
	{
		super();
	}

	// Parameterised Constructor
	public Asteroid(double positionX, double positionY, double positionZ, int direction, int speed) 
	{
		super(positionX, positionY, positionZ, direction, speed);
		this.setCohesion(10);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public int getCohesion() 
	{
		return cohesion;
	}

	public void setCohesion(int impact) 
	{
		this.cohesion = impact;
	}
	
	/*
	 * Functions and Methods
	 */
	
	public void impactAsteroid()
	{
		int remainingCohesion = this.getCohesion();
		
		if(remainingCohesion > 4)
		{
			this.setCohesion(cohesion - 4);
			System.out.println("Asteroid Impact!");
		}
		
		else if(remainingCohesion > 0 && remainingCohesion < 4)
		{
			this.setCohesion(remainingCohesion - remainingCohesion);
			System.out.println("Asteroid Cohesion Equals: " + remainingCohesion);
		}
		
		else
		{
			System.out.println("Asteroid Destroyed!");
		}
	}
}