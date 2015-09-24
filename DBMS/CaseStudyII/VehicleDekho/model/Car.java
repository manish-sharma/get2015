package model;
/*
 * this class initalize specific attributes of Vehicle car
 * @author Banwari kevat 
 */
public class Car extends Vehicle 
{

	private boolean AC;
	private boolean powerSteering;
	private boolean accessoryKit;

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
	
	// calculate on road price
	@Override
	public double calculateOnRoadPrice() 
	{
		double onRoadPrice = 0.0;
		if (this.isAC()) 
		{
			onRoadPrice = onRoadPrice + 5000;

		}

		if (isAccessoryKit())
		{
			onRoadPrice = onRoadPrice + 10000;

		}

		if (isPowerSteering()) 
		{
			onRoadPrice = onRoadPrice + 3000;

		}

		return super.calculateOnRoadPrice() + onRoadPrice;
	}
	
	// to print attributes over ride toString
	@Override
	public String toString()
	{
		return super.toString() + " AC=" + AC + ", powerSteering="
				+ powerSteering + ", accessoryKit=" + accessoryKit;
	}

}
