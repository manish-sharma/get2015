
public class Assignment4Mechanic extends Assignment4People
{

	String type;
	String rate;
	boolean isAvailable;

	public Assignment4Mechanic(String mechId, String mechName, String mechType, String mechRate)
	{
		mechID = mechId;
		name = mechName;
		type = mechType;
		rate = mechRate;
		isAvailable = true;
	}
}
