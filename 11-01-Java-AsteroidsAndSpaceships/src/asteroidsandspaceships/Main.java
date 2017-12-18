/*
 * Class:           Main.java
 * Project:         Asteroids And Spaceships Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.00
 * Author:          Peter Wightman
 * Description:     This is the Main Class
 */

package asteroidsandspaceships;

public class Main 
{
	public static void main(String[] args) 
	{
		// Create New Objects
		Asteroid asteroid1 = new Asteroid(100,100,100,90,1000);
		Asteroid asteroid2 = new Asteroid(200,200,200,180,1200);
		Asteroid asteroid3 = new Asteroid(300,300,300,270,1500);
		Spaceship spaceship1 = new Spaceship(10,10,10,360,3000);
		
		spaceship1.shoot();
		asteroid1.impactAsteroid();
		spaceship1.crash();
		spaceship1.shoot();
		asteroid2.impactAsteroid();
		spaceship1.shoot();
		asteroid3.impactAsteroid();
		spaceship1.shoot();
		asteroid2.impactAsteroid();
		spaceship1.crash();
		spaceship1.shoot();
		asteroid2.impactAsteroid();
		spaceship1.shoot();
		asteroid3.impactAsteroid();
		spaceship1.shoot();
		asteroid2.impactAsteroid();
		spaceship1.crash();
	}
}