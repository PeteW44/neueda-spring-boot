/*
 * Class:           Animal.java
 * Project:         Neueda Test Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.45
 * Author:          Peter Wightman
 * Description:     This is the Animal Class
 */

package neuedatest;

public class Animal 
{
	// Instance Variables
	private String animalName;

	// Default Constructor
	public Animal() 
	{
		super();
	}
	
	// Parameterised Constructor
	public Animal(String animalName) 
	{
		super();
		this.animalName = animalName;
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getAnimalName() 
	{
		return animalName;
	}

	public void setAnimalName(String animalName) 
	{
		this.animalName = animalName;
	}
}