/*
 * Class:           Cereal.java
 * Project:         Breakfast Cereal Demo
 * Package:         ac.uk.belfastmet.cereal.domain
 * Version:         1.0
 * Created:         11/12/2017
 * Updated:         11/12/2017 16.30
 * Author:          Peter Wightman
 * Description:     This is the Cereal Class
 */

package ac.uk.belfastmet.cereal.domain;
//Import Packages
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal 
{
	// Instance Variables
	@Id
	@GeneratedValue
	private Integer cerealId;
	private String manufacturerName;
	private String cerealName;
	private Double energy;
	private Double calories;
	private Double protein;
	private Double carbohydrate;
	private Double sugars;
	private Double fat;
	private Double saturates;
	private Double fibre;
	private Double sodium;
	private Double salt;
	private Double iron;
	
	// Default Passenger Constructor
	public Cereal()
	{
		super();
	}
	
	// Parameterised Passenger Constructor
	public Cereal(Integer cerealId, String manufacturerName, String cerealName, Double energy, Double calories,
				  Double protein, Double carbohydrate, Double sugars, Double fat, Double saturates,
				  Double fibre, Double sodium, Double salt, Double iron)
	{
		super();
		this.setCerealId(cerealId);
		this.setManufacturerName(manufacturerName);
		this.setCerealName(cerealName);
		this.setEnergy(energy);
		this.setCalories(calories);
		this.setProtein(protein);
		this.setCarbohydrate(carbohydrate);
		this.setSugars(sugars);
		this.setFat(fat);
		this.setSaturates(saturates);
		this.setFibre(fibre);
		this.setSodium(sodium);
		this.setSalt(salt);
		this.setIron(iron);
	}

	/*
	 * GET & SET Property Methods
	 */
	
	public Integer getCerealId() 
	{
		return cerealId;
	}
	
	public void setCerealId(Integer cerealId) 
	{
		this.cerealId = cerealId;
	}
	
	public String getManufacturerName() 
	{
		return manufacturerName;
	}
	
	public void setManufacturerName(String manufacturerName) 
	{
		this.manufacturerName = manufacturerName;
	}
	
	public String getCerealName() 
	{
		return cerealName;
	}
	
	public void setCerealName(String cerealName)
	{
		this.cerealName = cerealName;
	}
	
	public Double getEnergy() 
	{
		return energy;
	}
	
	public void setEnergy(Double energy) 
	{
		this.energy = energy;
	}
	
	public Double getCalories() 
	{
		return calories;
	}
	
	public void setCalories(Double calories) 
	{
		this.calories = calories;
	}
	
	public Double getProtein() 
	{
		return protein;
	}
	
	public void setProtein(Double protein) 
	{
		this.protein = protein;
	}
	
	public Double getCarbohydrate() 
	{
		return carbohydrate;
	}

	public void setCarbohydrate(Double carbohydrate) 
	{
		this.carbohydrate = carbohydrate;
	}
	
	public Double getSugars() 
	{
		return sugars;
	}
	
	public void setSugars(Double sugars) 
	{
		this.sugars = sugars;
	}
	
	public Double getFat() 
	{
		return fat;
	}
	
	public void setFat(Double fat) 
	{
		this.fat = fat;
	}
	
	public Double getSaturates() 
	{
		return saturates;
	}
	
	public void setSaturates(Double saturates) 
	{
		this.saturates = saturates;
	}
	
	public Double getFibre() 
	{
		return fibre;
	}
	
	public void setFibre(Double fibre) 
	{
		this.fibre = fibre;
	}
	
	public Double getSodium()
	{
		return sodium;
	}
	
	public void setSodium(Double sodium) 
	{
		this.sodium = sodium;
	}
	
	public Double getSalt() 
	{
		return salt;
	}
	
	public void setSalt(Double salt) 
	{
		this.salt = salt;
	}
	
	public Double getIron() 
	{
		return iron;
	}
	
	public void setIron(Double iron) 
	{
		this.iron = iron;
	}
}
