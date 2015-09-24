package model;

/*
 * This add specific attributes of Bike
 * @author Banwari kevat 
 */
public class Bike extends Vehicle  
{

	private boolean selfStart;

	private double helmetPrize;

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

	@Override
	public String toString() 
	{
		return super.toString() + " selfStart=" + selfStart + ", helmetPrize="
				+ helmetPrize;
	}

}
