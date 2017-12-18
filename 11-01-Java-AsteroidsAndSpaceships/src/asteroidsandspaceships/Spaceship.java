/*
 * Class:           Spaceship.java
 * Project:         Asteroids And Spaceships Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.00
 * Author:          Peter Wightman
 * Description:     This is the Spaceship Class
 */

package asteroidsandspaceships;

public class Spaceship extends AstronomicalBody
{
	// Instance Variables
	private int ammo;
	private int lives;
	
	// Default Constructor
	public Spaceship() 
	{
		super();
	}
	
	// Parameterised Constructor
	public Spaceship(double positionX, double positionY, double positionZ, int direction, int speed) 
	{
		super(positionX, positionY, positionZ, direction, speed);
		this.setAmmo(100);
		this.setLives(3);
	}
	
	/*
	 * GET & SET Property Methods
	 */
	
	public int getAmmo() 
	{
		return ammo;
	}

	public void setAmmo(int ammo) 
	{
		this.ammo = ammo;
	}

	public int getLives() 
	{
		return lives;
	}

	public void setLives(int lives) 
	{
		this.lives = lives;
	}
	
	/*
	 * Functions and Methods
	 */
	
	public void shoot()
	{
		int remainingBullets = this.getAmmo();
		
		if(remainingBullets > 4)
		{
			this.setAmmo(remainingBullets - 4);
			System.out.println("4 Bullets Fired");
		}

		else if(remainingBullets > 0 && remainingBullets < 4)
		{
			this.setAmmo(remainingBullets - remainingBullets);
			System.out.println(remainingBullets + "All Bullets Fired!");
		}
		
		else
		{
			System.out.println("Out Of Ammo!");
		}
	}
	
	public void crash()
	{
		int remainingLives = this.getLives();
		
		if(remainingLives > 0)
		{
			this.setLives(remainingLives - 1);
			System.out.println("Life Lost, Spaceship Crashed!");
		}
		
		else
		{
			System.out.println("No Lives Remaining, You Lose!");
		}
	}
}