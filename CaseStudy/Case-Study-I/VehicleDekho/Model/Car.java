/*
 * This class extends the vehicle class and specify a car
 * @author Banwari kevat
 */
package Model;

public class Car extends Vehicle {
    //car specification variables
	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;
    
	//getter setter function
	public boolean isAC()
	{
		return AC;
	}

	public void setAC(boolean aC) 
	{
		AC = aC;
	}

	public boolean isPowerSteering() 
	{
		return powerSteering;
	}

	public void setPowerSteering(boolean powerSteering) 
	{
		this.powerSteering = powerSteering;
	}

	public boolean isAccessoryKit() 
	{
		return accessoryKit;
	}

	public void setAccessoryKit(boolean accessoryKit) 
	{
		this.accessoryKit = accessoryKit;
	}
    
	//override method for calculating price on road
	@Override
	public double calculateOnRoadPrice() {
		double onRoadPrice = 0.0;
		if (this.isAC()) 
		{  // for AC
			onRoadPrice = onRoadPrice + 5000;

		}

		if (isAccessoryKit()) 
		{ // Accessory kit
			onRoadPrice = onRoadPrice + 10000;

		}

		if (isPowerSteering()) 
		{   // for power Steering
			onRoadPrice = onRoadPrice + 3000;

		}
        // return final price
		return super.calculateOnRoadPrice() + onRoadPrice;
	}
    
	// overriding toString method
	@Override
	public String toString() {
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}
