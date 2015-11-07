package oop1;

public class Mechanic extends People {
	String type;
	String rate;
	boolean isAvailable;

	/**
	 * @param mechanic Id
	 * @param mechanic Name
	 * @param mechanic Type
	 * @param Rate of Servicing
	 */
	public Mechanic(String mechId, String mechName, String mechType, String mechRate)
	{
		ID = super.ID;
		name = super.name;
		type = mechType;
		rate = mechRate;
		isAvailable = true;
	}
}

