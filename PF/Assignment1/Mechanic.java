package CarServiceAppointmentSystem;
public class Mechanic extends People
{

	String type;
	String rate;
	boolean isAvailable;

	public Mechanic(String mechId, String mechName, String mechType, String mechRate)
	{
		mechID = mechId;
		name = mechName;
		type = mechType;
		rate = mechRate;
		isAvailable = true;
	}
}
