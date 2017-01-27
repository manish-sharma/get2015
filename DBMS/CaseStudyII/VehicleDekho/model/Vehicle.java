package model;

import java.sql.Date;
/*
 * This is vehicle class
 * @author Banwari
 */

public class Vehicle {

	
	private String make;
	private String created_By;
	private Date created_Time;
	private String model;
	private int enginInCC;
	private int fuelCapacity;
	private int milage;
	private double price;
	private double roadTax;

	// getter setter methods for all data members
	public String getCreated_By()
	{
		return created_By;
	}

	public void setCreated_By(String created_By) 
	{
		this.created_By = created_By;
	}

	public Date getCreated_Time() 
	{
		return created_Time;
	}

	public void setCreated_Time(Date date) 
	{
		this.created_Time = date;
	}

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
	
	// method for calculate on road price
	public double calculateOnRoadPrice()
	{
		return price + roadTax;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	
	// override equals method for make and model attributes
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (make == null) 
		{
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null)
		{
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	// to print details of vehicle override toString method
	@Override
	public String toString() {
		return "Created_By="+created_By+", Created_Time="+created_Time+", make=" + make + ", model=" + model + ", enginInCC=" + enginInCC
				+ ", fuelCapacity=" + fuelCapacity + ", milage=" + milage
				+ ", price=" + price + ", roadTax=" + roadTax;
	}
}
