/*
 * Class:           Passenger.java
 * Project:         Titanic Demo
 * Package:         ac.uk.belfastmet.titaniccrud.domain
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 13.00
 * Author:          Peter Wightman
 * Description:     This is the Passenger Class
 */

package ac.uk.belfastmet.titaniccrud.domain;
// Import Packages
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passenger 
{
	// Instance Variables
	@Id
	@GeneratedValue
	private Integer passengerId;
	private Integer survived;
	private Integer pClass;
	private String name;
	private String sex;
	private Double age;
	private Integer sibSp;
	private Integer parch;
	private String ticket;
	private BigDecimal fare;
	private String cabin;
	private String embarked;

	// Default Passenger Constructor
	public Passenger()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Passenger(Integer passengerId, Integer survived, Integer pClass, String name, String sex, Double age,
					 Integer sibSp, Integer parch, String ticket, BigDecimal fare, String cabin, String embarked)
	{
		super();
		this.setPassengerId(passengerId);
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
	
	public Integer getPassengerId()
	{
		return passengerId;
	}
	
	public void setPassengerId(Integer passengerId)
	{
		this.passengerId = passengerId;
	}
	
	public Integer getSurvived() 
	{
		return survived;
	}

	public void setSurvived(Integer survived) 
	{
		this.survived = survived;
	}

	public Integer getpClass() 
	{
		return pClass;
	}

	public void setpClass(Integer pClass) 
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

	public Double getAge() 
	{
		return age;
	}

	public void setAge(Double age) 
	{
		this.age = age;
	}

	public Integer getSibSp() 
	{
		return sibSp;
	}

	public void setSibSp(Integer sibSp) 
	{
		this.sibSp = sibSp;
	}

	public Integer getParch() 
	{
		return parch;
	}

	public void setParch(Integer parch) 
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
