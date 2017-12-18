/*
 * Class:           WhaleWatcher.java
 * Project:         Neueda Test Demo
 * Package:         neuedatest
 * Version:         1.0
 * Created:         18/12/2017
 * Updated:         18/12/2017 12.45
 * Author:          Peter Wightman
 * Description:     This is the WhaleWatcher Class
 */

package neuedatest;

import java.util.ArrayList;

public class WhaleWatcher 
{
	// Class Variables
	ArrayList<Whale> whales = new ArrayList<Whale>();
	
	public static void main(String[] args) 
	{
		WhaleWatcher whaleWatcher = new WhaleWatcher();
		
		whaleWatcher.createWhales();
		whaleWatcher.whalesToString();
		whaleWatcher.findAtlanticWhales();
		whaleWatcher.fastestWhale();
		whaleWatcher.averageLength();
		whaleWatcher.heavestWhale();
	}
	
	public void createWhales()
	{
		Whale whale1 = new Whale("Right", "Atlantic", 2001, 21, 16);
		Whale whale2 = new Whale("Blue", "Pacific", 2001, 23, 16);
		Whale whale3 = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		Whale whale4 = new Whale("Humpback", "Antarctic", 919, 13, 13);
		
		whales.add(whale1);
		whales.add(whale2);
		whales.add(whale3);
		whales.add(whale4);
	}
	
	public void whalesToString()
	{
		for(Whale whale : whales)
		{
			whale.toString();
		}
	}
	
	public void findAtlanticWhales()
	{
		for(Whale whale : whales)
		{
			String whaleOcean = whale.getMainOcean();
			
			if(whaleOcean.equals("Atlantic"))
			{
				System.out.println(whale.getAnimalName() + " whales swim in the Atlantic");
			}
		}
	}
	
	public void fastestWhale()
	{
		int fastestSpeed = 0;
		String fastestWhaleName = "";
		
		for(Whale whale : whales)
		{
			if(whale.getMaxSpeed() > fastestSpeed)
			{
				fastestSpeed = whale.getMaxSpeed();
				fastestWhaleName = whale.getAnimalName();
			}
		}
		
		System.out.println("The Fastest Whale is the " + fastestWhaleName + " whale");
		System.out.println("The " + fastestWhaleName + " whale's maximum speed is " + fastestSpeed + "m/s");
	}
	
	public void averageLength()
	{
		int averageLength = 0;
		
		for(Whale whale : whales)
		{
			averageLength = averageLength + whale.getLength();
		}
		
		averageLength = averageLength / 4;
		
		System.out.println("The average length of the four whales is " + averageLength + "m");
	}
	
	public void heavestWhale()
	{
		ArrayList<String> heavestWhales = new ArrayList<String>();
		int heavestWeight = 0;
		
		for(Whale whale : whales)
		{
			if(whale.getWeight() > heavestWeight)
			{
				heavestWeight = whale.getWeight();
			}
		}
		
		for(Whale whale : whales)
		{
			if(whale.getWeight() == heavestWeight)
			{
				heavestWhales.add(whale.getAnimalName());
			}
		}
		
		for(String whaleName : heavestWhales)
		{
			System.out.println("The Heavest whales include " + whaleName + " whales");
		}
	}
}