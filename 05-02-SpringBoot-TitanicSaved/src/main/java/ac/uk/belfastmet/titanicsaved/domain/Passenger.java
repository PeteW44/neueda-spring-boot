/*
 * Class:           Passenger.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.dwarfs.domain
 * Version:         1.0
 * Created:         01/12/2017
 * Updated:         01/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Passenger Class
 */

package ac.uk.belfastmet.titanicsaved.domain;
// Import Packages
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger 
{
	// Instance Variables
	@Id
	@GeneratedValue
	private int passengerId;
	private int survived;
	private int pClass;
	private String name;
	private String sex;
	private int age;
	private int sibSp;
	private int parch;
	private String ticket;
	private BigDecimal fare;
	private String cabin;
	private String embarked;

	// Default Passenger Constructor
	public Passenger()
	{
		
	}
	
	// Parameterised Passenger Constructor
	public Passenger(int survived, int pClass, String name, String sex, int age, int sibSp, 
					 int parch, String ticket, BigDecimal fare, String cabin, String embarked)
	{
		this.setSurvived(survived);
		this.setpClass(pClass);
		this.setName(name);
		this.setSex(sex);
		this.setAge(age);
		this.setSibSp(sibSp);
		this.setParch(parch);
		this.setTicket(ticket);
		this.setFare(fare);
		this.setCabin(cabin);
		this.setEmbarked(embarked);
	}

	/*
	 * GET & SET Property Methods
	 */

	public int getSurvived() 
	{
		return survived;
	}

	public void setSurvived(int survived) 
	{
		this.survived = survived;
	}

	public int getpClass() 
	{
		return pClass;
	}

	public void setpClass(int pClass) 
	{
		this.pClass = pClass;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String getSex() 
	{
		return sex;
	}

	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public int getSibSp() 
	{
		return sibSp;
	}

	public void setSibSp(int sibSp) 
	{
		this.sibSp = sibSp;
	}

	public int getParch() 
	{
		return parch;
	}

	public void setParch(int parch) 
	{
		this.parch = parch;
	}

	public String getTicket() 
	{
		return ticket;
	}

	public void setTicket(String ticket) 
	{
		this.ticket = ticket;
	}

	public BigDecimal getFare() 
	{
		return fare;
	}

	public void setFare(BigDecimal fare) 
	{
		this.fare = fare;
	}

	public String getCabin() 
	{
		return cabin;
	}

	public void setCabin(String cabin) 
	{
		this.cabin = cabin;
	}

	public String getEmbarked() 
	{
		return embarked;
	}

	public void setEmbarked(String embarked) 
	{
		this.embarked = embarked;
	}
}
