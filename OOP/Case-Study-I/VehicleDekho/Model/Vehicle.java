/*
 * This class contains Vehicle specification
 */

package Model;

public class Vehicle {
    //vehicle specification veriables
	private String make;
	private String model;
	private int enginInCC;
	private int fuelCapacity;
	private int milage;
	private double price;
	private double roadTax;
    
	//getter setter functions
	public String getMake() 
	{
		return make;
	}

	public void setMake(String make) 
	{
		this.make = make;
	}

	public String getModel() 
	{
		return model;
	}

	public void setModel(String model) 
	{
		this.model = model;
	}

	public int getEnginInCC() 
	{
		return enginInCC;
	}

	public void setEnginInCC(int enginInCC) 
	{
		this.enginInCC = enginInCC;
	}

	public int getFuelCapacity() 
	{
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity)
	{
		this.fuelCapacity = fuelCapacity;
	}

	public int getMilage()
	{
		return milage;
	}

	public void setMilage(int milage)
	{
		this.milage = milage;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getRoadTax() 
	{
		return roadTax;
	}

	public void setRoadTax(double roadTax) 
	{
		this.roadTax = roadTax;
	}
   
	/*
	 * This function calculate the road price with tax
	 */
	public double calculateOnRoadPrice()
	{
		return price + roadTax;
	}
    
	//override toString methods
	@Override
	public String toString() 
	{
		return "make=" + make + ", model=" + model + ", enginInCC=" 
	            + enginInCC+ ", fuelCapacity=" + fuelCapacity + ", "
	            + "milage=" + milage+ ", price=" + price + ", roadTax=" + roadTax;
	}
}
