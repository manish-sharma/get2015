package carServiceStation;

public class Mechanic extends People
{

	private String type;
	private String rate;

	public void setRate(String r)
	{
		try
		{
			int val = Integer.parseInt(r);
			this.rate = r;
		}
		catch (Exception e)
		{
			this.rate = "0";
		}

	}

	public String getRate()
	{
		return this.rate;
	}

	public String getType()
	{
		return this.type;
	}

	boolean isAvailable;

	public Mechanic(String mechId, String mechName, String mechType, String mechRate)
	{
		mechID = mechId;
		name = mechName;
		type = mechType;
		setRate(mechRate);
		isAvailable = true;
	}
}
