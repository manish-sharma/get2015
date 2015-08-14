//class to hold the details for a mechanic

public class Mechanic {
	
	String name;
	String mechId;
	String speciality;
	String charge;
	boolean flag = true;
		
	public Mechanic(String name, String mechId, String speciality, String charge){		//parameterized constructor to initialize mechanic type object
		this.name = name;
		this.mechId = mechId;
		this.speciality = speciality;
		this.charge = charge;
	}
	
	boolean isAvailable(){
		return flag;				//method to check the availability of a mechanic
	}
	
}
