/*
 * Class:           Whale.java
 * Project:         Neueda Test Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.45
 * Author:          Peter Wightman
 * Description:     This is the Whale Class
 */

package neuedatest;

public class Whale extends Animal 
{
	// Instance Variables
	private String mainOcean;
	private int weight;
	private int maxSpeed;
	private int length;

	// Default Constructor
	public Whale() 
	{
		super();
	}

	public Whale(String animalName,String mainOcean, int weight, int maxSpeed, int length) 
	{
		super(animalName);
		this.setMainOcean(mainOcean);
		this.setWeight(weight);
		this.setMaxSpeed(maxSpeed);
		this.setLength(length);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public String getMainOcean() 
	{
		return mainOcean;
	}

	public void setMainOcean(String mainOcean) 
	{
		this.mainOcean = mainOcean;
	}

	public int getWeight() 
	{
		return weight;
	}

	public void setWeight(int weight) 
	{
		this.weight = weight;
	}

	public int getMaxSpeed() 
	{
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) 
	{
		this.maxSpeed = maxSpeed;
	}

	public int getLength() 
	{
		return length;
	}

	public void setLength(int length) 
	{
		this.length = length;
	}

	@Override
	public String toString() 
	{
		return "Whale [Main Ocean=" + mainOcean + 
			   ", Weight=" + weight + 
			   ", Max Speed=" + maxSpeed + 
			   ", Length=" + length + 
			   ", Name=" + getAnimalName() + "]";
	}
}
