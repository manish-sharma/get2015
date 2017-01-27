/*
 * This class extends the Bike class and specify a car
 * @author Banwari kevat
 */
package Model;

public class Bike extends Vehicle {
	//Bike specification variables
	private boolean selfStart;
	private double helmetPrize;
    
	//setter getter functions
	public boolean isSelfStart() 
	{
		return selfStart;
	}

	public void setSelfStart(boolean selfStart)
    {
		this.selfStart = selfStart;
	}

	public double getHelmetPrize()
	{
		return helmetPrize;
	}

	public void setHelmetPrize(double helmetPrize)
	{
		this.helmetPrize = helmetPrize;
	}
    
	//override method for calculating price on road
	@Override
	public double calculateOnRoadPrice() 
	{
		double onRoadPrice = 0;
		if (isSelfStart()) 
		{  
			onRoadPrice = onRoadPrice + 1000;
		}

		onRoadPrice = onRoadPrice + getHelmetPrize();
		return super.calculateOnRoadPrice() + onRoadPrice;
	}
   
	// overriding toString method
	@Override
	public String toString() 
	{
		return super.toString() + " selfStart=" + selfStart + ", helmetPrize="
				+ helmetPrize;
	}

}
