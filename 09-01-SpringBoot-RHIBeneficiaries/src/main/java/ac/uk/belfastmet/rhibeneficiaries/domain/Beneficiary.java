/*
 * Class:           Beneficiary.java
 * Project:         RHI Demo
 * Package:         ac.uk.belfastmet.rhibeneficiaries.domain
 * Version:         1.0
 * Created:         14/12/2017
 * Updated:         14/12/2017 16.00
 * Author:          Peter Wightman
 * Description:     This is the Beneficiary Class
 */

package ac.uk.belfastmet.rhibeneficiaries.domain;
// Import Packages
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beneficiary 
{
	// Instance Variables
	@Id
	@GeneratedValue
	private Integer rhibId;
	private String rhibName;
	private LocalDate applicationDate;
	private String location;
	private String techType;
	private Integer capacity;
	private BigDecimal paymentAmount;

	// Default Passenger Constructor
	public Beneficiary()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Beneficiary(Integer rhibId, String rhibName, LocalDate applicationDate, String location,
					   String techType, Integer capacity, BigDecimal paymentAmount)
	{
		super();
		this.setRhibId(rhibId);
		this.setRhibName(rhibName);
		this.setApplicationDate(applicationDate);
		this.setLocation(location);
		this.setTechType(techType);
		this.setCapacity(capacity);
		this.setPaymentAmount(paymentAmount);
	}

	/* 
	 * GET & SET Property Methods
	 */
	
	public Integer getRhibId() 
	{
		return rhibId;
	}

	public void setRhibId(Integer rhibId) 
	{
		this.rhibId = rhibId;
	}

	public String getRhibName() 
	{
		return rhibName;
	}

	public void setRhibName(String rhibName) 
	{
		this.rhibName = rhibName;
	}

	public LocalDate getApplicationDate() 
	{
		return applicationDate;
	}

	public void setApplicationDate(LocalDate applicationDate) 
	{
		this.applicationDate = applicationDate;
	}

	public String getLocation() 
	{
		return location;
	}

	public void setLocation(String location) 
	{
		this.location = location;
	}

	public String getTechType() 
	{
		return techType;
	}

	public void setTechType(String techType) 
	{
		this.techType = techType;
	}

	public Integer getCapacity() 
	{
		return capacity;
	}

	public void setCapacity(Integer capacity) 
	{
		this.capacity = capacity;
	}

	public BigDecimal getPaymentAmount() 
	{
		return paymentAmount;
	}

	public void setPaymentAmount(BigDecimal paymentAmount) 
	{
		this.paymentAmount = paymentAmount;
	}
}
